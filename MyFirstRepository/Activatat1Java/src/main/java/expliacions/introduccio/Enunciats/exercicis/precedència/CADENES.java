package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.util.Scanner;

class CADENES {
    public static void main(String[] args) {
        String numero = "0123456789";

        System.out.println(numero.substring(0));
        System.out.println(numero.substring(numero.length()));

        System.out.println(numero.substring(0, numero.length()));
        System.out.println(numero.substring(2, 3));

        String nom_complet = "Pablo Maso, Carceller";
        String nom = nom_complet.substring(nom_complet.indexOf(", ") + 2);
        System.out.println(nom);
    }
}

class TRIM {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text;
        do {
            System.out.println("Introduix un text (FI per acabar)");
            text = ent.nextLine();
        } while (!text.trim().equalsIgnoreCase("FI"));
    }
}


class Cadenessensesplif {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String text;
        int ini = 0;
//podem mirar si, text.length(0). If (text.IsEmpty)
        //If (text.isBlank()

        do {
            System.out.println("Escriu una frase no buida");
            text = ent.nextLine().trim();

            if (text.isBlank()) {
                System.out.println("T'he dit que no fiques una frase buida");
                continue;
            }
            break;
        } while (true);

        //Anem a retornar el text retallant les paraules que conte (buscant espais en blanc)

        do {
            int fi = text.indexOf(' ', ini);

            if (fi != -1) {  //hem trobat un espai en blanc
                System.out.println(text.substring(ini, fi));
            } else {
                System.out.println(text.substring(ini));
                break;
            }
            ini = fi + 1;
        } while (true);
    }
}

class binaris {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        for (int i = 0; i < casos; i++) {
            String[] str = ent.skip("[\r\n]*").nextLine().split("");
            int num1 = Integer.valueOf(str[0]);
            int num2 = Integer.valueOf(str[2]);
            int bin = 0;

        }
    }
}