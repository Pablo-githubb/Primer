package expliacions.introduccio.Enunciats.exercicis.precedència;

public class Dilluns20240923 {
    public static void main(String[] args) {


        //Declaracio de variables

        int a,b,c,d,e;

        a=3;
        b=2;
        c=1;
        d= ((a + ((b * c) / 65)) + 42);

        int q = a / b;
        int r = a % b;

        a = b * q + r;


        System.out.println( a+" dividit entre " +b+" val "+q);
        System.out.println("i el resto val "+r);


        //Forçar que la divisio sigue real, fent el que  s'anomena "casting"
        double qReal = (double) a / b;

        System.out.println(a+" divisio real entre "+b+" val "+qReal);
    }
}

class Booleans{


    public static void main(String[] args) {
        //boleans solament poden ser true o fals, i (true+false=false) o (true+false= true)
        boolean esA, esB, esC;

        esA = true;
        esB = false;
        esC = esA = esB = false;


        // ||= es aixo o aixo.  &&= es aixo i aixo
        boolean resultat = (esA || ((!esB) && esC));

        System.out.println(resultat);
    }

}

class Booleans2 {
    public static void main(String[] args) {


        int a = 0;
        int b = 5;

        boolean resultat = ((a == 0 && a > b));
    }
}

class TiposCoincidents{
    public static void main(String[] args) {
        String cadena = "Soc una cadena";

        cadena = "Text anterior " +cadena+ " text posterior";

        System.out.println("La cadena \""+cadena+"\" te una longitud de "+cadena.length()+" caracters.");
    }

}