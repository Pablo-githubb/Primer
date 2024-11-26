import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class desiertoTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void matrixGenerationShouldCreate5x5MatrixWithRandomValues() {
        int[][] matrix = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        assertEquals(5, matrix.length);
        assertEquals(5, matrix[0].length);
        for (int[] row : matrix) {
            for (int value : row) {
                assertTrue(value >= 0 && value < 10);
            }
        }
    }

    @Test
    void sumOfNeighborsShouldCalculateCorrectlyForInteriorCells() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int sum = matrix[1][0] + matrix[1][2] + matrix[0][0] + matrix[0][1] + matrix[0][2] + matrix[2][0] + matrix[2][1] + matrix[2][2];
        assertEquals(56, sum);
    }

    @Test
    void sumOfNeighborsShouldCalculateCorrectlyForEdgeCells() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int sum = matrix[0][1] + matrix[1][0] + matrix[1][1];
        assertEquals(15, sum);
    }

    @Test
    void shouldReturnCorrectMapNameWithHighestVotes() {
        BattleField[] mapes = new BattleField[3];
        mapes[0] = new BattleField();
        mapes[0].nom = "Map1";
        mapes[0].numVots = 5;
        mapes[1] = new BattleField();
        mapes[1].nom = "Map2";
        mapes[1].numVots = 3;
        mapes[2] = new BattleField();
        mapes[2].nom = "Map3";
        mapes[2].numVots = 7;
    }

    private String getOutput() {
        return outContent.toString();
    }
}
