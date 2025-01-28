import com.iesebrepablo.library20242024.myfirstlibrary.Numero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumeroTest {

    @Test
    void generaNumeroAleatoriReturnsNumber() {
        int result = Numero.generaNumeroAleatori();
        assertTrue(result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE);
    }

    @Test
    void generaNumeroAleatoriWithLimitReturnsNumberWithinLimit() {
        int limit = 10;
        int result = Numero.generaNumeroAleatori(limit);
        assertTrue(result >= 0 && result < limit);
    }

    @Test
    void generaNumeroAleatoriWithNegativeLimitReturnsMinusOne() {
        int result = Numero.generaNumeroAleatori(-5);
        assertEquals(-1, result);
    }

    @Test
    void vectorDigitsReturnsCorrectDigits() {
        int[] result = Numero.vectorDigits(12345);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    void vectorDigitsHandlesNegativeNumbers() {
        int[] result = Numero.vectorDigits(-12345);
        assertArrayEquals(new int[]{-1, 2, 3, 4, 5}, result);
    }

    @Test
    void numVectorReturnsCorrectNumber() {
        int result = Numero.numVector(new int[]{1, 2, 3, 4, 5});
        assertEquals(12345, result);
    }

    @Test
    void numVectorHandlesNegativeNumbers() {
        int result = Numero.numVector(new int[]{-1, 2, 3, 4, 5});
        assertEquals(-12345, result);
    }

    @Test
    void potenciaRecReturnsCorrectResult() {
        double result = Numero.potenciaRec(2.0, 3);
        assertEquals(8.0, result);
    }

    @Test
    void potenciaRecHandlesNegativeExponent() {
        double result = Numero.potenciaRec(2.0, -3);
        assertEquals(0.125, result);
    }

    @Test
    void fibonacciReturnsCorrectValue() {
        int result = Numero.fibonacci(10);
        assertEquals(55, result);
    }

    @Test
    void fibonacciHandlesNegativeInput() {
        int result = Numero.fibonacci(-1);
        assertEquals(-1, result);
    }

    @Test
    void nombreCombinatoriRecReturnsCorrectValue() {
        int result = Numero.nombreCombinatoriRec(5, 2);
        assertEquals(10, result);
    }

    @Test
    void nombreCombinatoriRecHandlesInvalidInput() {
        int result = Numero.nombreCombinatoriRec(2, 5);
        assertEquals(-1, result);
    }
}