import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiadaCastellera {

    @Test
    void shouldReturnAAndBoomersWhenAHasMorePointsAndBoomersHaveMorePoints() {
        String input = "1\n2 1\n2 1\n2 1\n2 1\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        DiadaCastellera.main(new String[]{});

        assertEquals("A\nBOOMERS\n", outContent.toString());
    }

    @Test
    void shouldReturnBAndMillennialsWhenBHasMorePointsAndMillennialsHaveMorePoints() {
        String input = "1\n1 2\n1 2\n1 2\n1 2\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        DiadaCastellera.main(new String[]{});

        assertEquals("B\nMILENIALS\n", outContent.toString());
    }

    @Test
    void shouldReturnErrorWhenAttemptedLessThanAchieved() {
        String input = "1\n1 2\n1 2\n1 2\n1 2\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        DiadaCastellera.main(new String[]{});

        assertEquals("ERROR\n", outContent.toString());
    }

    @Test
    void shouldHandleMultipleCasesCorrectly() {
        String input = "2\n2 1\n2 1\n2 1\n2 1\n1 2\n1 2\n1 2\n1 2\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        DiadaCastellera.main(new String[]{});

        assertEquals("A\nBOOMERS\nB\nMILENIALS\n", outContent.toString());
    }
}


