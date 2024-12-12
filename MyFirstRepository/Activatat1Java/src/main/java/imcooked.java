
import java.util.Scanner;

public class imcooked {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String nom = ent.nextLine();

        System.out.println("Hola, " + nom);

    }
}

class multiplica3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num = ent.nextInt();

        System.out.println(num * 3);

    }
}

class suma2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num1 = ent.nextInt();
        int num2 = ent.nextInt();

        System.out.println(num1 + num2);
    }
}

class quadrat {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int costat = ent.nextInt();

        int area = costat * costat;

        System.out.println(area);
    }
}

class triangle {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float altura = ent.nextInt();
        float base = ent.nextInt();

        float area = base * altura / 2;

        System.out.println(area);
    }
}

class paambtomaquet {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String paraula1 = ent.nextLine();
        String paraula2 = ent.nextLine();

        System.out.println(paraula1 + " amb " + paraula2);
    }
}

class caramelssobrants {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int caramels, nens;

        caramels = ent.nextInt();
        nens = ent.nextInt();

        System.out.println(caramels % nens);
    }
}

class okboomer {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int any;
        do {
            System.out.println("Introduix una data de naixment valida (1-2020): ");
            any = ent.nextInt();
            if (any <= 2020 && any >= 1)
                break;
            else continue;
        } while (true);

        if (any >= 1945 && any <= 1965) System.out.println("ok boomer");
        else System.out.println("nah");
    }
}

class cercaparelles {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int c1, c2, c3;
        do {
            System.out.println("Introduix un numero valid (1-13): ");
            c1 = ent.nextInt();
            c2 = ent.nextInt();
            c3 = ent.nextInt();
            if (c1 <= 13 && c1 >= 1 && c2 <= 13 && c2 >= 1 && c3 <= 13 && c3 >= 1)
                break;
            else continue;
        } while (true);

        if (c1 == c2 || c2 == c3 || c3 == c1) System.out.println("SI");
        else System.out.println("NO");
    }
}

class cercatrios {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int c1, c2, c3;
        do {
            System.out.println("Introduix un numero valid (1-13): ");
            c1 = ent.nextInt();
            c2 = ent.nextInt();
            c3 = ent.nextInt();
            if (c1 <= 13 && c1 >= 1 && c2 <= 13 && c2 >= 1 && c3 <= 13 && c3 >= 1)
                break;
            else continue;
        } while (true);

        if (c1 == c2 && c2 == c3 && c3 == c1) System.out.println("SI");
        else System.out.println("NO");
    }
}

class barret {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //System.out.println("Introduix una paraula:"); --> només el posariem en cas de ser executat per una persona
        String paraula = ent.nextLine();

        //Com comparem objectes utlitzem el mètode equals, no l'operador ==
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

class sumaunsegon {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int hores = ent.nextInt();
        int minuts = ent.nextInt();
        int segons = ent.nextInt();

        segons += 1;
        if (segons == 60 && segons >= 0) {
            minuts += 1;
            segons = 0;

        }
        if (minuts == 60 && minuts >= 0) {
            hores += 1;
            minuts = 0;
        }
        if (hores == 24 && hores >= 0) {
            hores = 0;
        }
        System.out.format("%d %d %d", hores, minuts, segons);
    }
}

class ambrosio {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            int pisos = ent.nextInt();


        }
    }
}

class pokerdedaus {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int a = ent.nextInt();
        int b = ent.nextInt();
        int c = ent.nextInt();
        int d = ent.nextInt();

        if ((a == b && b == c && c == d && d == a)) System.out.println("POKER");
        else if ((a == b && b == c && c == a) || (a == b && b == d && d == a) || (a == c && c == d && d == a) || (b == c && c == d && d == b))
            System.out.println("TRIO");
        else if ((a == b) || (a == c) || (a == d) || (b == c) || (b == d) || (c == d)) System.out.println("PARELLA");
        else System.out.println("RES");
    }
}

class pedrapapertisora {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
//1 pedra
//2 paper
//3 tisora
        int pedra = 1;
        int paper = 2;
        int tisora = 3;


        int jugador1 = ent.nextInt();
        int jugador2 = ent.nextInt();

        if (jugador1 > 3 && jugador1 < 1 && jugador2 > 3 && jugador2 < 1) System.out.println("ERROR");
        else if ((jugador1 == pedra && jugador2 == paper) || (jugador2 == pedra && jugador1 == tisora) || (jugador1 == paper && jugador2 == tisora))
            System.out.println("Jugador2");
        else if ((jugador2 == pedra && jugador1 == paper) || (jugador1 == pedra && jugador2 == tisora) || (jugador1 == tisora && jugador2 == paper))
            System.out.println("Jugador1");
        else if (jugador1 == jugador2) System.out.println("EMPAT");


    }
}


class Polvaalcinema {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int duracio = ent.nextInt();
        int marge = ent.nextInt();
        int hora = ent.nextInt();
        int minuts = ent.nextInt();

        // Calculate the total minutes from the start of the movie to Pol's arrival
        int totalMinutsArribada = hora * 60 + minuts;

        // Compare the arrival time with the margin
        if (totalMinutsArribada <= marge) {
            System.out.println("VEURE");
        } else {
            System.out.println("MARXAR");
        }
    }
}


