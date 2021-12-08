package UseCase.BasicOperations;

/**
 * Expression Interface holds compute function to be implemented in any Expression type
 */
public interface Expression {
    /**
     * @return double
     * @throws ExpressionException
     * If Expression is invalid throws Expression Exception
     */
    double compute() throws ExpressionException;
}
