package com.accenture.academy.church;

import com.accenture.academy.exceptions.ChurchNotFindException;
import jakarta.servlet.http.Cookie;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/churches")

public class ChurchRestController {
    private final ChurchService churchService;
    public ChurchRestController(ChurchService churchService) {
        this.churchService = churchService;
    }

    @GetMapping
    public List<ChurchDao> getAllChurches(@RequestParam(required = false) Optional<String> name) {
        if(name.isPresent()){
            return churchService.getChurchByName(name);
        } else{
            return churchService.getAllChurches();
        }
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getChurchById(@PathVariable Long id) {

        try {
            return ResponseEntity
                    .status(200)
                    .header("eluwina","byku")
                    .body(churchService.getChurchById(id));
        } catch (ChurchNotFindException exception) {
            return ResponseEntity
                    .status(404)
                    .body(exception.getMessage());
        }
    }
    @PostMapping
    public ChurchDto addChurch(@RequestBody @Valid ChurchDto churchDto){
        churchService.addChurch(churchDto);
        return churchDto;
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateChurch(@RequestBody ChurchDto churchDto, @PathVariable Long id){
        churchService.updateChurch(churchDto,id);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteChurchById(@PathVariable Long id){
        churchService.deleteChurchById(id);
    }
}
