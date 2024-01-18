package com.accenture.academy.priest;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "priests")
@Data
@NoArgsConstructor
public class PriestDao {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Double height;
    private Integer age;

    public PriestDao(String name, Double height, Integer age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
}
