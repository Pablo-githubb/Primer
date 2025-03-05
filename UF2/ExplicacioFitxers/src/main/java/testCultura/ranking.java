package testCultura;

import testCultura.models.Usuaris;
import testCultura.models.Usuaris.Usuari;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

public class ranking extends JFrame {
    private JTable taulaRanking;
    private JPanel panell1;
    private JButton btnMenu;
    private Usuaris usuaris;

    /**
     * Constructor de la classe ranking.
     *
     * @param usuaris Llista dels usuaris registrats del .dat.
     */
    public ranking(Usuaris usuaris) {
        this.usuaris = usuaris;

        // Inicialitza els components
        panell1 = new JPanel(new BorderLayout());
        taulaRanking = new JTable();
        btnMenu = new JButton("Menú Principal");

        // Afegeix els components al panell
        panell1.add(new JScrollPane(taulaRanking), BorderLayout.CENTER);
        panell1.add(btnMenu, BorderLayout.SOUTH);

        // Configura la finestra
        this.setTitle("RANKING GENERAL");
        this.setContentPane(panell1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Configura el listener del botó Menú Principal
        btnMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    FinestraRegistre f = new FinestraRegistre();
                    dispose(); // Tanca la finestra actual
                } catch (IOException | ClassNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "Error al obrir la pantalla de registre: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Mostra el ranking
        mostrarRanking();
    }

    /**
     * Mostra el ranking general de tots els usuaris registrats.
     */
    private void mostrarRanking() {
        List<Usuari> llistaUsuaris = usuaris.getUsuaris();
        String[] columnNames = {"Nom", "Partides Jugades", "Puntuació", "Partides Guanyades", "Respostes Correctes"};
        Object[][] data = new Object[llistaUsuaris.size()][5];
        for (int i = 0; i < llistaUsuaris.size(); i++) {
            Usuari u = llistaUsuaris.get(i);
            data[i][0] = u.getUsername();
            data[i][1] = u.getNumPartidesJugades();
            data[i][2] = u.getPuntuacio();
            data[i][3] = u.getPartidesGuanyades();
            data[i][4] = u.getRespostesCorrectes();
        }
        taulaRanking.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
    }
}