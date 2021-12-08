package UseCase.BasicOperations;

/**
 * MultiExpression Class which contains an expression that contains two SingleExpression objects
 */
public class MultiExpression implements Expression{

    private final Expression operand1;
    private final Expression operand2;
    private final String operator;

    /**
     * @param operand1 Expression Object
     * @param operator String operator
     * @param operand2 Expression Object
     */
    public MultiExpression(Expression operand1, String operator, Expression operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    /**
     * @return double
     * @throws ExpressionException
     * If Expression is invalid throws Expression Exception
     */
    @Override
    public double compute() throws ExpressionException {
        /*
         * Function that computes a MultiExpression using Divide and Conquer computing Single Expressions
         */
        double left = this.operand1.compute();
        double right = this.operand2.compute();
        return new SingleExpression(left, this.operator, right).resultant();

    }
}