package com.esprit.offre_ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffreService {

    @Autowired
    private OffreRepository offreRepository;

    public Offre addOffre(Offre offre){
        return offreRepository.save(offre);
    }

    public List<Offre> getAllOffres() {
        return offreRepository.findAll();
    }

    public Offre getOffreById(Long id) {
        return offreRepository.findById(id).orElseThrow(null);
    }

    public List<Offre> getOffresByType(TypeOffre typeOffre) {
        return offreRepository.findByTypeOffre(typeOffre);
    }

    /*public Offre updateOffre(Offre offre) {
        return offreRepository.save(offre);
    }*/

    public Offre updateOffre(Long id,Offre newOffre){
        if(offreRepository.findById(id).isPresent()){
            Offre existingOffre = offreRepository.findById(id).get();
            existingOffre.setNomOffre(newOffre.getNomOffre());
            existingOffre.setDescriptionOffre(newOffre.getDescriptionOffre());
            existingOffre.setTypeOffre(newOffre.getTypeOffre());
            return offreRepository.save(existingOffre);
        } else
            return null;
    }

    public String deleteOffre(Long id) {
        if (offreRepository.findById(id).isPresent()) {
            offreRepository.deleteById(id);
            return "Offre supprimé";
        } else
            return "Offre non supprimé";
    }
}
