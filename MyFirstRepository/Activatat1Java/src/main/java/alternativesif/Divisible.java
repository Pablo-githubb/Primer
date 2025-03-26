package alternativesif;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numero = ent.nextInt();

        if (numero % 9 == 0 && numero % 8 == 0 && numero % 7 == 0 && numero % 5 == 0) System.out.println("SI");
        else System.out.println("NO");


    }
}
