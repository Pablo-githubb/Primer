package expliacions.introduccio.Enunciats.exercicis.precedència.joel;
import javax.swing.*;
import java.nio.file.attribute.UserPrincipalLookupService;
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

class lalafel {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos > 0) {
            //tractament de cada cas

            String[] paraules = ent.skip("[\r\n]*").nextLine().split(", ");
            int necessaris = ent.nextInt();

            int comptLalafel = 0;
            int telPlenes = 0;

            for (int i = 0; i < paraules.length; i++) {
                switch (paraules[i].toLowerCase()) {
                    case "lalafel":
                        comptLalafel++;
                        break;
                    case "telaranya":
                        if (necessaris > 0 && comptLalafel >= necessaris) {
                            telPlenes++;
                            comptLalafel -= necessaris;
                        }
                        break;
                    case "aranya":
                        comptLalafel = 0;
                        telPlenes = 0;
                        break;
                }
            }
            System.out.format("Hay %d telaranyas llenas.%n", telPlenes);
        }
    }

}
class Quadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la entrada (número real que representa el lado del cuadrado)
        double costat = scanner.nextDouble();

        // Calcular l'àrea
        double area = costat * costat;

        // Imprimir l'àrea amb 15 posicions, omplint amb 0s a l'esquerra i 3 decimals
        System.out.format("%015.3f%n", area);
    }

}
class Una {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();

        if (n < 0 || n >= 1000) {
            System.out.println("El número debe ser mayor o igual que 0 y menor que 1000.");
            return;
        }

        scanner.nextLine();  // Consumir el salto de línea después del entero

        // Leer n líneas de texto
        String[] lineas = new String[n];
        for (int i = 0; i < n; i++) {
            lineas[i] = scanner.nextLine(); // Leer la línea de texto
        }

        // Aplicar la normativa y imprimir el resultado
        for (int i = 0; i < n; i++) {
            StringBuilder resultado = new StringBuilder();
            boolean mayuscula = false; // Indica si la siguiente letra debe ser mayúscula

            for (char c : lineas[i].toCharArray()) {
                // Solo alternamos letras alfabéticas
                if (Character.isLetter(c)) {
                    if (mayuscula) {
                        resultado.append(Character.toUpperCase(c));
                    } else {
                        resultado.append(Character.toLowerCase(c));
                    }
                    mayuscula = !mayuscula; // Alternar
                } else {
                    resultado.append(c); // Agregar el carácter tal como está (espacios, puntuación, etc.)
                }
            }
            // Imprimir la línea transformada
            System.out.println(resultado.toString());
        }
    }

}
class sumarnumerors{
    public static void main(String[] args) {
        System.out.println(89789798*72665512);
    }

}
class problemacpp {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num = ent.nextInt();
        System.out.println(num + 1);

    }

}
//02 01 Alternatives (if, easy) (gg ez)
class eleccions2020{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int jiden=ent.nextInt();
        int drump=ent.nextInt();


        if (jiden>drump) System.out.println("Jiden");
        if (jiden<drump) System.out.println("Drump");

    }


}
class eleccions20202{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int jiden=ent.nextInt();
        int drump=ent.nextInt();


        if (jiden>drump) System.out.println("Jiden");
        if (jiden<drump) System.out.println("Drump");
        else if (jiden==drump) System.out.println("No");
    }
}
class eleccions20203{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int jiden=ent.nextInt();
        int drump=ent.nextInt();
        int banders=ent.nextInt();


        if (jiden>drump) System.out.println("Jiden");
        if (jiden<drump) System.out.println("Drump");
        else if (banders>jiden && banders>drump) System.out.println("Banders");
    }
}
class difgranpetit{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int n1 = ent.nextInt();
        int n2 = ent.nextInt();

        if (n1>=n2) System.out.println(n1-n2);
        else if (n1<=n2) System.out.println(n2-n1);
    }

}
class difgranpetit2{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int a = ent.nextInt();
        int b = ent.nextInt();
        int c = ent.nextInt();

