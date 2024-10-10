package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.util.Scanner;

class DImarts2024108 {
    public static void main(String[] args) {
        System.out.println("Escriu un text qualsevol: ");
        Scanner ent = new Scanner(System.in);
        String text = ent.nextLine();


        int index=0;
        //declarem un index per recorrer el text
        while(index < text.length()){

            System.out.println(text.charAt(index));
            //incrementem l'index
            index++;



        }
        index=text.length()-1;

        while(index>=0){
            System.out.println(text.charAt(index));
            index--;
        }
    }
}

class compatarlletres{
    public static void main(String[] args) {
        System.out.println("Escriu un text qualsevol: ");
        Scanner ent = new Scanner(System.in);
        String text = ent.nextLine();

         int index=0;
         int compV=0;
         int compC=0;

        while (index < text.length()){
            char c=text.charAt(index);
            if(text.equals("A")|| text.equals("E") || text.equals("I") || text.equals("O") || text.equals("U")) System.out.println(text.charAt(compC));
            else compC++;


            index++;
        }



    }
}