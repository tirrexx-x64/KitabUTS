import static org.junit.Assert.*;
import org.junit.Test;


public class TotalMatriks2Test {
    @Test 
    public void testBaris(){
        int[][] matriks = {{1,2,3,4}
                          ,{5,6,7,8}
                          ,{3,4,5,6}};
        int[] jmlBaris = {10,26,18};

        assertArrayEquals(jmlBaris, TotalMatriks2.jumlahBaris(matriks));
    }

    @Test 
    public void testKolom(){
        int[][] matriks = {{1,2,3,4}
                          ,{5,6,7,8}
                          ,{3,4,5,6}};
        int[] jmlKolom = {9,12,15, 18};

        assertArrayEquals(jmlKolom, TotalMatriks2.jumlahKolom(matriks));

    }


}
