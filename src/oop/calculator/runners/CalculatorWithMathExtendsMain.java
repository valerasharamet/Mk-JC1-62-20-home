package oop.calculator.runners;

import oop.calculator.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main (String[]args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        double result = calculator.addition(calculator.addition(4.1,calculator.multiplication(15,7)),calculator.power(calculator.segmentation(28,5),2));
        System.out.println(result);

    }
}
