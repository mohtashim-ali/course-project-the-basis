public class Expression extends ExpressionHandler{
    /*
     Takes in 2 numeric values, and evaluates them with the given operator.
     */

    public double operand1;
    public double operand2;
    public String operator;

    public Expression(double operand1, String operator, double operand2) {
        super(operand1, operator, operand2);
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }
    /*
    Computes given expression with the appropriate operator
    and returns the result
     */

}
