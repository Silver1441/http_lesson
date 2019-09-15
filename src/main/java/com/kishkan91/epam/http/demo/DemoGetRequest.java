package com.kishkan91.epam.http.demo;

import com.kishkan91.epam.http.params.RequestParams;
import com.kishkan91.epam.http.service.RequestsManager;
import com.kishkan91.epam.http.service.RequestsManagerImpl;
import com.kishkan91.epam.http.service.ResponseСonsoleView;

public class DemoGetRequest {

    public void makeRequest() {
        RequestParams params = new RequestParams("GET", "http://www.mocky.io/v2/5d7e42962f00004367fee041");
        RequestsManager requestsManager = new RequestsManagerImpl();
        ResponseСonsoleView consoleViewer = new ResponseСonsoleView();
        consoleViewer.showResponseInConsole(requestsManager.makeRequest(params));
    }
}
