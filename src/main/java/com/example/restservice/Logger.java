package com.example.restservice;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Logger {

    public String logRequest(String body, String requestId, String headers, String resourcePath, String method){
        final String uri = "http://localhost:8080/log";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }

}
