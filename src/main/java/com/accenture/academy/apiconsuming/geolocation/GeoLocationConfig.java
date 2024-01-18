package com.accenture.academy.apiconsuming.geolocation;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "accenture.academy")
@Data
public class GeoLocationConfig {
    private String apikey;
    private String apikey2;
}
