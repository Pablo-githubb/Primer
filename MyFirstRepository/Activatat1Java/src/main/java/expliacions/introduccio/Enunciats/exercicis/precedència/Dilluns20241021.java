package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.util.Scanner;

public class Dilluns20241021 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int comptador=0;
        System.out.println("Introduix una frase (escriu Fi per acabar)");
        do {
            String frase = ent.nextLine();
            if(frase.length()==0) continue;

            if (frase.equalsIgnoreCase("FI")) break;
            if ( frase.isBlank() || frase.charAt(0)!='A') continue;
            comptador++;
            //if (frase.charAt(0) == 'a' || frase.charAt(0) == 'A') break;
        } while (true);
        System.out.format("Has posat %d linies que comencen per 'a' o 'A'%n", comptador);
    }
}


class formateig{
    public static void main(String[] args) {
        String text ="Soc un text";

        for (int i = 0; i < text.length(); i++) {
            System.out.format("%c %1$C %n",text.charAt(i));

        }
    }
}