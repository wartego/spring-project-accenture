package com.accenture.academy.church;

import com.accenture.academy.exceptions.ChurchNotFindException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChurchService {
    private final ChurchRepository churchRepository;

    public ChurchService(ChurchRepository churchRepository) {
        this.churchRepository = churchRepository;
    }


    public List<ChurchDao> getAllChurches() {
        return churchRepository.findAll();
    }

    public void addChurch(ChurchDao churchDao) {
        churchRepository.save(churchDao);
    }
    public void addChurch(ChurchDto churchDto) {
        churchRepository.save(ChurchMapper.mapDtoToDao(churchDto));
    }

    public ChurchDao getChurchById(Long id) {
        return churchRepository
                .findById(id)
                .orElseThrow(() -> new ChurchNotFindException("Church with id: " + id + " not found!"));
    }

    public void updateChurch( ChurchDto churchDto, Long id) {
        churchRepository.save(ChurchMapper.mapDtoToDao(churchDto,id));
    }

    public void deleteChurchById(Long id) {
        churchRepository.delete(id);
    }

    public List<ChurchDao> getChurchByName(Optional<String> name) {
        return churchRepository.findAllByName(name);
    }
}
