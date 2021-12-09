package UseCase.BasicOperations;

public class Multiplication implements Computation{

    /**
     *
     * @param a first number
     * @param b second number
     * @return result of multiplying a and b
     */

    @Override
    public double compute(double a, double b) {
        return a * b;
    }
}
