package io.bryantcason;

import static io.bryantcason.Calculator.*;
import static org.junit.Assert.*;


import org.junit.Test;

public class CalculatorSpec {

    @Test
    public void addTest(){
        double expectedValue = 6;
        double actualValue = add(3,3);
        assertEquals("6 should be the actual value", expectedValue, actualValue, .0);
    }

    @Test
    public void subtractTest(){
        double expectedValue = 1;
        double actualValue = subtract(2,1);
        assertEquals("1 should be the actual value", expectedValue, actualValue, .0);
    }

    @Test
    public void multiplyTest(){
        double expectedValue = 25;
        double actualValue = multiply(5,5);
        assertEquals("25 should be the actual value", expectedValue, actualValue, .0);
    }

    @Test
    public void divideTest(){
        double expectedValue = 9;
        double actualValue = divide(81, 9);
        assertEquals("9 should be the actual value", expectedValue, actualValue, .01);
    }

    @Test(expected = DividedByZeroException.class)
    public void dividedByZeroTest(){
        double actualValue = divide(1,0);
        assertEquals("Error should be thrown", true, actualValue);
    }


    @Test
    public void squareRootTest(){
        double expectedValue = 2;
        double actualValue = squareRoot(4);
        assertEquals("2 should be actual value", expectedValue, actualValue, .1);
    }

    @Test(expected = ComplexNumberException.class)
    public void complexNumberTest(){
        double actualValue = squareRoot(-1);
        assertEquals("Error should be thrown", true, actualValue);
    }

}
