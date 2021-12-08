package UseCase.BasicOperations;

import junit.framework.TestCase;

public class SingleExpressionTest extends TestCase {

    public void testCompute1() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.0, "+", 5.0);
        assertEquals(sp.compute(), 8.0);
    }

    public void testCompute2() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.0, "-", 5.0);
        assertEquals(sp.compute(), -2.0);
    }

    public void testCompute3() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.0, "*", 5.0);
        assertEquals(sp.compute(), 15.0);
    }

    public void testCompute4() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.0, "/", 5.0);
        assertEquals(sp.compute(), 3.0/5.0);
    }

    public void testResultant1() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.0, "+", 5.0);
        assertEquals(sp.resultant(), 8.0);
    }

    public void testResultant2() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.0, "-", 5.0);
        assertEquals(sp.resultant(), -2.0);
    }

    public void testResultant3() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.0, "*", 5.0);
        assertEquals(sp.resultant(), 15.0);
    }

    public void testResultant4() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.0, "/", 5.0);
        assertEquals(sp.resultant(), 3.0/5.0);
    }
}