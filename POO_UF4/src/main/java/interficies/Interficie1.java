package org.example.interficies;

public interface Interficie1 { // Dintre hi han mètodes abstractes

    //Mètodes abstractes → per defecte tots els mètodes son public i abstract

    void metode(int param);

    void metode(Interficie1 param);

}

class Classe1 implements Interficie1 { // Per implementar utilitzem → implements
    @Override
    public void metode(int param) {
        System.out.println("Estic a la classe Classe1");
    }

    @Override
    public void metode(Interficie1 param) {
        if (param instanceof Classe1) System.out.println("El parametre es de la mateixa classe que l'objecte actual");
        else if (param instanceof Classe2) System.out.println("El parametre NO es de la mateixa classe que l'objecte actual");
    }

    public void metode2() {
        System.out.println("Est en el metode2 de la class Classe1");
    }
}

class Classe2 implements Interficie1 { // Per implementar les interfícies utilitzem → implements
    @Override
    public void metode(int param) {
        System.out.println("Estic a la classe Classe2");
    }

    @Override
    public void metode(Interficie1 param) {

    }

    public void metode2() {
        System.out.println("Est en el metode2 de la class Classe2");
    }

}

class Prova{
    public static void main(String[] args) {
        Interficie1 obj = new Classe1(); // Class1 al tindre implementat Interficie1 l'objecte pot ser referenciat com Interficie1
        // Interficie1 obj2 = new String(); → la classe ha d'implementar la interficie

        obj.metode(785);
        // Al estar instanciat en una interficie, els metodes propis de les classes no es poden executar, per tant es tenen que castejar.
        ((Classe1)obj).metode2(); // Al castejar es pot accedir a l'informacio de la propia classe i executar els seus metodes.
        // No es pot castejar a altres metodes que no sigui l'instanciat.

        // instanceof → per saber si un objecte és d'una classe o d'una altra → retorna un booleà
        if (obj instanceof Classe1) ((Classe1)obj).metode2();
        else if (obj instanceof Classe2) ((Classe2)obj).metode2();

        obj.metode(obj); // Cositas raras
    }
}
