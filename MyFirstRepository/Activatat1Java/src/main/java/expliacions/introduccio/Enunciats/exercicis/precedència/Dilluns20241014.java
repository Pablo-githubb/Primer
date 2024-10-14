package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.util.Scanner;

public class Dilluns20241014 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String paraula = ent.nextLine();

        while (!paraula.equals("FIN")) {
            paraula = ent.nextLine();
            int exclamacions1 = 0;
            int exclamacions2 = 0;


            int i = 0;
            while (i < paraula.length()) {
                if (paraula.charAt(i) == '!') exclamacions1++;
                else if (paraula.charAt(i) == '¡') exclamacions2++;

                i++;
            }
            if (exclamacions1 == exclamacions2) System.out.println("SI");
            else System.out.println("NO");
            paraula = ent.nextLine();
        }

    }
}


class exemplefor{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text = "text raro";
        //segona estructura repetitiva -----> el for

        int index = 0;

        //fem el for equivalent
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}

class RepetitivaIII{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n;

        System.out.println("Introduix un enter: ");
        n= ent.nextInt();
        System.out.println(n);

        do{
            System.out.println("Introduix un enter: ");
            n= ent.nextInt();
            System.out.println(n);
        } while(n!=0);

        }

}
class beatels{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int linia1 = ent.nextInt();
        int linia2 = ent.nextInt();
        int linie3 = ent.nextInt();

        int i=0;
        do {
            for(i)