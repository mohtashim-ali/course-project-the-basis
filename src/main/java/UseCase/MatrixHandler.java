package UseCase;

import Entity.Fraction;
import Entity.Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MatrixHandler {
    /**
     * Creates a matrix.
     */

    ArrayList<ArrayList<Fraction>> matrix;

    /**
     * @param matrix double[][]
     */
    public MatrixHandler(ArrayList<ArrayList<Fraction>> matrix) {
        this.matrix = matrix;
    }

    /**
     * Adds 2 matrices
     *
     * @param other
     * @return
     */
    public ArrayList<ArrayList<Fraction>> addMatrix(Matrix other) {
        if (this.matrix.size() == other.matrix.size()) {
            for (int i=0; i<this.matrix.size(); i++) {
                for (int j=0; j<this.matrix.get(i).size(); j++) {
                    this.matrix.get(i).get(j).add(other.matrix.get(i).get(j));
                }
            }
        }
        return this.matrix;
    }

    /**
     * Substracts 2 matrices
     *
     * @param other
     * @return
     */
    public ArrayList<ArrayList<Fraction>> substractMatrix(Matrix other) {
        if (this.matrix.size() == other.matrix.size()) {
            for (int i=0; i<this.matrix.size(); i++) {
                for (int j=0; j<this.matrix.get(i).size(); j++) {
                    this.matrix.get(i).get(j).substract(other.matrix.get(i).get(j));
                }
            }
        }
        return this.matrix;
    }

    /**
     * Adds row2 to row1.
     *
     * @param row1
     * @param row2
     * @return
     */
    public ArrayList<Fraction> rowAdd(ArrayList<Fraction> row1, ArrayList<Fraction> row2) {
        ArrayList<Fraction> new_row = new ArrayList<>();
        for (int i = 0; i < row1.size(); i++) {
            new_row.add(row1.get(i).add(row2.get(i)));
        }
        return new_row;
    }

    /**
     * Adds scalar * row2 to row1.
     *
     * @param indexRow1
     * @param indexRow2
     * @param scalar
     * @return
     */
    public ArrayList<ArrayList<Fraction>> addScalarMult(int indexRow1, int indexRow2, Fraction scalar) {
        for (int i = 0; i < this.matrix.get(indexRow1).size(); i++) {
            this.matrix.get(indexRow1).set(i, scalar.multiply(this.matrix.get(indexRow2).get(i)));
        }
        return this.matrix;
    }

    /**
     * Swaps 2 rows in a given matrix.
     *
     * @param indexRow1
     * @param indexRow2
     * @return
     */
    public ArrayList<ArrayList<Fraction>> rowSwap(int indexRow1, int indexRow2) {
        ArrayList<Fraction> temp1 = this.matrix.get(indexRow1);
        ArrayList<Fraction> temp2 = this.matrix.get(indexRow2);
        this.matrix.set(indexRow1, temp2);
        this.matrix.set(indexRow2, temp1);
        return this.matrix;
    }

    public ArrayList<Fraction> scalMult(ArrayList<Fraction> row, Fraction scalar) {
        ArrayList<Fraction> new_row = new ArrayList<>();
        for (int i = 0; i < row.size(); i++) {
            new_row.add(i, row.get(i).multiply(scalar));
        }
        return new_row;
    }

    /**
     * Returns the inverse of this matrix.
     *
     * @param row
     * @return
     */
    public boolean rowOfZeros(ArrayList<Fraction> row) {
        for (Fraction fraction : row) {
            if (fraction.numerator != 0) {
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
        for (ArrayList<Fraction> i : this.matrix) {
            if (!rowOfZeros(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean startsWithZero(ArrayList<Fraction> row) {
        if (row.get(0).getNumerator() == 0){
            return true;
        }
        return false;
    }

    /**
     * Returns the RREF of this matrix.
     *
     * @return
     */
    public ArrayList<ArrayList<Fraction>> RREF() {

        if (zeroMatrix()) {
            return this.matrix;
        }

        for (int i = 0; i < this.matrix.size(); i++) {
            if (rowOfZeros(this.matrix.get(i))) {
                moveZerosToBottom(i);
            }
        }
        for (int k = 0; k < this.matrix.size(); k++) {
            ArrayList<Fraction> curr_row = this.matrix.get(k);
            if (!rowOfZeros(curr_row)) {
                Fraction value = curr_row.get(k);
                if (this.startsWithZero(curr_row)) {
                    for (int j = k; j < this.matrix.size() - k - 1; j++) {
                        rowSwap(j, j + 1);
                    }
                }
                curr_row = this.matrix.get(k);
                value = curr_row.get(k);
                List<Fraction> sublist = curr_row.subList(k, curr_row.size());
                if (this.startsWithZero(new ArrayList<>(sublist))){
                    continue;
                }
                curr_row = scalMult(curr_row, new Fraction(value.getDenominator(), value.getNumerator()));
                this.matrix.set(k, curr_row);
                for (int j = 0; j < this.matrix.size(); j++) {
                    if (j != k) {
                        ArrayList<Fraction> added_row;
                        ArrayList<Fraction> other_row = this.matrix.get(j);
                        Fraction multiple = other_row.get(k);
                        ArrayList<Fraction> scaleRow = scalMult(curr_row, multiple.multiply(new Fraction(-1, 1)));
                        added_row = rowAdd(other_row, scaleRow);
                        this.matrix.set(j, added_row);
                    }
                }
            }
        }
        return this.matrix;
    }


    /**
     * Returns the inverse of this matrix.
     *
     * @return
     */
    public ArrayList<ArrayList<Fraction>> inverse() {
        int n = 0;
        int m = 0;
        for (ArrayList<Fraction> i : this.matrix) {
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
        Matrix ans = new Matrix(this.matrix);
        return ans.RREF();
    }


//    @Override
//    public String toString() {
//        StringBuilder final_string = new StringBuilder("[[");
//        for (int i = 0; i < this.matrix.size(); i++) {
//            for (int j = 0; j < this.matrix.get(i).size(); j++) {
//                if (j != this.matrix.get(i).size() - 1) {
//                    final_string.append(this.matrix.get(i).get(j).toString()).append(", ");
//                } else {
//                    final_string.append(this.matrix.get(i).get(j).toString()).append("],").append("\n").append("[");
//                }
//            }
//        }
//        return final_string.toString().substring(0, final_string.length() - 3) + "]";
//    }


    public Fraction determinant() {
        if (this.matrix.size() == 2 && this.matrix.get(0).size() == 2) {
            Fraction a, b, c, d;
            a = this.matrix.get(0).get(0);
            b = this.matrix.get(0).get(1);
            c = this.matrix.get(1).get(0);
            d = this.matrix.get(1).get(1);
            return a.multiply(d).substract(b.multiply(c));
        } else {
            Fraction determinant = new Fraction(0, 1);
            ArrayList<Fraction> row = this.matrix.get(0);
            int n = 0;
            while (n < this.matrix.size()){
                ArrayList<ArrayList<Fraction>> temp = new ArrayList<>();
                for (int i = 1; i < this.matrix.size(); i++) {
                    ArrayList<Fraction> temp_row = new ArrayList<>();
                    for (int j = 0; j < this.matrix.size(); j++) {
                        if (j != n){
                            temp_row.add(this.matrix.get(i).get(j));
                        }
                    }
                    temp.add(temp_row);
                }
                Matrix m = new Matrix(temp);
                if (n % 2 == 0) {
                    determinant.add(row.get(n).multiply(m.determinant()));
                } else {
                    determinant.substract(row.get(n).multiply(m.determinant()));
                }
                n += 1;
            }
            return determinant;
        }
    }

}

