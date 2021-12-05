import UseCase.*;
import org.junit.Test;
import Entity.ExpressionException;


public class CalculatorTest {

    @Test
    public void addition() throws ExpressionException {
        Main oprt = new Main();
        assert oprt.resultant(1,"+",2) == 3;
    }
//    }
//    @Test
//    public void subtraction() throws ExpressionException {
//        Calculator oprt = new Calculator(new Subtraction());
//        assert oprt.resultant(10, 1) == 9.0;
//    }
//    @Test
//    public void multiplication() throws ExpressionException {
//        Calculator oprt = new Calculator(new Multiplication());
//        assert oprt.resultant(20, 10) == 200.0;
//    }
//    @Test
//    public void division() throws ExpressionException {
//        Calculator oprt = new Calculator(new Division());
//        assert oprt.resultant(20, 2) == 10.0;
//    }
//    @Test (expected = ExpressionException.class)
//    public void divisionByZero() throws ExpressionException {
//        Calculator oprt = new Calculator(new Division());
//        oprt.resultant(200, 0);
//    }
//    @Test
//    public void multiplicationByNegative() throws ExpressionException {
//        Calculator oprt = new Calculator(new Multiplication());
//        assert oprt.resultant(20, -2) == -40.0;;
//    @Test
//    public void additionMultiplePositiveNumbers() throws ExpressionException {
//        InputProcessor input = new InputProcessor("5 + 3 + 4");
//        Expression temp = input.processInput();
//        assert temp.compute() == 12.0;
//    }
//    @Test
//    public void testCompareOperators(){
//        InputProcessor input = new InputProcessor("");
//        assert !input.compareOperators("+", "-");
//        assert !input.compareOperators("*", "/");
//        assert input.compareOperators("+", "*");
//        assert input.compareOperators("-", "*");
//        assert input.compareOperators("+", "/");
//        assert input.compareOperators("-", "/");
//        assert !input.compareOperators("*", "+");
//        assert !input.compareOperators("*", "-");
//        assert !input.compareOperators("/", "+");
//        assert !input.compareOperators("/", "-");
//    }
//    @Test
//    public void mixOperationsOrder() throws ExpressionException {
//        InputProcessor input = new InputProcessor("12 / 4 - 3 + 6 * 18");
//        Expression temp = input.processInput();
//        assert temp.compute() == 108.0;
//
//    }
//    @Test
//    public void mixOperationsOrder2() throws ExpressionException {
//        InputProcessor input = new InputProcessor("12 / 4 * 3 + 6 * 18");
//        Expression temp = input.processInput();
//        assert temp.compute() == 117.0;
//
//    }
//    @Test
//    public void mixOperationsOrder3() throws ExpressionException {
//        InputProcessor input = new InputProcessor("12 + 4 + 3 / 6 + 18");
//        Expression temp = input.processInput();
//        temp.compute();
//
//    }
//    @Test (expected = ExpressionException.class)
//    public void invalidOperation() throws ExpressionException {
//        InputProcessor input = new InputProcessor("12 ( 4");
//        Expression temp = input.processInput();
//        assert temp.compute() == 34.5;
//
//    }
//    @Test
//    public void singleDigit() throws ExpressionException {
//        InputProcessor input = new InputProcessor("5");
//        Expression temp = input.processInput();
//        assert temp.compute() == 5.0;
//    }
//    @Test
//    public void NegativesingleDigit() throws ExpressionException {
//        InputProcessor input = new InputProcessor("-5");
//        Expression temp = input.processInput();
//        assert temp.compute() == -5.0;
//    }
//    @Test
//    public void exponentOneDigit() throws ExpressionException {
//        InputProcessor input = new InputProcessor("2 ^ 2");
//        Expression temp = input.processInput();
//        assert temp.compute() == 4.0;
//    }
//    @Test
//    public void exponentAddition() throws ExpressionException {
//        InputProcessor input = new InputProcessor("2 ^ 2 + 2 ^ 3");
//        Expression temp = input.processInput();
//        assert temp.compute() == 12.0;
//    }
//
//    @Test
//    public void doubleExponent() throws ExpressionException {
//        InputProcessor input = new InputProcessor("2 ^ 2 ^ 2");
//        Expression temp = input.processInput();
//        assert temp.compute() == 16.0;
//
//    }
//    @Test
//    public void testSin() {
//        double input = new Trigonometry().computeSin(90);
//        System.out.println(input);
//        assert input == 0.894;
//    }
//    @Test
//    public void testCos(){
//        double input = new Trigonometry().computeCos(270);
//        System.out.println(input);
//        assert input == 0.9844;
//
//    }
//    @Test
//    public void testTan() {
//        double input = new Trigonometry().computeTan(80);
//        System.out.println(input);
//        assert input == 9.0027;
//    }
//    @Test
//    public void testCsc() {
//        double input = new Trigonometry().computeCsc(240);
//        System.out.println(input);
//        assert input == 1.0578;
//    }
//    @Test
//    public void testSec() {
//        double input = new Trigonometry().computeSec(180);
//        System.out.println(input);
//        assert input == -1.6708;
//    }
//    @Test
//    public void testCot() {
//        double input = new Trigonometry().computeCot(360);
//        System.out.println(input);
//        assert input == -0.2959;
//    }

}

