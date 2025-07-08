import static org.junit.Assert.*;
import org.junit.Test;

public class PasswordTest {

    @Test
    public void test00(){
        assertEquals("Terlalu pendek!",false, Password.isValid(""));
    }

    @Test
    public void test01(){
        assertEquals("Terlalu pendek!",false, Password.isValid("1234Ab"));
    }

    @Test
    public void test02(){
        assertEquals("Tidak ada huruf besar",false, Password.isValid("1234aaavsa"));
    }

    @Test
    public void test03(){
        assertEquals("Tidak ada huruf kecil",false, Password.isValid("1234ABSNS"));
    }

    @Test
    public void test04(){
        assertEquals("Tidak ada bilangan",false, Password.isValid("ascasABSNS"));
    }

    @Test
    public void test05(){
        assertEquals("Password valid.",true, Password.isValid("ascas12ABSNS"));
    }

    @Test
    public void test06(){
        assertEquals("Angka nya minimal 2",false, Password.isValid("ascas1ABSNS"));
    }
}