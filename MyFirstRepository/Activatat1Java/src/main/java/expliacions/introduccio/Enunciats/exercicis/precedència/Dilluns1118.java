package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.util.Random;
import java.util.Scanner;

public class Dilluns1118 {
    public static final int NUMCARES = 6;

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Random r = new Random();

        int[] comptadorcares = new int[NUMCARES];

        for (int i = 0; i < 100; i++) {
            int index = r.nextInt(NUMCARES);
            comptadorcares[index]++;
        }


        for (int i = 0; i < NUMCARES; i++) {
            System.out.format("La cara %d ha sortit %d vegades.%n", i + 1, comptadorcares[i]);
        }
    }
}

class GenerarLletres {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.format("%c%n", (char) (r.nextInt('z' - 'A') + 'A'));

        System.out.format("%c %d%n", 'a', (int) 'a');
        System.out.format("%c %d%n", 'z', (int) 'z');
        System.out.format("%c %d%n", 'A', (int) 'A');
        System.out.format("%c %d%n", 'z', (int) 'Z');


    }
}


class exercici9 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r = new Random();
        int num = 0;
        int[] comptador = new int['Z' - 'A' + 1];

        //Demanem el número positiu a l'usuari
        do {
            System.out.println("Introduix un número enter positiu:");
            num = ent.nextInt();
            if (num <= 0) System.out.println("El número ha de ser major que 0!!");
            else break;
        } while (true);

        //generem les lletres aleatòriament
        extracted(r, num, comptador);
        System.out.println();

        //Mirem quines lletres han sortit i quantes vegades
        for (int i = 0; i < comptador.length; i++) {
            if (comptador[i] > 0)
                System.out.format("La lletra %c ha sortit %d vegades.%n", (char) (i + 'A'), comptador[i]);     //generem  la lletra a partir de  l'index aparegut
        }


    }

    private static void extracted(Random r, int num, int[] comptador) {
        for (int i = 0; i < num; i++) {
            int lletra = r.nextInt('Z' - 'A' + 1) + 'A';
            System.out.format("%c", (char) lletra);
            comptador[lletra - 'A']++;        //generem l'index del vector a partir de la lletra apareguda
        }
    }


}

class exercici9entrada {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Random r = new Random();
        int holadani = 0;
        int[] comptador = new int['Z' - 'A' + 1];
        char[] entrada; //creu un vector que guardara la entrada

        //Demanem el número positiu a l'usuari
        do {
            System.out.println("Introduix un número enter positiu:");
            holadani = ent.nextInt();
            if (holadani <= 0) System.out.println("El número ha de ser major que 0!!");
            else break;
        } while (true);

        entrada = new char[holadani];

        //generem les lletres aleatòriament
        for (int i = 0; i < holadani; i++) {
            int lletra = r.nextInt('Z' - 'A' + 1) + 'A';
            System.out.format("%c", (char) lletra);
            comptador[lletra - 'A']++;        //generem l'index del vector a partir de la lletra apareguda
            entrada[i] = (char) lletra;
        }
        System.out.println();

        //Mirem quines lletres han sortit i quantes vegades
        for (int i = 0; i < entrada.length; i++) {
            if (comptador[entrada[i] - 'A'] > 0)
                System.out.format("La lletra %c ha sortit %d vegades.%n", entrada[i], comptador[entrada[i] - 'A']);     //generem  la lletra a partir de  l'index aparegut
            comptador[entrada[i] - 'A'] = 0;
        }
    }
}

class exercici9boolean {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r = new Random();
        int num = 0;
        int[] comptador = new int['Z' - 'A' + 1];
        char[] entrada;                         //declaro un vector on guardaré l'entrada. No l'instàncio pk no sé quantes caselles necessitaré
        boolean[] tractades = new boolean['Z' - 'A' + 1];  //vector per saber si hem tractat una lletra o no
        //Demanem el número positiu a l'usuari
        do {
            System.out.println("Introduix un número enter positiu:");
            num = ent.nextInt();
            if (num <= 0) System.out.println("El número ha de ser major que 0!!");
            else break;
        } while (true);
        entrada = new char[num];      //Ara que sé quantes caselles necessityo instancio el vector

        //generem les lletres aleatòriament
        for (int i = 0; i < num; i++) {
            int lletra = r.nextInt('Z' - 'A' + 1) + 'A';
            System.out.format("%c", (char) lletra);
            comptador[lletra - 'A']++;        //generem l'index del vector a partir de la lletra apareguda
            entrada[i] = (char) lletra;
        }
        System.out.println();

        //Mostrem quantes vegades han aparegut les lletres de l'entrada, evitant repeticions
        for (int i = 0; i < entrada.length; i++) {
            //Per evitar repeticions mirarem el contingut del vector de lletres tractades
            if (!tractades[entrada[i] - 'A']) {
                System.out.format("La lletra %c ha sortit %d vegades.%n", entrada[i], comptador[entrada[i] - 'A']);     //generem  la lletra a partir de  l'index aparegut
                tractades[entrada[i] - 'A'] = true;
            }
        }
    }
}
