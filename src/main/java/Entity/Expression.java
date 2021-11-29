package Entity;

import UseCase.ExpressionHandler;

/**
 * Entity.Expression Object.
 */
public class Expression extends ExpressionHandler {
    /**
     Takes in 2 numeric values, and evaluates them with the given operator.
     */

    public double operand1;
    public double operand2;
    public String operator;

    /**
     * @param operand1 double
     * @param operator double
     * @param operand2 double
     */
    public Expression(double operand1, String operator, double operand2) throws ExpressionException {
        super(operand1, operator, operand2);
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }
}
