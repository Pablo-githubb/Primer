package testCultura.models;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Fitxers {

    // Ruta del fitxer d'usuaris dins del sistema de fitxers
    private static final String RUTA_FITXER = "usuaris.dat";

    /**
     * Llegeix una llista d'usuaris des del fitxer. Si no existeix, el crea i retorna una llista buida.
     * @return Llista d'usuaris llegits del fitxer.
     */
    public static List<Usuaris.Usuari> llegirUsuaris() {
        List<Usuaris.Usuari> usuaris = new ArrayList<>();
        File fitxer = new File(RUTA_FITXER);

        if (!fitxer.exists()) {
            try {
                fitxer.getParentFile().mkdirs(); // Crea la carpeta si no existeix
                fitxer.createNewFile(); // Crea el fitxer buit
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error en crear el fitxer: " + RUTA_FITXER);
                return usuaris;
            }
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fitxer))) {
            usuaris = (List<Usuaris.Usuari>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error en llegir el fitxer: " + RUTA_FITXER);
        }

        return usuaris;
    }

    /**
     * Guarda una llista d'usuaris en el fitxer.
     *
     * @param usuaris Llista d'usuaris a guardar.
     * @throws IllegalArgumentException Si la llista d'usuaris és null o buida.
     */
    public static void guardarUsuaris(List<Usuaris.Usuari> usuaris) {
        if (usuaris == null || usuaris.isEmpty()) {
            throw new IllegalArgumentException("La llista d'usuaris no pot ser null/buida.");
        }

        File file = new File(RUTA_FITXER);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(usuaris);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error d'I/O en guardar el fitxer: " + RUTA_FITXER);
        }
    }
}