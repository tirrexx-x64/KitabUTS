import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeNumberMethodTest {
    @Test
    public void test_00(){
        assertEquals(1, PrimeNumberMethod.jmlSuffixPrima(519));
    }    
    @Test
    public void test_01(){
        assertEquals(1, PrimeNumberMethod.jmlSuffixPrima(5133));
    }    
    @Test
    public void test_02(){
        assertEquals(3, PrimeNumberMethod.jmlSuffixPrima(91277));
    }    
    @Test
    public void test_03(){
        assertEquals(0, PrimeNumberMethod.jmlSuffixPrima(314));
    }        
    @Test
    public void test_04(){
        assertEquals(1, PrimeNumberMethod.jmlSuffixPrima(839));
    }    
    @Test
    public void test_05(){
        assertEquals(0, PrimeNumberMethod.jmlSuffixPrima(121));
    }    
    

}
