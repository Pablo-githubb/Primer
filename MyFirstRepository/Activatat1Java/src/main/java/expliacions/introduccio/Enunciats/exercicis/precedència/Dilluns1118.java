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
        for (int i = 0; i < num; i++) {
            int lletra = r.nextInt('Z' - 'A' + 1) + 'A';
            System.out.format("%c", (char) lletra);
            comptador[lletra - 'A']++;        //generem l'index del vector a partir de la lletra apareguda
        }
        System.out.println();

        //Mirem quines lletres han sortit i quantes vegades
        for (int i = 0; i < comptador.length; i++) {
            if (comptador[i] > 0)
                System.out.format("La lletra %c ha sortit %d vegades.%n", (char) (i + 'A'), comptador[i]);     //generem  la lletra a partir de  l'index aparegut
        }


    }


}

class exercici9entrada {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Random r = new Random();
        int num = 0;
        int[] comptador = new int['Z' - 'A' + 1];
        char[] entrada; //creu un vector que guardara la entrada

        //Demanem el número positiu a l'usuari
        do {
            System.out.println("Introduix un número enter positiu:");
            num = ent.nextInt();
            if (num <= 0) System.out.println("El número ha de ser major que 0!!");
            else break;
        } while (true);

        entrada = new char[num];

        //generem les lletres aleatòriament
        for (int i = 0; i < num; i++) {
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
        char[] entrada; //creu un vector que guardara la entrada
        boolean[] tractats = new boolean['Z' - 'A' + 1];
        //Demanem el número positiu a l'usuari
        do {
            System.out.println("Introduix un número enter positiu:");
            num = ent.nextInt();
            if (num <= 0) System.out.println("El número ha de ser major que 0!!");
            else break;
        } while (true);

        entrada = new char[num];

        //generem les lletres aleatòriament
        for (int i = 0; i < num; i++) {
            int lletra = r.nextInt('Z' - 'A' + 1) + 'A';
            System.out.format("%c", (char) lletra);
            comptador[lletra - 'A']++;        //generem l'index del vector a partir de la lletra apareguda
            entrada[i] = (char) lletra;
        }
        System.out.println();

        //Mirem quines lletres han sortit i quantes vegades
        for (int i = 0; i < entrada.length; i++) {
            if (!tractats[entrada[i] - 'A'])
                System.out.format("La lletra %c ha sortit %d vegades.%n", entrada[i], comptador[entrada[i] - 'A']);     //generem  la lletra a partir de  l'index aparegut
            tractats[entrada[i] - 'A'] = true;
        }
    }
}

class matriunumer {
    public static void main(String[] args) {

        Random r = new Random();

        int[][] m = new int[5][5];
        int[][] sumaveins = new int[5][5];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.format("%3d ", m[i][j] = r.nextInt(10));
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0 ; j < m[i].length; j++) {
                //tractament de la casella actual
                int suma = 0;
                //casella interior

                if (i == 0 || i == m.length-1 || j == 0 || j == m[i].length-1) {
                    if (i==0) suma = m[i][j - 1]+m[i][j + 1] + m[i + 1][j - 1] + m[i + 1][j] + m[i + 1][j + 1];
                } else {
                    suma = m[i - 1][j - 1] + m[i - 1][j] + m[i - 1][j + 1] + m[i][j - 1] + m[i][j + 1] + m[i + 1][j - 1] + m[i + 1][j] + m[i + 1][j + 1];
                }
                System.out.format("%3d ", suma);
            }
            System.out.println();
        }
    }
}