package UseCase;

import junit.framework.TestCase;

public class ParserTest extends TestCase {

    public void testValidity() {
        Parser p = new Parser("+33*444/");
        assertFalse(p.validity());
    }
}