package com.accenture.academy.apiconsuming.geocoding;

import lombok.Data;

@Data
public class Query {
    private String text;
    Parsed parsed;
}
