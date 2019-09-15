package com.kishkan91.epam.http.service;

import com.kishkan91.epam.http.params.RequestParams;
import kong.unirest.HttpResponse;

public interface RequestsManager {
    HttpResponse<String> makeRequest(RequestParams params);
}
