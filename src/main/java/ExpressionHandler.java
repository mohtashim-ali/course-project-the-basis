import java.util.List;
import java.util.Objects;

class ExpressionException extends Exception {
    public ExpressionException(String errorMessage) {
        super(errorMessage);
    }
}
/**
 * ExpressionHandler Class that handles all operations done to an Expression.
 */
public abstract class ExpressionHandler {
    public double operand1;
    public double operand2;
    public String operator;
    public List<String> operations = List.of(new String[]{"+", "-", "*", "/", "^"});

    /**
     * @param operand1 double
     * @param operator String
     * @param operand2 double
     */
    public ExpressionHandler(double operand1, String operator, double operand2) throws ExpressionException {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
        boolean valid_operator = false;
        for (String op : this.operations)
        {
            if (Objects.equals(op, this.operator)) {
                valid_operator = true;
                break;
            }

        }
        if (!valid_operator){
            throw new ExpressionException("Invalid Operator");
        }
    }

    /**
     * @return Double
     */
    public Double compute() throws ExpressionException {
        switch (this.operator) {
            case "+":
                return this.operand1 + this.operand2;
            case "-":
                return this.operand1 - this.operand2;
            case "*":
                return this.operand1 * this.operand2;
        }
        if (this.operand2 == 0){
            throw new ExpressionException("Undefined");
        }
        return this.operand1 / this.operand2;
    }

    /**
     * @return Expression
     */
    public Expression simplify() throws ExpressionException {
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
