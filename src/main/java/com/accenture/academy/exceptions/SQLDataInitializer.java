package com.accenture.academy.exceptions;

import com.accenture.academy.church.ChurchDao;
import com.accenture.academy.church.ChurchService;
import com.accenture.academy.member.MemberDao;
import com.accenture.academy.parish.ParishDao;
import com.accenture.academy.parish.ParishService;
import com.accenture.academy.priest.PriestDao;
import com.accenture.academy.priest.PriestDto;
import com.accenture.academy.priest.PriestService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class SQLDataInitializer {

    private final ParishService parishService;
    private final PriestService priestService;
    private final ChurchService churchService;

    @PostConstruct
    void addSomePriest(){
        PriestDto priestDto1 = new PriestDto(
                "Wojtek",
                180.0,
                29);
        PriestDto priestDto2 = new PriestDto(
                "Adam",
                192.0,
                23);
        PriestDto priestDto3 = new PriestDto(
                "Karol",
                170.2,
                75);
        priestService.addPriest(priestDto1);
        priestService.addPriest(priestDto2);
        priestService.addPriest(priestDto3);

        ////

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

        ///


        ParishDao parishDao1 = new ParishDao(
                new PriestDao("Jerzy", 160.0D, 65),
                new ChurchDao(
                        "Kościół św. Jakuba",
                        "Skierniewice",
                        80,
                        50000,
                        240.00),
                Set.of(new MemberDao("Marcin", "NieMarcin", "28-06-1993"),
                        new MemberDao("Maciej", "NieMaciej", "28-06-1993")));


        parishService.addParish(parishDao1);

//        PriestDao priestByID2 = priestService.getPriestByID(2L);
//        ChurchDao churchById2 = churchService.getChurchById(2L);
//        ParishDao parishDao2 = new ParishDao(priestByID2,churchById2,Set.of(
//                new MemberDao("Jan","NieJan","28-02-1003"),
//                new MemberDao("Karol","NieKarol","28-02-1003")));
//
//        parishService.addParish(parishDao2);
    }
}
