package UseCase.LinAlg;

import Entity.Matrix;
import Entity.Trigonometry;
import junit.framework.TestCase;
import org.junit.Test;

public class MatrixAddTest {

    @Test
    public void testMatrixAdd() {

        BuildMatrix n = new BuildMatrix("[[1,2],[3,4]]".split(""));
        Matrix one = n.createMatrix();
        BuildMatrix v = new BuildMatrix("[[2,2],[2,2]]".split(""));
        Matrix two = v.createMatrix();
        MatrixAdd add = new MatrixAdd();
        BuildMatrix m = new BuildMatrix("[[3, 4], [5, 6]]".split(""));
        Matrix expected = m.createMatrix();
        System.out.println(add.basicMatrixCompute(one, two));
        System.out.println(expected.getMatrix());
        assert(add.basicMatrixCompute(one, two) == expected.getMatrix());
    }

}