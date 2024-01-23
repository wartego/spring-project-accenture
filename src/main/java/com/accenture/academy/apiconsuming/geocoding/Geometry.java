package com.accenture.academy.apiconsuming.geocoding;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Geometry {

   @JsonProperty("type")
   String type;

   @JsonProperty("coordinates")
   List<Double> coordinates;

    
}