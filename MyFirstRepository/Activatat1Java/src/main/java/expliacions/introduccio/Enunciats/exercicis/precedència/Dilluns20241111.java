package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Scanner;

public class Dilluns20241111 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int[] diesMesosAny={31,28,31,30,31,31,31,31,30,31,30,31};
        diesMesosAny=new int[]{31,28,31,30,31,31,31,31,30,31,30,31};


        int[][] diesMesosAnyBi={{31},{31,28,31,30,31,31,31,31,30,31,30,31}};
        diesMesosAnyBi= new int[][]{{31},{30,31,30,31}};

        int[][][][][] cosa=new int[5][][][][];




    }
}

class indexofmatriu {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            int files = ent.nextInt();
            int columnes = ent.nextInt();
            int[][] matriu = new int[files][columnes];


            for (int i = 0; i < files*columnes; i++) {
             //
            }

            int posiciofila = 0;
            int posiciocolumna = 0;
            int num = ent.nextInt();
            for (int i = 0; i < files*columnes; i++) {
                   // if (matriu[i]==num) {
                        posiciofila = i;
                    }
                }
               // System.out.format("%d %d\n", posiciofila, posiciocolumna);
            }
        }

class sumafilescolumnes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int files = ent.nextInt();
        int columnes = ent.nextInt();
        int[][] matriu = new int[files][columnes];

        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                matriu[i][j] = ent.nextInt();
            }
        }
        int k = ent.nextInt();
        int sumafila = 0;
        int sumacolumna = 0;
        for (int i = 0; i < files; i++) {
            sumafila += matriu[i][k];
        }

        for (int j = 0; j < columnes; j++) {
            sumacolumna += matriu[k][j];
        }
        System.out.format("%d %d ", sumacolumna, sumafila);
    }
}

class matriuidentitat{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int k = ent.nextInt();
        int[][] matriu = new int[k][0];

        matriu[0] = new int[5];
        matriu[1] = new int[5];
        matriu[2] = new int[5];
        matriu[3] = new int[5];
        matriu[4] = new int[5];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                matriu[i][j]=0;
                System.out.format("5%d ", matriu[i][j]);
            }
            System.out.println();
        }
    }
}
//se perfectament que no esta be. Pero, no se com acabar-ho