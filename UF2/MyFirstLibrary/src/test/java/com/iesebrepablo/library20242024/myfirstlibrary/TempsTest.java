package com.iesebrepablo.library20242024.myfirstlibrary;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TempsTest {

    @Test
    void mostrar_returnsCorrectDateAndTime() {
        Temps temps = new Temps(24, 1, 2025, 14, 30, 45);
        assertEquals("24/01/2025 14-30-45", temps.mostrar());
    }

    @Test
    void mostrar_returnsCorrectDateOnly() {
        Temps temps = new Temps(24, 1, 2025);
        assertEquals("24/01/2025", temps.mostrar());
    }

    @Test
    void diaSeguent_returnsNextDay() {
        Temps temps = new Temps(24, 1, 2025);
        Temps dema = temps.diaSeguent();
        assertEquals("25/01/2025", dema.mostrar());
    }

    @Test
    void diaSeguent_returnsFirstDayOfNextMonth() {
        Temps temps = new Temps(31, 1, 2025);
        Temps dema = temps.diaSeguent();
        assertEquals("01/02/2025", dema.mostrar());
    }

    @Test
    void diaSeguent_returnsFirstDayOfNextYear() {
        Temps temps = new Temps(31, 12, 2025);
        Temps dema = temps.diaSeguent();
        assertEquals("01/01/2026", dema.mostrar());
    }

    @Test
    void comparaDates_returnsZeroForSameDate() {
        Temps temps1 = new Temps(24, 1, 2025);
        Temps temps2 = new Temps(24, 1, 2025);
        assertEquals(0, temps1.comparaDates(temps2));
    }

    @Test
    void comparaDates_returnsPositiveForLaterDate() {
        Temps temps1 = new Temps(25, 1, 2025);
        Temps temps2 = new Temps(24, 1, 2025);
        assertEquals(1, temps1.comparaDates(temps2));
    }

    @Test
    void comparaDates_returnsNegativeForEarlierDate() {
        Temps temps1 = new Temps(23, 1, 2025);
        Temps temps2 = new Temps(24, 1, 2025);
        assertEquals(-1, temps1.comparaDates(temps2));
    }

    @Test
    void diferenciaDies_returnsCorrectDifference() {
        Temps temps1 = new Temps(24, 1, 2025);
        Temps temps2 = new Temps(27, 1, 2025);
        assertEquals(3, temps1.diferenciaDies(temps2));
    }

    @Test
    void diferenciaDies_returnsZeroForSameDate() {
        Temps temps1 = new Temps(24, 1, 2025);
        Temps temps2 = new Temps(24, 1, 2025);
        assertEquals(0, temps1.diferenciaDies(temps2));
    }

    @Test
    void diferenciaDies_returnsNegativeOneForInvalidDate() {
        Temps temps1 = new Temps(24, 1, 2025);
        Temps temps2 = new Temps(32, 1, 2025); // Invalid date
        assertEquals(-1, temps1.diferenciaDies(temps2));
    }

    @Test
    void diferenciaDies_returnsNegativeOneForNullDate() {
        Temps temps1 = new Temps(24, 1, 2025);
        assertEquals(-1, temps1.diferenciaDies(null));
    }

    @Test
    void diferenciaDies_returnsCorrectDifferenceForLeapYear() {
        Temps temps1 = new Temps(28, 2, 2024);
        Temps temps2 = new Temps(1, 3, 2024);
        assertEquals(2, temps1.diferenciaDies(temps2));
    }

    @Test
    void diferenciaDies_returnsCorrectDifferenceAcrossYears() {
        Temps temps1 = new Temps(31, 12, 2024);
        Temps temps2 = new Temps(1, 1, 2025);
        assertEquals(1, temps1.diferenciaDies(temps2));
    }

    @Test
    void diferenciaDies_handlesInvalidDateInLeapYear() {
        Temps temps1 = new Temps(29, 2, 2024);
        Temps temps2 = new Temps(1, 3, 2024);
        assertEquals(1, temps1.diferenciaDies(temps2));
    }

    @Test
    void diferenciaDies_handlesInvalidDate() {
        Temps temps1 = new Temps(24, 1, 2025);
        Temps temps2 = new Temps(25, 1, 2025);
        assertEquals(1, temps1.diferenciaDies(temps2));
    }
}