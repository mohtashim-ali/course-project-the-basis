public class Expression {
    /*
    Takes in 2 numeric values, and evaluates them with the given operator.
     */

    public double operand1;
    public double operand2;
    public String operator;

    public Expression(double operand1, String operator, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

}
