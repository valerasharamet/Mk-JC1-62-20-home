package oop.calculator.additional;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private long countOperation;
    public double result;
    private static double memory =0;
    private final ICalculator calculator;

    public CalculatorWithMemoryDecorator (ICalculator calculator) {
        this.calculator = calculator;
        this.memory = 0.0;
    }

    public double segmentation(double a, double b) {
        countOperation++;
        result = this.calculator.segmentation(a, b);
        return result;
    }

    public double multiplication(double a, double b) {
        countOperation++;
        result = this.calculator.multiplication(a, b);
        return result;
    }

    public double addition(double a, double b) {
        countOperation++;
        result = this.calculator.addition(a, b);
        return result;
    }

    public double subtraction(double a, double b) {
        countOperation++;
        result = this.calculator.subtraction(a, b);
        return result;
    }

    public double root(double a, int b) {
        countOperation++;
        result = this.calculator.root(a, b);
        return result;
    }

    public double modulus(double a) {
        countOperation++;
        result = this.calculator.modulus(a);
        return result;
    }

    public double power(double a, int b) {
        countOperation++;
        result = this.calculator.power(a, b);
        return result;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public void saveMemory() {

        this.memory = result;
    }

    public double getMemory() {
        return memory;
    }

    public void showMemory() {
        System.out.println(getMemory());
        this.memory = 0;
    }

    public ICalculator getCalculator () {
        return this.calculator;
    }
}
