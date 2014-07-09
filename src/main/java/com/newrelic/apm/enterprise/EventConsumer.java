package com.newrelic.apm.enterprise;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.newrelic.apm.enterprise.bmc.ImpactManager;
import com.newrelic.apm.enterprise.bmc.ImpactManager_Service;
import com.newrelic.apm.enterprise.http.HttpClient;
import com.newrelic.apm.enterprise.log.Log;
import io.iron.ironmq.Message;
import io.iron.ironmq.Queue;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleBindings;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

public class EventConsumer implements Runnable {
    private static final Log LOG = new Log();
    private final CloseableHttpClient httpClient;

    private Thread thread = new Thread(this, "Event Consumer");
    private boolean running = false;
    private Queue queue;
    private int timeout;
    private File root;
    private String updateKey;
    private Map<String, String> config;
    private final ScriptEngineManager scriptEngineManager;

    @Inject
    public EventConsumer(Queue queue,
                         @Named("ironmq.timeout") int timeout,
                         @Named("root") File root,
                         @Named("remote.scriptUpdateKey") String updateKey,
                         @Named("config") Map<String, String> config) {
        this.queue = queue;
        this.timeout = timeout;
        this.root = root;
        this.updateKey = updateKey;
        this.config = config;
        scriptEngineManager = new ScriptEngineManager();
        httpClient = HttpClientBuilder.create().build();
    }

    public void start() {
        LOG.info("Starting queue consumer...");
        thread.start();
    }

    public void stop() {
        running = false;
        thread.interrupt();
    }


    @Override
    public void run() {
        running = true;

        while (running) {
            try {
                Message message = queue.get(1, timeout).getMessage(0);
                processMessage(message);
                queue.deleteMessage(message);
            } catch (IndexOutOfBoundsException e) {
                try {
                    Thread.sleep(10 * 1000);
                } catch (InterruptedException ie) {
                    return;
                }
            } catch (IOException e) {
                LOG.warn("Unable to connect to queue, will wait 60 seconds and try again", e);

                try {
                    Thread.sleep(60 * 1000);
                } catch (InterruptedException ie) {
                    return;
                }
            } catch (Exception e) {
                LOG.severe("Unable to process message, will keep trying", e);
            }

        }
    }

    private void processMessage(Message message) throws URISyntaxException, ScriptException, IOException {
        String body = message.getBody();
        if (updateKey != null && !"".equals(updateKey) && body.startsWith("// script update: " + updateKey)) {
            // save the script
            LOG.info("Receiving updated script; writing to script.js now");
            body = body.substring(body.indexOf('\n') + 1);
            try (FileWriter writer = new FileWriter(new File(root, "script.js"))) {
                writer.write(body);
            }
            return;
        }

        if (body.startsWith("alert=")) {
            body = new URI(body.substring(6)).getPath();
        } else if (body.startsWith("deployment=")) {
            body = new URI(body.substring(11)).getPath();
        }

        LOG.info("Received alert event, processing");

        ScriptEngine engine = scriptEngineManager.getEngineByName("JavaScript");
        SimpleBindings bindings = new SimpleBindings();
        bindings.put("eventStr", body);
        Object eventJson = engine.eval("JSON.parse(eventStr)", bindings);

        engine.put("event", eventJson);
        Log log = new Log("script.js");
        engine.put("log", log);
        engine.put("console", new Console(log));
        engine.put("utils", new Utils());
        engine.put("http", new HttpClient(httpClient, engine));
        engine.put("config", config);

        if (config.containsKey("bmc.wsdl")) {
            // todo: this probably should be a singleton/cached, but then again I guess most of the stuff above should too!
            String wsdl = config.get("bmc.wsdl");
            ImpactManager_Service impactManagerService = new ImpactManager_Service(new URL(wsdl));
            ImpactManager impactManager = impactManagerService.getImpactManager();
            engine.put("impactManager", impactManager);
        }

        engine.eval(new FileReader(new File(root, "script.js")));
    }
}
