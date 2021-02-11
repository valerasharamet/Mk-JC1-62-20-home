package oop.calculator.runners;

import oop.calculator.additional.CalculatorWithCounterAutoCompositeInterface;
import oop.calculator.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoCompositeInterface calculator = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathExtends());
        double result = calculator.addition(calculator.addition(4.1,calculator.multiplication(15,7)),calculator.power(calculator.segmentation(28,5),2));
        System.out.println(result);
        System.out.println(calculator.getCountOperation());
    }
}
