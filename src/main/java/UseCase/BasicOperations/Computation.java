package UseCase.BasicOperations;

import Entity.ExpressionException;

public interface Computation {

    double compute(double a, double b) throws ExpressionException;
}
