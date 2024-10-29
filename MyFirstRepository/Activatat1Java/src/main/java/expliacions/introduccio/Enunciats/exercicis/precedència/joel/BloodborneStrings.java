package expliacions.introduccio.Enunciats.exercicis.precedència.joel;

import java.util.Scanner;

public class BloodborneStrings {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();


        while (numCasos-- > 0) {
            for (int i = 0; i < numCasos; i++) {
                String paraula = ent.skip("[\n\r]*").nextLine().toLowerCase();
                boolean trobat = false;

                for (int j = 0; j + 1 < paraula.length(); j++) {
                    if (paraula.charAt(i) == paraula.charAt(j + 1)) trobat = true;
                    break;
                }
                if (trobat == true )System.out.println("SI");
                else System.out.println("NO");
            }
        }
    }
}

class bloodbornearray{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            for (int i = 0; i < numCasos; i++) {
                int length=0;
                int[] vector = new int[length];
                int numeros = ent.nextInt();

                for (int j = 0; j < length ; j++) {

                }
            }
        }
    }
}