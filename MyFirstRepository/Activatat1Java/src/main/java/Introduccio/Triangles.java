package Introduccio;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float altura = ent.nextFloat();
        float base = ent.nextFloat();

        float area = base*altura/2;
        System.out.println(area);
    }
}
