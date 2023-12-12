package com.example.micro_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Pay implements Serializable {
    private static final  long serialVersionUID=6;
    @Id
    @GeneratedValue
    private int id;
    private String description,nom,ville;

    public Pay() {
        super();
    }

    public Pay(String description, String nom, String ville) {
        super();
        this.description = description;
        this.nom = nom;
        this.ville = ville;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Pay(String nom) {
        super();
        this.nom = nom;
    }
}
