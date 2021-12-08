package UseCase.BasicOperations;
import Entity.*;

import java.util.HashMap;
import java.util.Objects;

public class Operator {

    private final Expression expression = new Expression();

    public Operator(Object operand1, String operator, Object operand2){
        assert false;
        this.expression.setOperand1(operand1);
        this.expression.setOperand2(operand2);
        this.expression.setOperator(operator);
    }

    public Expression getExpression(){
        return expression;
    }

    public Object compute() throws ExpressionException {
        if (!(this.expression.getOperand1() instanceof Operator) && !(this.expression.getOperand2() instanceof Operator)){
            Operator op = new Operator(this.expression.getOperand1(), this.expression.getOperator(), this.expression.getOperand2());
            return op.resultant();
        }
        if (this.expression.getOperand1() instanceof Operator && !(this.expression.getOperand2() instanceof Operator)){
            Operator op = new Operator(((Operator) this.expression.getOperand1()).compute(), this.expression.getOperator(),
                    this.expression.getOperand2());
            return op.resultant();
        }
        if (!(this.expression.getOperand1() instanceof Operator)){
            Operator op = new Operator(this.expression.getOperand1(), this.expression.getOperator(), ((Operator) this.expression.getOperand2()).compute());
            return op.resultant();
        }
        else{
            Object left = ((Operator) this.expression.getOperand1()).compute();
            Object right = ((Operator) this.expression.getOperand2()).compute();
            return new Operator(left, this.expression.getOperator(), right).resultant();
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
            if (Objects.equals(this.expression.getOperator(), key)) {
                context.setStrategy((Computation) hashMap.get(key));
            }
        }
        return context.getStrategy((double) this.expression.getOperand1(), (double) this.expression.getOperand2());
    }
}