
import java.util.Scanner;

public class imcooked {
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

class suma2{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num1 = ent.nextInt();
        int num2 = ent.nextInt();

        System.out.println(num1+num2);
    }
}

class quadrat{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int costat = ent.nextInt();

        int area = costat*costat;

        System.out.println(area);
    }
}

class triangle{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float altura = ent.nextInt();
        float base = ent.nextInt();

        float area = base*altura/2;

        System.out.println(area);
    }
}

class paambtomaquet{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String paraula1 = ent.nextLine();
        String paraula2 = ent.nextLine();

        System.out.println(paraula1+" amb "+paraula2);
    }
}

class caramelssobrants{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int caramels, nens;

        caramels = ent.nextInt();
        nens = ent.nextInt();

        System.out.println(caramels%nens);
    }
}

class okboomer{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int any;
        do{
            System.out.println("Introduix una data de naixment valida (1-2020): ");
            any = ent.nextInt();
            if(any<=2020 && any >=1)
                break;
            else continue;
        }while (true);

        if (any>= 1945 && any<= 1965) System.out.println("ok boomer");
        else System.out.println("nah");
    }
}

class  cercaparelles{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int c1, c2, c3;
        do{
            System.out.println("Introduix un numero valid (1-13): ");
            c1 = ent.nextInt();
            c2 = ent.nextInt();
            c3 = ent.nextInt();
            if(c1<=13 && c1 >=1 && c2<=13 && c2 >=1 && c3<=13 && c3 >=1)
                break;
            else continue;
        }while (true);

        if (c1 == c2 || c2==c3 || c3==c1) System.out.println("SI");
        else System.out.println("NO");
    }
}

class  cercatrios{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int c1, c2, c3;
        do{
            System.out.println("Introduix un numero valid (1-13): ");
            c1 = ent.nextInt();
            c2 = ent.nextInt();
            c3 = ent.nextInt();
            if(c1<=13 && c1 >=1 && c2<=13 && c2 >=1 && c3<=13 && c3 >=1)
                break;
            else continue;
        }while (true);

        if (c1 == c2 && c2==c3 && c3==c1) System.out.println("SI");
        else System.out.println("NO");
    }
}

class barret {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //System.out.println("Introduix una paraula:"); --> només el posariem en cas de ser executat per una persona
        String paraula = ent.nextLine();

        //Com comparem objectes utlitzem el mètode equals, no l'operador ==
        switch (paraula) {
            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;
            default:
                System.out.println("Hufflepuff");
        }
    }
}

class sumaunsegon{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int hores = ent.nextInt();
        int minuts = ent.nextInt();
        int segons = ent.nextInt();

        segons +=1;
        if (segons == 60 && segons>= 0){
            minuts+=1;
            segons=0;

        }
        if (minuts == 60 && minuts>= 0) {
            hores += 1;
            minuts = 0;
        }
        if (hores == 24 && hores >= 0) {
            hores = 0;
        }
        System.out.format("%d %d %d", hores ,minuts , segons);
    }
}

class ambrosio{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            int pisos = ent.nextInt();


        }
    }
}

class pokerdedaus{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int a = ent.nextInt();
        int b = ent.nextInt();
        int c = ent.nextInt();
        int d = ent.nextInt();

        if (a == b || a == c || a==d || b==c || b ==d || c==d) System.out.println("PARELLA");
        else if (a == b && b == c || a==b && b==d || a==c && c==d || b==c && c==d ) System.out.println("TRIO");
        else if (a == b && b == c &&  d==a) System.out.println("POKER");
        else System.out.println("RES");
    }
}