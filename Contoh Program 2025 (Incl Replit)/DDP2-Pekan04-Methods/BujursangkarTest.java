import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BujursangkarTest {
    @Test
    public void test00(){
        assertEquals(false, Bujursangkar.isDidalam(2,6,4, 4, 4, 4));
    }
    @Test
    public void test01(){
        assertEquals(true, Bujursangkar.isDidalam(2,6,4, 3, 4, 4));
    }
}
