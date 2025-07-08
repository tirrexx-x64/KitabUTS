import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class DisplayOutputTest {
    @Test
    public void test00() throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        // Penggujian method yang mencetak ke layar
        System.out.println("Hallo!");
        System.out.println("Testing output.");
        
        baos.flush();
        String whatWasPrinted = new String(baos.toByteArray());
        String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
        
        // Cara pengujian
        assertEquals(2, linesOfOutput.length);  // check jumlah baris
        assertEquals("Hallo!", linesOfOutput[0]); // cek per baris 0
        assertEquals("Testing output.", linesOfOutput[1]); // cek per baris 1
    }

    @Test
    public void testSatuBaris00() throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        // Penggujian method yang mencetak ke layar
        Ex07PrimeNumberMethod.printPrimeNumbers(9); 

        baos.flush();
        String whatWasPrinted = new String(baos.toByteArray());
        String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
        
        // Cara pengujian
        assertEquals(1, linesOfOutput.length);  // check jumlah baris
        assertEquals("2    3    5    7    11   13   17   19   23   ", linesOfOutput[0]); // cek per baris
    }

    @Test
    public void testSatuBaris01() throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        // Penggujian method yang mencetak ke layar
        Ex07PrimeNumberMethod.printPrimeNumbers(7); 

        baos.flush();
        String whatWasPrinted = new String(baos.toByteArray());
        String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
        
        // Cara pengujian
        assertEquals(1, linesOfOutput.length);  // check jumlah baris
        assertEquals("2    3    5    7    11   13   17   ", linesOfOutput[0]); // cek per baris
    }
    @Test
    public void testSatuBaris02() throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        // Penggujian method yang mencetak ke layar
        Ex07PrimeNumberMethod.printPrimeNumbers(50); 

        baos.flush();
        String whatWasPrinted = new String(baos.toByteArray());
        String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
        
        // Cara pengujian
        assertEquals(5, linesOfOutput.length);  // check jumlah baris
        assertEquals("2    3    5    7    11   13   17   19   23   29   ", linesOfOutput[0]); // cek per baris
        assertEquals("31   37   41   43   47   53   59   61   67   71   ", linesOfOutput[1]); // cek per baris
        assertEquals("73   79   83   89   97   101  103  107  109  113  ", linesOfOutput[2]); // cek per baris
        assertEquals("127  131  137  139  149  151  157  163  167  173  ", linesOfOutput[3]); // cek per baris
        assertEquals("179  181  191  193  197  199  211  223  227  229  ", linesOfOutput[4]); // cek per baris
    }

}
