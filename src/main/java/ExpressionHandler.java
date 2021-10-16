public abstract class ExpressionHandler {
    public double operand1;
    public double operand2;
    public String operator;

    public ExpressionHandler(double operand1, String operator, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }
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
}
