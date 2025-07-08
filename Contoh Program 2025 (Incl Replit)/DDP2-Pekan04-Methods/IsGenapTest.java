import static org.junit.Assert.*;

import org.junit.Test;

public class IsGenapTest {

    @Test
    public void test00(){
        boolean expected = false;
        int input = 5;
        assertEquals(expected, IsGenap.isGenap(input));
    }
    
    @Test
    public void test01(){
        boolean expected = true;
        int input = 6;
        assertEquals(expected, IsGenap.isGenap(input));
    }


    @Test
    public void test02(){
        boolean expected = false;
        int input = 7;
        assertEquals(expected, IsGenap.isGenap(input));
    }

}
