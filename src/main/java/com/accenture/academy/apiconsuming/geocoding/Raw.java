package com.accenture.academy.apiconsuming.geocoding;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

   @Data
public class Raw {

   @JsonProperty("name")
   String name;

   @JsonProperty("shop")
   String shop;

   @JsonProperty("brand")
   String brand;

   @JsonProperty("phone")
   String phone;

   @JsonProperty("osm_id")
   int osmId;

   @JsonProperty("organic")
   String organic;

   @JsonProperty("website")
   String website;

   @JsonProperty("building")
   String building;

   @JsonProperty("osm_type")
   String osmType;

   @JsonProperty("stroller")
   String stroller;

   @JsonProperty("addr:city")
   String addrcity;

   @JsonProperty("check_date")
   Date checkDate;

   @JsonProperty("wheelchair")
   String wheelchair;

   @JsonProperty("addr:street")
   String addrstreet;

   @JsonProperty("second_hand")
   String secondHand;

   @JsonProperty("currency:EUR")
   String currencyEUR;

   @JsonProperty("payment:cash")
   String paymentcash;

   @JsonProperty("payment:visa")
   String paymentvisa;

   @JsonProperty("addr:postcode")
   int addrpostcode;

   @JsonProperty("opening_hours")
   String openingHours;

   @JsonProperty("payment:coins")
   String paymentcoins;

   @JsonProperty("payment:notes")
   String paymentnotes;

   @JsonProperty("brand:wikidata")
   String brandwikidata;

   @JsonProperty("brand:wikipedia")
   String brandwikipedia;

   @JsonProperty("building:levels")
   int buildinglevels;

   @JsonProperty("internet_access")
   String internetAccess;

   @JsonProperty("addr:housenumber")
   int addrhousenumber;

   @JsonProperty("air_conditioning")
   String airConditioning;

   @JsonProperty("payment:girocard")
   String paymentgirocard;

   @JsonProperty("payment:contactless")
   String paymentcontactless;

   @JsonProperty("payment:credit_cards")
   String paymentcreditCards;


    
}