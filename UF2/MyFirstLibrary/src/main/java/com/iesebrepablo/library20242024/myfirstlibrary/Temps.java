package com.iesebrepablo.library20242024.myfirstlibrary;

public class Temps {
    private int dia = 1;
    private int mes = 1;
    private int any;
    private int hora;
    private int minut;
    private int segon;
    private boolean dataHora = true;

    // Constructor buid
    public Temps() {
    }

    // Mètodes de construcció d'objectes
    public Temps(boolean dataHora) {
        this.dataHora = dataHora;
    }

    public Temps(int dia, int mes, int any, boolean dataHora) {
        this(dia, mes, any);
        this.dataHora = dataHora;
    }

    public Temps(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
        this.dataHora = false;
    }

    public Temps(int dia, int mes, int any, int hora, int minut, int segon) {
        this(dia, mes, any);
        this.setHora(hora);
        this.setMinut(minut);
        this.setSegon(segon);
    }

    public int getDia() {
        return dia;
    }

    public boolean setDia(int dia) {
        if (dia >= 1 && dia <= 31 && this.dia != dia) {
            this.dia = dia;
            return true;
        }
        return false;
    }

    public int getMes() {
        return mes;
    }

    public boolean setMes(int mes) {
        if (mes >= 1 && mes <= 12 && this.mes != mes) {
            this.mes = mes;
            return true;
        }
        return false;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int getHora() {
        return hora;
    }

    public boolean setHora(int hora) {
        if (hora >= 0 && hora <= 23 && this.hora != hora) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public int getMinut() {
        return minut;
    }

    public boolean setMinut(int minut) {
        if (minut >= 0 && minut <= 59 && this.minut != minut) {
            this.minut = minut;
            return true;
        }
        return false;
    }

    public int getSegon() {
        return segon;
    }

    public boolean setSegon(int segon) {
        if (segon >= 0 && segon <= 59 && this.segon != segon) {
            this.segon = segon;
            return true;
        }
        return false;
    }

    public boolean isDataHora() {
        return dataHora;
    }

    public void setDataHora(boolean dataHora) {
        this.dataHora = dataHora;
    }

    public String mostrarText() {
        if (dataHora) {
            return String.format("%d/%d/%4d %2d-%2d-%2d", dia, mes, any, hora, minut, segon);
        } else return String.format("%d/%d/%4d", dia, mes, any);
    }

    public String mostrarText(boolean mostraHora) {
        if (dataHora) return String.format("%2d-%2d-%2d", hora, minut, segon);
        return "";
    }

    public boolean modifica(int dia, int mes, int any) {
        this.setAny(any);
        return this.setDia(dia) && this.setMes(mes);
    }

    public boolean modificaText(int dia, int mes, int any, int hora, int minut, int segon) {
        boolean resultat = this.modifica(dia, mes, any); // canviem la data
        if (!this.dataHora) return resultat; // si l'objecte només te data acabem
        else return resultat && this.setHora(hora) && this.setMinut(minut) && this.setSegon(segon);
    }

    public int comparaData(Temps data2) {
        // Implement comparison logic here
        return 0; // Placeholder return value
    }
}

// Aqui s'executarà els mètodes
class Proves {
    public static void main(String[] args) {
        Temps avui = new Temps(12, 12, 1992);
        System.out.println(avui.mostrarText());
        Temps t1 = new Temps(false);
        Temps t2 = new Temps(1, 2, 6, 2, 5, 8);
    }
}