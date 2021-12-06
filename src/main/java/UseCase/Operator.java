package UseCase;
import Entity.ExpressionException;
import UseCase.Calculator;
import java.util.*;
import java.util.HashMap;
import java.util.Objects;

public class Operator {

    private Object operand1;
    private Object operand2;
    private String operator;

    public Operator(Object operand1, String operator, Object operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public Object getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public Object getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Object compute() throws ExpressionException {
        if (!(this.operand1 instanceof Operator) && !(this.operand2 instanceof Operator)){
            Operator op = new Operator(this.operand1, this.operator, this.operand2);
            return op.resultant();
        }
        if (this.operand1 instanceof Operator && !(this.operand2 instanceof Operator)){
            Operator op = new Operator(((Operator) this.operand1).compute(), this.operator, this.operand2);
            return op.resultant();
        }
        if (!(this.operand1 instanceof Operator)){
            Operator op = new Operator(this.operand1, this.operator, ((Operator) this.operand2).compute());
            return op.resultant();
        }
        else{
            Object left = ((Operator) this.operand1).compute();
            Object right = ((Operator) this.operand2).compute();
            return new Operator(left, this.operator, right).resultant();
        }


    }

    public Object resultant() throws ExpressionException {
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
        return context.getStrategy((double) this.operand1, (double) this.operand2);
    }
}