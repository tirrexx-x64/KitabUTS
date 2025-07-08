import static org.junit.Assert.*;
import org.junit.Test;

public class OperasiMatriksTest {
    @Test
    public void test_00(){
        int[][] m1 = {{1,1},{2,2}};
        int[][] m2 = {{2,2},{1,1}};
        int[][] hasil = {{3,3},{3,3}};
        assertArrayEquals(hasil, OperasiMatriks.penjumlahan(m1,m2));

    }    

    @Test
    public void test_01(){
        int[][] m1 = {{1,1,1},{2,2,2}};
        int[][] m2 = {{2,2,2},{1,1,1}};
        int[][] hasil = {{3,3,3},{3,3,3}};
        assertArrayEquals(hasil, OperasiMatriks.penjumlahan(m1,m2));

    }    

    @Test 
    public void test_perkalian_00(){
        int[][] m1 = {{1,1},{1,1}};
        int[][] m2 = {{3},{3}};
        int[][] hasil = {{6},{6}};

        assertArrayEquals(hasil, OperasiMatriks.perkalian(m1,m2));
    }

    @Test 
    public void test_perkalian_01(){
        int[][] m1 = {{1,1,1},
                      {1,1,1}};
        int[][] m2 = {{3,2},
                      {3,2},
                      {3,2}};
        int[][] hasil = {{9,6},
                         {9,6}};

        assertArrayEquals(hasil, OperasiMatriks.perkalian(m1,m2));
    }

}
