import Entity.Trigonometry;
import UseCase.BasicOperations.*;
import org.junit.Test;
import Entity.ExpressionException;

public class CalculatorTest {

    @Test
    public void testAddition() throws ExpressionException {
        Operator op = new Operator(1, "+", 2);
        assertEquals(op.resultant(), 3);
    }

    @Test
    public void testSubtraction() throws ExpressionException {
        Operator op = new Operator(1, "-", 2);
        assert op.resultant() == -1;
    }

    @Test
    public void testMultiply() throws ExpressionException {
        Operator op = new Operator(6, "*", 2);
        assert op.resultant() == 12;
    }

    @Test
    public void testDivide() throws ExpressionException {
        Operator op = new Operator(1, "/", 2);
        assert op.resultant() == 0.5;
    }

    @Test
    public void exponent() throws ExpressionException {
        Operator op = new Operator(2, "^", 2);
        assert op.resultant() == 4;
    }

    }
    @Test
    public void subtraction() throws ExpressionException {
        Calculator oprt = new Calculator(new Subtraction());
        assert oprt.resultant(10, 1) == 9.0;
    }
    @Test
    public void multiplication() throws ExpressionException {
        Calculator oprt = new Calculator(new Multiplication());
        assert oprt.resultant(20, 10) == 200.0;
    }
    @Test
    public void division() throws ExpressionException {
        Calculator oprt = new Calculator(new Division());
        assert oprt.resultant(20, 2) == 10.0;
    }
    @Test (expected = ExpressionException.class)
    public void divisionByZero() throws ExpressionException {
        Calculator oprt = new Calculator(new Division());
        oprt.resultant(200, 0);
    }
    @Test
    public void multiplicationByNegative() throws ExpressionException {
        Calculator oprt = new Calculator(new Multiplication());
        assert oprt.resultant(20, -2) == -40.0;
    }
    @Test
    public void testSin() {
        double input = new Trigonometry().computeSin(90);
        System.out.println(input);
        assert input == 0.894;
    }
    @Test
    public void testCos(){
        double input = new Trigonometry().computeCos(270);
        System.out.println(input);
        assert input == 0.9844;

    }
    @Test
    public void testTan() {
        double input = new Trigonometry().computeTan(80);
        System.out.println(input);
        assert input == 9.0027;
    }
    @Test
    public void testCsc() {
        double input = new Trigonometry().computeCsc(240);
        System.out.println(input);
        assert input == 1.0578;
    }
    @Test
    public void testSec() {
        double input = new Trigonometry().computeSec(180);
        System.out.println(input);
        assert input == -1.6708;
    }
    @Test
    public void testCot() {
        double input = new Trigonometry().computeCot(360);
        System.out.println(input);
        assert input == -0.2959;
    }

}

