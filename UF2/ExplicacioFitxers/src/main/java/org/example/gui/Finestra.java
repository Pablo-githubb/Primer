package org.example.gui;

import com.iesebre.usefulcode.DirectAccessFile;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Finestra extends JFrame {
    private JPanel panel;
    private JButton botoInsertar;
    private JButton botoBorrar;
    private JButton botoModificar;
    private JTextField campNom;
    private JTextField campCognoms;
    private JTable taula;
    //Model de dades de la taula
    private DefaultTableModel dtm;

    private DirectAccessFile<Pojo> daf;

    public Finestra() throws IOException, ClassNotFoundException {
        //Per poder visualitzar la finestra farem...
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        //Instanciem el fitxer
        daf = new DirectAccessFile<>("pojos.daf");

        //Carreguem les dades del fitxer al model de dades
        Object[][] dades = new Object[daf.size()][2];

        for (int i = 0; i < daf.size(); i++) {
            Pojo p = daf.readObject(i);
            dades[i][0] = p.getNom();
            dades[i][1] = p.getCognoms();
        }


        //Anem a establir el model de dades de la taula
        dtm = new DefaultTableModel(
                //Dades a mostrar
                dades,
                //Definim les columnes de la taula
                new Object[]{"Nom", "Cognoms"}
        );

        //Li assignem el model a la taula
        taula.setModel(dtm);

        //Poso el model de selecció de la taula de manera que només pugue seleccionar una fila
        taula.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Listeners dels diferents components de la finestra
        botoInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!campNom.getText().isBlank() || !campCognoms.getText().isBlank()) {
                    try {
                        daf.writeObject(new Pojo(campNom.getText().strip(), campCognoms.getText().strip()));
                        dtm.addRow(new Object[]{campNom.getText().strip(), campCognoms.getText().strip()});
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog((Component) actionEvent.getSource(), "Ha hagut un problema al insertar");
                    }
                } else
                    JOptionPane.showMessageDialog((Component) actionEvent.getSource(), "No pots insertar un tetx en blanc!!");
            }
        });
        botoBorrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //Creem una variable per guardar la fila a borrar, que serà la que tenim seleccionada
                int filaSel = taula.getSelectedRow();
                if (filaSel != -1) {
                    //Si es cumplix la condició vol dir que hem seleccionat una fila
                    try {
                        daf.deleteObject(filaSel);
                    } catch (IOException | ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(e.getComponent(), "Ha hagut un error al borrar els arxius del programa");
                    }
                    dtm.removeRow(filaSel);
                } else {
                    JOptionPane.showMessageDialog(e.getComponent(), "Has de seleccionar a la taula la fila que vols borrar!!");
                }
            }
        });
        botoModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Creem una variable per guardar la fila a borrar, que serà la que tenim seleccionada
                int filaSel = taula.getSelectedRow();
                if (filaSel != -1 && (!campNom.getText().isBlank() || !campCognoms.getText().isBlank())) { //Si es cumplix la condició vol dir que hem seleccionat una fila
                    try {
                        daf.updateObject(new Pojo(campNom.getText().strip(), campCognoms.getText().strip()), filaSel);
                        dtm.removeRow(filaSel);     //primer borrem la fila seleccionada
                        dtm.insertRow(filaSel, new Object[]{campNom.getText().strip(), campCognoms.getText().strip()});
                        campNom.setText("");
                        campCognoms.setText("");
                    } catch (IOException | ClassNotFoundException e) {
                        JOptionPane.showMessageDialog((Component) actionEvent.getSource(), "Hi ha hagut algun error al modificar, comprova-ho");
                    }
                } else
                    JOptionPane.showMessageDialog((Component) actionEvent.getSource(), "Has de seleccionar a la taula la fila que vols modificar I POSAR UN NOU TEXT");
            }
        });
        taula.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //Copio el contingut de la fila seleccionada als corresponents camps del formulari
                int filaSel = taula.getSelectedRow();
                if (filaSel != -1) { //Si es cumplix la condició vol dir que hem seleccionat una fila
                    campNom.setText(taula.getValueAt(filaSel, 0).toString());
                    campCognoms.setText(taula.getValueAt(filaSel, 1).toString());
                } else {       //Hem deseleccionat
                    campNom.setText("");
                    campCognoms.setText("");
                }
            }
        });

        //Aqui posarem el codi que volem executar quan tanquem l'aplicació
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                try {
                    daf.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(e.getComponent(), "Hi ha hagut algun error d'I/O al tancar el programa");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Finestra f = new Finestra();
                } catch (ClassNotFoundException | IOException e) {
                    JOptionPane.showMessageDialog(null, "Hi ha hagut algun error al programa!!");
                    System.exit(1);
                }
            }
        });
    }

}