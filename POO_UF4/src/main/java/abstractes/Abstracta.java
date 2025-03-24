package org.example.abstractes;

public abstract class Abstracta { //ficar abstract en el nom de la classe

    //Mètodes abstractes → no te implementació, no li ficarem les {}
    public abstract int metodeAbstracte();



    public static void main(String[] args) {
        // Abstracta a = new Abstracta(); //no es pot instanciar una classe abstracta


    }

}

/*
 * Les classes abstractes poden serveri com llibreries de classes, per exemple, si volem que totes les classes que
 * heretin.
 * S'utilitzen molt per guardar en constants i mètodes que no es poden sobreesciure.
 */
abstract class FillaAbstracta1 extends Abstracta{}

class FillaAbstracta2 extends Abstracta{

    @Override
    public int metodeAbstracte() { //possible implementació de la conversió de mètode abstracte a mètode int
        return 0;
    }
}


