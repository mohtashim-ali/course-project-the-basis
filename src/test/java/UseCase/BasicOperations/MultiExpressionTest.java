package UseCase.BasicOperations;

import junit.framework.TestCase;

public class MultiExpressionTest extends TestCase {

    public void testCompute1() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(6, "+", 5),
                "-",
                new SingleExpression(4, "-", 2));
        assertEquals(m.compute(), 9.0);
    }

    public void testCompute2() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(1, "-", 5),
                "*",
                new SingleExpression(4, "/", 2));
        assertEquals(m.compute(), -8.0);
    }
}