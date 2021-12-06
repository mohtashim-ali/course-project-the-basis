package UseCase;

import Entity.ExpressionException;
import UseCase.BasicOperations.Computation;

public class Calculator {
    private Computation _operation;

    public void setStrategy(Computation operand) {
        this._operation = operand;
    }

    public double getStrategy(double a, double b) throws ExpressionException {
        return this._operation.compute(a,b);
    }
}

