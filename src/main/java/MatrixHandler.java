import MATLAB;
public class MatrixHandler {
    /**
     Creates a matrix.
     */

    double[][] matrix;

    /**
     *
     * @param matrix double[][]
     */
    public MatrixHandler(double[][] matrix) {
        this.matrix = matrix;
    }

    public static void main(String[] args) {
        double[][] new_matrix = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        Matrix temp = new Matrix(new_matrix);
    }

    /**
     * Adds 2 matrices
     * @param other
     * @return
     */
    public Matrix add(Matrix other) {
        // todo
        return null;
    }

    /**
     * Substracts 2 matrices
     * @param other
     * @return
     */
    public Matrix substract(Matrix other) {
        // todo
        return null;
    }

    /**
     * Multiples the matrix by a scalar.
     * @param scalar
     */
    public void scalarMult(double scalar) {
        for(int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                double temp = scalar * this.matrix[i][j];
                this.matrix[i][j] = temp;
            }
        }
    }

    /**
     * Adds row2 to row1.
     * @param row1
     * @param row2
     * @return
     */
    public void rowAdd(int row1, int row2) {
        for(int i = 0; i < this.matrix[row1].length; i++) {
            this.matrix[row1 - 1][i] += this.matrix[row2 - 1][i];
        }
    }

    /**
     * Adds scalar * row2 to row1.
     * @param row1
     * @param row2
     * @param scalar
     * @return
     */
    public void addScalarMult(int row1, int row2, double scalar) {
        for(int i = 0; i < this.matrix[row1].length; i++) {
            this.matrix[row1 - 1][i] += scalar * this.matrix[row2 - 1][i];
        }
    }

    /**
     * Swaps 2 rows in a given matrix.
     * @param row1
     * @param row2
     * @return
     */
    public void rowSwap(int row1, int row2) {
        double[] temp1 = this.matrix[row1 - 1];
        double[] temp2 = this.matrix[row2 - 1];
        this.matrix[row1 - 1] = temp2;
        this.matrix[row2 - 1] = temp1;
    }

    /**
     * Returns the RREF of this matrix.
     * @return
     */
    public Matrix RREF() {
        return null;
    }

    /**
     * Returns the inverse of this matrix.
     * @return
     */
    public Matrix inverse() {
        // todo
        return null;
    }

    @Override
    public String toString() {
        StringBuilder final_string = new StringBuilder("[[");
        for(int i = 0; i < this.matrix.length; i++) {
            for(int j=0; j < this.matrix[i].length; j++) {
                if(j != this.matrix[i].length - 1) {
                    final_string.append(this.matrix[i][j]).append(", ");
                } else {
                    final_string.append(this.matrix[i][j]).append("],").append("\n").append("[");
                }
            }
        }
        return final_string.toString().substring(0, final_string.length() - 3) + "]";
    }
}

