package com.kishkan91.epam.http.demo;

import com.kishkan91.epam.http.params.RequestParams;
import com.kishkan91.epam.http.service.RequestsManager;
import com.kishkan91.epam.http.service.RequestsManagerImpl;
import com.kishkan91.epam.http.service.ResponseСonsoleView;

public class DemoGetRequest {

    public void makeRequest() {
        RequestParams params = new RequestParams("GET", "https://postman-echo.com/get");
        params.addRequestParameter("value1", 1);
        params.addRequestParameter("value2", 2);

        RequestsManager requestsManager = new RequestsManagerImpl();
        ResponseСonsoleView consoleViewer = new ResponseСonsoleView();
        consoleViewer.showResponseInConsole(requestsManager.makeRequest(params));
    }
}
