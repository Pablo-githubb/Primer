package alternativesif;

import java.util.Scanner;

public class Eleccions2020 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int votsJiden = ent.nextInt();
        int votsDrump = ent.nextInt();

        if (votsJiden > votsDrump) System.out.println("Jiden");
        else System.out.println("Drump");
    }
}

class Eleccions2020v2{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int votsJiden = ent.nextInt();
        int votsDrump = ent.nextInt();

        if (votsJiden > votsDrump) System.out.println("Jiden");
        else if (votsDrump > votsJiden) System.out.println("Drump");
        else System.out.println("No");
    }
}

class Eleccions2020v3{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int votsJiden = ent.nextInt();
        int votsDrump = ent.nextInt();
        int votsBander = ent.nextInt();

        if (votsJiden > votsDrump && votsJiden > votsBander) System.out.println("Jiden");
        else if (votsJiden < votsDrump && votsBander < votsDrump) System.out.println("Drump");
        else System.out.println("Banders");
    }
}






