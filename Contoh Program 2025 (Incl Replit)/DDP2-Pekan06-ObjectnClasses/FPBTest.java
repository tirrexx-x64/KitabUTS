import static org.junit.Assert.*;
import org.junit.Test;

public class FPBTest {

    @Test
    public void checkFPB_case0(){
        assertEquals(1, FPB.cariFPB(3, 4));
    }


    @Test
    public void checkFPB_case1(){
        assertEquals(4, FPB.cariFPB(8, 12));
    }
    @Test
    public void checkFPB_case2(){
        assertEquals(21, FPB.cariFPB(63, 42));
    }

    @Test
    public void checkFPB_case3(){
        assertEquals(21, FPB.cariFPB(42, 63));
    }
}
