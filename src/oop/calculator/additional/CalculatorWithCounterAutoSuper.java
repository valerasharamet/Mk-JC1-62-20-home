package oop.calculator.additional;

import oop.calculator.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    public long countOperation;

    public CalculatorWithCounterAutoSuper() {

    }

    public double segmentation(double a, double b) {
        countOperation++;
        return a / b;
    }

    public double multiplication(double a, double b) {
        countOperation++;
        return a * b;
    }

    public double addition(double a, double b) {
        countOperation++;
        return a + b;
    }

    public double subtraction(double a, double b) {
        countOperation++;
        return a - b;
    }

    public double root (double a, int b) {
        countOperation++;
        return super.root(a,b);
    }

    public double power (double a,int b) {
        countOperation++;
        return super.power(a,b);
    }

    public double modulus (double a) {
        countOperation++;
        return super.modulus(a);
    }

    public long getCountOperation() {
        return countOperation;
    }


}


