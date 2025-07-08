import static org.junit.Assert.*;
import org.junit.Test;

public class Praktikum0302Test {

   @Test
   public void test00(){
	int bilanganDecimal = 10;
	int bilanganOktal = 12;
    assertEquals(bilanganOktal, Praktikum0302.convert2Octal(bilanganDecimal));
   }

   @Test
   public void test01(){
	int bilanganDecimal = 100;
	int bilanganOktal = 144;
    assertEquals(bilanganOktal, Praktikum0302.convert2Octal(bilanganDecimal));
   }

   @Test
   public void test02(){
	int bilanganDecimal = 0;
	int bilanganOktal = 0;
    assertEquals(bilanganOktal, Praktikum0302.convert2Octal(bilanganDecimal));
   }

   @Test
   public void test03(){
	int bilanganDecimal = 5;
	int bilanganOktal = 5;
    assertEquals(bilanganOktal, Praktikum0302.convert2Octal(bilanganDecimal));
   }

   @Test
   public void test04(){
	int bilanganDecimal = 999;
	int bilanganOktal = 1747;
    assertEquals(bilanganOktal, Praktikum0302.convert2Octal(bilanganDecimal));
   }

   @Test
   public void test05(){
	int bilanganDecimal = 1000;
	int bilanganOktal = 1750;
       assertEquals(bilanganOktal, Praktikum0302.convert2Octal(bilanganDecimal));
   }
}