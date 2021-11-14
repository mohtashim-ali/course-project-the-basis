import java.util.ArrayList;

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
     * Adds row2 to row1.
     * @param row1
     * @param row2
     * @return
     */
    public ArrayList<Double> rowAdd(ArrayList<Double> row1, ArrayList<Double> row2) {
        ArrayList<Double> new_row = new ArrayList<>();
        for(int i = 0; i < row1.size(); i++) {
            new_row.add(row1.get(i) + row2.get(i));
        }
        return new_row;
    }

    /**
     * Adds scalar * row2 to row1.
     * @param indexRow1
     * @param indexRow2
     * @param scalar
     * @return
     */
    public ArrayList<ArrayList<Double>> addScalarMult(int indexRow1, int indexRow2, double scalar) {
        for(int i = 0; i < this.matrix.get(indexRow1).size(); i++) {
            this.matrix.get(indexRow1).set(i, scalar * this.matrix.get(indexRow2).get(i));
        }
        return this.matrix;
    }

    /**
     * Swaps 2 rows in a given matrix.
     * @param indexRow1
     * @param indexRow2
     * @return
     */
    public ArrayList<ArrayList<Double>> rowSwap(int indexRow1, int indexRow2) {
        ArrayList<Double> temp1 = this.matrix.get(indexRow1);
        ArrayList<Double> temp2 = this.matrix.get(indexRow2);
        this.matrix.set(indexRow1, temp2);
        this.matrix.set(indexRow2, temp1);
        return this.matrix;
    }

    public ArrayList<Double> scalMult(ArrayList<Double> row, double scalar) {
        ArrayList<Double> new_row = new ArrayList<>();
        for (int i=0; i<row.size(); i++) {
            new_row.add(i, row.get(i)*scalar);
        }
        return new_row;
    }

    /**
     * Returns the inverse of this matrix.
     * @param row
     * @return
     */
    public boolean rowOfZeros(ArrayList<Double> row) {
        for (int i=0; i < row.size(); i++) {
            if (row.get(i) != 0) {
                return false;
            }
        }
        return true;
    }

    public void moveZerosToBottom(int index) {
        int curr_row = index;
        for (int j = 0; j < this.matrix.size() - index - 1; j++) {
            rowSwap(curr_row, curr_row + 1);
            curr_row += 1;
        }
    }

    public boolean zeroMatrix() {
        for (ArrayList<Double> doubles : this.matrix) {
            if (!rowOfZeros(doubles)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the RREF of this matrix.
     * @return
     */
    public ArrayList<ArrayList<Double>> RREF() {

        if (zeroMatrix()) {
            return this.matrix;
        }

        for (int i=0; i < this.matrix.size(); i++) {
            if (rowOfZeros(this.matrix.get(i))) {
                moveZerosToBottom(i);
            }
        }
        for (int k=0; k<this.matrix.size(); k++) {
            ArrayList<Double> curr_row = this.matrix.get(k);
            if (!rowOfZeros(curr_row)) {
                Double value = curr_row.get(k);
                curr_row = scalMult(curr_row, (1/value));
                this.matrix.set(k, curr_row);
                for (int j=0; j < this.matrix.size(); j++) {
                    if (j != k) {
                        ArrayList<Double> added_row;
                        ArrayList<Double> other_row = this.matrix.get(j);
                        double multiple = other_row.get(k);
                        ArrayList<Double> scaleRow = scalMult(curr_row, (multiple) * -1);
                        added_row = rowAdd(other_row, scaleRow);
                        this.matrix.set(j, added_row);
                    }
                }
            }
        }
        for (ArrayList<Double> doubles : this.matrix) {
            for (int m = 0; m < doubles.size(); m++) {
                if (doubles.get(m) == -0.0) {
                    doubles.set(m, 0.0);
                }
            }
        }


        return this.matrix;
    }


    /**
     * Returns the inverse of this matrix.
     * @return
     */
    public double [][] inverse() {
        // todo
        return null;
    }

    @Override
    public String toString() {
        StringBuilder final_string = new StringBuilder("[[");
        for(int i = 0; i < this.matrix.size(); i++) {
            for(int j = 0; j < this.matrix.get(i).size(); j++) {
                if(j != this.matrix.get(i).size() - 1) {
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

