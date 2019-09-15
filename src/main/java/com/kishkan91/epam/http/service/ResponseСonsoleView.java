package com.kishkan91.epam.http.service;

import kong.unirest.HttpResponse;

public class ResponseСonsoleView {
    public void showResponseInConsole(HttpResponse<String> response) {
        System.out.println(response.getBody());
        System.out.println("\n" + "Status code: " + response.getStatus());
    }
}
