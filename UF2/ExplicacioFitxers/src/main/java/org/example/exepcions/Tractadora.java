package org.example.exepcions;

import static org.example.exepcions.Propaganda.generaExcepcio;

public class Tractadora {
    public static void main(String[] args) {
        try{
            generaExcepcio(8);
        } catch (NullPointerException e) {
            System.out.println("Ja m'ho esperava!!");;
        }
    }

}
