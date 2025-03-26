package Introduccio;

import java.util.Scanner;

public class SumaSegon {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int hora = ent.nextInt();
        int minut = ent.nextInt();
        int segon = ent.nextInt()+1;

        if (segon==60){
            segon = 0;
            minut+=1;
        }
        if (minut==60){
            minut=0;
            hora+=1;
        }
        if (hora==24){
            hora=0;
        }
        System.out.format("%d %d %d",hora,minut,segon);
    }

}
