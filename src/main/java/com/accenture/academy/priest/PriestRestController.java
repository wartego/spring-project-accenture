package com.accenture.academy.priest;

import com.accenture.academy.exceptions.PriestNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/priests")
@RequiredArgsConstructor
public class PriestRestController {
    private final PriestService priestService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PriestDao> getAllPriests(){
        return priestService.getAllPriest();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public PriestDto savePriest(@RequestBody @Valid PriestDto priestDto){
        priestService.addPriest(priestDto);
        return priestDto;
    }

    @GetMapping("/search/")
    @ResponseStatus(HttpStatus.OK)
    public PriestDao findPriestById(@RequestParam(value = "id") Long id ){
        return priestService.getPriestByID(id);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public PriestDao findPriestByName(@RequestParam(value = "name") String name){
        return priestService.getPriestByName(name);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updatePriestByID(@PathVariable Long id ,@RequestBody PriestDto priestDto){
        priestService.updatePriestById(priestDto, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePriestByID(@PathVariable Long id){
        priestService.deletePriestById(id);
    }

}
