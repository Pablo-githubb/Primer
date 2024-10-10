package expliacions.introduccio.Enunciats.exercicis.precedència;

import javax.swing.*;
import java.util.Scanner;
import java.util.SortedMap;

import static java.lang.System.in;

public class Dilluns2024107 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(in);


        //while (concicio certa){
        //instruccions a repetir
        //}

        int control = ent.nextInt();

        while (control <= 10) {
            System.out.println("guillem sexy");
            System.out.println(control);
            control++;

        }
    }
}

class while2{
    public static void main(String[] args) {
        Scanner ent = new Scanner(in);

        int control= 0;
        while (control != 24){
            System.out.println("Endevina el numero per sortir");
            control = ent.nextInt();
        }
    }
}

class compteenrere{
    public static void main(String[] args) {
        Scanner ent = new Scanner(in);
        int numero = ent.nextInt();

        while(numero >= 0){
            System.out.println(numero);
            numero--;
        }
    }

}

class intervalnumeros {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num1 = ent.nextInt();
        int num2 = ent.nextInt();
        if (num1 < num2) System.out.println("El segon numero no es mes petit que el primer");

        while (num1 >= num2) {
            System.out.println(num1);
            num1--;
        }
    }
}

class platansbananes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int comptB = 0, comptP = 0;
        String linia = ent.nextLine();

        while (!linia.equals("0")) {
            System.out.println("M'agraden els platans");

            if (linia.equals("P")) comptP++;
            else comptB++;

            linia = ent.nextLine();
        }

        if (comptP == comptB) System.out.println("No puc distingir entre un platan i una banana");
        else if (comptP > comptB) System.out.println("M'agraden els platans");
        else if (comptB > comptP) System.out.println("M'agraden els platans");
    }
}

class Cremades2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de casos
        System.out.print("Introduce el número de casos: ");
        int numCasos = scanner.nextInt();

        for (int i = 0; i < numCasos; i++) {
            // Leer el número de cremades para este caso
            System.out.print("Introduce el número de cremades para el caso " + (i + 1) + ": ");
            int numCremades = scanner.nextInt();

            if (numCremades < 3) {
                // Si hay menos de 3 puntos, no podemos formar un triángulo
                System.out.println("NO");
                continue;
            }

            int[][] coordenadas = new int[numCremades][2];

            // Leer las coordenadas de cada cremada
            for (int j = 0; j < numCremades; j++) {
                System.out.print("Introduce las coordenadas x y de la cremada " + (j + 1) + ": ");
                coordenadas[j][0] = scanner.nextInt();
                coordenadas[j][1] = scanner.nextInt();
            }

            // Comprobar si podemos formar un triángulo con las coordenadas dadas
            boolean sePuedeFormarTriangulo = false;

            // Probar todas las combinaciones de tres puntos para ver si forman un triángulo
            for (int a = 0; a < numCremades - 2; a++) {
                for (int b = a + 1; b < numCremades - 1; b++) {
                    for (int c = b + 1; c < numCremades; c++) {
                        if (!estanAlineados(coordenadas[a], coordenadas[b], coordenadas[c])) {
                            sePuedeFormarTriangulo = true;
                            break;
                        }
                    }
                    if (sePuedeFormarTriangulo) break;
                }
                if (sePuedeFormarTriangulo) break;
            }

            // Mostrar el resultado para este caso
            if (sePuedeFormarTriangulo) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    // Método para comprobar si tres puntos están alineados usando el determinante
    private static boolean estanAlineados(int[] p1, int[] p2, int[] p3) {
        // Calcular el área del triángulo formado por los puntos p1, p2 y p3
        int area = p1[0] * (p2[1] - p3[1]) +
                p2[0] * (p3[1] - p1[1]) +
                p3[0] * (p1[1] - p2[1]);

        return area == 0; // Si el área es cero, los puntos están alineados
    }
}

