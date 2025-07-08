import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void test00(){
        int hasil = 24;
        assertEquals(hasil, Factorial.factorial(4));
    }
}
