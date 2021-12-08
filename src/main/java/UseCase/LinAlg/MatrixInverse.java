package UseCase.LinAlg;

import Entity.Fraction;
import Entity.Matrix;

import java.util.*;

public class MatrixInverse implements MatrixOperation {

    private final Matrix matrix;

    public MatrixInverse(Matrix matrix) {
        this.matrix = matrix;
    }

    /**
     * Returns the inverse of this matrix.
     *
     * @return ArrayList<ArrayList<Fraction>>
     */

    @Override
    public ArrayList<ArrayList<Fraction>> compute() {
        int n = 0;
        int m = 0;
        for (ArrayList<Fraction> i : matrix.getMatrix()) {
            if (i.size() == 2 & n == 0) {
                i.add(new Fraction(1, 1).add(new Fraction(n, 1)));
                n = 1;
            } else if (i.size() == 2 & n == 1) {
                i.add(new Fraction(0, n).add(new Fraction(n, n)));
            } else if (i.size() == 3 & m == 0) {
                i.add(new Fraction(1, 1).add(new Fraction(m, 1).add(new Fraction(m, 1))));
                m = 1;
            } else if (i.size() == 3 & m == 1) {
                i.add(new Fraction(0, m).add(new Fraction(m, m)).add(new Fraction(m, 0)));
                m = 2;
            } else if (i.size() == 3 & m == 2) {
                i.add(new Fraction(0, m).add(new Fraction(0, 1).add(new Fraction(1, 1))));
            }
        }
        Matrix ans1 = new Matrix();
        ans1.setMatrix(matrix.getMatrix());
        MatrixHandler ans = new MatrixHandler(ans1.getMatrix());
        return ans.RREF();
    }
}
