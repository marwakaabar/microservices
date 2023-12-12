package com.example.sitetouristique.services;

import com.example.sitetouristique.entities.SiteTouristique;
import com.example.sitetouristique.repositories.SiteTouristiqueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteTouristiqueServiceImp implements SiteTouristiqueService {

    @Autowired
    private final SiteTouristiqueRepo siteTouristiqueRepo;

    public SiteTouristiqueServiceImp(SiteTouristiqueRepo siteTouristiqueRepo) {
        this.siteTouristiqueRepo = siteTouristiqueRepo;
    }


    @Override
    public SiteTouristique add(SiteTouristique st) {
        return siteTouristiqueRepo.save(st);
    }

    @Override
    public SiteTouristique update(SiteTouristique st) {
         return siteTouristiqueRepo.save(st);
    }

    @Override
    public List<SiteTouristique> getAll() {
         return siteTouristiqueRepo.findAll();
    }

    @Override
    public SiteTouristique getById(Long id) {
        return siteTouristiqueRepo.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        siteTouristiqueRepo.deleteById(id);
    }
}
