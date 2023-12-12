package com.esprit.offre_ms;

import javax.persistence.*;

import java.io.Serializable;

@Entity
public class Offre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOffre;
    private String nomOffre;
    private String descriptionOffre;

    @Enumerated(EnumType.STRING)
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

    public String getDescriptionOffre() {
        return descriptionOffre;
    }

    public void setDescriptionOffre(String descriptionOffre) {
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

    public Offre(String nomOffre, String descriptionOffre, TypeOffre typeOffre) {
        super();
        this.nomOffre = nomOffre;
        this.descriptionOffre = descriptionOffre;
        this.typeOffre = typeOffre;
    }
}
