package io.bryantcason;

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

    public static double divide(double value1, double value2) throws ArithmeticException{
        answer = value1/value2;
        if (value2 == 0) {
            throw new ArithmeticException();
        }
        return answer;
    }
}
