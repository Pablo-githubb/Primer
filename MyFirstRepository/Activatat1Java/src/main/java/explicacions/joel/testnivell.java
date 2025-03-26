package explicacions.joel;

import java.util.Scanner;

class bolaslolas {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();


        while (casos-- > 0) {

            String cadena = ent.skip("[\n\r]*").nextLine();
            int p2 = ent.nextInt();
            int p1 = ent.nextInt();
            for (int i = 0; i <= cadena.length(); i++) {
                if (i != p1 && i != p2) System.out.format("%c", cadena.charAt(i));
                else if (i == p1) System.out.format("%i", cadena.charAt(p2));
                else System.out.format("%c", cadena.charAt(p1));
            }
            System.out.println();
        }
    }
}

class cagatio {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numcasos = ent.nextInt();
        for (int i = 0; i < numcasos; i++) {
            int generacio = ent.nextInt();
            int numcaga = (generacio + 1)/2;
            System.out.print("Caga ");
            for(int j = 1; j<numcaga; j++) {
                System.out.print("caga");
            }
            System.out.print("tio!");
        }

    }
}