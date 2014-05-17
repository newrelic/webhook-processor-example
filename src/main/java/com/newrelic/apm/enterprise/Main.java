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
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException, ScriptException {
        // set up simple logging
        Log.wireUp();

        // set up Guice
        Injector injector = Guice.createInjector(new ConfigModule(), new EnterpriseAgentModule());

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

        // start the consumer
        EventConsumer consumer = injector.getInstance(EventConsumer.class);
        consumer.start();
    }
}
