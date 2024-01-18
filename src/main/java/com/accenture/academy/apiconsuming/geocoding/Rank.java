package com.accenture.academy.apiconsuming.geocoding;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Rank {
    @JsonProperty("importance")
    private Double importance;
    @JsonProperty("popularity")
    private Double popularity;
    @JsonProperty("confidence")
    private Double confidence;
    @JsonProperty("confidence_city_level")
    private int confidence_city_level;
    @JsonProperty("confidence_street_level")
    private int confidence_street_level;
    @JsonProperty("match_type")
    private String match_type;
}
