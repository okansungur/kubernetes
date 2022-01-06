package com.example.msstudent.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class LectureRestTemplateClient {

    @Autowired
    RestTemplate restTemplate;

    public String getLecture(String id) {

        ResponseEntity<String> restExchange =
                restTemplate.exchange(
                        //"http://localhost/student/{studentID}",
                        "http://mslecture:9542/getLecture/{id}",
                        HttpMethod.GET,
                        null, String.class, id);

        return restExchange.getBody();
    }



}
