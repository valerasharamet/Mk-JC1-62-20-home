package oop.calculator.runners;

import oop.calculator.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main (String[]args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        double result = calculator.addition(calculator.addition(4.1, calculator.multiplication(15,7)),calculator.power(calculator.segmentation(28,5),2));
        System.out.println(result);
    }
}
