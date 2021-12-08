package UseCase.BasicOperations;
import java.lang.Math;

public class Exponent implements Computation {
    @Override
    public double compute(double a, double b) throws ExpressionException {
        return Math.pow(a, b);
    }
}

