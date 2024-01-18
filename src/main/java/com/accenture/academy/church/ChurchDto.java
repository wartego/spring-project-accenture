package com.accenture.academy.church;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChurchDto {

    private String name;
    private String nameOfCity;
    private Integer numberOfSeats;
    private Integer numberOfMembers;
    private Double budget;

}
