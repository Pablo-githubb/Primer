package control.access.primer;

public class Dades {
    public String nom = "Pablo";
    private double iva = 0.21;
    protected String insti = "IES EBRE";
    int edat = 18;

    //Mètode constructor
    public Dades(){
    }

    //Getters i Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getInsti() {
        return insti;
    }

    public void setInsti(String insti) {
        this.insti = insti;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    //Mètodes amb missatge

    public void mostraNom(){
        System.out.println("El meu nom és: "+nom);
    }

    public void mostraIva(){
        System.out.println("El IVA és: "+iva);
    }

    public void mostraInsti(){
        System.out.println("L'institut on estudio és: "+insti);
    }

    public void mostraEdat(){
        System.out.println("La meva edat és: "+edat);
    }
}




