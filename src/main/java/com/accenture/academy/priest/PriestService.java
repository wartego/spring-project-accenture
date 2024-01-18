package com.accenture.academy.priest;

import com.accenture.academy.exceptions.InvalidParamException;
import com.accenture.academy.exceptions.PriestNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PriestService {
    private final PriestRepository priestRepository;


    public List<PriestDao> getAllPriest() {
        return priestRepository.findAll();
    }

    public void addPriest(PriestDao PriestDao) {
        priestRepository.save(PriestDao);
    }

    public PriestDao getPriestByID(Long id) {
        return priestRepository.getById(id)
                .orElseThrow(() -> new PriestNotFoundException("Priest with id: " + id + " not found!"));
    }

    public PriestDao getPriestByName(String name) {
        return priestRepository.getByName(name)
                .orElseThrow(() -> new InvalidParamException("Priest with name: " + name + " not found!"));
    }

    public void deletePriestById(Long id) {
        priestRepository.delete(id);
    }

    public void updatePriestById(PriestDto priestDto, Long id) {
        priestRepository.update(PriestMapper.mapDtoToDao(priestDto,id));
    }
}
