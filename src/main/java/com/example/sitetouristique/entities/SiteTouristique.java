package com.example.sitetouristique.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SiteTouristique {


    @Id
    @GeneratedValue
    long idST;
    private String nomSt;
    private String descriptionSt;

    public SiteTouristique() {}

    public long getIdST() {
        return idST;
    }

    public String getNomSt() {
        return nomSt;
    }

    public String getDescriptionSt() {
        return descriptionSt;
    }



    public void setIdST(long idST) {
        this.idST = idST;
    }

    public void setNomSt(String nomSt) {
        this.nomSt = nomSt;
    }

    public void setDescriptionSt(String descriptionSt) {
        this.descriptionSt = descriptionSt;
    }
    public SiteTouristique(long idST, String nomSt, String descriptionSt) {
        this.idST = idST;
        this.nomSt = nomSt;
        this.descriptionSt = descriptionSt;
    }
}
