package oop.calculator.runners;

import oop.calculator.additional.*;
import oop.calculator.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
       CalculatorWithMemoryDecorator calculator = new CalculatorWithMemoryDecorator(new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends())));
        double a = calculator.multiplication(15,7);
        double b = calculator.addition(4.1,a);
        calculator.saveMemory();
        double c = calculator.segmentation(28,5);
        System.out.print("Текущее число в памяти:  ");
        calculator.showMemory();
        System.out.print("Число обнулилось:  ");
        calculator.showMemory();
        double d = calculator.power(c,2);
        double result = calculator.addition(b,d);
        calculator.saveMemory();
        System.out.println(result);
        System.out.println("Число операций:  " + calculator.getCountOperation());











    }
}
