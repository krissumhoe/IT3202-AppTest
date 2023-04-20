package Test;

import static org.junit.Assert.*;
import org.junit.Test;

import Main.Calculator;

public class CalculatorTest {
    
    @Test
    public void Add(){
        Calculator app=new Calculator();
        int result=app.add(4, 2);
        assertEquals(6,result);
    }

    @Test
    public void Subtract(){
        Calculator app=new Calculator();
        int result=app.subtract(4, 2);
        assertEquals(2,result);
    }

    @Test
    public void Multiply(){
        Calculator app=new Calculator();
        int result=app.multiply(4, 2);
        assertEquals(8,result);
    }

    @Test
    public void Divide(){
        Calculator app=new Calculator();
        int result=app.divide(4, 2);
        assertEquals(2,result);
    }
}
