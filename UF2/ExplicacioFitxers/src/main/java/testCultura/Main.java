package testCultura;

import testCultura.models.Usuaris;

import javax.swing.*;
import java.io.IOException;

/**
 * Classe principal del projecte per iniciar el joc.
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                Usuaris usuaris = new Usuaris();
                FinestraRegistre f = new FinestraRegistre();
            } catch (IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Hi ha hagut algun error al programa!!!");
                System.exit(1);
            }
        });
    }
}