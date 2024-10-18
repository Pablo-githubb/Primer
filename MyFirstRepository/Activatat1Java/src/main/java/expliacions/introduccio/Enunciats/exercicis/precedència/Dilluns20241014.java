package expliacions.introduccio.Enunciats.exercicis.precedència;

import java.util.Scanner;

public class Dilluns20241014 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String paraula = ent.nextLine();

        while (!paraula.equals("FIN")) {
            paraula = ent.nextLine();
            int exclamacions1 = 0;
            int exclamacions2 = 0;


            int i = 0;
            while (i < paraula.length()) {
                if (paraula.charAt(i) == '!') exclamacions1++;
                else if (paraula.charAt(i) == '¡') exclamacions2++;

                i++;
            }
            if (exclamacions1 == exclamacions2) System.out.println("SI");
            else System.out.println("NO");
            paraula = ent.nextLine();
        }

    }
}


class exemplefor{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text = "text raro";
        //segona estructura repetitiva -----> el for

        int index = 0;

        //fem el for equivalent
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}

class RepetitivaIII{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n;

        System.out.println("Introduix un enter: ");
        n= ent.nextInt();
        System.out.println(n);

        do{
            System.out.println("Introduix un enter: ");
            n= ent.nextInt();
            System.out.println(n);
        } while(n!=0);

        }

}

class beatels {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int linia1 = ent.nextInt();
        int linia2 = ent.nextInt();
        int linie3 = ent.nextInt();
    }
}

class ascensor {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int petit = ent.nextInt();
        int gran = ent.nextInt();
        int ini = ent.nextInt();
        ent.nextLine();

        int qMovs = 0;
        int qPis = 0;
        int fi = ini; //per si no hi han moviments preparem el final
        boolean incorrectes = false;
        //bucle per llegir els valors restants
        do {
            //llegir utilitzant un nextLine per que pot ser numeric o text
            String pisText = ent.nextLine();
            if (pisText.equalsIgnoreCase("x")) break; //sortim del bucle per la X
            else { //hem entrat al bucle perque pis es un numero
                int pis = Integer.valueOf(pisText);

                //fem calculs en el pis rebut
                if (pis < petit || pis > gran) {
                    incorrectes = true;
                } else {
                    //Comprovem si canviem de pis
                    if (pis != fi) {
                        qMovs++; //Incrementem el numero de moviments
                        //Anem a calcular els pisis que ens desplaçem
                        if (pis > fi) qPis += pis - fi;
                        else qPis += fi - pis;

                        //Actualizem el pis on anem
                        fi = pis;
                    }
                }
            }
        } while (true);
        System.out.println(qMovs + " " + qPis + " " + fi + " "+(incorrectes ? "E" : " "));
    }
}

class divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();

        for (int i = 0; i < casos; i++) {
            int n = scanner.nextInt();
            for (int j = 1; j <= n; j++) {
                if (n % j == 0) System.out.print(j + " ");
            }
        } System.out.println("");
    }
}