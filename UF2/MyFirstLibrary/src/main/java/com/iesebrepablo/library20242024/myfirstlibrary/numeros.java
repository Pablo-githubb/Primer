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

        if (digits == null || digits.length==0) return 0;

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

        return resultat*(negatiu?-1:1);
    }

    public static double potenciaRec(double base, int exponent){



    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(vectorDigits(123)));
        System.out.println(Arrays.toString(vectorDigits(-123)));
        System.out.println(numVector(new int[]{1, 2, 3}));
        System.out.println(numVector(new int[]{}));
    }
}
