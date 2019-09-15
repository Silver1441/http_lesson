package com.kishkan91.epam.http.service;

import com.kishkan91.epam.http.params.RequestParams;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;


public class RequestsManagerImpl implements RequestsManager {

    public HttpResponse<String> makeRequest(RequestParams params) {

        if(params.getJson().isEmpty()) {
            HttpResponse<String> response = Unirest.request(params.getMethod(), params.getUrl())
                    .headers(params.getHeaders())
                    .queryString(params.getRequestParameters())
                    .asString();

            return response;

        } else {
            HttpResponse<String> response = Unirest.request(params.getMethod(), params.getUrl())
                    .headers(params.getHeaders())
                    .queryString(params.getRequestParameters())
                    .body(params.getJson())
                    .asString();

            return response;
        }
    }
}
