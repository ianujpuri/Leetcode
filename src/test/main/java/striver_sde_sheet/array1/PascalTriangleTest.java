package striver_sde_sheet.array1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PascalTriangleTest {

    /**
     * Test case for the main method of PascalTriangle class.
     * This test verifies that the main method correctly calculates and prints
     * the value from Pascal's Triangle at row 3, column 2 (1-indexed).
     */
    @Test
    public void test_main_1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PascalTriangle.main(new String[]{});

        assertEquals("3\n", outContent.toString());
        System.setOut(System.out);
    }

}
