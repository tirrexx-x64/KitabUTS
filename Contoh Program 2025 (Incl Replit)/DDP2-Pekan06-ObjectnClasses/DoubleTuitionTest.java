import static org.junit.Assert.*;
import org.junit.Test;

public class DoubleTuitionTest {
    @Test
    public void tuitionTest(){
        DoubleTuition dt = new DoubleTuition();
        double expectedTuition = 10000;
        double outputTuition = dt.getTuition();

        assertEquals(expectedTuition, outputTuition,0.001);
    }    

    @Test
    public void yearDoubleTest(){
        DoubleTuition dt = new DoubleTuition();
        int expectedYear = 11;
        int outputYear = dt.getYearWhenDouble();
        assertEquals(expectedYear, outputYear);
    }
}