        if (a>=b && a>=c && b>=c) System.out.println(a-c);
        else if (b>=a && b>=c && a>=c) System.out.println(b-c);
        else if (c>=a && c>=b && b>=a) System.out.println(c-a);
        else if (b>=c && b>=c && c>=a) System.out.println(b-a);
        else if (a>=c && a>=b && c>=b) System.out.println(a-b);
        else if (c>=a && c>=b && a>=b) System.out.println(c-b);
    }

}
class pedrapapertisora{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
//1 pedra
//2 paper
//3 tisora
        int jugador1= ent.nextInt();
        int jugador2= ent.nextInt();

        if (jugador1==1 && jugador2 ==2 || jugador2==1 && jugador1==3) System.out.println("Jugador2");
        else if (jugador2==1 && jugador1 ==2 || jugador1==1 && jugador2==3) System.out.println("Jugador1");
        else if (jugador1==jugador2) System.out.println("EMPAT");
        else System.out.println("ERROR");
    }

}
class torresbessones{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float torre1= ent.nextFloat();
        float torre2= ent.nextFloat();

        if (Math.abs(torre1-torre2)<=5) System.out.println("SI");
        else System.out.println("NO");
    }

}
//02 03 Alternatives (AND OR)
class bambino{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int a = ent.nextInt();
        int b = ent.nextInt();
        int c = ent.nextInt();
        int n = ent.nextInt();

        if (n != a && n != b && n != c) System.out.println("SI");
        else System.out.println("NO");
    }
}
class muntanyes{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int n1= ent.nextInt();
        int n2= ent.nextInt();
        int n3= ent.nextInt();
        int n4= ent.nextInt();
        int n5= ent.nextInt();

        if (n2>n1 && n3<n2 && n4>n3 && n5<n4 || n2<n1 && n3>n2 && n4<n3 && n5>n4) System.out.println("SI");
        else System.out.println("NO");
    }

}
class felicitatascendent{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int f1=ent.nextInt();
        int f2=ent.nextInt();
        int f3=ent.nextInt();


        if (f1<f2 && f2<f3 && f3>f1) System.out.println("SI");
        else System.out.println("NO");
    }
}
class cercatrios{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int c1 = ent.nextInt();
        int c2 = ent.nextInt();
        int c3 = ent.nextInt();

        if (c1 == c2 && c2 == c3 && c3 == c1) System.out.println("SI");
        else System.out.println("NO");
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

class calorcitoc4{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int alumnes = ent.nextInt();
        int temperatura = ent.nextInt();
        String comandament = ent.skip("[\n\r]*").nextLine();

        if ((alumnes >= 15 || alumnes <= 15) && temperatura > 25 && comandament.equals("SI")) {
            System.out.println("Aire");
        } else if (alumnes > 15 && temperatura <= 25 && temperatura > 22 && comandament.equals("SI")) {
            System.out.println("Aire");
        } else if (alumnes > 15 && temperatura <= 25 && temperatura > 22 && comandament.equals("NO")) {
            System.out.println("Obrir finestra");
        } else if ((alumnes > 15 && temperatura > 18) && (comandament.equals("SI") || comandament.equals("NO"))) {
            System.out.println("Obrir finestra");
        } else {
            System.out.println("RES");
        }
    }
}
//02 05 Alternatives + Mòdul + Hores
class dimensioinversa{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double num = ent.nextDouble();

        System.out.println(1/num);
    }
}


class horavalida{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int hores=ent.nextInt();
        int minuts=ent.nextInt();
        int segons=ent.nextInt();

        if (hores<=23 && hores>=0 && minuts<=59 && minuts>=0 && segons<=59 && segons>=0) System.out.printf("SI");
        else System.out.printf("NO");
    }
}

class decada90{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int any = ent.nextInt();
        if (any % 100 >=90 && any % 100 <=99) System.out.println("SI");
        else System.out.println("NO");
    }
}

class amanecer{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int segons = ent.nextInt();

        System.out.format("%s del dia %d",
                segons%86400 < 43200 ?"mati":"nit",
                        (segons/86400)+1);
    }
}
class polvalcinema{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

    }
}