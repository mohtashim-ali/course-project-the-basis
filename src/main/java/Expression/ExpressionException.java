package Expression;

/**
 * Expression.ExpressionException Class that allows for custom exceptions of creating invalid expressions.
 */
public class ExpressionException extends Exception {
    /**
     * @param errorMessage String
     */
    public ExpressionException(String errorMessage) {
        super(errorMessage);
    }
}
