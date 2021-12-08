package UseCase.BasicOperations;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MultiExpressionTest {

    /**
     * Test Addition and Subtraction
     */
    @Test
    public void testAdditionAndSubtraction() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(6, "+", 5),
                "-",
                new SingleExpression(4, "-", 2));
        assert (m.compute() == 9.0);
    }
    /**
     * Test Addition
     */
    @Test
    public void testMultipleAddition() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(16, "+", 25),
                "+",
                new SingleExpression(14, "+", 12));
        assert (m.compute() == 67.0);
    }
    /**
     * Test Multiplication and Subtraction
     */
    @Test
    public void testSubtractionAndMultiplication() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(14, "-", 5),
                "*",
                new SingleExpression(90, "-", 76));
        System.out.println(m.compute());
        assert (m.compute() == 126.0);
    }
    /**
     * Test Division and Subtraction
     */
    @Test
    public void testSubtractionAndDivision() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(1, "-", 5),
                "*",
                new SingleExpression(12, "-", 76));
        System.out.println(m.compute());
        assert(m.compute() == 256.0);
    }
    /**
     * Test Division and Subtraction
     */
    @Test
    public void testSubtractionAndDivision2() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(10, "-", 1),
                "*",
                new SingleExpression(15, "/", 5));
        System.out.println(m.compute());
       assert (m.compute() == 27.0);
    }
    /**
     * Test Multiplication and Division
     */
    @Test
    public void testMultiplicationAndDivision() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(62, "*", 32),
                "/",
                new SingleExpression(14, "*", 22));
        System.out.println(m.compute());
        assert (m.compute() == 6.441558441558442);
    }
    /**
     * Test Multiplication and Division
     */
    @Test
    public void testMultiplicationAndDivision2() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(16, "/", 52),
                "*",
                new SingleExpression(4, "/", 2));
        System.out.println(m.compute());
        assert (m.compute() == 0.6153846153846154);
    }
    /**
     * Test Multiplication and Exponent
     */
    @Test
    public void testExponentAndMultiplication() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(3, "^", 5),
                "*",
                new SingleExpression(3, "^", 9));
        System.out.println(m.compute());
        assert (m.compute() == 4782969.0);
    }
    /**
     * Test Multiplication and Exponent
     */
    @Test
    public void testExponentAndMultiplication2() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(1, "^", 5),
                "^",
                new SingleExpression(4, "^", 5));
        System.out.println(m.compute());
        assert (m.compute() == 1.0);
    }
    /**
     * Test Division and Exponent
     */
    @Test
    public void testExponentAndDivision() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(10, "/", 5),
                "^",
                new SingleExpression(25, "/", 5));
        System.out.println(m.compute());
        assert (m.compute() == 32.0);
    }
    /**
     * Test Division and Exponent
     */
    @Test
    public void testExponentAndDivision2() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(2, "^", 3),
                "/",
                new SingleExpression(2, "^", 1));
        System.out.println(m.compute());
        assert (m.compute() == 4.0);
    }
    /**
     * Test Division with zero
     */
    @Test(expected = ExpressionException.class)
    public void ZeroDivision() throws ExpressionException {
        MultiExpression m = new MultiExpression(new SingleExpression(3, "^", 5),
                "/",
                new SingleExpression(0, "^", 10));
        m.compute();
    }

}