import static org.junit.Assert.*;
import org.junit.Test;

public class Kuis01a02Test {
    @Test
    public void luas01(){
        // sisi 2, luas 4

        double hasil = Kuis01a02.luasBujurSangkar(2);

        assertEquals(4, hasil, 0.001);

    }

    @Test
    public void luas02(){
        // sisi 3, luas 9

        double hasil = Kuis01a02.luasBujurSangkar(3);

        assertEquals(9, hasil, 0.001);

    }


}
