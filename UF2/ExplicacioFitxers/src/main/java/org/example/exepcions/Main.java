package org.example.exepcions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num = 0;
        boolean esText = true;

        do {
            System.out.println("Escriu un número enter major que 0");
            try {
                esText = true;
                num = ent.skip("[\r\n]*").nextInt();
                if (num > 0) break;
                esText = false;
                throw new InputMismatchException(); //nou missatge que tinc un número incorrecte
            } catch (InputMismatchException exepcio) { //quine és la exepció que volem capturar
                System.out.println("Has escriu un número incorrecte");
                if (esText) ent.next();
            }
        } while (true);
    }
}

class Main2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Escriu un número enter major que 0");
            try {

                num = Integer.valueOf(ent.nextLine());
                if (num > 0) break;

                throw new InputMismatchException(); //nou missatge que tinc un número incorrecte
            } catch (InputMismatchException exepcio) { //quine és la exepció que volem capturar
                System.out.println("Has escriu un número incorrecte");

            }
        } while (true);
    }
}

class Main3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Escriu un número enter major que 0");
            try {

                num = Integer.valueOf(ent.nextLine());
                if (num > 0) break;

                throw new NumberFormatException(); //nou missatge que tinc un número incorrecte
            } catch (NumberFormatException exepcio) { //quine és la exepció que volem capturar
                System.out.println("Has escriu un número incorrecte");

            } catch (ArithmeticException a) {
                System.out.println("Has escrit un número 0");
            }
        } while (true);
    }
}

class Main4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        do {
            System.out.println("Escriu un número enter major que 0");
            try {
                int[] array = new int[]{1, 2, 3};
                String string = "112";
                int index = 25;


                System.out.println(array[index]);
                throw new NumberFormatException(); //nou missatge que tinc un número incorrecte
            } catch (NumberFormatException exepcio) { //quine és la exepció que volem capturar
                System.out.println("Has escriu un número incorrecte");

            } catch (ArithmeticException a) {
                System.out.println("Has escrit un número 0");
            }
        } while (true);
    }
}

class Main5 {
    public static void main(String[] args) {


        try{
            int[] array=new int[]{1,2,3};
            String string="123";
            int index=25;
            //System.out.println(string.charAt(index));
            System.out.println(array[index]);

        }       //Els catch sempre han d'anar tractant excepcions de més específiques a més generals
        catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e){
            System.out.println("Hi ha hagut un error conegut!!");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Hi ha hagut un error desconegut!!");
        }catch(Exception e){
            System.out.println("Hi ha hagut una excepció que no sé d'on bé...");
        }

    }
}

class Main6 {
    public static void main(String[] args) {
        try{
            int[] array=new int[]{1,2,3};
            String string="123";
            int index=2;
            System.out.println(string.charAt(index));
            System.out.println(array[index]);


        }       //Els catch sempre han d'anar tractant excepcions de més específiques a més generals
        catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e){
            System.out.println("Hi ha hagut un error conegut!!");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Hi ha hagut un error desconegut!!");
        }catch(Exception e){
            System.out.println("Hi ha hagut una excepció que no sé d'on bé...");
        }finally{
            //Se posen instruccions que volem que s'executen tant si hi ha alguna excepció com si no
            System.out.println("Sempre m'executo, per què estic al finally!!");
            //fitxer.close();
        }

    }
}
