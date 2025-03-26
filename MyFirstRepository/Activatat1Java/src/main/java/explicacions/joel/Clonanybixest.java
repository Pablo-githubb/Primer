package explicacions.joel;

import  java.util.Scanner;

class Clonanybixest {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int dia = ent.nextInt();
        int any = ent.nextInt();

        if (dia >= 1 && dia <= 365) {
            System.out.println("Correcte i any qualsevol!");
        } else if (dia == 366 && !(any % 4 == 0 && any % 100 != 0 || any % 400 == 0)) {
            System.out.println("Incorrecte per any no bixest!");
        } else if (dia == 366 && (any % 4 == 0 && any % 100 != 0 || any % 400 == 0)) {
            System.out.println("Correcte i any bixest!");
        } else {
            System.out.println("Incorrecte per qualsevol any!");
        }
    }
}