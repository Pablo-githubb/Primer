package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.util.Scanner;

class Dimarts2024101 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int valor;

        System.out.println("Introduix un numero enter: ");
        valor = ent.nextInt();

        //estructura switch
        switch (valor) {

            case 0:
                System.out.println("Has posat un 0, t'incremento la variable");
                valor++;
                break;
            case 1:
                System.out.println("Has posat un 1, multiplico la variable per 10");
                valor = valor * 10;
                break;
            case 2:
                valor--;
                break;
            case 3:
                valor--;
                break;
            default:
                System.out.println("No has entrat a cap dels casos tractats!");
        }


    }
}

class Hogwardsswitch {
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

class numdivisible {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num = ent.nextInt();

        if (num % 9 == 0 && num % 8 == 0 && num % 7 == 0 && num % 5 == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}

class bulletinotes {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int nota = ent.nextInt();

        switch(nota) {
            case 1:
                System.out.println("Suspes");
                break;
            case 2:
                System.out.println("Suspes");
                break;
            case 3:
                System.out.println("Suspes");
                break;
            case 4:
                System.out.println("Suspes");
                break;
            case 5:
                System.out.println("Aprovat");
                break;
            case 6:
                System.out.println("Aprovat");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Excelent");
                break;
            case 10:
                System.out.println("Excelent");
                break;
        }
    }
}