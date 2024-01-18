package com.accenture.academy.priest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IPriestRepository extends JpaRepository<PriestDao,Long> {
    @Query("select p from PriestDao p where p.name = ?1")
    Optional<PriestDao> getByName(String name);

    Optional<PriestDao> getByHeight(Double height);
}
