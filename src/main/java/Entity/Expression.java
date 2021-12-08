package Entity;

/**
 * Entity.Expression Object.
 */
public class Expression{
    /**
     Takes in 2 numeric values, and evaluates them with the given operator.
     */

    private Object operand1;
    private Object operand2;
    private String operator;

    public Object getOperand1() {
        return operand1;
    }

    public void setOperand1(Object operand1) {
        this.operand1 = operand1;
    }

    public Object getOperand2() {
        return this.operand2;
    }

    public void setOperand2(Object operand2) {
        this.operand2 = operand2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
