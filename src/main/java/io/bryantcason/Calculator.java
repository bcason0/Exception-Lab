package io.bryantcason;

import com.sun.tools.corba.se.idl.constExpr.Divide;

/**
 * Created by bryantcason on 5/17/16.
 */
public class Calculator {
    public static double answer;

    public static double add(double value1, double value2) {
        answer = value1 + value2;
        return answer;
    }

    public static double subtract(double value1, double value2){
        answer = value1 - value2;
        return answer;
    }

    public static double multiply(double value1, double value2){
        answer = value1 * value2;
        return answer;
    }

    public static double divide(double value1, double value2) throws DividedByZeroException{
        answer = value1/value2;
        if (value2 == 0) {
            throw new DividedByZeroException();
        }
        return answer;
    }

    public static double squareRoot(double value1) throws ComplexNumberException{
        answer = Math.sqrt(value1);
        if(value1 < 0){
            throw new ComplexNumberException();
        }
        return answer;
    }
}
