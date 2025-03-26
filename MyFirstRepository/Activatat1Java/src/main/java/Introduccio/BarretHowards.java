package Introduccio;

import java.util.Scanner;

public class BarretHowards {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String paraula = ent.nextLine();

        switch (paraula) {
            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;

            default:
                System.out.println("Hufflepuff");
        }

    }
}
