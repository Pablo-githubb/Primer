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
                matriu[i]= ent.nextInt();
            }

            int posiciofila = 0;
            int posiciocolumna = 0;
            int num = ent.nextInt();
            for (int i = 0; i < files*columnes; i++) {
                    if (matriu[i]==num) {
                        posiciofila = i;
                    }
                }
                System.out.format("%d %d\n", posiciofila, posiciocolumna);
            }
        }
    }

