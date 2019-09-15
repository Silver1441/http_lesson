package com.kishkan91.epam.http.demo;

import com.kishkan91.epam.http.params.RequestParams;
import com.kishkan91.epam.http.service.RequestsManager;
import com.kishkan91.epam.http.service.RequestsManagerImpl;
import com.kishkan91.epam.http.service.ResponseСonsoleView;

public class DemoPostRequest {
    public void makeRequest() {
        RequestParams params = new RequestParams("POST", "http://httpbin.org/post");
        params.addHeader("accept", "application/json");
        params.addHeader("Accept-Charset", "utf-8");
        params.addHeader("Connection", "keep-alive");
        params.addJsonLine("key1", "value1");
        params.addJsonLine("key2", "value2");

        RequestsManager requestsManager = new RequestsManagerImpl();
        ResponseСonsoleView consoleViewer = new ResponseСonsoleView();
        consoleViewer.showResponseInConsole(requestsManager.makeRequest(params));
    }
}
