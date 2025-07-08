import static org.junit.Assert.*;
import org.junit.Test;

public class Praktikum05Test {
    @Test
    public void test00(){
        int[] input = {1,2,1,1,2};
        int[] hasil = {1,2};
        assertArrayEquals(hasil, Praktikum05.removeDup(input));
    }    

    @Test
    public void test01(){
        int[] input = {1,1,1,1,2};
        int[] hasil = {1,2};
        assertArrayEquals(hasil, Praktikum05.removeDup(input));
    }    
    @Test
    public void test03(){
        int[] input = {1,1,1,1,1};
        int[] hasil = {1};
        assertArrayEquals(hasil, Praktikum05.removeDup(input));
    }    

    @Test
    public void test04(){
        int[] input = {1,2,3,4,5};
        int[] hasil = {1,2,3,4,5};
        assertArrayEquals(hasil, Praktikum05.removeDup(input));
    }   
    @Test
    public void test05(){
        int[] input = {1,2,3,3,5};
        int[] hasil = {1,2,3,5};
        assertArrayEquals(hasil, Praktikum05.removeDup(input));
    }  
    
    @Test
    public void test06(){
        int[] input = {1,2,3,5,5};
        int[] hasil = {1,2,3,5};
        assertArrayEquals(hasil, Praktikum05.removeDup(input));
    }    
    
    @Test
    public void test07(){
        int[] input = {0,2,3,5,5};
        int[] hasil = {0,2,3,5};
        assertArrayEquals(hasil, Praktikum05.removeDup(input));
    }    

    @Test
    public void test08(){
        int[] input = {1,0,2,3,5,5};
        int[] hasil = {1,0,2,3,5};
        assertArrayEquals(hasil, Praktikum05.removeDup(input));
    }    

    @Test
    public void test09(){
        int[] input = {1,0,2,0,3,0,5,5};
        int[] hasil = {1,0,2,3,5};
        assertArrayEquals(hasil, Praktikum05.removeDup(input));
    }    

    @Test
    public void test03_00(){
        int[] input = {1,2,3,4,5};
        assertEquals(15, Praktikum05.maxSubArray(input));    
    }

    @Test
    public void test03_01(){
        int[] input = {1,2,-10,4,5};
        assertEquals(9, Praktikum05.maxSubArray(input));    
    }

    @Test
    public void test03_02(){
        int[] input = {5,4,-7,2,1};
        assertEquals(9, Praktikum05.maxSubArray(input));    
    }

    @Test
    public void test03_03(){
        int[] input = {5,4,-2,3,-1};
        assertEquals(10, Praktikum05.maxSubArray(input));    
    }


    @Test
    public void test03_04(){
        int[] input = {5,4,-2,3,-1,4};
        assertEquals(13, Praktikum05.maxSubArray(input));    
    }

    @Test
    public void test03_05(){
        int[] input = {-5,4,-2,3,-1,4,-2};
        assertEquals(8, Praktikum05.maxSubArray(input));    
    }
    @Test
    public void test03_06(){
        int[] input = {-5,4,-2,3,-1,4,-2};
        assertEquals(8, Praktikum05.maxSubArray(input));    
    }
    @Test
    public void test03_07(){
        int[] input = {4,-8,9,-1,2,-8,-1,6};
        assertEquals(10, Praktikum05.maxSubArray(input));    
    }
    @Test
    public void test03_08(){
        int[] input = {4,-8,9,-4,1,-8,-1,6};
        assertEquals(9, Praktikum05.maxSubArray(input));    
    }
    @Test
    public void test03_09(){
        int[] input = {-2,-3,4,-1,-2,1,5,-3};
        assertEquals(7, Praktikum05.maxSubArray(input));    
    }
    @Test
    public void test03_10(){
        int[] input = {2,3,-8,7,-1,2,3};
        assertEquals(11, Praktikum05.maxSubArray(input));    
    }
    @Test
    public void test03_11(){
        int[] input = {-2,-3,-1,-1,-1,-2,-3};
        assertEquals(-1, Praktikum05.maxSubArray(input));    
    }

    @Test
    public void test03_12(){
        int[] input = {-2,-3,-8,-7,-1,2,-3};
        assertEquals(2, Praktikum05.maxSubArray(input));    
    }
}
