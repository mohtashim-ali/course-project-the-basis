package UseCase.BasicOperations;

public class Addition implements Computation {
    @Override
    public double compute(double a, double b) throws ExpressionException {
        return a + b;
    }
}
