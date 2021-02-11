package oop.calculator.additional;

public class CalculatorWithMemoryDecorator implements ICalculator {
    ICalculator calculator;

    public CalculatorWithMemoryDecorator (ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    @Override
    public double segmentation(double a, double b) {
        return calculator.segmentation(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        return calculator.multiplication(a, b);
    }

    @Override
    public double addition(double a, double b) {
        return calculator.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        return calculator.subtraction(a , b);
    }

    @Override
    public double root(double a, int b) {
        return calculator.root(a, b);
    }

    @Override
    public double modulus(double a) {
        return calculator.modulus(a);
    }

    @Override
    public double power(double a, int b) {
        return calculator.power(a, b);
    }
}
