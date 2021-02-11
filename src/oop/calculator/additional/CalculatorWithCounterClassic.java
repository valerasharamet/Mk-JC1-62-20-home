package oop.calculator.additional;

import oop.calculator.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    public long countOperation;

    public CalculatorWithCounterClassic() {

    }
    public void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }
}
