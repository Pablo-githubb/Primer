package org.example.herencia;

public class Progenitor {
    private int propEntera; //lo privat no s'hereda
    protected boolean propLogica;
    char propCaracter;
    public static double propDecimal; //static, pertany solament a la classe

    private static String propStringStatica = "aaaaaaaaaahhhhhhhhhh"; //static, pertany solament a la classe

//amb els getter i setters no necessitem utilitzar els public, d'aquesta manera podem utilizar el private i crear els
// mètodes per accedir.


    public static String getPropStringStatica() {
        return propStringStatica;
    }

    public static void setPropStringStatica(String propStringStatica) {
        Progenitor.propStringStatica = propStringStatica;
    }
}

class Filla extends Progenitor { //extends s'utilitza per heretar sobre quina classe volem

}

class Prova {
    public static void main(String[] args) {
        Filla f = new Filla();

        Progenitor p = new Progenitor();
        p.propDecimal = 20.5;
        Progenitor p1 = new Progenitor();
        p1.propCaracter = 'a';
        System.out.println(p1.propDecimal);

        //Les props estàtiques se solen accedir utilitzant el nom de la classe
        Progenitor.propDecimal = 30.4;
        System.out.println(p1.propDecimal);

        System.out.println(Progenitor.getPropStringStatica());

    }
}