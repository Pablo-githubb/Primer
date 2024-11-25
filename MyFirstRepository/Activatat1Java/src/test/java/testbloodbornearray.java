import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class BloodborneArrayTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    void shouldReturnYesForConsecutiveDuplicateNumbers() {
        int[] input = {1, 2, 2, 3, 4};
        Object BloodborneArray;
        assertTrue(BloodborneArray.hasConsecutiveDuplicates(input));
    }

    @Test
    void shouldReturnNoForNoConsecutiveDuplicateNumbers() {
        int[] input = {1, 2, 3, 4, 5};
        Object BloodborneArray;
        assertFalse(BloodborneArray.hasConsecutiveDuplicates(input));
    }

    @Test
    void shouldReturnNoForSingleElementArray() {
        int[] input = {1};
        Object BloodborneArray;
        assertFalse(BloodborneArray.hasConsecutiveDuplicates(input));
    }

    @Test
    void shouldReturnNoForEmptyArray() {
        int[] input = {};
        Object BloodborneArray;
        assertFalse(BloodborneArray.hasConsecutiveDuplicates(input));
    }
}