package com.iesebrepablo.library20242024.myfirstlibrary;

import java.util.Random;

public class numeros {
    public static int generaNumeroAleatori(){
        Random r=new Random();
        return r.nextInt();
    }

    //Mètode que retorna un número enter entre 0 i el paràmetre menys 1 si és paràmetre és coorecte i sinó retorna -1
    public static int generaNumeroAleatori(int limit){
        if(limit<0) return -1;
        Random r=new Random();
        int valor;
        return r.nextInt(limit);
    }
}
