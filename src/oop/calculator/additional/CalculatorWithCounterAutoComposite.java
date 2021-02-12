package oop.calculator.additional;

import oop.calculator.simple.CalculatorWithMathCopy;
import oop.calculator.simple.CalculatorWithMathExtends;
import oop.calculator.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private final CalculatorWithOperator calculatorWithOperator;
    private final CalculatorWithMathCopy calculatorWithMathCopy;
    private long countOperation =0;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculator) {
        this.calculatorWithOperator = calculator;
        this.calculatorWithMathCopy = null;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculator) {
        this.calculatorWithOperator = null;
        this.calculatorWithMathCopy = calculator;
    }




    public double segmentation(double a, double b) {
        countOperation++;
        if(this.calculatorWithOperator != null){
            return this.calculatorWithOperator.segmentation(a,b);
        } else  {
            return this.calculatorWithMathCopy.segmentation(a, b);
        }

    }

    public double multiplication(double a, double b) {
        countOperation++;
        if(this.calculatorWithOperator != null){
            return this.calculatorWithOperator.multiplication(a,b);
        } else  {
            return this.calculatorWithMathCopy.multiplication(a, b);
        }
    }

    public double addition(double a, double b) {
        countOperation++;
        if(this.calculatorWithOperator != null){
            return this.calculatorWithOperator.addition(a,b);
        } else {
            return this.calculatorWithMathCopy.addition(a, b);
        }

    }

    public double subtraction(double a, double b) {
        countOperation++;
        if(this.calculatorWithOperator != null){
            return this.calculatorWithOperator.subtraction(a,b);
        } else {
            return calculatorWithOperator.subtraction(a, b);
        }

    }

    public double root(double a, int b) {
        countOperation++;
        if(this.calculatorWithOperator != null){
            return this.calculatorWithOperator.root(a,b);
        } else {
            return calculatorWithOperator.root(a, b);
        }

    }

    public double modulus(double a) {
        countOperation++;
        if(this.calculatorWithOperator != null){
            return this.calculatorWithOperator.modulus(a);
        } else {
            return this.calculatorWithMathCopy.modulus(a);
        }

    }

    public double power(double a, int b) {
        countOperation++;
        if(this.calculatorWithOperator != null){
            return this.calculatorWithOperator.power(a,b);
        } else {
            return calculatorWithOperator.power(a, b);
        }
    }

    public long getCountOperation() {
        return countOperation;
    }


}
