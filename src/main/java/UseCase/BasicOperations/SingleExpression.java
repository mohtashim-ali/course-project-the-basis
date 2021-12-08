package UseCase.BasicOperations;

import java.util.HashMap;
import java.util.Objects;

/**
 * SingleExpression Class contains the most basic type of Expression
 */
public class SingleExpression implements Expression{

    private final double operand1;
    private final double operand2;
    private final String operator;

    /**
     * @param operand1 double object
     * @param operator String object
     * @param operand2 double object
     */
    public SingleExpression(double operand1, String operator, double operand2){
        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    /**
     * @return double
     * @throws ExpressionException
     * If Expression is invalid throws Expression Exception
     */
    @Override
    public double compute() throws ExpressionException {
        /*
         * Function that computes the resultant of this SingleExpression
         */
        return this.resultant();
    }

    /**
     * @return double
     * @throws ExpressionException
     * If Expression is invalid throws Expression Exception
     */
    public double resultant() throws ExpressionException {
        /*
         * Function that computes the SingleExpression by finding which BasicOperation class to use
         */
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
