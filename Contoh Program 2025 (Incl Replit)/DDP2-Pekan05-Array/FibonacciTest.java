import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.Test;

public class FibonacciTest {
    @Test
    public void test00(){
        assertEquals(3, Fibonacci.fib(3));
        
    }    
    @Test
    public void test01(){
        assertEquals(5, Fibonacci.fib(4));
    }    
    @Test
    public void test02(){
        assertEquals(8, Fibonacci.fib(5));
    }        
    @Test
    public void test03(){
        assertEquals(13, Fibonacci.fib(6));
    }    
}
