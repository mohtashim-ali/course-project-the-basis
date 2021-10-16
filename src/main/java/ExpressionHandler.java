/**
 * ExpressionHandler Class that handles all operations done to an Expression.
 */
public abstract class ExpressionHandler {
    public double operand1;
    public double operand2;
    public String operator;

    /**
     * @param operand1 double
     * @param operator String
     * @param operand2 double
     */
    public ExpressionHandler(double operand1, String operator, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    /**
     * @return Double
     */
    public Double compute() {
        switch (this.operator) {
            case "+":
                return this.operand1 + this.operand2;
            case "-":
                return this.operand1 - this.operand2;
            case "*":
                return this.operand1 * this.operand2;
        }
        if (this.operand2 == 0){
            return null;
        }
        return this.operand1 / this.operand2;
    }

    /**
     * @return Expression
     */
    public Expression simplify(){
        /**
         * Might need to add a whole class for this as there are multiple ways of simplifying different expressions.
         */
        // 1/sqrt(2) -> sqrt(2)/2
        //TO DO
        return new Expression(1, "+", 2);
    }
    public void print(){
        System.out.println(this.operand1 + " " + this.operator + " " + this.operand2);
    }
}
