package oop.calculator.simple;

import oop.calculator.additional.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    public CalculatorWithOperator() {

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

    public double power (double a, int b) {
        int i = 1;
        double result = a;

        if (a < 0 || b <= 1) {
            result = a;
        } else
            while (i < b) {
                result = result * a;
                i++;
            }
        return result;
    }

    public double modulus(double a) {
        double result;
        if (a < 0) {
            result = -a;
        } else
            result = a;
        return result;
    }

    public double root (double a, int b) {
        return Math.pow(Math.E, Math.log(a)/b);
    }
}
