package com.accenture.academy.priest;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PriestDataInitializer {
    private final PriestService priestService;
    @PostConstruct
    void addSomePriest(){
        PriestDao priestDao1 = new PriestDao(
                "Wojtek",
                180.0,
                29);
        PriestDao priestDao2 = new PriestDao(
                "Adam",
                192.0,
                23);
        PriestDao priestDao3 = new PriestDao(
                "Karol",
                170.2,
                75);
        priestService.addPriest(priestDao1);
        priestService.addPriest(priestDao2);
        priestService.addPriest(priestDao3);
    }
}
