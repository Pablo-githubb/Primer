package explicacions;

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


class Binaris {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();
        ent.nextLine();
        for (int i = 0; i < casos; i++) {
            int numero = 0;
            String operacio[] = ent.nextLine().trim().split(" ");
            if (operacio[1].equals("+")) {
                numero = Integer.parseInt(operacio[0]) + Integer.parseInt(operacio[2]);
            } else {
                numero = Integer.parseInt(operacio[0]) - Integer.parseInt(operacio[2]);

            }

            String resultat = "";
            if (numero == 0) System.out.println("0");
            else {
                while (numero != 0) {

                    resultat = (numero % 2) + resultat;
                    numero = numero / 2;
                }
                System.out.println(resultat);
            }
        }
    }
}

class binarisvectors {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();
        ent.nextLine();
        for (int i = 0; i < casos; i++) {
            int numero = 0;
            String operacio[] = ent.nextLine().trim().split(" ");
            if (operacio[1].equals("+")) {
                numero = Integer.parseInt(operacio[0]) + Integer.parseInt(operacio[2]);
            } else {
                numero = Integer.parseInt(operacio[0]) - Integer.parseInt(operacio[2]);

            }

            int[] vector = new int[numero];
            if (numero == 0) System.out.println("0");
            else {
                int index = 0;
                while (numero != 0) {
                    vector[index] = numero % 2;
                    numero = numero / 2;
                    index++;
                }

                for (int j = index - 1; j >= 0; j--) {
                    System.out.print(vector[j]);
                }
                System.out.println();
            }

        }
    }
}

