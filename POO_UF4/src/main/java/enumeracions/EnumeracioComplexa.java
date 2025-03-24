package org.example.enumeracions;

public enum EnumeracioComplexa {
    MERCURI(1,2), VENUS(2,3), TERRA(3,4), LLUNA(5,6);

    //Les constants poden ser publiques
    public static final double G=9.81;

    //Propietats de la enumeracio
    //Les propietats de una enum son privades i finals (no es poden modificar)

    private final int massa;
    private final double radi;

    //Constructor de l'enum
    private EnumeracioComplexa(int massa, double radi) {
        this.massa = massa;
        this.radi = radi;
    }

    public double getRadi() {
        return radi;
    }

    public int getMassa() {
        return massa;
    }

    public double operacio(int valor){
        return this.massa + valor;
    }
}



class Prova2{
    public static void main(String[] args) {
        EnumeracioComplexa.MERCURI.getMassa();
        EnumeracioComplexa.MERCURI.getRadi();

        EnumeracioComplexa.VENUS.getMassa();
        EnumeracioComplexa.VENUS.getRadi();

        EnumeracioComplexa.TERRA.getMassa();
        EnumeracioComplexa.TERRA.getRadi();

        System.out.println("La massa de mercuri es "+EnumeracioComplexa.MERCURI.getMassa()+" KG"+ " i el radi es "+EnumeracioComplexa.MERCURI.getRadi()+" KM");
        System.out.println("La massa de mercuri es "+EnumeracioComplexa.VENUS.getMassa()+" KG"+ " i el radi es "+EnumeracioComplexa.VENUS.getRadi()+" KM");
        System.out.println("La massa de mercuri es "+EnumeracioComplexa.TERRA.getMassa()+" KG"+ " i el radi es "+EnumeracioComplexa.TERRA.getRadi()+" KM");

        System.out.println("La massa de mercuri segons l'operació "+EnumeracioComplexa.MERCURI.operacio(5));

        //Podem mostrar totes les constants d'una enumeracio
        for(EnumeracioComplexa elem: EnumeracioComplexa.values()){
            System.out.println(elem.name()); //elem.name serveix com un getter
            System.out.println(elem.ordinal());
            System.out.println(elem.getMassa());
            System.out.println(elem.getRadi());

        }
    }
}

/*
⠄⠄⠄⠄⠄⠄⢴⡶⣶⣶⣶⡒⣶⣶⣖⠢⡄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄
⠄⠄⠄⠄⠄⠄⢠⣿⣋⣿⣿⣉⣿⣿⣯⣧⡰⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄
⠄⠄⠄⠄⠄⠄⣿⣿⣹⣿⣿⣏⣿⣿⡗⣿⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄
⠄⠄⠄⠄⠄⠄⠟⡛⣉⣭⣭⣭⠌⠛⡻⢿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄
⠄⠄⠄⠄⠄⠄⠄⠄⣤⡌⣿⣷⣯⣭⣿⡆⣈⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄
⠄⠄⠄⠄⠄⠄⠄⢻⣿⣿⣿⣿⣿⣿⣿⣷⢛⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄
⠄⠄⠄⠄⠄⠄⠄⠄⢻⣷⣽⣿⣿⣿⢿⠃⣼⣧⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄
⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣛⣻⣿⠟⣀⡜⣻⢿⣿⣿⣶⣤⡀⠄⠄⠄⠄⠄
⠄⠄⠄⠄⠄⠄⠄⠄⢠⣤⣀⣨⣥⣾⢟⣧⣿⠸⣿⣿⣿⣿⣿⣤⡀⠄⠄⠄
⠄⠄⠄⠄⠄⠄⠄⠄⢟⣫⣯⡻⣋⣵⣟⡼⣛⠴⣫⣭⣽⣿⣷⣭⡻⣦⡀⠄
⠄⠄⠄⠄⠄⠄⠄⢰⣿⣿⣿⢏⣽⣿⢋⣾⡟⢺⣿⣿⣿⣿⣿⣿⣷⢹⣷⠄
⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⢣⣿⣿⣿⢸⣿⡇⣾⣿⠏⠉⣿⣿⣿⡇⣿⣿⡆
⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⢸⣿⣿⣿⠸⣿⡇⣿⣿⡆⣼⣿⣿⣿⡇⣿⣿⡇
⠇⢀⠄⠄⠄⠄⠄⠘⣿⣿⡘⣿⣿⣷⢀⣿⣷⣿⣿⡿⠿⢿⣿⣿⡇⣩⣿⡇
⣿⣿⠃⠄⠄⠄⠄⠄⠄⢻⣷⠙⠛⠋⣿⣿⣿⣿⣿⣷⣶⣿⣿⣿⡇⣿⣿⡇
 */

/*
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░▄▄▄░░░░▄███▄▄███▄░░░░░░▄░░▄░░░░░░░░
░░░░█░░░░░██████████░░░░░░█░░█░░░░░░░░
░░░░█░░░░░░▀██████▀░░░░░░░█░░█░░░░░░░░
░░░▀▀▀░░░░░░░▀██▀░░░░░░░░░░▀▀░░░░░░░░░
░░░░░░░░░░░░▄░░░░░█░▄▀░░▄░░░░░░░░░░░░░
░░░░░░░░▄░░░▀▄▄▄▀█▀▀█▀▀▄█▄░█░░░░░░░░░░
░░░░░░░░░▀▄▄▀█░░░▀░░░░░░░░█▄░▄▀▀░░░░░░
░░░░░▀▀▄░█▀░░░░░░░░░▄▄▄▄▄▄░▀█░░░░░░░░░
░░░░░░▄▀▀░▄▄▀▀▀▄░░▄█▀░░░░▀▄░▄█▀▀▀▄░░░░
░░░▄▄██░░█░░░░░░█░█░░███░▄▀░░░██░█░░░░
░░█░▄█░░░█░███░▄▀░▀▀▄███▀░░░░░██░█░░░░
░░█░▀█▄░░▀▄███▄▀░░░░░░░░░░░░░▄█▄▀░░░░░
░░░▀▀▀▀█░░░░░░░░░░░░░░░▄█▀░░▄▀░░░░▄░░░
░░░░▄░░░▀▄░▀▀▄▄░░░░░▄▄▀▀░░▄▀░░░░▄█▀░░░
░░▄▄█▄░░░░▀▀▄▄░▀▀▀▀▀░▄▄▄▀▀░░▄▄▀▀▀█▀▀░░
░░▄█▀▀▀▀▄▄▄▄░░▀▀▀▀▀█▀░░░▄▄▀▀░░░░░░▀░░░
░░░░░░░░░░░░▀▀▀▀▀▄▄█▄▄▀▀░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░▀░░░░░░░░
 */
