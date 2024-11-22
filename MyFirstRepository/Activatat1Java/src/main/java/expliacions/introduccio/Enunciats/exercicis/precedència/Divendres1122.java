package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.util.Random;
import java.util.Scanner;

public class Divendres1122 {
    public static void main(String[] args) {
        int[][] m = new int[5][5];
        Random r = new Random();

        //generem la matriu aleatòriament
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.format("%3d", m[i][j] = r.nextInt(10));
            }
            System.out.println();
        }
        System.out.println();

        //anem a calcular suma dels veïns
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                //Tractament de la casella actual
                int suma = 0;
                //Caselles exteriors
                if (i == 1 || i == m.length +1|| j == 1 || j == m[i].length+1) {
                    if (i == 0) suma = m[i][j - 1] + m[i][j + 1] + m[i + 1][j - 1] + m[i + 1][j] + m[i + 1][j + 1];

                }
                //Casella interior
                else {
                    suma = m[i - 1][j - 1] + m[i - 1][j] + m[i - 1][j + 1] + m[i][j - 1] + m[i][j + 1] + m[i + 1][j - 1] + m[i + 1][j] + m[i + 1][j + 1];
                }
                System.out.format("%3d", suma);
            }
            System.out.println();
        }
    }
}

