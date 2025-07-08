import static org.junit.Assert.*;

import org.junit.Test;

public class MaxTest {

    @Test
    public void test00(){
        int i = 5;
        int j = 2;
        int expected = 5;
        assertEquals(expected, Max.max(i,j));
    }

    
    @Test
    public void test01(){
        int i = 5;
        int j = 9;
        int expected = 9;
        assertEquals(expected, Max.max(i,j));
    }

        @Test
    public void testDouble00(){
        double i = 5;
        double j = 2;
        double expected = 5;
        assertEquals(expected, Max.max(i,j),0.001);
    }

    
    @Test
    public void testDouble01(){
        double i = 5;
        double j = 9;
        double expected = 9;
        assertEquals(expected, Max.max(i,j), 0.001);
    }
}
