package explicacions;

import java.util.Scanner;

public class Divendres20240920 {
    public static void main(String[] args) {
        System.out.println("Hello World");   //"Hello Worl" es una cadena de text, String
        System.out.println(44);          //44.89 es un numero deciamal o real, short byte int long
        System.out.println(44.89);      //44.89 es un numero decimal o real, float double
        System.out.println(true);       //true es un caracter bolea. bolean
        System.out.println('a');        //'a' es un caracter, char
        
    }


}
class segona{

    public static void main(String[] args) {

        int numero;
        numero = 0;
    }
}
class tercera{

        public static void main(String[] args) {

            Scanner ent = new Scanner(System.in);

            //Declaracio de variables

            int edat;

            //Anem a demanar l'edat a l'usuari
            System.out.println("Quina edat tens?");
            edat=ent.nextInt();


            //Mostrem l'edat
            System.out.println("Tens "+edat+" anys." );

            //Mostrem l'edat que tindra l'any que ve
            System.out.println("L'any que ve tindras "+(edat+1)+" anys." );
    }

}