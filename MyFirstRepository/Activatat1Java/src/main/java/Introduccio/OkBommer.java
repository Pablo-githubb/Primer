package Introduccio;

import java.util.Scanner;

public class OkBommer {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int anyNaixement = ent.nextInt();

        if (anyNaixement>=1945 && anyNaixement<=1965) System.out.println("ok boomer");
        else System.out.println("nah");

    }

}
