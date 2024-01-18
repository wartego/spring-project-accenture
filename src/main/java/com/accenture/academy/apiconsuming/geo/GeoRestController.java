package com.accenture.academy.apiconsuming.geo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/zipcode")
@Slf4j
public class GeoRestController {

    private final GeoService geoService;

    public GeoRestController(GeoService geoService) {
        this.geoService = geoService;
    }

    @GetMapping
    public Geo getGeo(@RequestParam String ip) throws IOException, InterruptedException {

        Geo geo = GeoClient.getGeo(ip);
        log.info(String.valueOf(geo));
        geoService.saveGeo(geo);
        return geo;
    }

}
