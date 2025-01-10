package com.iesebrepablo.library20242024.myfirstlibrary;

import java.util.Random;

public class RandomNumbers {
    public static int[] generateRandomNumbers(int bound){
        Random r=new Random();
        int[] valor=new int[3];

        //Generem els 3 números aleatoris
        valor[0]=r.nextInt(bound);
        valor[1]=r.nextInt(bound);
        valor[2]=r.nextInt(bound);

        return valor;
    }

    public static int[] generateRandomNumbers(int bound, int quantitat) {

        if(quantitat<0 || bound<0) return null;
        Random r=new Random();
        int[] valor=new int[quantitat];

        //Generem els números aleatoris
        for (int i = 0; i < valor.length; i++) {
            valor[i]=r.nextInt(bound);
        }
        return valor;
    }
}
