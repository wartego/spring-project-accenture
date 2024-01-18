package com.accenture.academy.apiconsuming.geo;

import com.accenture.academy.apiconsuming.geo.Geo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGeoRepository extends JpaRepository<Geo,Long> {
}
