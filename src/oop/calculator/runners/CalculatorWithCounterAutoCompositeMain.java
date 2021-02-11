package oop.calculator.runners;

import oop.calculator.additional.CalculatorWithCounterAutoComposite;
import oop.calculator.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main (String[] args) {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());

        System.out.println(calculator.addition(calculator.addition(4.1,calculator.multiplication(15,7)),calculator.power(calculator.segmentation(28,5),2)));
        System.out.println(calculator.getCountOperation());
    }
}
