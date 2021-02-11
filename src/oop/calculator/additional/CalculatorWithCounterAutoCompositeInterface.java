package oop.calculator.additional;

import oop.calculator.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoCompositeInterface {
    ICalculator calculator;
    public long countOperation;

    public CalculatorWithCounterAutoCompositeInterface (ICalculator calculator) {
        this.calculator = calculator;
    }

    public double segmentation(double a, double b) {
        countOperation++;
        return calculator.segmentation(a, b);
    }

    public double multiplication(double a, double b) {
        countOperation++;
        return calculator.multiplication(a, b);
    }

    public double addition(double a, double b) {
        countOperation++;
        return calculator.addition(a, b);
    }

    public double subtraction(double a, double b) {
        countOperation++;
        return calculator.subtraction(a, b);
    }

    public double root(double a, int b) {
        countOperation++;
        return calculator.root(a, b);
    }

    public double modulus(double a) {
        countOperation++;
        return calculator.modulus(a);
    }

    public double power(double a, int b) {
        countOperation++;
        return calculator.power(a, b);
    }

    public long getCountOperation() {
        return countOperation;
    }

}
