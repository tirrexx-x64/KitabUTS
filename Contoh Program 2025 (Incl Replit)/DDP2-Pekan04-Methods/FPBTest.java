import static org.junit.Assert.*;
import org.junit.Test;

public class FPBTest {

    @Test
    public void checkFPB_case0(){
        FPB fpb1 = new FPB();
        assertEquals(1, fpb1.cariFPB(3, 4));
    }

    @Test
    public void checkFPB_case1(){
        FPB fpb1 = new FPB();
        assertEquals(4, fpb1.cariFPB(8, 12));
    }

    @Test
    public void checkFPB_case2(){
        FPB fpb1 = new FPB();
        assertEquals(21, fpb1.cariFPB(63, 42));
    }

    @Test
    public void checkFPB_case3(){
        FPB fpb1 = new FPB();
        assertEquals(21, fpb1.cariFPB(42, 63));
    }

    @Test
    public void checkFPB_case4(){
        FPB fpb1 = new FPB();
        assertEquals(11, fpb1.cariFPB(22,121));
    }
}
