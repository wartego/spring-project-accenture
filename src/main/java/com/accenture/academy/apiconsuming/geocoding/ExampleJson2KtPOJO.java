package com.accenture.academy.apiconsuming.geocoding;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ExampleJson2KtPOJO {

   @JsonProperty("type")
   String type;
   @JsonProperty("features")
   List<Features> features;
   @JsonProperty("query")
   Query query;

}