package com.example.microo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Reservation implements Serializable {
    private static final long serialVersionUID = 6;

    @Id
    @GeneratedValue
    private int id;
    private String nomR, commentR;
    private LocalDate date;

    public Reservation() {
        super();
    }

    public Reservation(String nomR, String commentR, LocalDate date) {
        super();
        this.nomR = nomR;
        this.commentR = commentR;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getNomR() {
        return nomR;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public String getCommentR() {
        return commentR;
    }

    public void setCommentR(String commentR) {
        this.commentR = commentR;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
