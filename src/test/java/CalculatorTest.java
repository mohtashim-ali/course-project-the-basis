import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addition() {
        InputProcessor input = new InputProcessor("5 + 5");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 10.0;
    }
    @Test
    public void subtraction() {
        InputProcessor input = new InputProcessor("5 - 4");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 1.0;
    }
    @Test
    public void multiplication() {
        InputProcessor input = new InputProcessor("5 * 4");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 20.0;
    }
    @Test
    public void division() {
        InputProcessor input = new InputProcessor("10 / 5");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 2.0;
    }
    @Test
    public void divisionByZero() {
        InputProcessor input = new InputProcessor("5 / 0");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == null;
    }
    @Test
    public void multiplicationByNegative() {
        InputProcessor input = new InputProcessor("-5 * -1");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 5.0;
    }
    @Test
    public void additionMultiplePositiveNumbers(){
        InputProcessor input = new InputProcessor("5 + 3 + 4");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 12.0;
    }
    @Test
    public void threeNumbersSubtraction(){
        InputProcessor input = new InputProcessor("1 - 1 - 0");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 0.0;
    }
    @Test
    public void MulitpleNumbersSubtraction(){
        InputProcessor input = new InputProcessor("25 - 1 - 4 - 2 - 1 - 4 - 5 - 2");
        Expression temp = input.processInput(input.listInput());
        assert temp.compute() == 6.0;
    }


}
