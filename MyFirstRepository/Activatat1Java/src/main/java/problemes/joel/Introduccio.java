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