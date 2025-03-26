package explicacions;

import java.util.Random;
import java.util.Scanner;

public class Divendres1122 {
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

class desierto {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //tractament de cada cas
            int numMapes = ent.nextInt(); //numero de mapes a llegir, a l'enunciat


            BattleField[] mapes = new BattleField[numMapes];
            while (numMapes-- > 0) {

                String nomMapa = ent.skip("[\r\n]*").nextLine();
                //Anem a buscar el nom del mapa al vetor

                int i = 0; //Declarem el index fora per poder utilitzar en el if de fora
                for (; i < mapes.length && mapes[i] != null && !mapes[i].nom.equals(nomMapa); i++) {
                    if (mapes[i] != null) {
                        BattleField mapa = new BattleField();
                        mapa.nom = nomMapa;
                        mapa.numVots = 1; //el primer vot que rep aquest mapa
                        mapes[i] = mapa;
                    } else {
                        mapes[i].numVots++;
                    }
                }
                //Anem a bucar al guanyador

                int maximvots = 0, indexMaxim=-1;
                for (; i < mapes.length && mapes[i]!=null; i++) {
                    if (mapes[i].numVots>maximvots) {
                        maximvots=mapes[i].numVots;
                        indexMaxim=i;
                    }
                }
                //El resultat sera
                System.out.println(mapes[indexMaxim].nom);
            }
        }
    }
}

class BattleField {
    //Propietats de la clase

    String nom;
    int numVots = 0;

}

