package oop.calculator.simple;

import oop.calculator.additional.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public CalculatorWithMathCopy() {
    }

    public double segmentation(double a, double b) {
        return a / b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double root (double a, int b) {
        return Math.pow(Math.E, Math.log(a)/b);
    }

    public double modulus(double a) {
        return Math.sqrt(a);
    }

    public double power (double a, int b) {
        return Math.pow(a,b);
    }
}
