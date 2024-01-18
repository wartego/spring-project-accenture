package com.accenture.academy.apiconsuming.zipcode;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ZipCode {
    @JsonProperty("post code")
    private String postCode;
    private String country;
    @JsonProperty("country abbreviation")
    private String countryAbbreviation;
    private List<Places> places;
}
