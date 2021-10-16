import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addition() {
        WebProcessor input = new WebProcessor("5-4");
        Expression temp = input.processInput();
        assert temp.compute() == 1.0;

    }


}
