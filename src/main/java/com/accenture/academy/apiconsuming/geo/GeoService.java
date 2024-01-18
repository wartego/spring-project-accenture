package com.accenture.academy.apiconsuming.geo;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class GeoService {
    private final GeoRepository geoRepository;

    public void saveGeo(Geo geo){
        geoRepository.save(geo);
    }

}
