package testCultura.models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * La classe Fitxers proporciona mètodes per llegir i guardar objectes d'usuaris en fitxers.
 */
public class Fitxers {
    /**
     * Llegeix una llista d'usuaris des d'un fitxer.
     * @param rutaFitxer La ruta del fitxer des del qual es llegiran els usuaris.
     * @return Una llista d'objectes Usuari llegits del fitxer.
     */
    public static List<Usuaris.Usuari> llegirUsuaris(String rutaFitxer) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaFitxer))) {
            return (List<Usuaris.Usuari>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    /**
     * Guarda una llista d'usuaris en un fitxer.
     * @param usuaris La llista d'usuaris a guardar.
     * @param rutaFitxer La ruta del fitxer on es guardaran els usuaris.
     */
    public static void guardarUsuaris(List<Usuaris.Usuari> usuaris, String rutaFitxer) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaFitxer))) {
            oos.writeObject(usuaris);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}