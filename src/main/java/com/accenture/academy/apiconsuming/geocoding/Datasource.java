package com.accenture.academy.apiconsuming.geocoding;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Datasource {

   @JsonProperty("sourcename")
   String sourcename;

   @JsonProperty("attribution")
   String attribution;

   @JsonProperty("license")
   String license;

   @JsonProperty("url")
   String url;

   @JsonProperty("raw")
   Raw raw;

    
}