import Entity.Trigonometry;
import UseCase.BasicOperations.*;
import org.junit.Test;
import UseCase.BasicOperations.ExpressionException;

public class TrigonometryTest {

    /**
     * Tests basic sin function with multiple digit numbers
     */
    @Test
    public void testSin() {
        double input = new Trigonometry().computeSin(90);
        System.out.println(input);
        assert input == 0.894;
    }
    /**
     * Tests basic cos function with single multiple digit numbers
     */
    @Test
    public void testCos(){
        double input = new Trigonometry().computeCos(270);
        System.out.println(input);
        assert input == 0.9844;
    }
    /**
     * Tests basic tan function with single multiple digit numbers
     */
    @Test
    public void testTan() {
        double input = new Trigonometry().computeTan(80);
        System.out.println(input);
        assert input == 9.0027;
    }
    /**
     * Tests basic csc function with single multiple digit numbers
     */
    @Test
    public void testCsc() {
        double input = new Trigonometry().computeCsc(240);
        System.out.println(input);
        assert input == 1.0578;
    }
    /**
     * Tests basic sec function with single multiple digit numbers
     */
    @Test
    public void testSec() {
        double input = new Trigonometry().computeSec(180);
        System.out.println(input);
        assert input == -1.6708;
    }
    /**
     * Tests basic cot function with single multiple digit numbers
     */
    @Test
    public void testCot() {
        double input = new Trigonometry().computeCot(360);
        System.out.println(input);
        assert input == -0.2959;
    }

}
