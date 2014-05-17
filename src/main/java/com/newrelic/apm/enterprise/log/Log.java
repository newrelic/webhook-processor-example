package com.newrelic.apm.enterprise.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

public class Log {
    protected Logger logger;
    private String className;

    public static void wireUp() {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger("");
        Handler[] handlers = logger.getHandlers();
        for (Handler handler : handlers) {
            logger.removeHandler(handler);
        }

        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new StandardFormatter());
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);

        // tell commons-logging to use the JDK logging (otherwise it would default to log4j
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
    }

    public static void setUpLoggly(String url) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger("");
        logger.addHandler(new LogglyHandler(url));
    }

    public Log() {
        Exception e = new Exception();
        className = e.getStackTrace()[1].getClassName();
        logger = LoggerFactory.getLogger(className);
    }

    public Log(Class clazz) {
        className = clazz.getName();
        logger = LoggerFactory.getLogger(className);
    }

    public Log(String className) {
        this.className = className;
        logger = LoggerFactory.getLogger(className);
    }

    public void severe(String msg, Object... args) {
        logger.error(msg, args);
    }

    public void warn(String msg, Object... args) {
        logger.warn(msg, args);
    }

    public void info(String msg, Object... args) {
        logger.info(msg, args);
    }

    public void fine(String msg, Object... args) {
        logger.debug(msg, args);
    }
}
