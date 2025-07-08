import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmployee {
    
    EmployeOO employeeTest = new EmployeOO("Vegapunk", "Peneliti", 55, 25000000);

    @Test
    public void testGet()
    {
       //TODO lengkapi method ini untuk menguji semua fungsi get 
       assertEquals(employeeTest.getNama(), "Vegapunk");
       assertEquals(employeeTest.getPosisi(), "Peneliti");
       assertEquals(employeeTest.getUmur(), 55);
       assertEquals(employeeTest.getGaji(), 25000000);
    }

    @Test
    public void testNaikPenalti()
    {
        //TODO lengkapi method ini untuk menguji fungsi NaikGaji dan KenaPenalti
        employeeTest.naikGaji(5000000);
        assertEquals(employeeTest.getGaji(), 30000000);

        employeeTest.kenaPenalti(10000000);
        assertEquals(employeeTest.getGaji(), 20000000);

    }

    //NOTE: Method PanggilEmployee tidak perlu dibuatkan test
}
