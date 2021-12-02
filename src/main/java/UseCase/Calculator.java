package UseCase;

import Entity.ExpressionException;

public class Calculator {
    private final Computation _operation;

    public Calculator(Computation operand){
        this._operation = operand;
    }
    public double resultant (double a, double b) throws ExpressionException {
         return this._operation.compute(a, b);
    }

}