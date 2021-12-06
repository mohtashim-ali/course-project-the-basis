package UseCase;

/**
 * Entity.ExpressionException Class that allows for custom exceptions of creating invalid expressions.
 */
public class ParserException extends Exception {
    /**
     * @param errorMessage String
     */
    public ParserException(String errorMessage) {
        super(errorMessage);
    }
}
