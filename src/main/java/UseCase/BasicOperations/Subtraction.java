package UseCase.BasicOperations;

public class Subtraction implements Computation {

    /**
     *
     * @param a first number
     * @param b second number
     * @return result of subtracting b from a
     */
    @Override
    public double compute(double a, double b) {
        return a - b;
    }
}
