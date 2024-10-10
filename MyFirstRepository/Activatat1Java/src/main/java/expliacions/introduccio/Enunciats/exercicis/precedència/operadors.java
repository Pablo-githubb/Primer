package expliacions.introduccio.Enunciats.exercicis.precedència;

public class operadors {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Sense parèntesis
        int resultat1 = a + b * c;
        System.out.println("Resultat sense parèntesis: " + resultat1);

        // Amb parèntesis
        int resultat2 = (a + b) * c;
        System.out.println("Resultat amb parèntesis: " + resultat2);

    }

}

class exe2{

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        boolean z = true;

// Sense parèntesis
        boolean resultat1 = x || y && z;
        System.out.println("Resultat sense parèntesis: " + resultat1);

// Amb parèntesis
        boolean resultat2 = (x || y) && z;
        System.out.println("Resultat amb parèntesis: " + resultat2);

    }
}
