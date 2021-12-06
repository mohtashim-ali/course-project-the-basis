package UseCase;

import Entity.ExpressionException;

public class Division implements Computation {
    @Override
    public double compute(double a, double b) throws ExpressionException
    {
        if (b == 0) {
            throw new ExpressionException("Undefined");
        }
        return a / b;


    }
}
