package Introduccio;

import java.util.Scanner;

public class Caramels {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
            int caramels = ent.nextInt();
            int nens = ent.nextInt();

            int sobrants = caramels%nens;

        System.out.println(sobrants);
    }
}
