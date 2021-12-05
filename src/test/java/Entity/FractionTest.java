package Entity;

import junit.framework.TestCase;

public class FractionTest extends TestCase {

    public void testSimplify() {
        Fraction f = new Fraction(-8, 28);
        Fraction f1 = f.simplify();
        assertEquals(f1.getNumerator(), -2);
        assertEquals(f1.getDenominator(), 7);
    }
    public void testSimplify2() {
        Fraction f = new Fraction(-1, 1);
        Fraction f1 = f.simplify();
        assertEquals(f1.getNumerator(), -1);
        assertEquals(f1.getDenominator(), 1);
    }

    public void testMultiply() {
        Fraction f1 = new Fraction(1, 1);
        Fraction f2 = new Fraction(-1, 1);
        Fraction f3 = f1.multiply(f2);
        assertEquals(f3.getNumerator(), -1);
        assertEquals(f3.getDenominator(), 1);
    }

}