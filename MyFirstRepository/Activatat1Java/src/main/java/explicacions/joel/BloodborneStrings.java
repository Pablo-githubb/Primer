package explicacions.joel;

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

        while (numCasos-- > 0) {
            int length = ent.nextInt();
            int[] vector = new int[length]; //declarem un vector de *length* --> No te sentit ferho abans perque no hi habia la variable int length
            boolean igual = false;

            for (int i = 0; i < length; i++) {
                vector[i] = ent.nextInt();
            }
            for (int i = 0; i < length - 1; i++) {
                if (vector[i] == vector[i + 1]) {
                    igual = true;
                    break;
                }
            }
            System.out.println(igual ? "SI" : "NO");
        }
    }
}

class bloodborne2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            int caselles = ent.nextInt();
            int[] vector = new int[caselles]; //declarem un vector de *length* --> No te sentit ferho abans perque no hi habia la variable int length
            boolean igual = false;

            if (caselles <= 1) {
                int anterior = ent.nextInt();

                while (--caselles > 0) {
                    int actual= ent.nextInt();
                   if (anterior==actual) igual=true;
                        anterior=actual;
                        //hem comparat els dos elements llavors actualizem el valor de l'anterior
                    System.out.println(igual ? "SI" : "NO");
                }
            }
        }
    }
}