package oop.calculator.runners;

import oop.calculator.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main (String[]args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double a = calculator.multiplication(15,7);
        calculator.incrementCountOperation();
        double b = calculator.addition(4.1,a);
        calculator.incrementCountOperation();
        double c = calculator.segmentation(28,5);
        calculator.incrementCountOperation();
        double d = calculator.power(c,2);
        calculator.incrementCountOperation();
        double result = calculator.addition(b,d);
        calculator.incrementCountOperation();
        System.out.println(result);

    }
}
