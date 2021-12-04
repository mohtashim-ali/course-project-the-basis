package UseCase;

public class Multiplication implements Computation{

    @Override
    public double compute(double a, double b) {
        return a * b;
    }
}
