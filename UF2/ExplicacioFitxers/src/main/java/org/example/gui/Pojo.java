package org.example.gui;

import java.awt.print.PrinterJob;
import java.io.Serializable;

public class Pojo implements Serializable {
    private String nom;
    private String cognoms;

    public Pojo(){}

    public Pojo(String nom, String cognoms){
        this.nom = nom;
        this.cognoms = cognoms;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    @Override
    public String toString() {
        return null;
    }
}


