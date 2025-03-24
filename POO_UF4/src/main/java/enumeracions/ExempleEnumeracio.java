package org.example.enumeracions;

public enum ExempleEnumeracio {
    DAVANT, DARRERA, ESQUERRA, DRETA
}

class Vehicle{
    private String nom = "Cotxe";
    private double cilindrada;
    //Davant, darrera, esquerra i dreta
    private String direccio;

    private ExempleEnumeracio direction;

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }


    //    public void setDireccio(String direccio) {
//        switch (direccio){
//            case  "davant":
//            case "detras":
//            case "esquerra":
//            case "dreta":
//                this.direccio = direccio;
//                break;
//
//        }
//
//    }

    public ExempleEnumeracio getDirection() {
        return direction;
    }

    public void setDirection(ExempleEnumeracio direction) {
        this.direction = direction;
    }

    public String toString(){
        return "Vehicle{" +
                "nom='" + nom + '\'' +
                ", cilindrada=" + cilindrada +
                ", Direccio='" + direccio + '\'' +
                ", direction=" + direction +
                '}';
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        //v.setDireccio("adelante"); NOT WORTH IT

        v.setDirection(ExempleEnumeracio.DRETA);
        v.setDirection(ExempleEnumeracio.DARRERA);
        v.setDirection(ExempleEnumeracio.DAVANT);
        v.setDirection(ExempleEnumeracio.ESQUERRA);

        System.out.println(v);
    }
}