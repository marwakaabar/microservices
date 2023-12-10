package com.esprit.offre_ms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
public class Offre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOffre;
    private String nomOffre;
    private Boolean descriptionOffre;
    private TypeOffre typeOffre;

    public Long getIdOffre() {
        return idOffre;
    }

    public String getNomOffre() {
        return nomOffre;
    }

    public void setNomOffre(String nomOffre) {
        this.nomOffre = nomOffre;
    }

    public Boolean getDescriptionOffre() {
        return descriptionOffre;
    }

    public void setDescriptionOffre(Boolean descriptionOffre) {
        this.descriptionOffre = descriptionOffre;
    }

    public TypeOffre getTypeOffre() {
        return typeOffre;
    }

    public void setTypeOffre(TypeOffre typeOffre) {
        this.typeOffre = typeOffre;
    }

    public Offre() {
        super();
    }

    public Offre(String nomOffre) {
        super();
        this.nomOffre = nomOffre;
    }

    public Offre(String nomOffre, Boolean descriptionOffre, TypeOffre typeOffre) {
        super();
        this.nomOffre = nomOffre;
        this.descriptionOffre = descriptionOffre;
        this.typeOffre = typeOffre;
    }
}
