import java.util.Random;
import java.util.Scanner;

/// MATRIUS
public class APUNTSEXAMEN {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //declarem una array bidimensonals --> matriu

        int[][] matriu;

        matriu = new int[2][3]; //files = 2 columnes = 3

        //recoregut d'una matriu ---> necessitem 2 for un dins de l'altre

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = ent.nextInt();
            }
        }


        // mostrem el contingut de la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.format("%5d ", matriu[i][j]);
            }
            System.out.println();
        }
    }
}

class escriuunamatriu {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int[][] matriu;
        matriu = new int[ent.nextInt()][ent.nextInt()];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = ent.nextInt();
            }
        }
        int posiciofila = ent.nextInt();
        int posiciocolumna = ent.nextInt();
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.format("%5d ", matriu[i][j]);
            }
            System.out.println();
        }
        System.out.format("%d ", matriu[posiciofila][posiciocolumna]);
    }
}

class matriuamorfa {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[][] matriu = new int[5][];

        matriu[0] = new int[4]; //primera fila 4 columnes    ****
        matriu[1] = new int[1]; //segona fila 1 columna      *
        matriu[2] = new int[0]; //tercera fila 0 columnes    0
        matriu[3] = new int[2]; //quarta fila 2 columnes     **
        matriu[4] = new int[3]; //cinquena fila 3 columnes   ***

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.format("5%d ", matriu[i][j]);
            }
            System.out.println();
        }
    }
}

class matriumaxim {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            int num1 = ent.nextInt();
            int num2 = ent.nextInt();
            int[][] matriu = new int[num1][num2];

            int maxim = 0;
            int maximcolumna = 0;
            int maximfila = 0;

            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu[i].length; j++) {
                    matriu[i][j] = ent.nextInt();
                    if (matriu[i][j] > maxim) {

                        maxim = matriu[i][j];
                        maximfila = i + 1;
                        maximcolumna = j + 1;
                    }
                }
            }
            System.out.format("%d %d\n", maximfila, maximcolumna);
        }
    }
}


/// ARRAYS
class Arrays {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            int k = ent.nextInt();
            int[] vector = new int[k];

            for (int i = 0; i < vector.length; i++) {
                vector[i] = ent.nextInt();

            }
            int p = ent.nextInt();

            System.out.println(vector[p]);
        }
    }
}

class escriurearray1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        // Leer el tamaño del array
        int tamany = ent.nextInt();

        // Leer los elementos del array
        int[] array = new int[tamany];
        for (int i = 0; i < array.length; i++) {
            array[i] = ent.nextInt();
        }

        // Leer la posición a acceder
        int N = ent.nextInt();

        // Imprimir el array completo
        for (int num : array) {
            System.out.println(num + " ");
        }

        // Imprimir el elemento en la posición N
        System.out.println(array[N]);
    }
}

class escriurearray4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int tamany = ent.nextInt();
        int[] vector = new int[tamany];

        for (int i = 0; i < tamany; i++) {
            vector[i] = ent.nextInt();
        }
        int suma = ent.nextInt();
        for (int num : vector) {
            System.out.print((num + suma) + " ");
        }
    }
}


class arraystrings {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int tamany = ent.nextInt();
        int[] vector = new int[tamany];

        String str = ent.skip("[\r\n]*").nextLine();
    }
}


class amanecer {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int segons = ent.nextInt();

        System.out.format("%s del dia %d",
                segons % 86400 < 43200 ? "mati" : "nit",
                (segons / 86400) + 1);
    }
}

/// SWITCH
class BARRETSWITCH {
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


/// RANDOMS
class random {
    public static void main(String[] args) {
        int[][] m = new int[5][5];
        Random r = new Random();

        //generem la matriu aleatòriament
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.format("%3d", m[i][j] = r.nextInt(10));
            }
            System.out.println();
        }
        System.out.println();

        //anem a calcular suma dels veïns
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                //Tractament de la casella actual
                int suma = 0;
                //Caselles exteriors
                if (i == 0 || i == m.length - 1 || j == 0 || j == m[i].length - 1) {
                    if (i == 0) suma = m[i][j - 1] + m[i][j + 1] + m[i + 1][j - 1] + m[i + 1][j] + m[i + 1][j + 1];

                }
                //Casella interior
                else {
                    suma = m[i - 1][j - 1] + m[i - 1][j] + m[i - 1][j + 1] + m[i][j - 1] + m[i][j + 1] + m[i + 1][j - 1] + m[i + 1][j] + m[i + 1][j + 1];
                }
                System.out.format("%3d", suma);
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

class GeneraLletres {

    public static void main(String[] args) {
        Random r = new Random();

        System.out.format("%c%n", (char) (r.nextInt('z' - 'A') + 'A'));

        System.out.format("%c %d%n", 'a', (int) 'a');
        System.out.format("%c %d%n", 'z', (int) 'z');
        System.out.format("%c %d%n", 'A', (int) 'A');
        System.out.format("%c %d%n", 'Z', (int) 'Z');
    }
}

class numcares {
    public static final int NUMCARES = 6;

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Random r = new Random();

        int[] comptadorcares = new int[NUMCARES];

