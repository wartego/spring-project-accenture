package com.accenture.academy.parish;

import com.accenture.academy.church.ChurchRepository;
import com.accenture.academy.priest.PriestDao;
import com.accenture.academy.priest.PriestRepository;
import com.accenture.academy.priest.PriestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParishService {

    //to jest Bean
    private final ParishRepository parishRepository;
    private final PriestService priestService;
    private final ChurchRepository churchRepository;

    public List<ParishDao> gettAllParishes(){
       return parishRepository.getAll();
    }

    public ParishDao getParishById(Long id){
        return parishRepository.getById(id).orElse(null);
    }


    //saving paringDto
    public void addParish(ParishDto parishDto) {
        ParishDao parishDao = ParishMapper.mapDtoToDao(parishDto);
        parishRepository.save(parishDao);
    }

    //saving ParishDao
    public void addParish(ParishDao parishDao) {
        parishRepository.save(parishDao);
    }
    public void updateParish(Long id, ParishDto parishDto) {
        ParishDao parishDao = ParishMapper.mapDtoToDao(parishDto);
        parishDao.setId(id);
        parishRepository.save(parishDao);
    }
    public void assignPriestToParish(PriestAssignmentDto priestAssignmentDto, Long parishId){
        ParishDao parishDao = getById(parishId);
        PriestDao priestDao = priestService.getPriestByID(priestAssignmentDto.getPriestId());
        parishDao.setPriestDao(priestDao);
        parishRepository.save(parishDao);
    }

    private ParishDao getById(Long id) {
        return parishRepository
                .findById(id)
                .orElseThrow(()-> new RuntimeException("Parish with id " + id + " does not exist!"));
    }

//    public updateParish(ParishDao parishDao, Long id){
//
//    }

}
