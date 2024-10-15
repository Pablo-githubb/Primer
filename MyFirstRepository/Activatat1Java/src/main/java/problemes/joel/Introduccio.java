package problemes.joel;
import java.util.Scanner;

public class Introduccio {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String nom = ent.nextLine();

        System.out.println("Hola, "+nom);
    }
}

class multiplica3{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num = ent.nextInt();

        System.out.println(num*3);
    }
}

class sumados{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num1 = ent.nextInt();
        int num2 = ent.nextInt();

        System.out.println(num1+num2);
    }
}

class quadrat {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int costat = ent.nextInt();

        int area = costat * costat;

        System.out.println(area);

    }
}

class triangles {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double altura = ent.nextInt();
        double base = ent.nextInt();

        double area = altura*base/2;

        System.out.println(area);

    }
}

class beatles {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int files = ent.nextInt();
        int columna = ent.nextInt();
        int filaInici = ent.nextInt();


        for (int i = 0; i < files; i++) {
            if ((i + filaInici) % 2 == 0) {
                for (int j = 0; j < columna; j++) {
                    System.out.print("1 ");
                }
            } else {
                for (int j = 0; j < columna; j++) {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

class boomer {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int anys = ent.nextInt();

        if (anys >= 1945 && anys <= 1965) System.out.println("ok boomer");
        else System.out.println("nah");
    }
}