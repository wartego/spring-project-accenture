package com.accenture.academy.church;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor //wstrzykiwanie
public class ChurchDataInitializer {
    private final ChurchService churchService;

    @PostConstruct
    void initChurches(){
                ChurchDao churchDao1 = new ChurchDao(
                "Kosciol św. Krzyża",
                "Warszawa",
                150,
                10000,
                4335.2
        );
        ChurchDao churchDao2 = new ChurchDao(
                "Kosciol św. Maryi",
                "Łódź",
                120,
                20000,
                54545.2
        );
        ChurchDao churchDao3 = new ChurchDao(
                "Kosciol św. Rodziny",
                "Gdańsk",
                180,
                15000,
                6547547.4
        );
        List<ChurchDao> daoList = new ArrayList<>();
        churchService.addChurch(churchDao1);
        churchService.addChurch(churchDao2);
        churchService.addChurch(churchDao3);
    }

}
