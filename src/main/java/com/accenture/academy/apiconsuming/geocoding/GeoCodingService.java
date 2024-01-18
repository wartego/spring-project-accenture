package com.accenture.academy.apiconsuming.geocoding;


import com.accenture.academy.apiconsuming.GeoLocationConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@Slf4j
@RequiredArgsConstructor
public class GeoCodingService {

    private final GeoLocationConfig config;
    private final HttpClient httpClient;
    @PostConstruct
    void getGeoLocation() throws IOException, InterruptedException {

        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .GET()
                .uri(URI.create("https://api.geoapify.com/v1/geocode/search?text=38%20Upper%20Montagu%20Street%2C%20Westminster%20W1H%201LJ%2C%20United%20Kingdom&apiKey="+ config.getApikey()))
                .build();
        HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        String response = httpResponse.body().toString();

        ObjectMapper objectMapper = new ObjectMapper();
        ExampleJson2KtPOJO featureCollection = objectMapper.readValue(response, ExampleJson2KtPOJO.class);

        System.out.println(featureCollection);

        log.info(String.valueOf(featureCollection));
    }
}
