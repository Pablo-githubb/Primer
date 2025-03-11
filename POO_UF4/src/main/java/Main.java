package org.example;

public class Main {
    //Mètode main
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Alumne objecte = new Alumne("Joan");

        //objecte.setNom("Capullo");
        //No pot accedir es privat
        //System.out.println("Nom: " + objecte.nom);
        //Este si que pot perquè el mètode getNom és public
        System.out.println("Nom: " + objecte.getNom());
        System.out.println("DNI: " + objecte.dni);
    }
}

class Alumne {
    //Propietats
    private String nom = "Josep"; //private, solament es accessible des de la mateixa classe
    protected String dni; // Es veu sempre i quan estiguis al mateix paquet
    String cicle="DAM"; //Package-private -> no se sol fer mai, es accessible si esta en la classe del mateix paquet
    public String curs = "1r"; //public, es accessible a tothom

    //Mètodes

    //Mètodes constructors

    public Alumne() {
    }

    public Alumne(String nom) {
        setNom(nom);
    }
    //Mètodes accessors

    //Click dret -> Generate -> Getter and Setter
    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        if (nom.contains("Capullo")) return;
        //Propietat=paràmetre
        this.nom = nom;
    }
}

