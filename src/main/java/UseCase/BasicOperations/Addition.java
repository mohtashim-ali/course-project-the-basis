package UseCase.BasicOperations;

public class Addition implements Computation {

    /**
     *
     * @param a first number
     * @param b second number
     * @return result of adding a and b
     * @throws ExpressionException error in addition
     */
    @Override
    public double compute(double a, double b) throws ExpressionException {
        return a + b;
    }
}
