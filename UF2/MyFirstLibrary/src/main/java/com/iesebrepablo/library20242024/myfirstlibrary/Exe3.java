package com.iesebrepablo.library20242024.myfirstlibrary;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
         final int F=20;
         final int C=20;
         final int P=20;

        //Demanem quin alumne vol consultar
        int alumne = demanaValor("l'alumne", F);

        //Demanem quin mòdul vol consultar
        int mp = demanaValor("el mòdul", C);

        //Demanem quina nota vol consultar
        int nota = demanaValor("la nota", P);

    }

    /**
     * Demana un número/valor sempre sigui menor que 0 i major o igual a un número
     * @param text un text que diu el que hem de fer
     * @param num el valor superior a introduir
     * @return retorna un enter entre 0 i el valor
     */
    public static int demanaValor(String text, int num) {
        Scanner entrada = new Scanner(System.in);
        int valor;

        do{
            System.out.format("\nIntroduix l'alumne a consultar (0-%d):\n",text,num - 1);
            valor = entrada.nextInt();
        } while (valor < 0 || valor >= num);

        return valor;

    }
}
