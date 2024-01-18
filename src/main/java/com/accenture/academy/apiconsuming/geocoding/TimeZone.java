package com.accenture.academy.apiconsuming.geocoding;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TimeZone {
    @JsonProperty("name")
    private String name;
    @JsonProperty("offset_STD")
    private String offSetSTD;
    @JsonProperty("offset_STD_seconds")
    private String offSetSTDseconds;
    @JsonProperty("offset_DST")
    private String offsetDST;
    @JsonProperty("offset_DST_seconds")
    private String offsetDSTseconds;
    @JsonProperty("abbreviation_STD")
    private String abbreviation_STD;
    @JsonProperty("abbreviation_DST")
    private String abbreviation_DST;
}
