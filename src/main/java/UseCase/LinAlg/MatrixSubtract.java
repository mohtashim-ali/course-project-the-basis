package UseCase.LinAlg;

import Entity.Fraction;
import Entity.Matrix;

import java.util.ArrayList;

public class MatrixSubtract implements MatrixBasicOp {

    /**
     * Subtracts 2 matrices
     *
     * @param matrix1 First matrix
     * @param matrix2 Second Matrix
     * @return ArrayList<ArrayList<Fraction>>
     */

    @Override
    public ArrayList<ArrayList<Fraction>> basicMatrixCompute(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getMatrix().size() == matrix2.getMatrix().size()) {
            for (int i=0; i< matrix1.getMatrix().size(); i++) {
                for (int j=0; j<matrix1.getMatrix().get(i).size(); j++) {
                    matrix1.getMatrix().get(i).set(j, matrix1.getMatrix().get(i).get(j).subtract(matrix2.getMatrix().get(i).get(j)));
                }
            }
        }
        return matrix1.getMatrix();
    }
}