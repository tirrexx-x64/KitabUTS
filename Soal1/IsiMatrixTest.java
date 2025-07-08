import static org.junit.Assert.*;
import org.junit.Test;

public class IsiMatrixTest {
    @Test
    public void testSum(){
        
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        assertEquals(45, isiMatrix.sum(input));
    }

    @Test 
    public void testSumGanjil() {
        int[][] input = {{1,3,5},{7,9,11},{13,15,17}};
        assertEquals(9+27+45, isiMatrix.sum(input));
    }

}
