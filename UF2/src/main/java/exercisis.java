import java.util.Scanner;
import java.util.Random;

public class exercisis {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int carac = 0; // Inicialitzar la variable

        do {
            System.out.println("Digues quants caracters vols vore: ");
            carac = ent.nextInt();
        } while (carac < 1);

        for (int i = 0; i < carac; i++) {
            System.out.print(retornaCaracter() + " ");
        }
    }

    public static char retornaCaracter() {
        Random r = new Random();
        return (char) (r.nextInt(94) + 32); // Generar un caràcter aleatori entre 32 i 125
    }

    class random {
        public static void main(String[] args) {
            Scanner ent = new Scanner(System.in);
            int num;
            String caractersGenerats = "";

            num = obtenirEnterMajorOigual("Digues quants caracters vols vore: ", "Número incorrecte, torna a intentar-ho.");
            for (int i = 0; i < num; i++) {
                Random r = new Random();
                System.out.format("%c", (char) (r.nextInt(94) + 32));
            }
            System.out.println();
        }

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

    public static char retornaCaracter(char caracterMinim, char caracterMaxim) {
        // Comprovem si els paràmetres estan ordenats correctament
        if (caracterMinim > caracterMaxim) {
            char temp = caracterMinim;
            caracterMinim = caracterMaxim;
            caracterMaxim = temp;
        }
        Random r = new Random();
        return (char) (r.nextInt(caracterMaxim - caracterMinim + 1) + caracterMinim);
    }

}


class Exercici17 {

    public static int[] tractaParametres(int... params) {
        //Tractament de casos "especials"
        if (params == null) return null;
        if (params.length == 0) return null;

        //Tractament de vectors en caselles
        int suma, max, min;

        max = min = suma = params[0];     //tractem la primera casella
        //Recorrem el vector a partir de la segona casella
        for (int i = 1; i < params.length; i++) {
            //Actualitzem el màxim si cal
            if (params[i] > max) max = params[i];
            //Actualitzem el mínim si cal
            if (params[i] < min) min = params[i];
            //Sumen el valor de la casella actual
            suma += params[i];
        }

        return new int[]{suma, params.length, max, min};
    }

    public static void main(String[] args) {

        tractaParametres();

        tractaParametres(null);

        tractaParametres(new int[]{});
    }

}

class Exercici18 {

    public static float[] ompleVectorFloats(float... params) {
        if (params == null || params.length == 0) return null;
//        float[] resultat=new float[params.length];
//        for (int i = 0; i < params.length; i++) {
//            resultat[i]=params[i];
//        }
//
//        return resultat;
        return params;
    }
}


class Exe20 {
    public class StringReplacer {

        public static String reemplassaMultiplesCaracters(String input, char primerCaracter, char segonCaracter, char... caracters) {
            // Tractament de casos especials
            if (input == null || input.isEmpty()) {
                return input;
            }

            // Construir un conjunt de caràcters a reemplaçar
            StringBuilder charsToReplace = new StringBuilder();
            charsToReplace.append(segonCaracter);
            if (caracters != null) {
                for (char c : caracters) {
                    charsToReplace.append(c);
                }
            }

            // Construir el resultat reemplaçant els caràcters
            StringBuilder result = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (charsToReplace.indexOf(String.valueOf(c)) >= 0) {
                    result.append(primerCaracter);
                } else {
                    result.append(c);
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            // Exemple d'ús
            String input = "Hola, món!";
            char primerCaracter = '*';
            char segonCaracter = 'o';
            char[] caracters = {'a', 'm'};

            String resultat = reemplassaMultiplesCaracters(input, primerCaracter, segonCaracter, caracters);
            System.out.println(resultat); // H*l*, *ón!
        }
    }
}


