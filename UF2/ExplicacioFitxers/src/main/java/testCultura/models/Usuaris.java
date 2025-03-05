package testCultura.models;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Usuaris implements Serializable {
    private static final String FITXER_USUARIS = "usuaris.dat";
    private List<Usuari> usuaris;
    private Map<String, Usuari> usuarisMap; // Per buscar més eficientment

    /**
     * Constructor de la clase Usuaris.
     * Inicialitza la llista dels usuaris desde l'arxiu.
     */
    public Usuaris() {
        usuaris = Fitxers.llegirUsuaris();
        if (usuaris == null) {
            usuaris = new ArrayList<>(); // Evita NullPointerException si no se pueden leer usuarios
        }
        usuarisMap = new HashMap<>();
        for (Usuari usuari : usuaris) {
            usuarisMap.put(usuari.getUsername().toLowerCase(), usuari);
        }
    }

    /**
     * Registra un nou usuari amb un nom de d'usuari i contrasenya.
     *
     * @param username    El nom l'usuari.
     * @param contrasenya La constrasenya de l'usuari.
     */
    public void registrarUsuari(String username, char[] contrasenya) {
        try {
            if (username == null || username.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre de usuario no puede estar vacío.");
            }
            if (contrasenya == null || contrasenya.length == 0) {
                throw new IllegalArgumentException("La contraseña no puede estar vacía.");
            }

            String usernameLower = username.toLowerCase();
            if (usuarisMap.containsKey(usernameLower)) {
                throw new IllegalArgumentException("Ya existe un usuario con ese nombre.");
            }

            Usuari nouUsuari = new Usuari(username, new String(contrasenya));
            usuaris.add(nouUsuari);
            usuarisMap.put(usernameLower, nouUsuari);
            Fitxers.guardarUsuaris(usuaris);
            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "El nom de l'usuari ja existeix");
        }
    }

    /**
     * Lista tots els usuaris registrats. Si no hi han usuaris, mostra un missatge d'error.
     */
    public void llistarUsuaris() {
        try {
            if (usuaris.isEmpty()) {
                throw new IllegalArgumentException("No hay usuarios registrados.");
            }

            StringBuilder usuarisList = new StringBuilder();
            for (Usuari u : usuaris) {
                usuarisList.append(u.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, usuarisList.toString(), "Lista de Usuarios", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error al listar els usuaris.");
        }
    }

    /**
     * Elimina un usuari registrat.
     *
     * @param username El nom de l'usuari a eliminar.
     */
    public void esborrarUsuari(String username) {
        try {
            if (username == null || username.trim().isEmpty()) {
                throw new IllegalArgumentException("El nom de l'usuari no pot ser null/buit.");
            }

            String usernameLower = username.toLowerCase();
            if (usuarisMap.remove(usernameLower) != null) {
                usuaris.removeIf(u -> u.getUsername().equalsIgnoreCase(username));
                Fitxers.guardarUsuaris(usuaris);
                JOptionPane.showMessageDialog(null, "Usuari eliminat correctament.");
            } else {
                throw new IllegalArgumentException("No hi ha ningun usuari amb aquest nom.");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar l'usuari.");
        }
    }

    /**
     * Actualitza les estadístiques dels usuaris bassats en els jugadors que han participat en una partida.
     * @param jugadors La llista dels jugadors que han participat en la partida.
     */
    public void actualitzarEstadistiques(List<Jugador> jugadors) {
        for (Jugador jugador : jugadors) {
            Usuari usuari = usuarisMap.get(jugador.getNom().toLowerCase());
            if (usuari != null) {
                usuari.incrementarPartidesJugades();
                usuari.incrementarPuntuacio(jugador.getPuntuacio());
                if (jugador.getPuntuacio() >= 200) {
                    usuari.incrementarPartidesGuanyades();
                }
            }
        }
        Fitxers.guardarUsuaris(usuaris);
    }

    /**
     * Retorna la llista dels usuaris registrats.
     *
     * @return La llista dels usuaris.
     */
    public List<Usuari> getUsuaris() {
        return usuaris;
    }

    /**
     * Mètode booleà que comprova si existeix un usuari amb el nom d'usuari donat.
     *
     * @param username
     * @return retorna el valor booleà true si l'usuari existeix, false en cas contrari.
     */
    public boolean existeixUsuari(String username) {
        if (username == null || username.trim().isEmpty()) {
            return false;
        }
        return usuarisMap.containsKey(username.toLowerCase());
    }

    /**
     * Clase interna que representa un usuario registrado.
     */
    public static class Usuari implements Serializable {
        private String username;
        private String contrasenya;
        private int numPartidesJugades;
        private int puntuacio;
        private int partidesGuanyades;
        private int respostesCorrectes;

        public Usuari(String username, String contrasenya) {
            this.username = username;
            this.contrasenya = contrasenya;
            this.numPartidesJugades = 0;
            this.puntuacio = 0;
            this.partidesGuanyades = 0;
            this.respostesCorrectes = 0;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getContrasenya() {
            return contrasenya;
        }

        public void setContrasenya(String contrasenya) {
            this.contrasenya = contrasenya;
        }

        public int getNumPartidesJugades() {
            return numPartidesJugades;
        }

        public int getPuntuacio() {
            return puntuacio;
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

        public void incrementarPuntuacio(int punts) {
            this.puntuacio += punts;
        }

        public void incrementarPartidesGuanyades() {
            this.partidesGuanyades++;
        }

        public void incrementarRespostesCorrectes() {
            this.respostesCorrectes++;
        }

        @Override
        public String toString() {
            return "Usuario: " + username +
                    " | Partidas Jugadas: " + numPartidesJugades +
                    " | Partidas Ganadas: " + partidesGuanyades +
                    " | Respuestas Correctas: " + respostesCorrectes;
        }
    }
}