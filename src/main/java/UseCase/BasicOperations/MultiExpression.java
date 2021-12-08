package UseCase.BasicOperations;

public class MultiExpression implements Expression{

    private final Expression operand1;
    private final Expression operand2;
    private final String operator;

    public MultiExpression(Expression operand1, String operator, Expression operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public double compute() throws ExpressionException {
        double left = this.operand1.compute();
        double right = this.operand2.compute();
        return new SingleExpression(left, this.operator, right).resultant();

    }
}