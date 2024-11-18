package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.util.Random;
import java.util.Scanner;

public class Dilluns1118 {
    public static final int NUMCARES=6;
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Random r=new Random();

        int[] comptadorcares = new int[NUMCARES];

        for (int i = 0; i < 100; i++) {
            int index = r.nextInt(NUMCARES);
            comptadorcares[index]++;
        }


        for (int i = 0; i < NUMCARES; i++) {
            System.out.format("La cara %d ha sortit %d vegades.%n", i+1, comptadorcares[i]);
        }
    }
}

class GenerarLletres{
    public static void main(String[] args) {
        Random r = new Random();

        System.out.format("%c%n", (char)(r.nextInt('z'-'A')+'A'));

        System.out.format("%c %d%n", 'a', (int)'a');
        System.out.format("%c %d%n", 'z', (int)'z');
        System.out.format("%c %d%n", 'A', (int)'A');
        System.out.format("%c %d%n", 'z', (int)'Z');


    }
}


class programa{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Introduix un enter positiu: ");
        int num=0;
        do {
            num = ent.nextInt(); //indiquem el numero
            if(num<=0) System.out.println("El numero ha de ser major que 0");
            else {
                Random r = new Random();
//generem les lletres aleatoriament
                int[] vector = new int['Z' - 'A'];
                for (int i = 0; i < num; i++) {
                    int lletra=r.nextInt(('Z' - 'A'+1)+'A');
                    System.out.format("%c",(char)lletra);
                    vector[lletra-'A']++;
                }
                System.out.println();

        //mirem quines lletres han sortit
                for (int i = 0; i <= vector.length; i++) {
                    if (vector[i]>0)
                        System.out.format("%c",(char)(vector[i]+'A'));

                }

            }
        } while (num > 0);
    }
}


