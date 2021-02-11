package oop.calculator.additional;



public class CalculatorWithMemory  {
    private long countOperation;
    public double result;
    ICalculator calculator;

    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
    }

    public double segmentation(double a, double b) {
        countOperation++;
        result = calculator.segmentation(a, b);
        return result;
    }

    public double multiplication(double a, double b) {
        countOperation++;
        result = calculator.multiplication(a, b);
        return result;
    }

    public double addition(double a, double b) {
        countOperation++;
        result = calculator.addition(a, b);
        return calculator.addition(a, b);
    }

    public double subtraction(double a, double b) {
        countOperation++;
        result = calculator.subtraction(a, b);
        return calculator.subtraction(a, b);
    }

    public double root(double a, int b) {
        countOperation++;
        result = calculator.root(a, b);
        return calculator.root(a, b);
    }

    public double modulus(double a) {
        countOperation++;
        result = calculator.modulus(a);
        return calculator.modulus(a);
    }

    public double power(double a, int b) {
        countOperation++;
        result = calculator.power(a, b);
        return calculator.power(a, b);
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double getResult() {
        return result;
    }

    public void numberNow() {
        System.out.println(getResult());
        result = 0;
    }
}
