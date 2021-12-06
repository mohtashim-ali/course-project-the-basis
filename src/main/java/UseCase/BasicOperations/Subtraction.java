package UseCase.BasicOperations;

public class Subtraction implements Computation {
    @Override
    public double compute(double a, double b) {
        return a - b;
    }
}
