package com.newrelic.apm.enterprise;

import com.newrelic.apm.enterprise.log.Log;

import java.util.HashMap;
import java.util.Map;

public class Console {
    private Log log;

    public Console(Log log) {
        this.log = log;
    }

    public void log(Object... objs) {
        log.info(toLog(objs));
    }

    public void info(Object... objs) {
        log(objs);
    }

    public void debug(Object... objs) {
        log.fine(toLog(objs));
    }

    public void warn(Object... objs) {
        log.warn(toLog(objs));
    }

    public void error(Object... objs) {
        log.severe(toLog(objs));
    }

    private String toLog(Object[] objs) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objs) {
            if (obj instanceof Map) {
                //noinspection unchecked
                sb.append(new HashMap((Map) obj));
            } else {
                sb.append(obj);
            }

            sb.append(' ');
        }

        return sb.toString();
    }
}
