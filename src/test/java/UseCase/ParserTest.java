package UseCase;

import UseCase.BasicOperations.*;
import junit.framework.TestCase;

import java.util.ArrayList;

public class ParserTest extends TestCase {

    public void testValidity() {
        Parser p = new Parser("+33*444/");
        assertFalse(p.validity());
    }

    public void testValidity2() {
        Parser p = new Parser("330+*56");
        assertFalse(p.validity());
    }

    public void testValidity3() {
        Parser p = new Parser("330+*56/");
        assertFalse(p.validity());
    }

    public void testValidity4() {
        Parser p = new Parser("330^56");
        assertTrue(p.validity());
    }

    public void testValidity5() {
        Parser p = new Parser("3305%6");
        assertFalse(p.validity());
    }

    public void testFindHighest1() {
        Parser p = new Parser("1+2+3*4");
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(5);
        lst1.add(1);
        lst1.add(3);
        assertEquals(p.findOps(), lst1);
    }
    public void testFindHighest2() {
        Parser p = new Parser("44^9-1/2*4+2");
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(2);
        lst1.add(6);
        lst1.add(8);
        lst1.add(4);
        lst1.add(10);
        assertEquals(p.findOps(), lst1);
    }

    public void testStringToExpression() throws ParserException, ExpressionException {
        Parser p = new Parser("1+2+3*4");
        Expression expression = p.stringToExpression();
        assertEquals(expression.compute(), 15.0);
    }

    public void testStringToExpression2() throws ParserException, ExpressionException {
        Parser p = new Parser("7+4/5+4*5");
        Expression expression = p.stringToExpression();
        assertEquals(expression.compute(), 27.8);
    }
    public void testStringToExpression3() throws ParserException, ExpressionException {
        Parser p = new Parser("4 + 6 / 3 * 6 - 6*6*7*5*5");
        Expression expression = p.stringToExpression();
        assertEquals(expression.compute(), -6284.0);
    }
    public void testStringToExpression4() throws ParserException, ExpressionException {
        Parser p = new Parser("3^2^2");
        Expression expression = p.stringToExpression();
        assertEquals(expression.compute(), 81.0);
    }

}