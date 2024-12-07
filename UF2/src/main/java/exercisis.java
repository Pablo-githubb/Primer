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
}
