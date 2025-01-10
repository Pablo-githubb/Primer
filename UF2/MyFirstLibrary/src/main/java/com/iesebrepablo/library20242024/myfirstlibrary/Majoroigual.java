package com.iesebrepablo.library20242024.myfirstlibrary;

import java.util.Scanner;

public class Majoroigual {
    public static int obtenirEnterMajorOigual(String instruccions, String informacioSiIncorrecte) {
        Scanner ent = new Scanner(System.in);
        int num;
        do {
            System.out.println(instruccions);
            num = ent.nextInt();
            if (num < 1) System.out.println(informacioSiIncorrecte);
            else break;
        } while (true);
        return num;
    }
}
