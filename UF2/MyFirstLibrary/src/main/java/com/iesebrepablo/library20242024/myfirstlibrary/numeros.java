package com.iesebrepablo.library20242024.myfirstlibrary;

import java.util.Arrays;
import java.util.Random;

public class numeros {
    public static int generaNumeroAleatori() {
        Random r = new Random();
        return r.nextInt();
    }

    //Mètode que retorna un número enter entre 0 i el paràmetre menys 1 si és paràmetre és coorecte i sinó retorna -1
    public static int generaNumeroAleatori(int limit) {
        if (limit < 0) return -1;
        Random r = new Random();
        int valor;
        return r.nextInt(limit);
    }

    /**
     * Un programa que rep un paràmetre enter i retorna els digits d'aquest numero en un vector
     *
     * @param num el número que demana per retornar els seus dígits
     * @return el vector amb els paràmetres separats del número
     */
    public static int[] vectorDigits(int num) {
        boolean negatiu = num < 0;
        if (negatiu) num *= -1; //si el número és negatiu ho paso a positiu


        int[] vector = new int[Integer.toString(num).length()];

        //creem un varaible que vagi anant de dreta a esquerra
        int index = vector.length - 1;

        while (num != 0) {
            vector[index] = num % 10;
            index--;
            num /= 10;
        }

        //si el número era negatiu i en cas afirmatiu canvio el signe del primer digit del vector
        if (negatiu) vector[0] *= -1;
        return vector;
    }

    /**
     * @param digits
     * @return
     */
    public static int numVector(int[] digits) {

        if (digits == null || digits.length == 0) return 0;

        boolean negatiu = digits[0] < 0;
        if (negatiu) digits[0] *= -1; //si el número és negatiu ho paso a positiu

        int pot10 = 1;
        int resultat = 0;
        int index = digits.length - 1;


        while (index >= 0) {
            resultat += digits[index] * pot10;
            index--;
            pot10 *= 10;
        }

        return resultat * (negatiu ? -1 : 1);
    }

    /**
     * Programa que calcula de forma recursiva la potència d'un double base elevat a l'enter exponent.
     *
     * @param base     El número double demanat com base
     * @param exponent El número enter demanat per a la potència
     * @return Retorna el resultat de la potència sobre la base i l'exponent demanats
     */
    public static double potenciaRec(double base, int exponent) {
        double resultat;
        if (exponent > 0) {
            resultat = base * Math.pow(base, exponent - 1);
        } else if (exponent < 0) {
            resultat = 1 / Math.pow(base, -exponent);
        } else {
            resultat = 1;
        }
        return resultat;
    }

    /**
     * Demanem un número enter per buscar el terme n-èssim d'aquest. Si el número (n) és <0, el mètode retornarà -1. Si el número és =0, retornarà 0. Si el número és =1, retornarà 1.
     * Pero si el número és >1, retorarà la suma dels dos números anterios al número indicat.
     *
     * @param n el número fibonacci que volem comprovar.
     * @return Retorna la suma dels dos números anteriors del número indicat.
     */
    public static int fibonacci(int n) {
        if (n < 0) return -1;
        else if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static double nombreCombinatoriRec(double n, double m) {
        double resultat = 0;

        if (n > m) {
            resultat = nombreCombinatoriRec(n - 1, m - 1) + nombreCombinatoriRec(n - 1, m);
        } else if (n == m || m == 0) {
            return 1;
        } else {
            return -1;
        }
        return resultat;
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(vectorDigits(123)));
        //System.out.println(Arrays.toString(vectorDigits(-123)));
        //System.out.println(numVector(new int[]{1, 2, 3}));
        //System.out.println(numVector(new int[]{}));
        //System.out.println(potenciaRec(5,2));
        System.out.println(fibonacci(2));
        System.out.println(nombreCombinatoriRec(3,4));

    }
}
