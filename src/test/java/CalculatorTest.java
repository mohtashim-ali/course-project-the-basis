import org.junit.Rule;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addition() throws ExpressionException {
        InputProcessor input = new InputProcessor("5 + 5");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 10.0;
    }
    @Test
    public void subtraction() throws ExpressionException {
        InputProcessor input = new InputProcessor("5 - 4");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 1.0;
    }
    @Test
    public void multiplication() throws ExpressionException {
        InputProcessor input = new InputProcessor("5 * 4");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 20.0;
    }
    @Test
    public void division() throws ExpressionException {
        InputProcessor input = new InputProcessor("10 / 5");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 2.0;
    }
    @Test (expected = ExpressionException.class)
    public void divisionByZero() throws ExpressionException {
        InputProcessor input = new InputProcessor("5 / 0");
        Expression temp = input.processInput(input.listInput());
        temp.compute();
    }
    @Test
    public void multiplicationByNegative() throws ExpressionException {
        InputProcessor input = new InputProcessor("-5 * -1");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 5.0;
    }
    @Test
    public void additionMultiplePositiveNumbers() throws ExpressionException {
        InputProcessor input = new InputProcessor("5 + 3 + 4");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 12.0;
    }
    @Test
    public void testCompareOperators(){
        InputProcessor input = new InputProcessor("");
        assert !input.compareOperators("+", "-");
        assert !input.compareOperators("*", "/");
        assert input.compareOperators("+", "*");
        assert input.compareOperators("-", "*");
        assert input.compareOperators("+", "/");
        assert input.compareOperators("-", "/");
        assert !input.compareOperators("*", "+");
        assert !input.compareOperators("*", "-");
        assert !input.compareOperators("/", "+");
        assert !input.compareOperators("/", "-");
    }
    @Test
    public void mixOperationsOrder() throws ExpressionException {
        InputProcessor input = new InputProcessor("12 / 4 - 3 + 6 * 18");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 108.0;

    }
    @Test
    public void mixOperationsOrder2() throws ExpressionException {
        InputProcessor input = new InputProcessor("12 / 4 * 3 + 6 * 18");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 117.0;

    }
    @Test
    public void mixOperationsOrder3() throws ExpressionException {
        InputProcessor input = new InputProcessor("12 + 4 + 3 / 6 + 18");
        Expression temp = input.processInput(input.listInput());
        temp.compute();

    }
    @Test (expected = ExpressionException.class)
    public void invalidOperation() throws ExpressionException {
        InputProcessor input = new InputProcessor("12 ( 4");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 34.5;

    }
    public void singleDigit() throws ExpressionException {
        InputProcessor input = new InputProcessor("5");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 5.0;
    }




}
