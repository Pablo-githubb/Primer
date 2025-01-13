package com.iesebrepablo.library20242024.myfirstlibrary;

public class Data {

    /**
     * Diu si l'any que rep com a paràmetre és o no bixest (any de traspàs)
     *
     * @param any el que volem avaluar
     * @return true si any és bixest i false en cas contrari
     */
    public static boolean esBixest(int any) {
        return any >= 1582 && (any % 4 == 0 && any % 100 != 0 || any % 400 == 0);
    }

    /**
     * Indica si la data rebuda és o no correcta
     *
     * @param dia un número que representa el dia de la data
     * @param mes un número que representa el mes de la data
     * @param any un número que representa l'any de la data
     * @return true si la data és correcta i false en cas contrari
     */
    public static boolean dataCorrecta(int dia, int mes, int any) {
        //Vector que conté la durada dels 12 mesos d'un any
        int[] mesos = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //Mirem si l'any és bixest per modificar la durada del febrer
        if (esBixest(any)) mesos[1] = 29;

        //Mirem si el més correcte
        if (mes < 1 || mes > 12) return false;

        //Mirem si el dia és correcte
        return dia >= 1 && dia <= mesos[mes - 1];
    }

    /**
     * Obtenim la data de demà
     *
     * @param dia un número que representa el dia de la data
     * @param mes un número que representa el mes de la data
     * @param any un número que representa l'any de la data
     * @return Un vector d'enters contenint el dia, mes i any de demà si la data rebuda és correcta, sinó retornem null
     */
    public static int[] diaSeguent(int dia, int mes, int any) {
        if (!dataCorrecta(dia, mes, any)) return null; //Si la data rebuda és incorrecta no cal fer res

        if (dataCorrecta(dia + 1, mes, any)) return new int[]{dia + 1, mes, any};
        if (dataCorrecta(1, mes + 1, any)) return new int[]{1, mes + 1, any};
        return new int[]{1, 1, any + 1};
    }

    /**
     * Compara dues dates donades per dia, mes i any.
     *
     * @param dia1 el dia de la primera data
     * @param mes1 el mes de la primera data
     * @param any1 l'any de la primera data
     * @param dia2 el dia de la segona data
     * @param mes2 el mes de la segona data
     * @param any2 l'any de la segona data
     * @return 1 si la primera data és major que la segona, 0 si són iguals, -1 si la primera és menor que la segona, i -2 si alguna de les dates no és correcta
     */
    public static int comparaDates(int dia1, int mes1, int any1, int dia2, int mes2, int any2) {

        if (!dataCorrecta(dia1, mes1, any1) || !dataCorrecta(dia2, mes2, any2)) return -2;
        if (any1 > any2 || (any1 == any2 && mes1 > mes2) || (any1 == any2 && mes1 == mes2 && dia1 > dia2)) return 1;
        else if (any1 == any2 && mes1 == mes2 && dia1 == dia2) return 0;
        else return -1;
        }
    }



