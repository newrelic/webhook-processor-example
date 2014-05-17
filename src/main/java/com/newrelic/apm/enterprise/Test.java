package com.newrelic.apm.enterprise;

import com.newrelic.apm.enterprise.http.HttpClient;
import com.newrelic.apm.enterprise.log.Log;
import org.apache.http.impl.client.HttpClientBuilder;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;

public class Test {
    private static final Log LOG = new Log();

    public static void main(String[] args) throws IOException, ScriptException {
        // set up simple logging
        Log.wireUp();

        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("JavaScript");
        engine.eval("var event = {\"created_at\":\"2014-01-08T12:35:01-08:00\",\"alert_policy_name\":\"Key Transactions\",\"account_name\":\"NewRelic Administration\",\"severity\":\"critical\",\"message\":\"'BeaconServiceServlet/getAccountInformation' Apdex score < 0.7\",\"short_description\":\"Ended alert for Key Transactions: 'BeaconServiceServlet/getAccountInformation' Apdex score < 0.7\",\"long_description\":\"Alert ended for Key Transactions -- Triggered by: 'BeaconServiceServlet/getAccountInformation' Apdex score < 0.7 -- Key transactions currently involved: BeaconServiceServlet/getAccountInformation, Plugin Components Index, APIv2: Applications Index, KT test Transaction\",\"alert_url\":\"https://dev.newrelic.com/accounts/1/incidents/13861\"}\n");
        engine.put("log", new Log("script.js"));
        engine.put("utils", new Utils());

        engine.put("http", new HttpClient(HttpClientBuilder.create().build(), engine));
        engine.eval("var console = {log: function(msg) { log.info(msg); }}");
        engine.eval("log.info('foo', 'bar', 'baz')");


    }
}
