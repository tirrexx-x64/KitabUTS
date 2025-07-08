import static org.junit.Assert.*;
import org.junit.Test;

public class PrimaPalindromTest {
    @Test
    public void testPalindrom3_case0(){
        assertFalse("Bukan Palindrom", PrimaPalindrom.isPalindrom3(123));
    }    

    @Test
    public void testPalindrom3_case1(){
        assertTrue("Check Palindrom", PrimaPalindrom.isPalindrom3(373));
    }    
    @Test
    public void testPalindrom3_case2(){
        assertTrue("Check Palindrom", PrimaPalindrom.isPalindrom3(212));
    }    

    @Test
    public void testPrimaPalindromTrue_case1(){
        assertTrue("Prima dan Palindrom", PrimaPalindrom.isPrima(373));
    }

    @Test
    public void testPrimaPalindromFalse_case1(){
        assertFalse("121 Bukan Prima", PrimaPalindrom.isPrima(121));
    }
    @Test
    public void testPrimaPalindromFalse_case2(){
        assertFalse("212 Bukan Prima", PrimaPalindrom.isPrima(212));
    }    

}
