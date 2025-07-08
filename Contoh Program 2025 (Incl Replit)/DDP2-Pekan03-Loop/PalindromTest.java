import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromTest {
    @Test
    public void test00(){
        assertEquals(true, Palindrom.isPalindrom("tamat"));
    }
    @Test
    public void test01(){
        assertEquals(true, Palindrom.isPalindrom("malam"));
    }
    @Test
    public void test02(){
        assertEquals(true, Palindrom.isPalindrom("ini"));
    }
    @Test
    public void test03(){
        assertEquals(true, Palindrom.isPalindrom("kasur ini rusak"));
    }
    @Test
    public void test04(){
        assertEquals(false, Palindrom.isPalindrom("bukan"));
    }
    @Test
    public void test05(){
        assertEquals(false, Palindrom.isPalindrom("ini bukan palindrom"));
    }
}
