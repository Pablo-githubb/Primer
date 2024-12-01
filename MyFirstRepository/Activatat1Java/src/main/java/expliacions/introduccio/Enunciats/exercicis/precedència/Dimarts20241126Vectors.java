package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.awt.event.WindowFocusListener;
import java.util.Scanner;

import java.util.Random;

public class Dimarts20241126Vectors {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n;
        do {
            System.out.println("Introduix el numerps vols");
            n = ent.nextInt();
            if (n > 0) break;
        } while (true);

        char lletra = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%2c", lletra);

                if (lletra == 'Z') lletra = 'A';
                else lletra++;
            }

            System.out.println();
        }

    }
}


class exe16bis {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int superior;
        int inferior;
        do {
            System.out.println("Introduix un numero dintre del rang de valors: ");
            inferior = ent.nextInt();
        } while (inferior < 0);

        do {
            System.out.println("Introduix un numero dintre del rang de valors: ");
            superior = ent.nextInt();
        } while (superior < inferior);

        Random r = new Random();

        int[] comptador = new int[(superior - inferior) + 1];
        int[][] matriu = new int[5][10];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = r.nextInt(inferior, superior);
                System.out.format("%5d ", matriu[i][j]);
                System.out.format("El valor %d ha sortit %d ");
                comptador[matriu[i][j] - inferior] += 1;

            }
        }
    }
}

class Exercici16Matrius {

    public static void main(String[] args) {
        Random r = new Random();
        int[][] matriu = new int[5][10];  //no cal matriu, però en este cas l'usem
        int[] sumaFiles = new int[5];     //vector en 5 caselles --> tenim 5 files
        int[] sumaColumnes = new int[10];//vector en 10 caselles --> tenim 10 columnes

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = r.nextInt(101);        //generem números aleatoris de 0 a 100
                sumaFiles[i] += matriu[i][j];               //sumem la casella actual a la fila i
                sumaColumnes[j] += matriu[i][j];            //sumem la casella actual a la columna j
                System.out.format("%4d", matriu[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //Mostrem la suma de files
        System.out.println("Vector en la suma de les files:");
        for (int i = 0; i < sumaFiles.length; i++) System.out.format("%4d", sumaFiles[i]);
        System.out.println();

        //Mostrem la suma de columnes
        System.out.println("Vector en la suma de les columnes:");
        for (int i = 0; i < sumaColumnes.length; i++) System.out.format("%4d", sumaColumnes[i]);
    }
}


class exe14Matrius {
    public static void main(String[] args) {

        //Demanem la dimensió de la matriu forçant a que sigue més gran que 0
        Scanner ent = new Scanner(System.in);
        int n;
        do {
            System.out.println("Quantes caselles vols usar? (>=1)");
            n = ent.nextInt();
            if (n < 1) System.out.println("Ha de ser més que 0!!");
            else break;
        } while (true);

        //Mostrem el resultat
        char lletra = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%2c", lletra);
                //Fem que les lletres sempre siguen d'A a Z
                if (lletra == 'Z') lletra = 'A';
                else lletra++;
            }
            System.out.println();
        }
    }
}

class Exercici9Vectors {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r = new Random();
        int num = 0;
        int[] comptador = new int['Z' - 'A' + 1];

        //Demanem el número positiu a l'usuari
        do {
            System.out.println("Introduix un número enter positiu:");
            num = ent.nextInt();
            if (num <= 0) System.out.println("El número ha de ser major que 0!!");
            else break;
        } while (true);

        //generem les lletres aleatòriament
        for (int i = 0; i < num; i++) {
            int lletra = r.nextInt('Z' - 'A' + 1) + 'A';
            System.out.format("%c", (char) lletra);
            comptador[lletra - 'A']++;        //generem l'index del vector a partir de la lletra apareguda
        }
        System.out.println();

        //Mirem quines lletres han sortit i quantes vegades
        for (int i = 0; i < comptador.length; i++) {
            if (comptador[i] > 0)
                System.out.format("La lletra %c ha sortit %d vegades.%n", (char) (i + 'A'), comptador[i]);     //generem  la lletra a partir de  l'index aparegut
        }
    }
}

class Exercici3Cadenes {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text = "", linia;
        int comptLinies = 0;

        //Sumen els valors fins introduir un 0 --> concatenar lńies fins trobar una cabada en punt
        System.out.println("Escriu un text format per una o més línies i acabat en punt:");
        do {
            linia = ent.nextLine();
            if (!linia.isBlank()) comptLinies++;     //!linia.trim().isEmpty() o linia.trim().length()!=0
            if (!linia.endsWith(".")) text = text + linia + "\n";
            else text = text + linia;
        } while (!linia.endsWith("."));

        System.out.println(text);
        System.out.format("El text conté %d línies no buides.", comptLinies);
    }
}

class Exercici4Cadenes {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text = "", linia;
        int comptLinies = 0, comptCars = 0;

        //Sumen els valors fins introduir un 0 --> concatenar lńies fins trobar una cabada en punt
        System.out.println("Escriu un text format per una o més línies i acabat en una línia que ha de contindre el punt:");
        do {
            linia = ent.nextLine().trim();
            comptLinies++;
            //Comptem quants espàis en blanc conté la línia --> usem indeOf dins d'un bucle
            int pos = 0, comptadorBlancs = 0;
            do {
                pos = linia.indexOf(" ", pos);
                if (pos != -1) {
                    comptadorBlancs++;
                    pos++;
                } else break;
            } while (true);
            comptCars += linia.length() - comptadorBlancs;
            if (!linia.contains(".")) text = text + linia + "\n";
            else text = text + linia;
        } while (!linia.contains("."));

        System.out.println("El text introduït és:\n" + text + "\n");
        System.out.format("El text conté %d línies i %d caràcters.", comptLinies, comptCars);
    }
}