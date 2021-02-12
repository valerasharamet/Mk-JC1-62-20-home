package oop.calculator.simple;

import oop.calculator.additional.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    public CalculatorWithMathExtends() {
    }

    @Override
    public double root(double a, int b) {
        return Math.pow(Math.E, Math.log(a) / b);
    }

    @Override
    public double modulus(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double power(double a, int b) {
        return Math.pow(a, b);
    }
}
