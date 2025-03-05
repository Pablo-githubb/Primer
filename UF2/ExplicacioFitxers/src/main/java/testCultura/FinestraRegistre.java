package testCultura;

import com.iesebre.usefulcode.DirectAccessFile;
import testCultura.models.Partida;
import testCultura.models.Usuaris;
import testCultura.models.Usuaris.Usuari;
import testCultura.models.Jugador;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FinestraRegistre extends JFrame {
    private JPanel panell;
    private JTable taula;
    private JButton botoInsertar, botoBorrar, botoModificar, botoJugar, botoRanking;
    private JTextField campUsername;
    private JPasswordField campContrasenya;
    private JLabel Username, Contrasenya, etiqueta;
    private DefaultTableModel dtm;
    private Usuaris usuaris;

    // Fitxer d'accés directe
    private DirectAccessFile<Usuaris.Usuari> daf;
    private JTable table1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel titol;

    /**
     * Mètode Constructor de la classe FinestraRegistre.
     *
     * @throws IOException Si hi ha algun error en la lectura del fitxer.
     * @throws ClassNotFoundException Si hi ha algun error en la lectura del fitxer.
     */
    public FinestraRegistre() throws IOException, ClassNotFoundException {
        // Inicialitzem el panell
        panell = new JPanel();
        panell.setLayout(new BorderLayout());

        // Inicialitzem els components
        taula = new JTable();
        botoInsertar = new JButton("INSERTAR");
        botoBorrar = new JButton("BORRAR");
        botoModificar = new JButton("MODIFICAR");
        botoJugar = new JButton("JUGAR");
        botoRanking = new JButton("RANKING GENERAL");
        campUsername = new JTextField(20);
        campContrasenya = new JPasswordField(20);
        Username = new JLabel("Username:");
        Contrasenya = new JLabel("Contrasenya:");

        // Configurem la finestra
        this.setContentPane(panell);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setMinimumSize(getPreferredSize());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Inicialitza el fitxer d'accés directe
        daf = new DirectAccessFile<>("usuaris.dat");

        // Inicialitza la llista d'usuaris
        usuaris = new Usuaris();

        // Carreguem les dades del fitxer al model de dades de la taula
        Object[][] dades = new Object[daf.size()][2];
        for (int i = 0; i < daf.size(); i++) {
            Usuari u = daf.readObject(i);
            dades[i][0] = u.getUsername();
            dades[i][1] = "*****"; // No mostrem la contrasenya per seguretat
        }

        // Anem a establir el model de dades de la taula
        dtm = new DefaultTableModel(
                dades,
                new Object[]{"Username", "Contrasenya"}
        );

        // Li assignem el model a la taula
        taula.setModel(dtm);

        // Posem el model de selecció de la taula de manera que només es pugui seleccionar una fila
        taula.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Listeners dels diferents components de la finestra

        /**
         * Listener del botó per insertar un usuari.
         */
        botoInsertar.addActionListener(actionEvent -> {
            if (!campUsername.getText().isBlank() && campContrasenya.getPassword().length > 0) {
                try {
                    String username = campUsername.getText().strip();
                    char[] contrasenya = campContrasenya.getPassword();

                    // Verifiquem si l'usuari ja existeix
                    if (usuaris.existeixUsuari(username)) {
                        JOptionPane.showMessageDialog(null, "Aquest nom d'usuari ja existeix!!!");
                        return;
                    }

                    // Creem l'usuari
                    Usuari nouUsuari = new Usuaris.Usuari(username, new String(contrasenya));

                    // Afegim l'usuari al fitxer
                    daf.writeObject(nouUsuari);

                    // Afegim l'usuari a la taula
                    dtm.addRow(new Object[]{username, "*****"});

                    // Afegim l'usuari a la llista d'usuaris
                    usuaris.registrarUsuari(username, contrasenya);

                    // Netegem els camps
                    campUsername.setText("");
                    campContrasenya.setText("");
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Hi ha un error a l'insertar: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "NO POTS INSERTAR TEXT EN BLANC!!!");
            }
        });

        botoBorrar.addActionListener(actionEvent -> {
            int filaSel = taula.getSelectedRow();
            if (filaSel != -1) {
                try {
                    // Obtenim el nom de l'usuari a borrar
                    String username = taula.getValueAt(filaSel, 0).toString();

                    // Borrem l'usuari del fitxer
                    daf.deleteObject(filaSel);

                    // Borrem l'usuari de la taula
                    dtm.removeRow(filaSel);

                    // Borrem l'usuari de la llista d'usuaris
                    usuaris.esborrarUsuari(username);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ha hagut un error al borrar els arxius del programa: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Has de seleccionar a la taula la fila que vols borrar!!!");
            }
        });

        botoModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int filaSel = taula.getSelectedRow();
                if (filaSel != -1 && (!campUsername.getText().isBlank() || campContrasenya.getPassword().length > 0)) {
                    try {
                        String nouUsername = campUsername.getText().strip();
                        char[] novaContrasenya = campContrasenya.getPassword();

                        // Verifiquem si el nou nom d'usuari ja existeix
                        if (usuaris.existeixUsuari(nouUsername)) {
                            JOptionPane.showMessageDialog(null, "Aquest nom d'usuari ja existeix!!!");
                            return;
                        }

                        // Obtenim l'usuari antic
                        String anticUsername = taula.getValueAt(filaSel, 0).toString();

                        // Modifiquem l'usuari al fitxer
                        daf.updateObject(new Usuaris.Usuari(nouUsername, new String(novaContrasenya)), filaSel);

                        // Modifiquem l'usuari a la taula
                        dtm.removeRow(filaSel);
                        dtm.insertRow(filaSel, new Object[]{nouUsername, "*****"});

                        // Modifiquem l'usuari a la llista d'usuaris
                        usuaris.esborrarUsuari(anticUsername);
                        usuaris.registrarUsuari(nouUsername, novaContrasenya);

                        // Netegem els camps
                        campUsername.setText("");
                        campContrasenya.setText("");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Hi ha hagut algun error al modificar: ");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Has de seleccionar l'usuari que vols modificar abans. ESCRIURE EL NOU TEXT!!!");
                }
            }
        });
        /**
         * Listener de la taula per copiar el contingut de la fila seleccionada als camps del formulari.
         */
        taula.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int filaSel = taula.getSelectedRow();
                if (filaSel != -1) {
                    campUsername.setText(taula.getValueAt(filaSel, 0).toString());
                    campContrasenya.setText(""); // No mostrem la contrasenya per seguretat
                } else {
                    campUsername.setText("");
                    campContrasenya.setText("");
                }
            }
        });

        /**
         * Listener per tancar el fitxer quan es tanqui la finestra.
         */
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                if (daf != null) {
                    try {
                        daf.close();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Hi ha hagut algun error d'I/O al tancar el programa!!");
                    }
                }
            }
        });

        /**
         * Listener del botó per jugar i començar la partida.
         */
        botoJugar.addActionListener(actionEvent -> {
            int filaSel = taula.getSelectedRow();
            if (filaSel != -1) {
                String nomJugador = taula.getValueAt(filaSel, 0).toString();
                List<Jugador> jugadors = new ArrayList<>();
                jugadors.add(new Jugador(nomJugador));
                try {
                    new Partida(jugadors, usuaris);
                } catch (ClassNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "Hi ha hagut algun error al començar la partida");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Has de seleccionar un usuari per jugar!!!");
            }
        });

        /**
         * Listener del botó per dirigir-se al ranking general de la partida.
         */
        botoRanking.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new ranking(usuaris);
            }
        });
    }
}