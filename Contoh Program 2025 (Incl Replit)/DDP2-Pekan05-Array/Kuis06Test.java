import static org.junit.Assert.*;
import org.junit.Test;

public class Kuis06Test {
    @Test
    public void test00(){
        int[] input = {1,2,1,1,2};
        int[] hasil = {1,2};
        assertArrayEquals(hasil, Kuis06.noDuplikat(input));
    }    

    @Test
    public void test01(){
        int[] input = {1,1,1,1,2};
        int[] hasil = {1,2};
        assertArrayEquals(hasil, Kuis06.noDuplikat(input));
    }    
    @Test
    public void test03(){
        int[] input = {1,1,1,1,1};
        int[] hasil = {1};
        assertArrayEquals(hasil, Kuis06.noDuplikat(input));
    }    

    @Test
    public void test04(){
        int[] input = {1,2,3,4,5};
        int[] hasil = {1,2,3,4,5};
        assertArrayEquals(hasil, Kuis06.noDuplikat(input));
    }   
    @Test
    public void test05(){
        int[] input = {1,2,3,3,5};
        int[] hasil = {1,2,3,5};
        assertArrayEquals(hasil, Kuis06.noDuplikat(input));
    }  
    
    @Test
    public void test06(){
        int[] input = {1,2,3,5,5};
        int[] hasil = {1,2,3,5};
        assertArrayEquals(hasil, Kuis06.noDuplikat(input));
    }    
    @Test
    public void test07(){
        int[] input = {0,0,1,2,3,5,5};
        int[] hasil = {0,1,2,3,5};
        assertArrayEquals(hasil, Kuis06.noDuplikat(input));
    }    

}
