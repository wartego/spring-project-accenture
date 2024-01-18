package com.accenture.academy.apiconsuming.geo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class GeoRepository {
    private final IGeoRepository iGeoRepository;

    public void save(Geo geo){
        iGeoRepository.save(geo);
    }
}
