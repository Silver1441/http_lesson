package com.kishkan91.epam.http.params;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class RequestParams {
    final private String method;
    final private String url;
    private JSONObject json = new JSONObject();
    private Map<String, String> headers = new HashMap<>();
    private Map<String, Object> requestParameters = new HashMap<>();

    public RequestParams(String method, String url) {
        this.method = method;
        this.url = url;
    }

    public void addJsonLine(String key, String value) {
        json.put(key, value);
    }

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    public void addRequestParameter(String key, Object value) {
        requestParameters.put(key, value);
    }

    public String getMethod() {
        return method;
    }
    public String getUrl() {
        return url;
    }
    public JSONObject getJson() {
        return json;
    }
    public Map<String, String> getHeaders() {
        return headers;
    }
    public Map<String, Object> getRequestParameters() {
        return requestParameters;
    }
}
