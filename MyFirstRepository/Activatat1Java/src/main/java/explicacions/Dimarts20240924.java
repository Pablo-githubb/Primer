package explicacions;

import java.util.Scanner;

public class Dimarts20240924 {


    public static void main(String[] args) {

        int x=9, y=8;
        x = y + 1;
        x = x + y;
        x += y;

        x = x - y; // x -= y;
        x = x * y; // x *= y;
        x = x / y;  // x /= y;

        x = x + 1;
        x++;++x;

        x= x - 1;
        x--;--x;
        x -= 1;
    }
}

class SentenciaCondicional1{
    public static void main(String[] args) {
        //La sentencia if
        Scanner ent = new Scanner(System.in);
        System.out.println("Quina es la teva edat?");
        int edat = ent.nextInt();

        if(edat >= 18) {
            System.out.println("Ets major d'edat!!");
        } else {
            System.out.println("No ets major d'edat");
        }


    }
}

class Anytraspas{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int any = ent.nextInt();

        if(any % 4 == 0 && any % 100 != 0 || any % 400 == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }
}


class elbarret{
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String paraula = ent.nextLine();

        if (paraula.equals("Coratge")) {
            System.out.println("Gryffindor");
        }
            else if (paraula.equals ("Coneixement")) {
                System.out.println("Ravenclaw");
        }
                else if (paraula.equals ("Ambicio")) {
                    System.out.println("Slytherin");
        }
                    else { System.out.println("Hufflepuff");
        }
    }
}