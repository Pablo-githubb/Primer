package testCultura.models;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuaris {
    private static final String FITXER_USUARIS = "data/usuaris.dat";
    private List<Usuari> usuaris;

    /**
     * Creem un Array per guardar dintre els pròxim usuaris que vulguem registrar.
     */
    public Usuaris() {
        usuaris = Fitxers.llegirUsuaris(FITXER_USUARIS);
        if (usuaris == null) {
            usuaris = new ArrayList<>(); // Així evitem el NullPointerException si no es poden llegir usuaris
        }
    }

    /**
     * Mètode per registrar nous usuaris a les dades
     * @param nom Amb aquesta variable indiquem el nickname del nou usuari que volem afegir. S'han implementat algunes restriccions per a que no hi hagi ningun al moment d'utilitzar el mètode.
     */
    public void registrarUsuari(String nom) {
        try {
            if (nom == null || nom.trim().isEmpty()) {
                throw new IllegalArgumentException("El nom d'usuari no pot estar buit.");
            }

            for (Usuari u : usuaris) {
                if (u.getNom().equalsIgnoreCase(nom)) {
                    throw new IllegalArgumentException("Ja existeix un usuari amb aquest nom.");
                }
            }

            usuaris.add(new Usuari(nom));
            Fitxers.guardarUsuaris(usuaris, FITXER_USUARIS);
            JOptionPane.showMessageDialog(null, "Usuari registrat correctament.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Aquest mètode serveix per llistar els usuaris ja creats i mostrar-los per pantalla. S'han implementat algunes restriccions per a que no hi hagi ningun al moment d'utilitzar el mètode
     */
    public void llistarUsuaris() {
        try {
            if (usuaris.isEmpty()) {
                throw new IllegalArgumentException("No hi ha usuaris registrats.");
            } else {
                StringBuilder usuarisList = new StringBuilder();
                for (Usuari u : usuaris) {
                    usuarisList.append(u.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, usuarisList.toString(), "Llista d'Usuaris", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Mètode per esborrar els usuaris registrats al fitxer .daf anteriorment. S'han implementat algunes restriccions per a que no hi hagi ningun al moment d'utilitzar el mètode
     * @param nom Amb la variable nom podem indicar quin és el nickname de l'usuari que volem esborrar de les dades
     */
    public void esborrarUsuari(String nom) {
        try {
            if (nom == null || nom.trim().isEmpty()) {
                throw new IllegalArgumentException("El nom d'usuari no pot estar buit.");
            }

            boolean eliminat = usuaris.removeIf(u -> u.getNom().equalsIgnoreCase(nom));

            if (eliminat) {
                Fitxers.guardarUsuaris(usuaris, FITXER_USUARIS);
                JOptionPane.showMessageDialog(null, "Usuari eliminat correctament.");
            } else {
                throw new IllegalArgumentException("No s'ha trobat cap usuari amb aquest nom.");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public class Usuari implements Serializable {
        private String nom;
        private int numPartidesJugades;
        private int partidesGuanyades;
        private int respostesCorrectes;

        /**
         * El mètode constructor de la clase Usuari on registrem les dades de l'usuari amb: el seu nom, partides jugades, partides guanyades i respostes correctes
         * @param nom Registrem amb la variable nom el nickname del nou usuari
         */
        public Usuari(String nom) {
            this.nom = nom;
            this.numPartidesJugades = 0;
            this.partidesGuanyades = 0;
            this.respostesCorrectes = 0;
        }

        //Paràmetres dels getters i setters del mètode constructor Usuari
        public Usuari() {
        }

        public String getNom() {
            return nom;
        }

        public int getNumPartidesJugades() {
            return numPartidesJugades;
        }

        public int getPartidesGuanyades() {
            return partidesGuanyades;
        }

        public int getRespostesCorrectes() {
            return respostesCorrectes;
        }

        public void incrementarPartidesJugades() {
            this.numPartidesJugades++;
        }

        public void incrementarPartidesGuanyades() {
            this.partidesGuanyades++;
        }

        public void incrementarRespostesCorrectes() {
            this.respostesCorrectes++;
        }

        @Override
        public String toString() {
            return "Usuari: " + nom +
                    " | Jugades: " + numPartidesJugades +
                    " | Guanyades: " + partidesGuanyades +
                    " | Correctes: " + respostesCorrectes;
        }
    }
}