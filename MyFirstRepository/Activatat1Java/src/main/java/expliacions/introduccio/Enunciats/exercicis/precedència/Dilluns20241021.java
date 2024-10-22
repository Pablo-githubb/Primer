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



class detector{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String paraula = ent.nextLine().toUpperCase();

        switch (paraula){
            case "ADIOS":
                System.out.println("ES");
            break;
            case "GOOD BYE":
                System.out.println("UK");
                break;
            case "AU REVOIR":
                System.out.println("FR");
                break;
            case "CIAO":
                System.out.println("IT");
                break;
            case "DOEI":
                System.out.println("NL");
                break;
            case "TSCHUSS":
                System.out.println("DE");
                break;
            default: System.out.println("??");
        }
    }
}


class Problemesjoel_bombo {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numalum = ent.nextInt();
        int numbomb = ent.nextInt();
        if (numbomb == numalum || numbomb == 0 && numalum == 0) {
            System.out.println("OK");
        } else if (numbomb < numalum) {
            int faltants =  numalum - numbomb;
            System.out.println("KO: " + faltants);
        } else {
            int sobrants = numbomb - numalum;
            System.out.println("OK: " + sobrants);
        }
    }
}


class Serp {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            char lletra = ent.skip("[\n\r]*").nextLine().charAt(0);
            String[] paraules = ent.skip("[\n\r]*").nextLine().split(" ");
            String resultat = "";

            switch (lletra) {
                case 'P':
                    for (int i = 0; i < paraules.length; i++) {
                        resultat += paraules[i].toUpperCase().charAt(0) + paraules[i].toLowerCase().substring(1);
                    }
                    break;
                case 'K':
                    for (int i = 0; i < paraules.length; i++) {
                        resultat += paraules[i].toLowerCase();
                        if (i != paraules.length - 1) resultat += '-';
                    }
                    break;
                case 'S':
                    for (int i = 0; i < paraules.length; i++) {
                        resultat += paraules[i].toLowerCase();
                        if (i != paraules.length - 1) resultat += '_';
                    }
                    break;
                case 'C':
                    for (int i = 0; i < paraules.length; i++) {
                        resultat += paraules[i].toLowerCase();
                        if (i != paraules.length - 1) resultat += '_';
                        //else resultat+=
                    }
                    break;

            }System.out.println(resultat);

        }
    }
}
