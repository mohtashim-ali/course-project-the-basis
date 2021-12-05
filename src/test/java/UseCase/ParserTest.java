package UseCase;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

public class ParserTest extends TestCase {

    public void testParse() {
        Parser p = new Parser("3+4");
        assertEquals(p.parse(), new ArrayList<>(Arrays.asList(new StringType("3"), new OppType("+"), new StringType("4"))));
    }
}