package com.iesebrepablo.library20242024.myfirstlibrary;

import static com.iesebrepablo.library20242024.myfirstlibrary.Data.esBixest;

public class dataCorrecta {
    public static void main(String[] args) {
        System.out.println(dataCorrecta(2, 2, 1990) ? "Data Correcta!!" : "Data Incorrecta!!");
    }

    public static boolean dataCorrecta(int dia, int mes, int any) {
        int[] mesos = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (esBixest(any)) {
            mesos[1] = 29;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        return dia >= 1 && dia <= mesos[mes - 1];
    }

    /**
     * El programa sumarà un dia a la data indicada
     * @param dia 
     * @param mes
     * @param any
     * @return
     */
    public static int[] diaSeguent(int dia, int mes, int any) {

        if (!dataCorrecta(dia, mes, any)) {
            return null;
        }
        if (dataCorrecta(dia + 1, mes, any)) {
            return new int[]{dia + 1, mes, any};
        }
        if (dataCorrecta(1, mes + 1, any)) {
            return new int[]{1, mes + 1, any};
        }
        return new int[]{1, 1, any + 1};
    }
}