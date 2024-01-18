package com.accenture.academy.priest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PriestRepository {
    private final IPriestRepository iPriestRepository;


    public List<PriestDao> findAll() {
        return iPriestRepository.findAll();
    }

    public void save(PriestDao priestDao) {
        iPriestRepository.save(priestDao);
    }

    public Optional<PriestDao> getById(Long id) {
        return iPriestRepository.findById(id);
    }

    public Optional<PriestDao> getByName(String name) {
        return iPriestRepository.getByName(name);
    }
    public void delete(Long id) {
        iPriestRepository.deleteById(id);
    }

    public void update(PriestDao priestDao) {
        iPriestRepository.save(priestDao);
    }
}

