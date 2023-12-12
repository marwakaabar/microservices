package com.example.sitetouristique.services;

import com.example.sitetouristique.entities.SiteTouristique;

import java.util.List;

public interface SiteTouristiqueService {

    SiteTouristique add(SiteTouristique st);

    SiteTouristique update(SiteTouristique st);

    List<SiteTouristique> getAll();

    SiteTouristique getById(Long id);

    void deleteById(Long id);

}
