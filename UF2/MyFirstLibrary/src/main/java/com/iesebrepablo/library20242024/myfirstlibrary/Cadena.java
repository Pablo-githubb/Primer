package com.iesebrepablo.library20242024.myfirstlibrary;

import java.util.Random;

public class Cadena {

    /*
    Comentari multilínia
    normal i corrent,
    no pertany al Javadoc
     */
    public static char retornaCaracter() {
        //Generem un caracter aleatori entre ' ' i '}'
        Random r = new Random();
        return (char) (r.nextInt('}' - ' ' + 1) + ' ');
    }

    /**
     * Genera un caràcter aleatori entre un caracter mínim i un màxim
     * @param caracterMinim el caracter aleatori generat més menut possible
     * @param caracterMaxim el caracter aleatori generat més gran possible
     * @return el caràcter generat aleatòriament entre un mínim i un màxim.
     */
    public static char retornaCaracter(char caracterMinim, char caracterMaxim) {
        //Primer comprovem si els paràmetres estan ordenats correctament, i sinó els intercanviem
        if (caracterMinim > caracterMaxim) {
            char temp = caracterMinim;
            caracterMinim = caracterMaxim;
            caracterMaxim = temp;
        }
        //Generem un caracter aleatori entre ' ' i '}'
        Random r = new Random();
        return (char) (r.nextInt(caracterMaxim - caracterMinim + 1) + caracterMinim);
    }

    /**
     * Programa que retorna una subcadena
     * @param text text que insermim
     * @param subcadena text que volem inserir després del text
     * @param pos posició a partir de la qual volem insertar
     * @return si el text i la cadena són null, retornará null. D'altra banda, si algun dels Strings és null, retornarà l'altre que no es null. Finalment afegirà la subcadena en el text en la posició que nosaltres marquem
     */
    public static String insertaCadena (String text, String subcadena, int pos){
        //casos especials
        if (text== null && subcadena==null) return null;
        if (text==null) return subcadena;
        if (subcadena==null) return text;
        if (pos<0) pos=0;
        if (pos>text.length()) pos=text.length();

        //casos reals

        return text.substring(0,pos)+subcadena+text.substring(pos);
    }
}

