import static org.junit.Assert.*;
import org.junit.Test;

public class TerbesarTest{
 @Test
     public void testTerbesar_01(){
         assertEquals(3,TigaBilangan.terbesar(1,2,3));
    }

    @Test
    public void testTerbesar_02(){
        assertEquals(3,TigaBilangan.terbesar(2,1,3));
    }

    @Test
    public void testTerbesar_03(){
        assertEquals(5,TigaBilangan.terbesar(5,3,1));
    }

    @Test
    public void testTerbesar_04(){
        assertEquals(5,TigaBilangan.terbesar(5,1,3));
    }

    @Test
    public void testTerbesar_05(){
        assertEquals(7,TigaBilangan.terbesar(5,7,1));
    }

    @Test
    public void testTerbesar_06(){
        assertEquals(7,TigaBilangan.terbesar(1,7,5));
    }
    @Test
    public void testTerbesar_07(){
        assertEquals(-1,TigaBilangan.terbesar(-5,-4,-3));
    }

    @Test
    public void testTerbesar_08(){
        assertEquals(-1,TigaBilangan.terbesar(-1,-7,-5));
    }
}
