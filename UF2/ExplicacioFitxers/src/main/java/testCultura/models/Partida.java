package testCultura.models;

import testCultura.models.GestorPreguntes.Pregunta;
import testCultura.ranking;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class Partida extends JFrame {
    private JButton btnA, btnB, btnC;
    private JTextArea textPreguntes;
    private JPanel panell;
    private JProgressBar progressBar;
    private Timer timer;
    private JTable taula;
    private DefaultTableModel dtm;

    private List<Pregunta> preguntes;
    private List<Jugador> jugadors;
    private int indexPregunta = 0;
    private int jugadorActual = 0;
    private int tempsRestant = 30; // 30 segons per respondre
    private Usuaris usuaris;

    public Partida(List<Jugador> jugadors, Usuaris usuaris) throws ClassNotFoundException {
        this.jugadors = jugadors;
        this.usuaris = usuaris;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        panell = new JPanel(new BorderLayout());
        textPreguntes = new JTextArea(5, 40);
        textPreguntes.setEditable(false);
        textPreguntes.setLineWrap(true);
        textPreguntes.setWrapStyleWord(true);
        btnA = new JButton();
        btnB = new JButton();
        btnC = new JButton();
        progressBar = new JProgressBar(0, 30);
        taula = new JTable();

        JPanel panelBotons = new JPanel(new GridLayout(1, 3));
        panelBotons.add(btnA);
        panelBotons.add(btnB);
        panelBotons.add(btnC);

        panell.add(new JScrollPane(textPreguntes), BorderLayout.NORTH);
        panell.add(panelBotons, BorderLayout.CENTER);
        panell.add(progressBar, BorderLayout.SOUTH);
        panell.add(new JScrollPane(taula), BorderLayout.EAST);

        this.setContentPane(panell);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        setMinimumSize(getPreferredSize());
        setLocationRelativeTo(null);

        preguntes = GestorPreguntes.carregarPreguntes();
        mostrarPregunta();

        btnA.addActionListener(e -> validarResposta(btnA.getText()));
        btnB.addActionListener(e -> validarResposta(btnB.getText()));
        btnC.addActionListener(e -> validarResposta(btnC.getText()));

        iniciarTimer();
    }

    private void mostrarPregunta() {
        if (indexPregunta < preguntes.size()) {
            Pregunta p = preguntes.get(indexPregunta);
            textPreguntes.setText(p.pregunta);
            btnA.setText(p.opcions[0]);
            btnB.setText(p.opcions[1]);
            btnC.setText(p.opcions[2]);
            tempsRestant = 30;
            progressBar.setValue(tempsRestant);
        } else {
            finalitzarPartida();
        }
    }

    private void validarResposta(String resposta) {
        if (resposta == null || resposta.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Resposta no vàlida.");
            return;
        }

        Jugador jugador = jugadors.get(jugadorActual);
        if (preguntes.get(indexPregunta).correcta.equalsIgnoreCase(resposta)) {
            jugador.incrementarPuntuacio(preguntes.get(indexPregunta).punts);
        }
        if (jugador.getPuntuacio() >= 200) {
            finalitzarPartida();
        } else {
            passarSeguentPregunta();
        }
    }

    private void passarSeguentPregunta() {
        indexPregunta++;
        jugadorActual = (jugadorActual + 1) % jugadors.size();
        mostrarPregunta();
    }

    private void iniciarTimer() {
        timer = new Timer(1000, e -> {
            tempsRestant--;
            progressBar.setValue(tempsRestant);
            if (tempsRestant <= 0) {
                timer.stop();
                JOptionPane.showMessageDialog(this, "T'HAS QUEDAT SENSE TEMPS TONTET. Has de començar de nou");
                finalitzarPartida();
            }
        });
        timer.start();
    }

    private void finalitzarPartida() {
        if (timer != null) {
            timer.stop();
        }

        Jugador guanyador = jugadors.stream().max((j1, j2) -> Integer.compare(j1.getPuntuacio(), j2.getPuntuacio())).orElse(null);
        if (guanyador != null) {
            guanyador.incrementarPartidesGuanyades();
            JOptionPane.showMessageDialog(this, "El guanyador és " + guanyador.getNom() + " amb " + guanyador.getPuntuacio() + " punts!");
        }
        usuaris.actualitzarEstadistiques(jugadors);
        new ranking(usuaris);
        this.dispose();
    }
}