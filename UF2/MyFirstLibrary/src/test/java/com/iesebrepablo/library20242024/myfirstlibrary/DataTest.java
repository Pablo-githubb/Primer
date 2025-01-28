package com.iesebrepablo.library20242024.myfirstlibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    void esBixest_returnsTrueForLeapYear() {
        assertTrue(Data.esBixest(2024));
    }

    @Test
    void esBixest_returnsFalseForNonLeapYear() {
        assertFalse(Data.esBixest(2023));
    }

    @Test
    void esBixest_returnsFalseForYearBefore1582() {
        assertFalse(Data.esBixest(1500));
    }

    @Test
    void dataCorrecta_returnsTrueForValidDate() {
        assertTrue(Data.dataCorrecta(29, 2, 2024));
    }

    @Test
    void dataCorrecta_returnsFalseForInvalidDate() {
        assertFalse(Data.dataCorrecta(30, 2, 2023));
    }

    @Test
    void dataCorrecta_returnsFalseForInvalidMonth() {
        assertFalse(Data.dataCorrecta(15, 13, 2023));
    }

    @Test
    void diaSeguent_returnsNextDay() {
        int[] result = Data.diaSeguent(24, 1, 2025);
        assertArrayEquals(new int[]{25, 1, 2025}, result);
    }

    @Test
    void diaSeguent_returnsFirstDayOfNextMonth() {
        int[] result = Data.diaSeguent(31, 1, 2025);
        assertArrayEquals(new int[]{1, 2, 2025}, result);
    }

    @Test
    void diaSeguent_returnsFirstDayOfNextYear() {
        int[] result = Data.diaSeguent(31, 12, 2025);
        assertArrayEquals(new int[]{1, 1, 2026}, result);
    }

    @Test
    void comparaDates_returnsZeroForSameDate() {
        assertEquals(0, Data.comparaDates(24, 1, 2025, 24, 1, 2025));
    }

    @Test
    void comparaDates_returnsPositiveForLaterDate() {
        assertEquals(1, Data.comparaDates(25, 1, 2025, 24, 1, 2025));
    }

    @Test
    void comparaDates_returnsNegativeForEarlierDate() {
        assertEquals(-1, Data.comparaDates(23, 1, 2025, 24, 1, 2025));
    }

    @Test
    void diferenciaDies_returnsCorrectDifference() {
        assertEquals(3, Data.diferenciaDies(24, 1, 2025, 27, 1, 2025));
    }

    @Test
    void diferenciaDies_returnsZeroForSameDate() {
        assertEquals(0, Data.diferenciaDies(24, 1, 2025, 24, 1, 2025));
    }

    @Test
    void diferenciaDies_returnsNegativeOneForInvalidDate() {
        assertEquals(-1, Data.diferenciaDies(24, 1, 2025, 32, 1, 2025));
    }
}