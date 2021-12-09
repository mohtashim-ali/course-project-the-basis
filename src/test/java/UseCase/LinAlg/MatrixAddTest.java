package UseCase.LinAlg;

import Entity.Matrix;
import Entity.Trigonometry;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixAddTest {

    @Test
    public void testMatrixAdd() {
        BuildMatrix n = new BuildMatrix("[[1,2],[3,4]]".split(""));
        Matrix one = n.createMatrix();
        BuildMatrix v = new BuildMatrix("[[2,2],[2,2]]".split(""));
        Matrix two = v.createMatrix();
        MatrixAdd add = new MatrixAdd();
        System.out.println(add.basicMatrixCompute(one, two));
        assertEquals(add.basicMatrixCompute(one, two).toString(), "[[5/1, 6/1], [7/1, 8/1]]");
    }

}