package com.accenture.academy.apiconsuming.geocoding;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


@Data
public class Features {

   @JsonProperty("type")
   String type;

   @JsonProperty("properties")
   Properties properties;

   @JsonProperty("geometry")
   Geometry geometry;
   @JsonProperty("bbox")
   List<Double> bbox;

    
}