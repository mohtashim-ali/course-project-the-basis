package UseCase.BasicOperations;
import java.lang.Math;

public class Exponent implements Computation {

    /**
     *
     * @param a first number
     * @param b second number
     * @return result of a to the power of b
     * @throws ExpressionException error in powers
     */
    @Override
    public double compute(double a, double b) throws ExpressionException {
        return Math.pow(a, b);
    }
}

