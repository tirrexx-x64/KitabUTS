import static org.junit.Assert.*;
import org.junit.Test;

public class MaxSubSeqTest {

    @Test
    public void test01_00(){
        int[] input = {1,2,3,4,5};
        assertEquals(15, MaxSubSeq.calculate(input));    
    }

    @Test
    public void test01_01(){
        int[] input = {1,2,-10,4,5};
        assertEquals(9, MaxSubSeq.calculate(input));    
    }

    @Test
    public void test01_02(){
        int[] input = {5,4,-7,2,1};
        assertEquals(9, MaxSubSeq.calculate(input));    
    }

    @Test
    public void test01_03(){
        int[] input = {5,4,-2,3,-1};
        assertEquals(10, MaxSubSeq.calculate(input));    
    }


    @Test
    public void test01_04(){
        int[] input = {5,4,-2,3,-1,4};
        assertEquals(13, MaxSubSeq.calculate(input));    
    }

    @Test
    public void test01_05(){
        int[] input = {-5,4,-2,3,-1,4,-2};
        assertEquals(8, MaxSubSeq.calculate(input));    
    }
    @Test
    public void test01_06(){
        int[] input = {-5,4,-2,3,-1,4,-2};
        assertEquals(8, MaxSubSeq.calculate(input));    
    }
    @Test
    public void test01_07(){
        int[] input = {4,-8,9,-1,2,-8,-1,6};
        assertEquals(10, MaxSubSeq.calculate(input));    
    }
    @Test
    public void test01_08(){
        int[] input = {4,-8,9,-4,1,-8,-1,6};
        assertEquals(9, MaxSubSeq.calculate(input));    
    }
    @Test
    public void test01_09(){
        int[] input = {-2,-3,4,-1,-2,1,5,-3};
        assertEquals(7, MaxSubSeq.calculate(input));    
    }
    @Test
    public void test01_10(){
        int[] input = {2,3,-8,7,-1,2,3};
        assertEquals(11, MaxSubSeq.calculate(input));    
    }
    @Test
    public void test01_11(){
        int[] input = {-2,-3,-1,-1,-1,-2,-3};
        assertEquals(-1, MaxSubSeq.calculate(input));    
    }

    @Test
    public void test01_12(){
        int[] input = {-2,-3,-8,-7,-1,2,-3};
        assertEquals(2, MaxSubSeq.calculate(input));    
    }
}
