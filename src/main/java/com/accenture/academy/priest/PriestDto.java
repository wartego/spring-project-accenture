package com.accenture.academy.priest;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PriestDto {
    private String name;
    private Double height;
    private Integer age;
}
