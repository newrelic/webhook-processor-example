package com.newrelic.apm.enterprise;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;
import com.newrelic.apm.enterprise.log.Log;
import io.iron.ironmq.Queue;

import javax.script.ScriptException;
import java.io.File;
import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException, ScriptException {
        // set up simple logging
        Log.wireUp();

        // set up Guice
        ConfigModule configModule = new ConfigModule();
        Injector injector = Guice.createInjector(configModule, new EnterpriseAgentModule());

        if (args.length > 0) {
            Queue queue = injector.getInstance(Queue.class);
            File root = injector.getInstance(Key.get(File.class, Names.named("root")));

            if ("--update-script".equals(args[0])) {
                String updateKey = injector.getInstance(Key.get(String.class, Names.named("remote.scriptUpdateKey")));

                File script = new File(root, "script.js");
                byte[] bytes = Files.readAllBytes(Paths.get(script.toURI()));

                String body = StandardCharsets.UTF_8.decode(ByteBuffer.wrap(bytes)).toString();
                body = "// script update: " + updateKey + "\n" + body;
                queue.push(body);
                return;
            }
        }

        // bring over HTTP/S proxy stuff
        Map<String, String> config = configModule.getConfig();

        copyToSystemProperty(config, "http.proxyHost");
        copyToSystemProperty(config, "http.proxyPort");
        copyToSystemProperty(config, "http.proxyUser");
        copyToSystemProperty(config, "http.proxyPassword");
        copyToSystemProperty(config, "http.nonProxyHosts");
        copyToSystemProperty(config, "https.proxyHost");
        copyToSystemProperty(config, "https.proxyPort");
        copyToSystemProperty(config, "https.proxyUser");
        copyToSystemProperty(config, "https.proxyPassword");

        if (config.containsKey("http.proxyUser")) {
            final String user = config.get("http.proxyUser");
            final String password = config.get("http.proxyPassword");
            Authenticator.setDefault(
                    new Authenticator() {
                        public PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(user, password.toCharArray());
                        }
                    }
            );
        }

        // start the consumer
        EventConsumer consumer = injector.getInstance(EventConsumer.class);
        consumer.start();
    }

    private static void copyToSystemProperty(Map<String, String> config, String key) {
        if (config.containsKey(key)) {
            System.setProperty(key, config.get(key));
        }
    }
}
