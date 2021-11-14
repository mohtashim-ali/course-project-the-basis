import java.util.ArrayList;
import java.util.Arrays;

public class MatrixHandler {
    /**
     * Creates a matrix.
     */

    ArrayList<ArrayList<Double>> matrix;

    /**
     * @param matrix double[][]
     */
    public MatrixHandler(ArrayList<ArrayList<Double>> matrix) {
        this.matrix = matrix;
    }

    /**
     * Adds 2 matrices
     *
     * @param other
     * @return
     */
    public Matrix add(Matrix other) {
        // todo
        return null;
    }

    /**
     * Substracts 2 matrices
     *
     * @param other
     * @return
     */
    public Matrix substract(Matrix other) {
        // todo
        return null;
    }

    /**
     * Multiples the matrix by a scalar.
     *
     * @param scalar
     */
    public void scalarMult(double scalar) {
        for (int i = 0; i < this.matrix.size(); i++) {
            for (int j = 0; j < this.matrix.get(i).size(); j++) {
                double temp = scalar * this.matrix.get(i).get(j);
                this.matrix.get(i).set(j, temp);
            }
        }
    }

    /**
     * Adds row2 to row1.
     *
     * @param row1
     * @param row2
     * @return
     */
    public void rowAdd(int row1, int row2) {
        for (int i = 0; i < this.matrix.get(row1).size(); i++) {
            this.matrix.get(row1 - 1).set(i, this.matrix.get(row2 - 1).get(i));
        }
    }

    /**
     * Adds scalar * row2 to row1.
     *
     * @param row1
     * @param row2
     * @param scalar
     * @return
     */
    public void addScalarMult(int row1, int row2, double scalar) {
        for (int i = 0; i < this.matrix.get(row1).size(); i++) {
            this.matrix.get(row1 - 1).set(i, scalar * this.matrix.get(row2 - 1).get(i));
        }
    }

    /**
     * Swaps 2 rows in a given matrix.
     *
     * @param row1
     * @param row2
     * @return
     */
    public void rowSwap(int row1, int row2) {
        ArrayList<Double> temp1 = this.matrix.get(row1 - 1);
        ArrayList<Double> temp2 = this.matrix.get(row2 - 1);
        this.matrix.set(row1 - 1, temp2);
        this.matrix.set(row2 - 1, temp1);
    }

    /**
     * Returns the RREF of this matrix.
     *
     * @return
     */
    public Matrix RREF() {
        return null;
    }

    /**
     * Returns the inverse of this matrix.
     *
     * @return
     */
    public Matrix inverse() {
        // todo
        return null;
    }

    @Override
    public String toString() {
        StringBuilder final_string = new StringBuilder("[[");
        for (int i = 0; i < this.matrix.size(); i++) {
            for (int j = 0; j < this.matrix.get(i).size(); j++) {
                if (j != this.matrix.get(i).size() - 1) {
                    final_string.append(this.matrix.get(i).get(j)).append(", ");
                } else {
                    final_string.append(this.matrix.get(i).get(j)).append("],").append("\n").append("[");
                }
            }
        }
        return final_string.toString().substring(0, final_string.length() - 3) + "]";
    }

    public double determinant() {
        if (this.matrix.size() == 2 && this.matrix.get(0).size() == 2) {
            double a, b, c, d;
            a = this.matrix.get(0).get(0);
            b = this.matrix.get(0).get(1);
            c = this.matrix.get(1).get(0);
            d = this.matrix.get(1).get(1);
            return a * d - b * c;
        } else {
            double determinant = 0;
            ArrayList<Double> row = this.matrix.get(0);
            int n = 0;
            while (n < this.matrix.size()){
                ArrayList<ArrayList<Double>> temp = new ArrayList<>();
                for (int i = 1; i < this.matrix.size(); i++) {
                    ArrayList<Double> temp_row = new ArrayList<>();
                    for (int j = 0; j < this.matrix.size(); j++) {
                        if (j != n){
                            temp_row.add(this.matrix.get(i).get(j));
                        }
                    }
                    temp.add(temp_row);
                }
                Matrix m = new Matrix(temp);
                if (n % 2 == 0) {
                    determinant += row.get(n) * m.determinant();
                } else {
                    determinant -= row.get(n) * m.determinant();
                }
                n += 1;
            }
            return determinant;
        }
    }
}

