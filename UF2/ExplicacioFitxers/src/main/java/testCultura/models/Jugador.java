package testCultura.models;

public class Jugador {
    private String nom;
    private int puntuacio;
    private int partidesGuanyades;

    public Jugador(String nom) {
        this.nom = nom;
        this.puntuacio = 0;
        this.partidesGuanyades = 0;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void incrementarPuntuacio(int punts) {
        this.puntuacio += punts;
    }

    public int getPartidesGuanyades() {
        return partidesGuanyades;
    }

    public void incrementarPartidesGuanyades() {
        this.partidesGuanyades++;
    }

    public void resetPuntuacio() {
        this.puntuacio = 0;
    }
}