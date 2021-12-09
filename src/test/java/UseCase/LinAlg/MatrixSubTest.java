package UseCase.LinAlg;

import Entity.Fraction;
import Entity.Matrix;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class MatrixSubTest {
    /**
     * Subtract 2x2 matrix
     */
    @Test
    public void testMatrixSubtract() {

        BuildMatrix n = new BuildMatrix("[[1,2],[3,4]]".split(""));
        Matrix one = n.createMatrix();
        BuildMatrix v = new BuildMatrix("[[2,2],[2,2]]".split(""));
        Matrix two = v.createMatrix();
        MatrixSubtract sub = new MatrixSubtract();
        assert (Objects.equals(sub.basicMatrixCompute(one, two).toString(), "[[-1/1, 0/1], [1/1, 2/1]]"));
    }

    /**
     * Subtract 3x3 matrix
     */
    @Test
    public void testMatrixSubtract2() {

        BuildMatrix n = new BuildMatrix("[[1,2],[3,4],[1,3]".split(""));
        Matrix one = n.createMatrix();
        BuildMatrix v = new BuildMatrix("[[2,2],[2,2],[9,0]".split(""));
        Matrix two = v.createMatrix();
        MatrixSubtract sub = new MatrixSubtract();
        System.out.println(sub.basicMatrixCompute(one, two));
        assertEquals(sub.basicMatrixCompute(one, two).toString(), "[[-3/1, -2/1], [-1/1, 0/1], [-17/1, 3/1]]");
    }

    /**
     * Subtract 3x3 zero matrix
     */
    @Test
    public void testMatrixSubtract3() {

        BuildMatrix n = new BuildMatrix("[[0,0],[0,0],[0,0]".split(""));
        Matrix one = n.createMatrix();
        BuildMatrix v = new BuildMatrix("[[0,0],[0,0],[0,0]".split(""));
        Matrix two = v.createMatrix();
        MatrixSubtract sub = new MatrixSubtract();
        System.out.println(sub.basicMatrixCompute(one, two));
        assert (Objects.equals(sub.basicMatrixCompute(one, two).toString(), "[[0/1, 0/1], [0/1, 0/1], [0/1, 0/1]]"));
    }

    /**
     * Subtract 3x3 matrix identity
     */
    @Test
    public void testMatrixSubtract5() {

        BuildMatrix n = new BuildMatrix("[[1,0],[1,0],[1,0]".split(""));
        Matrix one = n.createMatrix();
        BuildMatrix v = new BuildMatrix("[[0,1],[0,1],[0,1]".split(""));
        Matrix two = v.createMatrix();
        MatrixSubtract sub = new MatrixSubtract();
        System.out.println(sub.basicMatrixCompute(one, two));
        assertEquals(sub.basicMatrixCompute(one, two).toString(), "[[1/1, -2/1], [1/1, -2/1], [1/1, -2/1]]");
    }
}

