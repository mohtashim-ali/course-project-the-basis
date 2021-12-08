package UseCase.BasicOperations;

import java.util.HashMap;
import java.util.Objects;

public class SingleExpression implements Expression{

    private final double operand1;
    private final double operand2;
    private final String operator;

    public SingleExpression(double operand1, String operator, double operand2){
        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    public double compute() throws ExpressionException {
        return this.resultant();
    }

    public double resultant() throws ExpressionException {
        HashMap<String, Object> hashMap = new HashMap<>()
        {{
            put("+", new Addition());
            put("-", new Subtraction());
            put("*", new Multiplication());
            put("/", new Division());
            put("^", new Exponent());
        }};
        Calculator context = new Calculator();
        for (String key : hashMap.keySet()) {
            if (Objects.equals(this.operator, key)) {
                context.setStrategy((Computation) hashMap.get(key));
            }
        }
        return context.getStrategy(this.operand1, this.operand2);
    }
}
