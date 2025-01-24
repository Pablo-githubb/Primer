package com.iesebrepablo.library20242024.myfirstlibrary;

/**
 * Classe que representa una data i hora.
 */
public class Temps {
    private int dia = 1;
    private int mes = 1;
    private int any;
    private int hora;
    private int minut;
    private int segon;
    private boolean dataHora = true;

    // Constructors
    public Temps() {
    }

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

    // Getters i Setters
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

    /**
     * Mostra la data i hora com a text.
     *
     * @return la data i hora com a text.
     */
    public String mostrarText() {
        if (dataHora) {
            return String.format("%d/%d/%4d %2d-%2d-%2d", dia, mes, any, hora, minut, segon);
        } else return String.format("%d/%d/%4d", dia, mes, any);
    }

    /**
     * Mostra l'hora com a text si l'objecte té informació d'hora.
     *
     * @param mostraHora si s'ha de mostrar l'hora.
     * @return l'hora com a text.
     */
    public String mostrarText(boolean mostraHora) {
        if (dataHora) return String.format("%2d-%2d-%2d", hora, minut, segon);
        return "";
    }

    /**
     * Modifica la data.
     *
     * @param dia el dia a establir.
     * @param mes el mes a establir.
     * @param any l'any a establir.
     * @return true si la data s'ha modificat correctament, false en cas contrari.
     */
    public boolean modifica(int dia, int mes, int any) {
        this.setAny(any);
        return this.setDia(dia) && this.setMes(mes);
    }

    /**
     * Modifica la data i l'hora.
     *
     * @param dia   el dia a establir.
     * @param mes   el mes a establir.
     * @param any   l'any a establir.
     * @param hora  l'hora a establir.
     * @param minut el minut a establir.
     * @param segon el segon a establir.
     * @return true si la data i l'hora s'han modificat correctament, false en cas contrari.
     */
    public boolean modificaText(int dia, int mes, int any, int hora, int minut, int segon) {
        boolean resultat = this.modifica(dia, mes, any); // canviem la data
        if (!this.dataHora) return resultat; // si l'objecte només té data acabem
        else return resultat && this.setHora(hora) && this.setMinut(minut) && this.setSegon(segon);
    }

    /**
     * Comprova si una data és correcta.
     *
     * @param dia el dia a comprovar.
     * @param mes el mes a comprovar.
     * @param any l'any a comprovar.
     * @return true si la data és correcta, false en cas contrari.
     */
    public static boolean dataCorrecta(int dia, int mes, int any) {
        int[] mesos = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (esBixest(any)) mesos[1] = 29;
        if (mes < 1 || mes > 12) return false;
        return dia >= 1 && dia <= mesos[mes - 1];
    }

    /**
     * Comprova si un any és bixest.
     *
     * @param any l'any a comprovar.
     * @return true si l'any és bixest, false en cas contrari.
     */
    public static boolean esBixest(int any) {
        return any >= 1582 && (any % 4 == 0 && any % 100 != 0 || any % 400 == 0);
    }

    /**
     * Retorna el dia següent a una data donada.
     *
     * @param dia el dia de la data.
     * @param mes el mes de la data.
     * @param any l'any de la data.
     * @return un array d'enters amb el dia, mes i any del dia següent.
     */
    public static int[] diaSeguent(int dia, int mes, int any) {
        if (!dataCorrecta(dia, mes, any)) return null;
        if (dataCorrecta(dia + 1, mes, any)) return new int[]{dia + 1, mes, any};
        if (dataCorrecta(1, mes + 1, any)) return new int[]{1, mes + 1, any};
        return new int[]{1, 1, any + 1};
    }

    /**
     * Compara dues dates.
     *
     * @param dia1 el dia de la primera data.
     * @param mes1 el mes de la primera data.
     * @param any1 l'any de la primera data.
     * @param dia2 el dia de la segona data.
     * @param mes2 el mes de la segona data.
     * @param any2 l'any de la segona data.
     * @return 1 si la primera data és major que la segona, 0 si són iguals, -1 si és menor, i -2 si alguna data és incorrecta.
     */
    public static int comparaDates(int dia1, int mes1, int any1, int dia2, int mes2, int any2) {
        if (!dataCorrecta(dia1, mes1, any1) || !dataCorrecta(dia2, mes2, any2)) return -2;
        if (any1 > any2) return 1;
        else if (any1 < any2) return -1;
        if (mes1 > mes2) return 1;
        else if (mes1 < mes2) return -1;
        if (dia1 > dia2) return 1;
        else if (dia1 < dia2) return -1;
        return 0;
    }

    /**
     * Retorna el nombre de dies entre dues dates.
     *
     * @param dia1 el dia de la primera data.
     * @param mes1 el mes de la primera data.
     * @param any1 l'any de la primera data.
     * @param dia2 el dia de la segona data.
     * @param mes2 el mes de la segona data.
     * @param any2 l'any de la segona data.
     * @return el nombre de dies entre les dues dates, o -1 si alguna data és incorrecta.
     */
    public static int diferenciaDies(int dia1, int mes1, int any1, int dia2, int mes2, int any2) {
        if (!dataCorrecta(dia1, mes1, any1) || !dataCorrecta(dia2, mes2, any2)) return -1;
        switch (comparaDates(dia1, mes1, any1, dia2, mes2, any2)) {
            case 0:
                return 0;
            case 1:
                int temp = dia1;
                dia1 = dia2;
                dia2 = temp;
                temp = mes1;
                mes1 = mes2;
                mes2 = temp;
                temp = any1;
                any1 = any2;
                any2 = temp;
        }
        int compt = 0;
        while (comparaDates(dia1, mes1, any1, dia2, mes2, any2) != 0) {
            int[] dema = diaSeguent(dia1, mes1, any1);
            dia1 = dema[0];
            mes1 = dema[1];
            any1 = dema[2];
            compt++;
        }
        return compt;
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