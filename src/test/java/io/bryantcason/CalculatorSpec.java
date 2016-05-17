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

    @Test(expected = ArithmeticException.class)
    public void dividedByZero(){
        double actualValue = divide(1,0);
        assertEquals("Error should be thrown", true, actualValue);
    }


    }
