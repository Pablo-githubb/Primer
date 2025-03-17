package org.example.interficies;

public interface FullEquip {

    //Constants → totes les propietats d'una interfície son public static final
    int NUMERO_ASIGNATURES_SUSPESES=23;  // Les constants han de tenir un valor per defecte no modificable, a part ha de ser en MAJSUCULES

    //Mètodes abstractes → ja ho hem vist

    //Mètodes estàtics
    static void metodeEstatic() {
        System.out.println(NUMERO_ASIGNATURES_SUSPESES);
    }
    //Mètodes default implementats
    default void metodePerDefecte() {
        System.out.println("Mètode per defecte");
    }
}

class ClasseFull implements FullEquip{
    @Override
    public void metodePerDefecte() {
        FullEquip.super.metodePerDefecte();

        System.out.println("Faig més coses que les que fea el mètode per defecte de la interfície");
    }

    public static void main(String[] args) {
        ClasseFull o=new ClasseFull();
        o.metodePerDefecte();
    }
}
