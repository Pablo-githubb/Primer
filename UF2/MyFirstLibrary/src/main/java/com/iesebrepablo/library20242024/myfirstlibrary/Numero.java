package com.iesebrepablo.library20242024.myfirstlibrary;

import java.util.Random;

public class Numero {
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
     * @param base     El número double demanat com base
     * @param n El número enter demanat per a la potència
     * @return Retorna el resultat de la potència sobre la base i l'exponent demanats
     */
    public static double potenciaRec(double base, int n) {
        double resultat;
        if (n > 0) {
            resultat = base * Math.pow(base, n - 1);
        } else if (n < 0) {
            resultat = 1.0 / Math.pow(base, -n);
        } else {
            resultat = 1.0;
        }
        return resultat;
    }

    /**
     * Demanem un número enter per buscar el terme n-èssim d'aquest. Si el número (n) és <0, el mètode retornarà -1. Si el número és =0, retornarà 0. Si el número és =1, retornarà 1.
     * Pero si el número és >1, retorarà la suma dels dos números anterios al número indicat.
     * @param n el número fibonacci que volem comprovar.
     * @return Retorna la suma dels dos números anteriors del número indicat.
     */
    public static int fibonacci(int n) {
        if (n < 0) return -1;
        else if (n == 0 || n==1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int nombreCombinatoriRec(int n, int m){
        if(n < m) return -1;
        //Casos  de parada
        if(n == m || m==0) return 1;

        //Cas recursiu
        return nombreCombinatoriRec(n - 1, m -1) + nombreCombinatoriRec(n-1, m);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.format("Terme %d-èssim: %d\n", i, fibonacci(i));
            System.out.println("-------------------------");
            System.out.println("Número d'or ----> "+(double)fibonacci(i)/fibonacci(-1));
        }
        System.out.println(potenciaRec(5,2));
        System.out.println(nombreCombinatoriRec(3,4));

    }
}
