import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit Tests for Validator class
 */
public class ValidatorTest {
    private Validator validator;
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testIntValidatorWithValidInput() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("5\n".getBytes()));
        validator = new Validator(scanner);

        int result = validator.intValidator("Enter number:", 1, 10);
        assertEquals(5, result);

        String output = outputStream.toString();
        assertTrue(output.contains("Enter number:"));
    }

    @Test
    public void testIntValidatorWithNoBounds() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("42\n".getBytes()));
        validator = new Validator(scanner);

        int result = validator.intValidator("Enter any number:", 0, 0);
        assertEquals(42, result);
    }

    @Test
    public void testIntValidatorWithInvalidThenValidInput() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("15\n5\n".getBytes()));
        validator = new Validator(scanner);

        int result = validator.intValidator("Enter number:", 1, 10);
        assertEquals(5, result);

        String output = outputStream.toString();
        assertTrue(output.contains("Harus berada didalam interval"));
    }

    @Test
    public void testIntValidatorWithNonIntegerInput() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("abc\n5\n".getBytes()));
        validator = new Validator(scanner);

        int result = validator.intValidator("Enter number:", 1, 10);
        assertEquals(5, result);

        String output = outputStream.toString();
        assertTrue(output.contains("Masukan harus berupa angka"));
    }

    @Test
    public void testStrValidator() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("test string\n".getBytes()));
        validator = new Validator(scanner);

        String result = validator.strValidator("Enter text:");
        assertEquals("test string", result);

        String output = outputStream.toString();
        assertTrue(output.contains("Enter text:"));
    }

    @Test
    public void testStrValidatorWithEmptyString() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("\n".getBytes()));
        validator = new Validator(scanner);

        String result = validator.strValidator("Enter text:");
        assertEquals("", result);
    }

    @Test
    public void testIntValidatorAtLowerBound() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("1\n".getBytes()));
        validator = new Validator(scanner);

        int result = validator.intValidator("Enter number:", 1, 10);
        assertEquals(1, result);
    }

    @Test
    public void testIntValidatorAtUpperBound() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("10\n".getBytes()));
        validator = new Validator(scanner);

        int result = validator.intValidator("Enter number:", 1, 10);
        assertEquals(10, result);
    }


}
