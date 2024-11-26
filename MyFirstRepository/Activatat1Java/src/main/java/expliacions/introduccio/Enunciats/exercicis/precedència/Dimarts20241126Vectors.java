package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.awt.event.WindowFocusListener;
import java.util.Scanner;

import java.util.Random;

public class Dimarts20241126Vectors {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n;
        do {
            System.out.println("Introduix el numerps vols");
            n = ent.nextInt();
            if (n >0) break;
        }while (true);

        char lletra='A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%2c", lletra);

                if(lletra=='Z') lletra='A';
                else lletra++;
            }

            System.out.println();
        }

    }
}

class exe16 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Introduix un nombre per a les files: ");
        int files = ent.nextInt();
        System.out.println("Introduix un nombre per a les columnes: ");
        int columnes = ent.nextInt();

        Random r = new Random();
        int[][] matriu = new int[files][columnes];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = r.nextInt(101);
            }
        }

        //matriu generada
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.format("%5d", matriu[i][j]);
            }
        }
        System.out.println();
        int sumafila = 0;
        for (int i = 0; i <= files; i++) {
            for (int j = 0; j <= columnes; j++) {
                sumafila += matriu[i][j];
                System.out.format("%d", sumafila[i]);
            }
        }
        System.out.println();

        int sumacolumna = 0;
        for (int j = 0; j <= columnes; j++) {
            for (int i = 0; i <= files; i++) {
                sumacolumna += matriu[i][j];
                System.out.format("%d", sumacolumna[j]);
            }
        }
        System.out.println();
    }
}

class exe16bis{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int superior;
        int inferior;
        do {
            System.out.println("Introduix un numero dintre del rang de valors: ");
            inferior =ent.nextInt();
        }while (inferior < 0);

        do {
            System.out.println("Introduix un numero dintre del rang de valors: ");
            superior =ent.nextInt();
        }while (superior<inferior);

        Random r = new Random();

        int[] comptador = new int [(superior - inferior)+1];
        int [][] matriu = new int[5][10];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = r.nextInt(inferior, superior);
                System.out.format("%5d ", matriu[i][j]);
                System.out.format("El valor %d ha sortit %d ");comptador[matriu[i][j] - inferior] += 1;

            }
        }








    }
}