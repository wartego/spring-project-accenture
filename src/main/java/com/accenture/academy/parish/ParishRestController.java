package com.accenture.academy.parish;

import com.accenture.academy.church.ChurchDao;
import com.accenture.academy.church.ChurchService;
import com.accenture.academy.priest.PriestDao;
import com.accenture.academy.priest.PriestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parishes")
@RequiredArgsConstructor
public class ParishRestController {

    private final ParishService parishService;
    private final PriestService priestService;
    private final ChurchService churchService;
    @GetMapping
    public List<ParishDao> getAllParish(){
        return parishService.gettAllParishes();
    }
    @GetMapping("/{id}")
    public ParishDao getParishById(@PathVariable Long id){
        return parishService.getParishById(id);
    }

    @PostMapping
    public ParishDto addParish(@RequestBody ParishDto parishDto){
//        PriestDao priestByID = priestService.getPriestByID(parishDto.getPriestDao().getId());
//        ChurchDao churchById = churchService.getChurchById(parishDto.getChurchDao().getId());
        parishService.addParish(parishDto);
        return parishDto;
    }

    @PutMapping("/{id}")
    public void updateParish(@PathVariable Long id, @RequestBody ParishDto parishDto){
        parishService.updateParish(id, parishDto);
    }

    @PatchMapping("/{parishid}")
    public void assignPriestToParish(@RequestBody PriestAssignmentDto priestAssignmentDto, @PathVariable Long parishid){
        parishService.assignPriestToParish(priestAssignmentDto,parishid);

    }
}
