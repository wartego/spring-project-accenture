package com.accenture.academy.apiconsuming.geo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class GeoClient {

    public static Geo getGeo(String ip) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .GET()
                .uri(URI.create(String.format("https://ipinfo.io/%s/geo",ip)))
                .build();
        HttpResponse httpResponse = httpClient.send(httpRequest , HttpResponse.BodyHandlers.ofString());
        String response = httpResponse.body().toString();

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(response, Geo.class);
    }
}
