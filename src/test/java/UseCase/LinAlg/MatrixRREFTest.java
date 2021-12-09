package UseCase.LinAlg;

import Entity.Fraction;
import Entity.Matrix;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MatrixRREFTest {

    /**
     * Row reducing a matrix of 0s
     */
    @Test
    public void zeroMatrixTest() {
        BuildMatrix n = new BuildMatrix("[[0,0],[0,0]]".split(""));
        Matrix zeroMatrix = n.createMatrix();
        MatrixRREF matrixRREF = new MatrixRREF();
        matrixRREF.setMatrix(zeroMatrix);
        Matrix rrefMatrix = new Matrix();
        rrefMatrix.setMatrix(matrixRREF.compute());
        System.out.println(rrefMatrix.getMatrix() == zeroMatrix.getMatrix());
        System.out.println(zeroMatrix.getMatrix());
        assertEquals(rrefMatrix.getMatrix(), zeroMatrix.getMatrix());
    }

    /**
     * Square matrix
     */
    @Test
    public void SquareMatrixTest() {
        BuildMatrix m = new BuildMatrix("[[3,4],[2,1]]".split(""));
        Matrix test = m.createMatrix();
        MatrixRREF matrixRREF = new MatrixRREF();
        BuildMatrix m2 = new BuildMatrix("[[1,0],[0,1]]".split(""));
        Matrix expected = m2.createMatrix();
        matrixRREF.setMatrix(test);
        System.out.println(expected.getMatrix());
        System.out.println(matrixRREF.compute());
        assertEquals(expected.getMatrix().toString(), matrixRREF.compute().toString());
    }

}
