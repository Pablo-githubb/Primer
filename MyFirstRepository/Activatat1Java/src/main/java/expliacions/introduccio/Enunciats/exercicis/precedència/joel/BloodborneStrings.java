package expliacions.introduccio.Enunciats.exercicis.precedència.joel;

import java.util.Scanner;

public class BloodborneStrings {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            String paraula = ent.skip("[\r\n]*").nextLine().toLowerCase();
            boolean trobat = false;

            for (int i = 0; !trobat && i + 1 < paraula.length(); i++) {
                if (paraula.charAt(i) == paraula.charAt(i + 1)) trobat = true;
            }
            System.out.println(trobat ? "SI" : "NO");
        }
    }
}


class BloodborneArray {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();

        while (numCasos-- > 0)
            for (int i = 0; i < numCasos; i++) {
                int length = ent.nextInt();
                int[] vector = new int[length];
                boolean igual = false;

                for (int j = 0; j < length; j++) {
                    vector[j] = ent.nextInt();
                }
                for (int j = 0; j < length - 1; j++) {
                    if (vector[j] == vector[j + 1]) {
                        igual = true;
                        break;
                    }
                }
                System.out.println(igual ? "SI" : "NO");
            }
    }
}


