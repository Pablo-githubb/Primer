package com.iesebrepablo.library20242024.myfirstlibrary;

import java.util.Random;

public class Cadena {
    /**
     * Retorna un caracter aleatori
     *
     */
    public static char retornaCaracter() {
        Random r = new Random();
        return (char) (r.nextInt(94) + 32); // Generar un caràcter aleatori entre 32 i 125
    }

    public static char retornaCaracter(char caracterMinim, char caracterMaxim) {
        /**
         * Retorna dos caracters aleatoris amb un caracter mínim i màxim
         */
        if (caracterMinim > caracterMaxim) {
            char temp = caracterMinim;
            caracterMinim = caracterMaxim;
            caracterMaxim = temp;
        }
        Random r = new Random();
        return (char) (r.nextInt(caracterMaxim - caracterMinim + 1) + caracterMinim);
    }

}

