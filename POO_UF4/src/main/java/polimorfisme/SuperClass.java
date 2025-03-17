package org.example.polimorfisme;

public class SuperClass {

    protected int prop = 11; //propietat sobreescrita
    //Mètodes sobrecarregats → polimorfistme pt1

    public void metodeSobreCarregat() {
        System.out.println("Sóc un mètode sense paràmetres");
    }

    public int metodeSobreCarregat(int num) {
        System.out.println("Sóc un mètode amb un paràmetre");
        return 1;
    }

    public int metodeSobreCarregat(int num2) {
        System.out.println("Sóc un mètode amb un paràmetre");
        return 1;
    }


    public void metodeSobreEscrit() {
        System.out.println("SERÉ un mètode sobreescrit");

    }

    public static void main(String[] args) {
        SuperClass s = new SuperClass();
        int num = s.metodeSobreCarregat(22);

        SuperClass s2 = new SuperClass();
        int num2 = s.metodeSobreCarregat(44);

        s.metodeSobreEscrit();


        SubClasse filla = new SubClasse();

        System.out.println(filla.prop);


    }

    //Métode sobreescrit
    public void metodeSobreEscrit(int param){
        System.out.println("Sóc un mètode sobreescrit");
    }
}

class SubClasse extends SuperClass {


    protected int prop = 99; //propietat sobreescrita
    public static final String nom = "Pablo"; //Propietat que és coneguda com una constant

    //Mètode que no pot ser sobreescrit
    private static final void metodeFinal() {
        System.out.println("Sóc un mètode que no es pot sobreescrit");
    }


    //Mètode sobreescrit → polimorfisme pt2

    @Override
    public void metodeSobreEscrit(int param) {
        //super.metodeSobreEscrit(); //igual que el this, fa referencia a la classe heretada
        System.out.println("JA SÓC un mètode sobreescrit");
        System.out.println("La meve prop val " + prop);
        System.out.println("La prop de MUNPARE val " + super.prop);
    }
}

//Classe que no ser extendre → esteril/sense descendència
final class Esteril{ }


// class FillaEsteril extends Esteril{} No podem heretar una classe final