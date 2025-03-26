package explicacions;

import java.time.chrono.IsoChronology;
import java.util.Arrays;
import java.util.Scanner;
public class Divendres20241108 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //declarem una array bidimensonals --> matriu

        int[][] matriu;

        matriu= new int[2][3]; //files = 2 columnes = 3

        //recoregut d'una matriu ---> necessitem 2 for un dins de l'altre

        for (int i = 0; i < matriu.length ; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                    matriu[i][j]= ent.nextInt();
            }
        }


        // mostrem el contingut de la matriu
        for (int i = 0; i < matriu.length ; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.format("%5d ",matriu[i][j]);
            }
            System.out.println();
        }
    }
}


class escriuunamatriu {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int[][] matriu;
        matriu = new int[ent.nextInt()][ent.nextInt()];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = ent.nextInt();
            }
        }
        int posiciofila = ent.nextInt();
        int posiciocolumna = ent.nextInt();
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.format("%5d ", matriu[i][j]);
            }
            System.out.println();
        }
        System.out.format("%d ", matriu[posiciofila][posiciocolumna]);
    }
}

class matriuamorfa {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[][] matriu = new int[5][];

        matriu[0] = new int[4]; //primera fila 4 columnes    ****
        matriu[1] = new int[1]; //segona fila 1 columna      *
        matriu[2] = new int[0]; //tercera fila 0 columnes    0
        matriu[3] = new int[2]; //quarta fila 2 columnes     **
        matriu[4] = new int[3]; //cinquena fila 3 columnes   ***

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.format("5%d ", matriu[i][j]);
            }
            System.out.println();
        }
    }
}

class matriumaxim {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            int num1 = ent.nextInt();
            int num2 = ent.nextInt();
            int[][] matriu = new int[num1][num2];

            int maxim = 0;
            int maximcolumna = 0;
            int maximfila = 0;

            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu[i].length; j++) {
                    matriu[i][j] = ent.nextInt();
                    if (matriu[i][j] > maxim) {

                    maxim = matriu[i][j];
                    maximfila = i + 1;
                    maximcolumna = j + 1;
                }
                }
            }
            System.out.format("%d %d\n", maximfila, maximcolumna);
        }
    }
}


