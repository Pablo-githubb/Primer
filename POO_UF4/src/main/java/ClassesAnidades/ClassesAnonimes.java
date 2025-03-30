package org.example.ClassesAnidades;

public class ClassesAnonimes {

    //Propietats de la classe

    //Es pot ficar una variable una interficie, aquesta variablo pot contindre qualsevol classe que tingui implementat la interficie
    //Esta creant una classe anonima (no te nom) al moment de fer new.
    Interficie prop = new Interficie() {
        @Override
        public void metode() {
            System.out.println("Soc un metode de una classe anonima");
        }

        @Override
        public int top(float f) {
            return 0;
        }
    };

    Interficie prop2 = new EnNom(); //Com EnNom es una clase que implementa interficie, podem ficar-la aqui

    public static void main(String[] args) {
        ClassesAnonimes obj = new ClassesAnonimes();
        obj.prop.metode();
        obj.prop2.metode();

        System.out.println(obj.prop.getClass().getName());
        System.out.println(obj.prop2.getClass().getName());
    }
}

class EnNom implements Interficie {

    @Override
    public void metode() {
        System.out.println("Soc un metode de una classe en nom que implementa la interficie");
    }

    @Override
    public int top(float f) {
        return 0;
    }
}

interface Interficie{
    void metode();
    int top(float f);
}