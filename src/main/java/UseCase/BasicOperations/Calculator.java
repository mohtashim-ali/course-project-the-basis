package UseCase.BasicOperations;

public class Calculator {
    private Computation _operation;

    /**
     * Strategy pattern, sets the operand
     * @param operand input operand
     */

    public void setStrategy(Computation operand) {
        this._operation = operand;
    }

    public double getStrategy(double a, double b) throws ExpressionException {
        return this._operation.compute(a,b);
    }
}

