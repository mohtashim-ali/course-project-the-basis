package UseCase.BasicOperations;

import Entity.Expression;
import Entity.ExpressionException;

import java.util.List;
import java.util.Objects;
import java.lang.Math;

/**
// * UseCase.BasicOperations.ExpressionHandler Class that handles all operations done to an Entity.Expression.
// */
public class ExpressionHandler {
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
        for (String op : this.operations) {
            if (Objects.equals(op, this.operator)) {
                valid_operator = true;
                break;
            }

        }
        if (!valid_operator) {
            if (!Objects.equals(this.operator, "")) {
                throw new ExpressionException("Invalid Operator");
            }
        }
    }

    /**
     * @return Double
     */
    public double compute() throws ExpressionException {
        switch (this.operator) {
            case "+":
                return this.operand1 + this.operand2;
            case "-":
                return this.operand1 - this.operand2;
            case "*":
                return this.operand1 * this.operand2;
            case "^":
                return Math.pow(this.operand1, this.operand2);
        }

        if (this.operator.equals("")){
            return this.operand1;
        }
        if (this.operand2 == 0){
            throw new ExpressionException("Undefined");
        }
        return this.operand1 / this.operand2;
    }
}
