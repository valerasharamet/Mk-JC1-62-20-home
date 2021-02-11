package oop.calculator.runners;


import oop.calculator.additional.CalculatorWithCounterAutoSuper;
import oop.calculator.additional.CalculatorWithMemory;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithCounterAutoSuper());
        double a = calculator.multiplication(15, 7);
        calculator.numberNow();
        double b = calculator.addition(4.1, a);
        calculator.numberNow();
        double c = calculator.segmentation(28, 5);
        calculator.numberNow();
        double d = calculator.power(c, 2);
        calculator.numberNow();
        double result = calculator.addition(b, d);
        calculator.numberNow();
        System.out.println(result);
    }
}
