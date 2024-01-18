package com.accenture.academy.apiconsuming.zipcode;


import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@Slf4j
public class ZipCodeService {

    @PostConstruct
    public void getZipCode() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .GET()
                .uri(URI.create("https://api.zippopotam.us/us/33162"))
                .build();
        HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        String response = httpResponse.body().toString();

        ObjectMapper objectMapper = new ObjectMapper();
        ZipCode zipCode = objectMapper.readValue(response, ZipCode.class);
        System.out.println(zipCode);
    }
    }
