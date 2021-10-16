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
    /*
    Computes given expression with the appropriate operator
    and returns the result
     */
    public double compute() {
        switch (this.operator) {
            case "+":
                return this.operand1 + this.operand2;
            case "-":
                return this.operand1 - this.operand2;
            case "*":
                return this.operand1 * this.operand2;
        }
        return this.operand1 / this.operand2;
    }

}
