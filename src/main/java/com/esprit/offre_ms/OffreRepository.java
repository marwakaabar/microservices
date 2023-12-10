package com.esprit.offre_ms;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OffreRepository extends JpaRepository<Offre,Long> {
    List<Offre> findByTypeOffre(TypeOffre typeOffre);
}
