package expliacions.introduccio.Enunciats.exercicis.precedència;
import java.util.Scanner;


public class Dimarts20241022 {
    public static void main(String[] args) {
        String numero = "0123456789";

        System.out.println(numero.substring(0));
        System.out.println(numero.substring(numero.length()));

        System.out.println(numero.substring(0,numero.length()));
        System.out.println(numero.substring(2,3));

        String nom_complet="Pablo Maso, Carceller";
        String nom=nom_complet.substring(nom_complet.indexOf(", ")+2);
        System.out.println(nom);
    }
}

class trim{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text;
        do{
            System.out.println("Introduix un text (FI per acabar)");
            text= ent.nextLine();
        }while (!text.trim().equalsIgnoreCase("FI"));
    }
}