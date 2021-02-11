package oop.calculator.runners;

import oop.calculator.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main (String[]args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        double result = calculator.addition(calculator.addition(4.1, calculator.multiplication(15,7)),calculator.power(calculator.segmentation(28,5),2));
        System.out.println(result);
        System.out.println(calculator.getCountOperation());
    }
}
