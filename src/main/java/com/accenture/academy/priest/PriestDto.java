package com.accenture.academy.priest;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PriestDto {

    @Pattern(regexp = "^[A-Z][a-z]*$", message = "Name must start from capital letter")
    private String name;
    @NotNull(message = "Height must be not null!")
    private Double height;
    @Min(value = 18, message = "Age must be greater then 18")

    private Integer age;
}
