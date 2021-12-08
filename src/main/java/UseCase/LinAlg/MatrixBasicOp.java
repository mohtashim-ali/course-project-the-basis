package UseCase.LinAlg;

import Entity.Fraction;
import Entity.Matrix;

import java.util.ArrayList;

public interface MatrixBasicOp {
    ArrayList<ArrayList<Fraction>> basicMatrixCompute(Matrix matrix1, Matrix matrix2);
}
