package UseCase.BasicOperations;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SingleExpressionTest {
    /**
     * Tests basic addition with single digit numbers
     */
    @Test
    public void testAddition() throws ExpressionException {
        SingleExpression op = new SingleExpression(1, "+", 2);
        assert op.resultant() == 3.0;
    }
    /**
     * Tests basic addition with double-digit numbers
     */
    @Test
    public void testDoubleAddition() throws ExpressionException {
        SingleExpression op = new SingleExpression(10, "+", 12);
        assert op.resultant() == 22.0;
    }
    /**
     * Tests basic addition with multiple-digit numbers
     */
    @Test
    public void testMultipleAddition() throws ExpressionException {
        SingleExpression op = new SingleExpression(102123233, "+", 123244234);
        assert op.resultant() == 225367467.0;
    }
    /**
     * Tests basic addition with decimals
     */
    @Test
    public void testDecimalAddition() throws ExpressionException {
        SingleExpression op = new SingleExpression(1.23, "+", 4.20);
        assert op.resultant() == 5.43;
    }
    /**
     * Tests basic addition with multiple decimals
     */
    @Test
    public void testMultiDecimalAddition() throws ExpressionException {
        SingleExpression op = new SingleExpression(1.1234, "+", 4.32198765);
        assert op.resultant() == 5.44538765;
    }
    /**
     * Tests basic subtraction with single digit numbers
     */
    @Test
    public void testSubtraction() throws ExpressionException {
        SingleExpression op = new SingleExpression(5, "-", 2);
        assert op.resultant() == 3;
    }
    /**
     * Tests basic subtraction with double-digit numbers
     */
    @Test
    public void testDoubleSubtraction() throws ExpressionException {
        SingleExpression op = new SingleExpression(40, "-", 20);
        assert op.resultant() == 20;
    }
    /**
     * Tests basic subtraction with negative  numbers
     */
    @Test
    public void testNegativeSubtraction() throws ExpressionException {
        SingleExpression op = new SingleExpression(-10, "-", 8);
        assert op.resultant() == -18;
    }
    /**
     * Tests basic subtraction with multiple digits
     */
    @Test
    public void testMultipleSubtraction() throws ExpressionException {
        SingleExpression op = new SingleExpression(100000, "-", 9000);
        assert op.resultant() == 91000;
    }

    /**
     * Tests basic multiplication with single digit numbers
     */

    @Test
    public void testMultiply() throws ExpressionException {
        SingleExpression op = new SingleExpression(6, "*", 2);
        assert op.resultant() == 12;
    }
    /**
     * Tests basic division with single digit numbers
     */
    @Test
    public void testDivide() throws ExpressionException {
        SingleExpression op = new SingleExpression(2, "/", 2);
        assert op.resultant() == 1.0;
    }
    /**
     * Tests basic exponent operations with single digit numbers
     */

    @Test
    public void exponent() throws ExpressionException {
        SingleExpression op = new SingleExpression(2, "^", 2);
        assert op.resultant() == 4;
    }

    @Test
    public void testSubtract2() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.0, "-", 5.0);
        assert (sp.compute() == -2.0);
    }
    /**
     * Tests basic multiplication with single digit numbers
     */
    @Test
    public void testMultiply2() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.0, "*", 5.0);
        assert (sp.compute() == 15.0);
    }
    /**
     * Tests basic division with single decimal numbers
     */
    @Test
    public void testDivide2() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.0, "/", 5.0);
        assert (sp.compute() == 3.0 / 5.0);
    }
    /**
     * Tests basic division with double decimal numbers
     */
    @Test
    public void Divide2() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.01, "/", 5.02);
        assert (sp.resultant() == 3.01 / 5.02);
    }
    /**
     * Tests division with 0. Should give an error message
     */
    @Test (expected = ExpressionException.class)
    public void ZeroDivide() throws ExpressionException {
        SingleExpression sp = new SingleExpression(3.01, "/", 0);
        sp.resultant();
    }
}