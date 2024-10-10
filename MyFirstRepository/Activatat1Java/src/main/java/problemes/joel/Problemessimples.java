package problemes.joel;
import javax.xml.transform.Source;
import java.util.Scanner;
import java.util.SortedMap;

public class Problemessimples {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int edat = ent.nextInt();

        if (edat < 32){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}


class parelles {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int c1 = ent.nextInt();
        int c2 = ent.nextInt();
        int c3 = ent.nextInt();

        if (c1 != c2 && c1 != c3 && c2 != c1 && c2 != c3 && c3 != c1 && c3 != c2) {
            System.out.println("NO");
        } else {
            System.out.println("SI");
        }

    }
}

class anyvinent{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int N= ent.nextInt();

        System.out.println("Tindras "+(N+1)+" anys");

    }
}

class diferenciagranpetit{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int a = ent.nextInt();
        int b = ent.nextInt();
        int diferencia = (a-b);

        System.out.println(diferencia);

    }
}

class diesetmana {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int dia = ent.nextInt();
        if (dia == 1) {
            System.out.println("Monday");
        } else if (dia == 2) {
            System.out.println("Tuesday");
        } else if (dia == 3) {
            System.out.println("Wednesday");
        } else if (dia == 4) {
            System.out.println("Thursday");
        } else if (dia == 5) {
            System.out.println("Friday");
        } else if (dia == 6) {
            System.out.println("Saturday");
        } else if (dia == 7) {
            System.out.println("Sunday");
        }
    }
}

class diesetmana2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double dia = ent.nextInt();
        if (dia == 1) {
            System.out.println("Monday");
        } else if (dia == 2) {
            System.out.println("Tuesday");
        } else if (dia == 3) {
            System.out.println("Wednesday");
        } else if (dia == 4) {
            System.out.println("Thursday");
        } else if (dia == 5) {
            System.out.println("Friday");
        } else if (dia == 6) {
            System.out.println("Saturday");
        } else if (dia == 7) {
            System.out.println("Sunday");
        }
    }
}

class iron4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String tecla = ent.nextLine();
        switch (tecla) {
            case "Q":
                System.out.println("Skill 1");
                break;
            case "W":
                System.out.println("Skill 2");
                break;
            case "E":
                System.out.println("Skill 3");
                break;
            case "R":
                System.out.println("Ultimate");
                break;
            case "B":
                System.out.println("Recall");
                break;
            case "D":
                System.out.println("Bronzes never use summoners");
                break;
            case "F":
                System.out.println("Bronzes never use summoners");
                break;
            default:
                System.out.println("Error");
        }
    }
}

class etsjove2{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n1 = ent.nextInt();
        int n2 = ent.nextInt();
        int n3 = ent.nextInt();
        int n4 = ent.nextInt();
        int n5 = ent.nextInt();

        }
    }


class cercaparelles {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int c1 = ent.nextInt();
        int c2 = ent.nextInt();
        int c3 = ent.nextInt();

        if (c1 == c2 && c2 == c3) System.out.println("TRIO");
        else if (c1 == 0 || c2 == 0 || c3 == 0) {
            if (c1 == c2 || c2 == c3 || c1 == c3) System.out.println("TRIO");
            else System.out.println("PARELLA");
        } else if (c1 == c2 || c2 == c3 || c1 == c3) System.out.println("PARELLA");
        else System.out.println("RES");
    }
}

class aireacondicionat {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int N = ent.nextInt();

        System.out.println(N%180 == 0 ? "BRONCA" : "OK");
    }
}

