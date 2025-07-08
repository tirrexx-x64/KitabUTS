import static org.junit.Assert.*;
import org.junit.Test;

public class Praktikum0301Test {
    @Test 
    public void test00(){
        assertEquals(true, Praktikum0301.isPerfectNumber(6));

    }
    
    @Test
    public void test01(){
        assertEquals(true, Praktikum0301.isPerfectNumber(28));

    }
    
    @Test
    public void test02(){
        assertEquals(true, Praktikum0301.isPerfectNumber(496));

    }
    
    @Test
    public void test03(){
        assertEquals(true, Praktikum0301.isPerfectNumber(8128));

    }

    @Test
    public void test04(){
        assertEquals(false, Praktikum0301.isPerfectNumber(9999));

    }

    @Test
    public void test05(){
        assertEquals(false, Praktikum0301.isPerfectNumber(10));

    }

}
