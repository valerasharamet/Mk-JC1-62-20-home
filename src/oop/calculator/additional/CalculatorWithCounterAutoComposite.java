package oop.calculator.additional;

import oop.calculator.simple.CalculatorWithMathCopy;
import oop.calculator.simple.CalculatorWithMathExtends;
import oop.calculator.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    CalculatorWithMathExtends calculatorWithMathExtends;
    CalculatorWithOperator calculatorWithOperator;
    CalculatorWithMathCopy calculatorWithMathCopy;
    public long countOperation;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculator) {
        this.calculatorWithOperator = calculator;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculator) {
        this.calculatorWithMathCopy = calculator;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculator) {
        this.calculatorWithMathExtends = calculator;
    }

    public double segmentation(double a, double b) {
        countOperation++;
        return calculatorWithMathExtends.segmentation(a,b);


    }

    public double multiplication(double a, double b) {
        countOperation++;
        return calculatorWithMathExtends.multiplication(a,b);
    }

    public double addition(double a, double b) {
        countOperation++;
        return calculatorWithMathExtends.addition(a,b);

    }

    public double subtraction(double a, double b) {
        countOperation++;
        return calculatorWithMathExtends.subtraction(a,b);

    }

    public double root(double a, int b) {
        countOperation++;
        return calculatorWithMathExtends.root(a, b);

    }

    public double modulus(double a) {
        countOperation++;
        return calculatorWithMathExtends.modulus(a);

    }

    public double power(double a, int b) {
        countOperation++;
        return calculatorWithMathExtends.power(a, b);
    }

    public long getCountOperation() {
        return countOperation;
    }


}
