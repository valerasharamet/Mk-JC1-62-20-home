package oop.calculator.additional;

public class CalculatorWithCounterAutoDecorator implements ICalculator  {
    private final ICalculator calculator;
    private long countOperation =0;

    public CalculatorWithCounterAutoDecorator (ICalculator calculator) {
        this.calculator = calculator;
    }

    public double segmentation(double a, double b) {
        countOperation++;
        return this.calculator.segmentation(a, b);
    }

    public double multiplication(double a, double b) {
        countOperation++;
        return this.calculator.multiplication(a, b);
    }

    public double addition(double a, double b) {
        countOperation++;
        return this.calculator.addition(a, b);
    }

    public double subtraction(double a, double b) {
        countOperation++;
        return this.calculator.subtraction(a, b);
    }

    public double root(double a, int b) {
        countOperation++;
        return this.calculator.root(a, b);
    }

    public double modulus(double a) {
        countOperation++;
        return this.calculator.modulus(a);
    }

    public double power(double a, int b) {
        countOperation++;
        return this.calculator.power(a, b);
    }

    public long getCountOperation() {
        return countOperation;
    }

    public ICalculator getCalculator() {
        return this.calculator;
    }
}
