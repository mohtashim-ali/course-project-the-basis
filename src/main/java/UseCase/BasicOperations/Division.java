package UseCase.BasicOperations;

public class Division implements Computation {
    /**
     *
     * @param a first number
     * @param b second number
     * @return result of dividing a and b
     * @throws ExpressionException error in division
     */
    @Override
    public double compute(double a, double b) throws ExpressionException
    {
        if (b == 0) {
            throw new ExpressionException("Undefined");
        }
        return a / b;


    }
}
