package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.awt.*;
import java.util.Scanner;

public class Divendres20241018 {
    public static void main(String[] args) {
        Divendres20241018 objecte = new Divendres20241018();
        Scanner ent = new Scanner(System.in);

        // ent = System.in;
        String cadena = new String("Soc un text");
         String cadenaRep = cadena;
        System.out.println(cadena.charAt(0));
        System.out.println(cadena.charAt(10));

        if(cadena.equals(cadenaRep)) System.out.println("Son iguals");

        if(cadena.compareTo(cadenaRep)==0) System.out.println("Son iguals");
        else if (cadena.compareTo(cadenaRep)<0) System.out.println("La primera es menor que la segona");

        System.out.println(cadena.compareTo(cadenaRep));



        //if(cadena.startsWith("S")) System.out.println("El text comença en S");
       // else System.out.println("No comença per S");

    }
}

class string2{
    public static void main(String[] args) {

        String text = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahkjhkjhaa";

        //recorrem d'esquerra a dreta
        int compt=0;
        int index=text.indexOf('a'); //comenca a buscar a partir de la posicio text.length()-1


        //volem comptar a's
        while(index!=-1){
            compt++;
            System.out.println("S'ha trobat a la posicio "+index);
            index=text.indexOf('a', index-1);
        }





        //volem comptar 'a'
        //for (int i = 0; i < text.length(); i++) {
          //  if(text.charAt(i)==('a')) compt++;
        //}
        //System.out.println("hem trobat "+compt+" a");
    }
}

class string3{
    public static void main(String[] args) {
        String text = "50 9 8 10";

        String[] paraules=text.split(" "); //vetor array
        int[] numeros = new int[paraules.length]; //declaro un array d'enters de la mateixa longitud que el de dalt
        int suma=0;

        for (int i = 0; i < paraules.length; i++) {
            System.out.print( paraules[i] );
            numeros[i]=Integer.valueOf(paraules[i]);

            //suma+=Integer.valueOf(paraules[i]);
        }
    }
}
