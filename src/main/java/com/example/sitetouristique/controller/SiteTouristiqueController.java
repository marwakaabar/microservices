package com.example.sitetouristique.controller;

import com.example.sitetouristique.entities.SiteTouristique;
import com.example.sitetouristique.services.SiteTouristiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("SiteTouristique")
public class SiteTouristiqueController {

    @Autowired
    private final SiteTouristiqueService siteTouristiqueService;

    public SiteTouristiqueController(SiteTouristiqueService siteTouristiqueService) {
        this.siteTouristiqueService = siteTouristiqueService;
    }

    @GetMapping
    public List<SiteTouristique> getSitesTouristiques() {
        return siteTouristiqueService.getAll();
    }

    @GetMapping("{id}")
    public SiteTouristique getSiteTouristique(@PathVariable long id) {
        return siteTouristiqueService.getById(id);
    }

    @PostMapping
    public SiteTouristique addSiteTouristique(@RequestBody SiteTouristique siteTouristique) {
        return siteTouristiqueService.add(siteTouristique);
    }

    @PutMapping("{id}")
    public SiteTouristique updateSiteTouristique(@RequestBody SiteTouristique siteTouristique) {
        return siteTouristiqueService.update(siteTouristique);
    }

    @DeleteMapping("{id}")
    public void deleteSiteTouristique(@PathVariable long id) {
         siteTouristiqueService.deleteById(id);
    }


}
