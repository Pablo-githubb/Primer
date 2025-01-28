package com.iesebrepablo.library20242024.myfirstlibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CadenaTest {

    @Test
    void retornaCaracter_returnsCharacterWithinRange() {
        char result = Cadena.retornaCaracter();
        assertTrue(result >= ' ' && result <= '}');
    }

    @Test
    void retornaCaracter_withinSpecifiedRange() {
        char result = Cadena.retornaCaracter('a', 'z');
        assertTrue(result >= 'a' && result <= 'z');
    }

    @Test
    void retornaCaracter_withMinGreaterThanMax() {
        char result = Cadena.retornaCaracter('z', 'a');
        assertTrue(result >= 'a' && result <= 'z');
    }

    @Test
    void insertaCadena_insertsSubstringAtPosition() {
        String result = Cadena.insertaCadena("Hello", "World", 3);
        assertEquals("HelWorldlo", result);
    }

    @Test
    void insertaCadena_insertsAtStartWhenPositionIsNegative() {
        String result = Cadena.insertaCadena("Hello", "World", -1);
        assertEquals("WorldHello", result);
    }

    @Test
    void insertaCadena_insertsAtEndWhenPositionIsTooLarge() {
        String result = Cadena.insertaCadena("Hello", "World", 10);
        assertEquals("HelloWorld", result);
    }

    @Test
    void insertaCadena_returnsNullWhenBothInputsAreNull() {
        String result = Cadena.insertaCadena(null, null, 3);
        assertNull(result);
    }

    @Test
    void insertaCadena_returnsSubcadenaWhenTextIsNull() {
        String result = Cadena.insertaCadena(null, "World", 3);
        assertEquals("World", result);
    }

    @Test
    void insertaCadena_returnsTextWhenSubcadenaIsNull() {
        String result = Cadena.insertaCadena("Hello", null, 3);
        assertEquals("Hello", result);
    }
}