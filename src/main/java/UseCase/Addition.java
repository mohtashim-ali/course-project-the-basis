package UseCase;

import Entity.ExpressionException;

public class Addition implements Computation {
    @Override
    public double compute(double a, double b) throws ExpressionException {
        return a + b;
    }
}
