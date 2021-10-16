import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addition() {
        InputProcessor input = new InputProcessor("5+5");
        Expression temp = input.processInput();
        assert temp.compute() == 10.0;
    }
    @Test
    public void subtraction() {
        InputProcessor input = new InputProcessor("5-4");
        Expression temp = input.processInput();
        assert temp.compute() == 1.0;
    }
    @Test
    public void multiplication() {
        InputProcessor input = new InputProcessor("5*4");
        Expression temp = input.processInput();
        assert temp.compute() == 20.0;
    }
    @Test
    public void division() {
        InputProcessor input = new InputProcessor("10/5");
        Expression temp = input.processInput();
        assert temp.compute() == 2.0;
    }


}