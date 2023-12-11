package com.example.gestionhotel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
public class Hotel implements Serializable {

    private static final long serialVersionUID = 6;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idH;

    private String nomH, emailH, adresseh, telH;

    private int etoilesH;


    public Hotel() {
        super();
    }

    public Hotel(String nomH) {
        super();
        this.nomH = nomH;
    }

    public Hotel(String nomH, String emailH, String adresseh, String telH, int etoilesH) {
        super();
        this.nomH = nomH;
        this.emailH = emailH;
        this.adresseh = adresseh;
        this.telH = telH;
        this.etoilesH = etoilesH;
    }



    public Long getIdH() {
        return idH;
    }

    public void setIdH(Long idH) {
        this.idH = idH;
    }

    public String getNomH() {
        return nomH;
    }

    public void setNomH(String nomH) {
        this.nomH = nomH;
    }

    public String getEmailH() {
        return emailH;
    }

    public void setEmailH(String emailH) {
        this.emailH = emailH;
    }

    public String getAdresseh() {
        return adresseh;
    }

    public void setAdresseh(String adresseh) {
        this.adresseh = adresseh;
    }

    public String getTelH() {
        return telH;
    }

    public void setTelH(String telH) {
        this.telH = telH;
    }

    public int getEtoilesH() {
        return etoilesH;
    }

    public void setEtoilesH(int etoilesH) {
        this.etoilesH = etoilesH;
    }


}