class puntog {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String cas1 = ent.nextLine();
        String cas2 = ent.nextLine();
        String cas3 = ent.nextLine();
        String cas4 = ent.nextLine();
        String cas5 = ent.nextLine();

        int contador = 0;
        if (cas1.equals("G")) contador++;
        if (cas2.equals("G")) contador++;
        if (cas3.equals("G")) contador++;
        if (cas4.equals("G")) contador++;
        if (cas5.equals("G")) contador++;

        if (contador == 0) {
            System.out.println("NO");
        } else if (contador == 1) {
            System.out.println("SI");
        } else {
            System.out.println("PUNTOS");
        }
    }
}


class arbolito {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float c1 = ent.nextFloat(); // altura màxima inclusiva d'un arbust
        float c2 = ent.nextFloat(); // altura mínima inclusiva d'un arbre
        float k1 = ent.nextFloat(); // altura planta 1
        float k2 = ent.nextFloat(); // altura planta 2
        float k3 = ent.nextFloat(); // altura planta 3

        int comptadorarbolito = 0;

        if (k1 > c1 && k1 < c2) {
            comptadorarbolito++;
        }
        if (k2 > c1 && k2 < c2) {
            comptadorarbolito++;
        }
        if (k3 > c1 && k3 < c2) {
            comptadorarbolito++;
        }

        System.out.println(comptadorarbolito);
    }
}

class arrodoniment {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float nota = ent.nextFloat();
        if (nota % 1 >= 0.5) {
            System.out.println(Math.round(nota));
        } else System.out.println((int) nota);
    }
}

class sumarapida {
    public static void main(String[] args) {
        System.out.print(89789798.5 * 72665512.5);
    }
}

class Canondades {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int metres = ent.nextInt();
        int preu = 0;

        if (metres <= 25) {
            preu = metres * 3;
        } else if (metres <= 75) {
            preu = 25 * 3 + (metres - 25) * 4;
        } else {
            preu = 25 * 3 + 50 * 4 + (metres - 75) * 5;
        }

        System.out.format("%fm: %f euros", (float) metres, (float) preu);
    }
}

class dediaames {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int dia = ent.nextInt();
        int mes = 0;

        if (dia >= 1 && dia <= 31) {
            mes = 1;
        } else if (dia >= 32 && dia <= 59) {
            mes = 2;
        } else if (dia >= 60 && dia <= 90) {
            mes = 3;
        } else if (dia >= 91 && dia <= 120) {
            mes = 4;
        } else if (dia >= 121 && dia <= 151) {
            mes = 5;
        } else if (dia >= 152 && dia <= 181) {
            mes = 6;
        } else if (dia >= 182 && dia <= 212) {
            mes = 7;
        } else if (dia >= 213 && dia <= 243) {
            mes = 8;
        } else if (dia >= 244 && dia <= 273) {
            mes = 9;
        } else if (dia >= 274 && dia <= 304) {
            mes = 10;
        } else if (dia >= 305 && dia <= 334) {
            mes = 11;
        } else if (dia >= 335 && dia <= 365) {
            mes = 12;
        }

        System.out.println(mes);
    }
}


class diadelasetmana2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num = ent.nextInt();
        String dia = "";

        switch (num % 7) {
            case 1:
                dia = "Monday";
                break;
            case 2:
                dia = "Tuesday";
                break;
            case 3:
                dia = "Wednesday";
                break;
            case 4:
                dia = "Thursday";
                break;
            case 5:
                dia = "Friday";
                break;
            case 6:
                dia = "Saturday";
                break;
            case 0:
                dia = "Sunday";
                break;
        }

        System.out.println(dia);
    }
}


class avimesgran {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String avi1 = ent.skip("[\r\n]*").nextLine();
        int edat1 = ent.nextInt();
        String avi2 = ent.skip("[\r\n]*").nextLine();
        int edat2 = ent.nextInt();

        if (edat1 > edat2) System.out.println(avi1);
        else if (edat2 > edat1) System.out.println(avi2);
        else System.out.println("Tenen la mateixa edat");

    }
}

class dosporuno {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num1 = ent.nextInt();
        int num2 = ent.nextInt();

        if (num1 * 2 / num2 == 0 || num2 * 2 / num1 == 0) System.out.println("SI");
        else System.out.println("NO");
    }
}

class elnenmésalt {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int alturamax = ent.nextInt();
        int nen1 = ent.nextInt();
        int nen2 = ent.nextInt();
        int nen3 = ent.nextInt();
        int posicio = 0;

        if (nen1 <= alturamax && nen1 > nen2 && nen1 > nen3) {
            posicio = 1;
            System.out.println("Nen " + posicio);
        } else if (nen2 <= alturamax && nen2 > nen1 && nen2 > nen3) {
            posicio = 2;
            System.out.println("Nen " + posicio);
        } else if (nen3 <= alturamax && nen3 > nen1 & nen3 > nen2) {
            posicio = 3;
            System.out.println("Nen " + posicio);
        } else System.out.println("No hi ha cap nen");
    }
}


class etsjove2{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int edat = ent.nextInt();
        int comptador = 1;

        for (int i = 0; i < 4 ; i++) {
            if (edat<=30) comptador++;
            edat = ent.nextInt();
        }
        System.out.println(comptador);
    }
}
