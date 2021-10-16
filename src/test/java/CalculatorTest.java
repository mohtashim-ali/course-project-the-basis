import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addition() {
        InputProcessor input = new InputProcessor("5+4");
        Expression temp = input.processInput();
        assert temp.compute() == 9.0;
    }
    @Test
    public void subtraction() {
        InputProcessor input = new InputProcessor("5-4");
        Expression temp = input.processInput();
        assert temp.compute() == 1.0;
    }



}
