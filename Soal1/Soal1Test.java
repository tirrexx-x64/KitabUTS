import static org.junit.Assert.*;
import org.junit.Test;

public class Soal1Test {
    @Test
    public void testSum(){
        
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        assertEquals(45, Soal1.sum(input));
    }

}
