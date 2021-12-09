package UseCase.LinAlg;

import Entity.Fraction;
import Entity.Matrix;

import java.util.*;

public class MatrixDeterminant implements MatrixDetInt {

    private final Matrix matrix;

    public MatrixDeterminant(Matrix matrix) {
        this.matrix = matrix;
    }

    /**
     * Returns the determinant of this matrix.
     *
     * @return Fraction
     */

    @Override
    public Fraction compute() {
        if (matrix.getMatrix().size() == 2 && matrix.getMatrix().get(0).size() == 2) {
            Fraction a, b, c, d;
            a = matrix.getMatrix().get(0).get(0);
            b = matrix.getMatrix().get(0).get(1);
            c = matrix.getMatrix().get(1).get(0);
            d = matrix.getMatrix().get(1).get(1);
            return a.multiply(d).subtract(b.multiply(c));
        } else {
            Fraction determinant = new Fraction(0, 1);
            ArrayList<Fraction> row = matrix.getMatrix().get(0);
            int n = 0;
            while (n < matrix.getMatrix().size()) {
                ArrayList<ArrayList<Fraction>> temp = new ArrayList<>();
                for (int i = 1; i < matrix.getMatrix().size(); i++) {
                    ArrayList<Fraction> temp_row = new ArrayList<>();
                    for (int j = 0; j < matrix.getMatrix().size(); j++) {
                        if (j != n) {
                            temp_row.add(matrix.getMatrix().get(i).get(j));
                        }
                    }
                    temp.add(temp_row);
                }
                Matrix m = new Matrix();
                m.setMatrix(temp);
                MatrixDeterminant control = new MatrixDeterminant(m);
                if (n % 2 == 0) {
                    determinant.add(row.get(n).multiply(control.compute()));
                } else {
                    determinant.subtract(row.get(n).multiply(control.compute()));
                }
                n += 1;
            }
            return determinant;
        }
    }
}
