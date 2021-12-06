package UseCase;

import junit.framework.TestCase;

import java.lang.reflect.Array;
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

    public void testStringToExpression() throws ParserException {
        Parser p = new Parser("1+2");
        System.out.println(p.stringToExpression());
        //assertEquals(p.stringToExpression().getOperand1(), 1);
        //assertEquals(p.stringToExpression().getOperand2(), 2);
    }
}