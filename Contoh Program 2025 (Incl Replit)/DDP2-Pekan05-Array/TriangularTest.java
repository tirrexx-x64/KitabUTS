import static org.junit.Assert.*;
import org.junit.Test;

public class TriangularTest {
    @Test
    public void test_00(){
        int[][] actual;
        actual = Triangular.lowerTriangular(3);
        assertEquals(actual.length, 3);
        assertEquals(actual[0].length, 1);
        assertEquals(actual[1].length, 2);
        assertEquals(actual[2].length, 3);
        
        int[][] expected = {{0},
                            {0,0},
                            {0,0,0}};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void test_00_2(){
        int[][] actual;
        actual = Triangular.lowerTriangular(2);
        assertEquals(actual.length, 2);
        assertEquals(actual[0].length, 1);
        assertEquals(actual[1].length, 2);
        
        int[][] expected = {{0},
                            {0,0}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_01(){
        int[][] expected = {{1},
                            {2,3},
                            {4,5,6}};
        int[][] actual = Triangular.lowerTriangular(3);
        actual = Triangular.sequenceInMatrix(actual);
        assertArrayEquals(expected, actual);
    }    
    @Test
    public void test_02(){
        int[][] expected = {{1},
                            {2,3},
                            {4,5,6},
                            {7,8,9,10}};
        int[][] actual = Triangular.lowerTriangular(4);
        actual = Triangular.sequenceInMatrix(actual);
        assertArrayEquals(expected, actual);
    }    
}
