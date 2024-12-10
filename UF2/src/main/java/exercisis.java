import java.util.Scanner;
import java.util.Random;

public class exercisis {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int carac = 0; // Inicialitzar la variable

        do {
            System.out.println("Digues quants caracters vols vore: ");
            carac = ent.nextInt();
        } while (carac < 1);

        for (int i = 0; i < carac; i++) {
            System.out.print(retornaCaracter() + " ");
        }
    }

    public static char retornaCaracter() {
        Random r = new Random();
        return (char) (r.nextInt(94) + 32); // Generar un caràcter aleatori entre 32 i 125
    }

    class random {
        public static void main(String[] args) {
            Scanner ent = new Scanner(System.in);
            int num;
            String caractersGenerats = "";

            num = obtenirEnterMajorOigual("Digues quants caracters vols vore: ", "Número incorrecte, torna a intentar-ho.");
            for (int i = 0; i < num; i++) {
                Random r = new Random();
                System.out.format("%c", (char) (r.nextInt(94) + 32));
            }
            System.out.println();
        }

        public static int obtenirEnterMajorOigual(String instruccions, String informacioSiIncorrecte) {
            Scanner ent = new Scanner(System.in);
            int num;
            do {
                System.out.println(instruccions);
                num = ent.nextInt();
                if (num < 1) System.out.println(informacioSiIncorrecte);
                else break;
            } while (true);
            return num;
        }
    }

    public static char retornaCaracter(char caracterMinim, char caracterMaxim) {
        // Comprovem si els paràmetres estan ordenats correctament
        if (caracterMinim > caracterMaxim) {
            char temp = caracterMinim;
            caracterMinim = caracterMaxim;
            caracterMaxim = temp;
        }
        Random r = new Random();
        return (char) (r.nextInt(caracterMaxim - caracterMinim+1)+caracterMinim);
    }
}


    

