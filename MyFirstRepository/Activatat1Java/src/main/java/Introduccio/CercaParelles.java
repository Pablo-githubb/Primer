package Introduccio;

import java.util.Scanner;

public class CercaParelles {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int c1 = ent.nextInt();
        int c2 = ent.nextInt();
        int c3 = ent.nextInt();

        if (c1 == c2 || c2 == c3 || c3 == c1) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
