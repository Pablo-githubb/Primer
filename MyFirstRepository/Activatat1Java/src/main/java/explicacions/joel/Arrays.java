package explicacions.joel;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            int k = ent.nextInt();
            int[] vector = new int[k];

            for (int i = 0; i < vector.length; i++) {
                vector[i] = ent.nextInt();

            }
            int p = ent.nextInt();

            System.out.println(vector[p]);
        }
    }
}


class escriurearray1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        // Leer el tamaño del array
        int tamany = ent.nextInt();

        // Leer los elementos del array
        int[] array = new int[tamany];
        for (int i = 0; i < array.length; i++) {
            array[i] = ent.nextInt();
        }

        // Leer la posición a acceder
        int N = ent.nextInt();

        // Imprimir el array completo
        for (int num : array) {
            System.out.println(num + " ");
        }

        // Imprimir el elemento en la posición N
        System.out.println(array[N]);
    }
}

class escriurearray4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int tamany = ent.nextInt();
        int[] vector = new int[tamany];

        for (int i = 0; i < tamany; i++) {
            vector[i] = ent.nextInt();
        }
        int suma = ent.nextInt();
        for (int num : vector) {
            System.out.print((num + suma) + " ");
        }
    }
}


class arraystrings{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int tamany = ent.nextInt();
        int[] vector = new int[tamany];

        String str = ent.skip("[\r\n]*").nextLine();
    }
}

