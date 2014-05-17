package com.newrelic.apm.enterprise;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.newrelic.apm.enterprise.log.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class ConfigModule extends AbstractModule {
    private static final Log LOG = new Log();

    private File root;

    @Override
    protected void configure() {
        URL url = getClass().getClassLoader().getResource(ConfigModule.class.getName().replace('.', '/') + ".class");
        String path = url.getPath();
        if (url.getProtocol().equals("file")) {
            root = new File(path.substring(0, path.indexOf("target/classes")));
        } else if (path.startsWith("file:")) {
            // note: jars will have a protocol of jar: and a path starting with "file:" -- just to keep you on your toes!
            path = path.substring(5);
            String breakBang = path.substring(0, path.indexOf('!'));
            String breakJar = path.substring(0, breakBang.lastIndexOf('/'));
            root = new File(breakJar).getParentFile();
        } else {
            addError("Could not find root directory");
            return;
        }

        File config = new File(root, "agent.properties");
        Properties props = new Properties();
        try {
            LOG.info("Reading config file {}", config.getAbsolutePath());
            props.load(new FileInputStream(config));
        } catch (IOException e) {
            addError("Could not load properties", e);
            return;
        }

        // configure Loggly
        if (props.containsKey("remote.sendLogs")) {
            String logglyUrl = props.getProperty("remote.sendLogs");
            Log.setUpLoggly(logglyUrl);
        }

        Names.bindProperties(binder(), props);
    }

    @Provides
    @Singleton
    @Named("root")
    public File getRoot() {
        return root;
    }
}
