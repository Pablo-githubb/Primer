package testCultura;

import testCultura.models.GestorPreguntes;
import testCultura.models.GestorPreguntes.Pregunta;
import testCultura.models.GestorPreguntes.testCultura;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal del joc de preguntes.
 */
public class joc extends JFrame {
    private JButton btnA, btnB, btnC, btnSeguent;
    private JTextArea textPreguntes;
    private JPanel panell;
    private List<Pregunta> preguntes;
    private int indexPregunta = 0;
    private int puntuacio = 0;

    /**
     * Constructor de la classe joc.
     * @throws IOException si hi ha un error en carregar les preguntes.
     */
    public joc() throws IOException {
        // Inicialitza el panell
        panell = new JPanel();
        textPreguntes = new JTextArea();
        btnA = new JButton();
        btnB = new JButton();
        btnC = new JButton();
        btnSeguent = new JButton();

        // Afegeix els components al panell
        panell.add(textPreguntes);
        panell.add(btnA);
        panell.add(btnB);
        panell.add(btnC);
        panell.add(btnSeguent);

        this.setContentPane(panell);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        // Estableix la mida mínima a la mida actual
        setMinimumSize(getPreferredSize());

        // Centra el frame a la pantalla
        setLocationRelativeTo(null);

        try {
            testCultura t = GestorPreguntes.carregarPreguntes("preguntesTest.json");
            preguntes = new ArrayList<>();
            for (Pregunta p : t.categoria) {
                preguntes.add(p);
            }
            mostrarPregunta();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error carregant les preguntes: " + e.getMessage());
            System.exit(1);
        }

        btnA.addActionListener(e -> validarResposta(btnA.getText()));
        btnB.addActionListener(e -> validarResposta(btnB.getText()));
        btnC.addActionListener(e -> validarResposta(btnC.getText()));
        btnSeguent.addActionListener(e -> passarSeguentPregunta());
    }

    /**
     * Mostra la pregunta actual.
     */
    private void mostrarPregunta() {
        if (indexPregunta < preguntes.size()) {
            Pregunta p = preguntes.get(indexPregunta);
            textPreguntes.setText(p.pregunta);
            btnA.setText(p.opcions[0]);
            btnB.setText(p.opcions[1]);
            btnC.setText(p.opcions[2]);
        } else {
            JOptionPane.showMessageDialog(this, "Test completat! Puntuació: " + puntuacio);
            System.exit(0);
        }
    }

    /**
     * Valida la resposta seleccionada.
     * @param resposta la resposta seleccionada.
     */
    private void validarResposta(String resposta) {
        if (preguntes.get(indexPregunta).correcta.equalsIgnoreCase(resposta)) {
            puntuacio += preguntes.get(indexPregunta).punts;
        }
        passarSeguentPregunta();
    }

    /**
     * Passa a la següent pregunta.
     */
    private void passarSeguentPregunta() {
        indexPregunta++;
        mostrarPregunta();
    }

    /**
     * Mètode principal per iniciar l'aplicació.
     * @param args arguments de la línia de comandes.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            joc j = null;
            try {
                j = new joc();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Hi ha hagut algun error al programa!!");
                System.exit(1);
            }
        });
    }
}
