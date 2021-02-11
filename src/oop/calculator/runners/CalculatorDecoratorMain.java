package oop.calculator.runners;

import oop.calculator.additional.*;
import oop.calculator.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {

        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends())));
        double result = (calculator.addition(calculator.addition(4.1,calculator.multiplication(15,7)),calculator.power(calculator.segmentation(28,5),2)));
        System.out.println(calculator.getResult());
        System.out.println(calculator.getCountOperation());
        System.out.println(result);

    }
}