        for (int i = 0; i < 100; i++) {
            int index = r.nextInt(NUMCARES);
            comptadorcares[index]++;
        }


        for (int i = 0; i < NUMCARES; i++) {
            System.out.format("La cara %d ha sortit %d vegades.%n", i + 1, comptadorcares[i]);
        }
    }
}

/// CADENES

class CADENES {
    public static void main(String[] args) {
        String numero = "0123456789";

        System.out.println(numero.substring(0));
        System.out.println(numero.substring(numero.length()));

        System.out.println(numero.substring(0, numero.length()));
        System.out.println(numero.substring(2, 3));

        String nom_complet = "Pablo Maso, Carceller";
        String nom = nom_complet.substring(nom_complet.indexOf(", ") + 2);
        System.out.println(nom);
    }
}

class TRIM {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text;
        do {
            System.out.println("Introduix un text (FI per acabar)");
            text = ent.nextLine();
        } while (!text.trim().equalsIgnoreCase("FI"));
    }
}


class Cadenessensesplif {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String text;
        int ini = 0;
//podem mirar si, text.length(0). If (text.IsEmpty)
        //If (text.isBlank()

        do {
            System.out.println("Escriu una frase no buida");
            text = ent.nextLine().trim();

            if (text.isBlank()) {
                System.out.println("T'he dit que no fiques una frase buida");
                continue;
            }
            break;
        } while (true);

        //Anem a retornar el text retallant les paraules que conte (buscant espais en blanc)

        do {
            int fi = text.indexOf(' ', ini);

            if (fi != -1) {  //hem trobat un espai en blanc
                System.out.println(text.substring(ini, fi));
            } else {
                System.out.println(text.substring(ini));
                break;
            }
            ini = fi + 1;
        } while (true);
    }
}


class Binaris {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();
        ent.nextLine();
        for (int i = 0; i < casos; i++) {
            int numero = 0;
            String operacio[] = ent.nextLine().trim().split(" ");
            if (operacio[1].equals("+")) {
                numero = Integer.parseInt(operacio[0]) + Integer.parseInt(operacio[2]);
            } else {
                numero = Integer.parseInt(operacio[0]) - Integer.parseInt(operacio[2]);

            }

            String resultat = "";
            if (numero == 0) System.out.println("0");
            else {
                while (numero != 0) {

                    resultat = (numero % 2) + resultat;
                    numero = numero / 2;
                }
                System.out.println(resultat);
            }
        }
    }
}

class binarisvectors {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();
        ent.nextLine();
        for (int i = 0; i < casos; i++) {
            int numero = 0;
            String operacio[] = ent.nextLine().trim().split(" ");
            if (operacio[1].equals("+")) {
                numero = Integer.parseInt(operacio[0]) + Integer.parseInt(operacio[2]);
            } else {
                numero = Integer.parseInt(operacio[0]) - Integer.parseInt(operacio[2]);

            }

            int[] vector = new int[numero];
            if (numero == 0) System.out.println("0");
            else {
                int index = 0;
                while (numero != 0) {
                    vector[index] = numero % 2;
                    numero = numero / 2;
                    index++;
                }

                for (int j = index - 1; j >= 0; j--) {
                    System.out.print(vector[j]);
                }
                System.out.println();
            }

        }
    }
}


class ComptarLletres {

    //Fer un programa que llig un text format per una sola línia i en minúscules, i sense accents,
    // i a continuació diu quantes lletres vocals i consonants conté
    //Per simplificar només escriure vocals, consonants i espais en blanc
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Escriu un text:");
        String text = ent.nextLine();

        int compV, compC, index;
        index = compV = compC = 0;

        //Recorrem el text
        while (index < text.length()) {
            char c = text.charAt(index);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') compV++;
            else if (c != ' ') compC++;

            index++;
        }

        System.out.println("S'han trobat " + compV + " vocals i " + compC + " consonants.");
    }

}


/// MATRIUS HARD
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
            //Comptem quants espàis en blanc conté la línia --> usem indexOf dins d'un bucle
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

/// FUMADA

class diadacastellera {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        //Declaració de variables
        int dA, dB, dBoo, dMil;
        dA = dB = dBoo = dMil = 0;
        boolean error = false;

        while (numCasos-- > 0) {
            //Tractament de cada cas
            //Tractem els 8 números
            for (int i = 1; i <= 4; i++) {
                int intentats = ent.nextInt();
                int d = ent.nextInt();
                if (intentats < d) error = true;  //marquem que hi ha hagut un error
                switch (i) {      //Tractem cada parella de números mirant el valor d'i
                    case 1:
                        dA += d;
                        dBoo += d;
                        break;
                    case 2:
                        dA += d;
                        dMil += d;
                        break;
                    case 3:
                        dB += d;
                        dBoo += d;
                        break;
                    case 4:
                        dB += d;
                        dMil += d;
                        break;
                }
            }
        }

        //Mostrem el resultat
        System.out.println(error ? "ERROR" : (dA > dB ? "A" : "B") + "\n" + (dBoo > dMil ? "BOOMERS" : "MILENIALS"));
    }
}
