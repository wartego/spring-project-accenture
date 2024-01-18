package com.accenture.academy.apiconsuming.geocoding;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class Properties {

   @JsonProperty("name")
   String name;

   @JsonProperty("country")
   String country;

   @JsonProperty("country_code")
   String countryCode;

   @JsonProperty("state")
   String state;

   @JsonProperty("county")
   String county;

   @JsonProperty("city")
   String city;

   @JsonProperty("postcode")
   String postcode;

   @JsonProperty("suburb")
   String suburb;

   @JsonProperty("street")
   String street;

   @JsonProperty("housenumber")
   String housenumber;

   @JsonProperty("lon")
   Double lon;

   @JsonProperty("lat")
   Double lat;
   @JsonProperty("state_code")
   String statecode;

   @JsonProperty("formatted")
   String formatted;

   @JsonProperty("address_line1")
   String addressLine1;

   @JsonProperty("address_line2")
   String addressLine2;

   @JsonProperty("category")
   String category;

   @JsonProperty("timezone")
   TimeZone timezone;

   @JsonProperty("plus_code")
   String plusCode;
   @JsonProperty("plus_code_short")
   String plusCodeShort;

   @JsonProperty("result_type")
   String resultType;

   @JsonProperty("rank")
   Rank rank;

   @JsonProperty("details")
   List<String> details;

   @JsonProperty("datasource")
   Datasource datasource;

   @JsonProperty("place_id")
   String placeId;

    
}