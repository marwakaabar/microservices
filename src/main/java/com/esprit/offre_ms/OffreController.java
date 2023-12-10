package com.esprit.offre_ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/offres")
public class OffreController {

    @Autowired
    private OffreService offreService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Offre> createOffre(@RequestBody Offre offre) {
        return new ResponseEntity<>(offreService.addOffre(offre),HttpStatus.CREATED);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Offre>> getAllOffres() {
        return new ResponseEntity<>(offreService.getAllOffres(),HttpStatus.OK);
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Offre> getOffreById(@PathVariable Long id) {
        return new ResponseEntity<>(offreService.getOffreById(id), HttpStatus.OK);
    }

    @GetMapping("type/{type}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Offre>> getOffresByType(@PathVariable TypeOffre type) {
        return new ResponseEntity<>(offreService.getOffresByType(type),HttpStatus.OK);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Offre> updateOffre(@PathVariable Long id,@RequestBody Offre offre) {
        return new ResponseEntity<>(offreService.updateOffre(id,offre),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteOffre(@PathVariable(value = "id") Long id){
        return new ResponseEntity<>(offreService.deleteOffre(id), HttpStatus.OK);
    }
}
