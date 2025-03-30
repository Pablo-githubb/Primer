package org.example.ClassesAnidades;

//Les interficies que nomes tenen un metode s'anomenen FUNCIONALS
//Son els unics els quals es poden fer expressions lambda

import java.util.Random;

interface Funcional{
    boolean esCert();
}

interface Funcional2{
    boolean esCert(int x);
}

public class ExpresionsLambda {
    static void metode(Funcional f){
        if (f.esCert()) System.out.println("Es cert");
        else System.out.println("Es fals");
    }

    static void metode2(Funcional2 f){
        if (f.esCert(5)) System.out.println("Es cert");
        else System.out.println("Es fals");
    }

    public static void main(String[] args) {
        metode(new Funcional() {
            @Override
            public boolean esCert() {
                Random r = new Random();
                return r.nextInt()%2 == 0;
            }
        }); // amazing

        //Expressio Lambda → esquerra es posar parametres del interficie funcional, dreta el codi que volem ficar TOT SEPARAT A FLEXA
        metode( () ->  {
            Random r = new Random();
            return r.nextInt()%2 == 0;
        }); //Lo mismo que arriba pero simplificado :D

        metode2(x -> {
            return x % 2 == 0;   // Es lo mismo, solament que te una propietat
        });
    }
}