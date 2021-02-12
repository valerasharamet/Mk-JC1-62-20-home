package oop.calculator.runners;

import oop.calculator.additional.CalculatorWithMemory;
import oop.calculator.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithMathExtends());
        double a = calculator.multiplication(15,7);
        double b = calculator.addition(4.1,a);
        calculator.saveMemory();
        double c = calculator.segmentation(28,5);
        calculator.showMemory();
        calculator.showMemory();
        double d = calculator.power(c,2);
        double result = calculator.addition(b,d);
        calculator.saveMemory();
        System.out.println(result);
        calculator.showMemory();
        System.out.println(calculator.getCountOperation());


    }
}
