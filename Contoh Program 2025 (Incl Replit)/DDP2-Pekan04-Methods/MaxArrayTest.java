import static org.junit.Assert.*;
import org.junit.Test;

public class MaxArrayTest {
    @Test
    public void testFindMaxPositif(){
        assertEquals("Gagal Pemeriksaan Positif",
                4, 
                MaxArray.findMax(new int[]{1,3,4,2}));
    }
    @Test
    public void testFindMaxNegatif(){
        assertEquals("Gagal Pemeriksaan Negatif",
                     -1, MaxArray.findMax(new int[]{-12,-1,-3,-4,-2}));
    }
    @Test
    public void testFindMaxNegatif2(){
        assertEquals("Gagal Pemeriksaan Negatif",
                    -11, MaxArray.findMax(new int[]{-12,-11,-13,-14,-22}));
    }
}
