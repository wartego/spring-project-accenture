package com.accenture.academy.apiconsuming.geocoding;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Parsed {

    @JsonProperty("housenumber")
    private String housenumber;
    @JsonProperty("street")
    private String street;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("district")
    private String district;
    @JsonProperty("country")
    private String country;
    @JsonProperty("expected_type")
    private String expected_type;
}
