package UseCase;
import Entity.ExpressionException;
import UseCase.Calculator;

import java.util.Objects;

public class Main {

    public double resultant(double a, String action, double b) throws ExpressionException {
        Calculator context = new Calculator();
        if (Objects.equals(action, "+")){
            context.setStrategy(new Addition());
        }
        if (Objects.equals(action, "-")) {
            context.setStrategy(new Subtraction());
        }

        if (Objects.equals(action, "*")) {
            context.setStrategy(new Multiplication());
        }

        if (Objects.equals(action, "/")){
            context.setStrategy(new Division());
        }
        if (Objects.equals(action, "^")){
            context.setStrategy(new Exponent());
        }
        return context.getStrategy(a, b);
    }
}