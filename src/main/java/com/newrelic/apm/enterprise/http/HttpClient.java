package com.newrelic.apm.enterprise.http;

import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.script.SimpleBindings;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HttpClient {
    org.apache.http.client.HttpClient client;
    private ScriptEngine engine;

    public HttpClient(org.apache.http.client.HttpClient client, ScriptEngine engine) {
        this.client = client;
        this.engine = engine;
    }

    public void get(String url, ResponseCallback callback) throws IOException, ScriptException {
        get(url, null, callback);
    }

    public void get(String url, Map<String, String> headers, ResponseCallback callback) throws IOException, ScriptException {
        execute(new HttpGet(url), null, headers, callback);
    }

    public void head(String url, ResponseCallback callback) throws IOException, ScriptException {
        head(url, null, callback);
    }

    public void head(String url, Map<String, String> headers, ResponseCallback callback) throws IOException, ScriptException {
        execute(new HttpHead(url), null, headers, callback);
    }

    public void put(String url, Object data, ResponseCallback callback) throws IOException, ScriptException {
        put(url, data, null, callback);
    }

    public void put(String url, Object data, Map<String, String> headers, ResponseCallback callback) throws IOException, ScriptException {
        execute(new HttpPut(url), data, null, callback);
    }

    public void post(String url, Object data, ResponseCallback callback) throws IOException, ScriptException {
        post(url, data, null, callback);
    }

    public void post(String url, Object data, Map<String, String> headers, ResponseCallback callback) throws IOException, ScriptException {
        execute(new HttpPost(url), data, headers, callback);
    }

    public void del(String url, ResponseCallback callback) throws IOException, ScriptException {
        del(url, null, callback);
    }

    public void del(String url, Map<String, String> headers, ResponseCallback callback) throws IOException, ScriptException {
        execute(new HttpDelete(url), null, headers, callback);
    }


    private void execute(HttpUriRequest request, Object data, Map<String, String> headers, ResponseCallback callback) throws ScriptException, IOException {
        if (data != null && request instanceof HttpEntityEnclosingRequest) {
            HttpEntityEnclosingRequest enclosingRequest = (HttpEntityEnclosingRequest) request;
            if (data instanceof Map) {
                request.addHeader("Content-Type", "application/json");
                SimpleBindings bindings = new SimpleBindings();
                bindings.put("obj", data);
                data = engine.eval("JSON.stringify(obj)", bindings);
            }
            enclosingRequest.setEntity(new StringEntity(data.toString()));
        }

        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                request.addHeader(entry.getKey(), entry.getValue());
            }
        }

        invoke(callback, request);
    }

    private void invoke(ResponseCallback callback, HttpUriRequest request) throws IOException {
        org.apache.http.HttpResponse response = client.execute(request);

        String data = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
        Map<String, String> headers = new HashMap<>();
        for (Header header : response.getAllHeaders()) {
            headers.put(header.getName(), header.getValue());
        }

        callback.invoke(data, response.getStatusLine().getStatusCode(), headers);
    }

    public static interface ResponseCallback {
        void invoke(Object data, int status, Map<String, String> headers);
    }
}
