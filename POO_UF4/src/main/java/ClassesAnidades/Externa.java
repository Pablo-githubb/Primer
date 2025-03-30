package org.example.ClassesAnidades;

public class Externa {

    //Propietats de la classe externa
    private int numero;

    void metode(){
        numero = 10;
        System.out.println("Estic a la classe externa i el meu numero val "+numero);
    }

    //Classe anidada no estatica --> inner class
    public class Interna{

        //Propietats de la classe interna
        private int numero;
        void metode(){
            numero = 23; //Com tenim un numero a la classe interna, accedira a aquell.

            //Despres de canviar el numero, es pot accedir al de la classe externa amb una anotacio especial.
            //Aqui si que es pot accedir el numero de la classe Externa

            System.out.println("Estic a la classe interna i el meu numero val "+numero);
        }
    }

    //classe anidada estatica
    protected static class Estatica{
        void metode(){
            //No pot accedir a numero, al ser una classe estatica
            System.out.println("Estic a la classe anidada estatica i no se que es el numero");

        }
    }
}

class SimilarAEstatica{
    void metode(){
        System.out.println("Estic a la classe normal i no se que es el numero");
    }
}

class Prova{
    public static void main(String[] args) {
        //Instanciem un objecte de la classe Estatica
        Externa.Estatica objecte = new Externa.Estatica(); //Obkecte de la classe
        //Instanciem una classe d'una classe normal
        SimilarAEstatica objecte2 = new SimilarAEstatica();
        //Instanciem un objecte de la classe interna
        Externa obj3 = new Externa();
        Externa.Interna obj4 = obj3.new Interna(); //Es necessita obj3 per a fer el new de obj4

        //Prova
        objecte.metode();
        objecte2.metode();
        obj3.metode();
        obj4.metode();
    }
}