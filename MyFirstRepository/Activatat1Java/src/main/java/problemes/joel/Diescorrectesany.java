package problemes.joel;

import  java.util.Scanner;

class Diescorrectesany {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int dia;
        dia = ent.nextInt();

        if (dia <= 365 && dia >= 1) {
            System.out.println("Correcte per un any no bixest!");
        }
        else if (dia == 366) {
            System.out.println("Correcte per un any bixest!");
        } else {
            System.out.println("Incorrecte!");
        }
    }
}