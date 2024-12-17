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
    public static String reemplassaMultiplesCaracters(String text, char primerCaracter, char segonCaracter, char... caracters) {
        // Tractament de casos especials
        if (text == null || text.isEmpty()) {
            return text;
        }

        // Construir un conjunt de caràcters a reemplaçar
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == segonCaracter) resultat += primerCaracter;
            else {
                if (caracters != null) {
                    int j = 0;
                    for (; j < caracters.length && caracters[j] != c; j++) {
                        if (j < caracters.length) resultat += primerCaracter;
                        else resultat += c;
                    }
                } else resultat += c;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(reemplassaMultiplesCaracters("Hola",'p','o'));
        System.out.println(reemplassaMultiplesCaracters("Hola",'p','o', null));
        System.out.println(reemplassaMultiplesCaracters("Hola",'p','o', new char[]{}));
        System.out.println(reemplassaMultiplesCaracters("Hola",'p','o', new char[]{'H','l', 'a'}));
    }
}