package com.example.article.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Article implements Serializable {

    private final static long serialVersionUID = 7;



    @Id
    @GeneratedValue
    private int idA;
    private String titleA;
    private String descriptionA;

    public Article() {
        super();
    }

    public Article(String titleA, String descriptionA) {
        super();
        this.titleA = titleA;
        this.descriptionA = descriptionA;
    }

    public int getIdA() {
        return idA;
    }

    public String getTitleA() {
        return titleA;
    }

    public void setTitleA(String titleA) {
        this.titleA = titleA;
    }

    public String getDescriptionA() {
        return descriptionA;
    }

    public void setDescriptionA(String descriptionA) {
        this.descriptionA = descriptionA;
    }

    public Article(String titleA) {
        super();
        this.titleA = titleA;
    }
}
