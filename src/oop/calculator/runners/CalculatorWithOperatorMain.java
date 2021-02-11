package oop.calculator.runners;

import oop.calculator.simple.CalculatorWithMathCopy;
import oop.calculator.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main (String[]args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double result = (calculator.addition(calculator.addition(4.1,calculator.multiplication(15,7)),calculator.power(calculator.segmentation(28,5),2)));
        System.out.println(result);
    }


}
