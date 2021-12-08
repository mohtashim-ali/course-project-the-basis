package UseCase.BasicOperations;

/**
 * UseCase.BasicOperations.ExpressionException Class that allows for custom exception's of creating invalid expressions.
 */
public class ParserException extends Exception {
    /**
     * @param errorMessage String
     */
    public ParserException(String errorMessage) {
        super(errorMessage);
    }
}
