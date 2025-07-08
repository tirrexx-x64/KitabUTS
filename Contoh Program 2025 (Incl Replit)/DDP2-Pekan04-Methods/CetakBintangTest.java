import static org.junit.Assert.*;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class CetakBintangTest {
    
    @Test
    public void testCetakBintang00() throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        CetakBintang.cetakBintang(5);
             
        baos.flush();
        String whatWasPrinted = new String(baos.toByteArray());
        String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
        
        // Cara pengujian
        assertEquals(1, linesOfOutput.length);  // check jumlah baris
        assertEquals("*****", linesOfOutput[0]); // cek per baris 0
    }

    @Test
    public void testCetakBintang01() throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        CetakBintang.cetakSpasi(3);
        CetakBintang.cetakBintang(7);
             
        baos.flush();
        String whatWasPrinted = new String(baos.toByteArray());
        String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
        
        // Cara pengujian
        assertEquals(1, linesOfOutput.length);  // check jumlah baris
        assertEquals("   *******", linesOfOutput[0]); // cek per baris 0
    }

    @Test
    public void testSegitiga00() throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        CetakBintang.segitiga(1,3,3);
             
        baos.flush();
        String whatWasPrinted = new String(baos.toByteArray());
        String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
        
        // Cara pengujian
        assertEquals(3, linesOfOutput.length);  // check jumlah baris
        assertEquals("  1", linesOfOutput[0]); // cek per baris 0
        assertEquals(" 234", linesOfOutput[1]); // cek per baris 1
        assertEquals("56789", linesOfOutput[2]); // cek per baris 2
    }
}
