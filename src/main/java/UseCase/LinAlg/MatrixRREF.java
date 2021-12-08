package UseCase.LinAlg;

import Entity.Fraction;
import Entity.Matrix;

import java.util.ArrayList;
import java.util.List;

public class MatrixRREF implements MatrixOperation {

    private Matrix matrix;

    /**
     * Returns the RREF of this matrix.
     *
     * @return ArrayList<ArrayList<Fraction>>
     */

    @Override
    public ArrayList<ArrayList<Fraction>> compute() {

        if (zeroMatrix()) {
            return matrix.getMatrix();
        }

        for (int i = 0; i < matrix.getMatrix().size(); i++) {
            if (rowOfZeros(matrix.getMatrix().get(i))) {
                moveZerosToBottom(i);
            }
        }
        for (int k = 0; k < matrix.getMatrix().size(); k++) {
            ArrayList<Fraction> curr_row = matrix.getMatrix().get(k);
            if (!rowOfZeros(curr_row)) {
                Fraction value = curr_row.get(k);
                if (this.startsWithZero(curr_row)) {
                    for (int j = k; j < matrix.getMatrix().size() - k - 1; j++) {
                        rowSwap(j, j + 1);
                    }
                }
                curr_row = matrix.getMatrix().get(k);
                value = curr_row.get(k);
                List<Fraction> sublist = curr_row.subList(k, curr_row.size());
                if (this.startsWithZero(new ArrayList<>(sublist))) {
                    continue;
                }
                curr_row = scalMult(curr_row, new Fraction(value.getDenominator(), value.getNumerator()));
                matrix.getMatrix().set(k, curr_row);
                for (int j = 0; j < matrix.getMatrix().size(); j++) {
                    if (j != k) {
                        ArrayList<Fraction> added_row;
                        ArrayList<Fraction> other_row = matrix.getMatrix().get(j);
                        Fraction multiple = other_row.get(k);
                        ArrayList<Fraction> scaleRow = scalMult(curr_row, multiple.multiply(new Fraction(-1, 1)));
                        added_row = rowAdd(other_row, scaleRow);
                        matrix.getMatrix().set(j, added_row);
                    }
                }
            }
        }
        return matrix.getMatrix();
    }

    /**
     * Checks if the row starts with a zero
     *
     * @param row The row being checked
     */

    public boolean startsWithZero(ArrayList<Fraction> row) {
        return row.get(0).getNumerator() == 0;
    }

    /**
     * Checks if the matrix is a matrix of zeros
     *
     * @return boolean
     */

    public boolean zeroMatrix() {
        for (ArrayList<Fraction> i : matrix.getMatrix()) {
            if (!rowOfZeros(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Moves row to the bottom of the matrix
     *
     * @param index Index of current row
     */

    public void moveZerosToBottom(int index) {
        int curr_row = index;
        for (int j = 0; j < matrix.getMatrix().size() - index - 1; j++) {
            rowSwap(curr_row, curr_row + 1);
            curr_row += 1;
        }
    }

    /**
     * Returns the inverse of this matrix.
     *
     * @param row Given row
     * @return boolean
     */
    public boolean rowOfZeros(ArrayList<Fraction> row) {
        for (Fraction fraction : row) {
            if (fraction.numerator != 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Fraction> scalMult(ArrayList<Fraction> row, Fraction scalar) {
        ArrayList<Fraction> new_row = new ArrayList<>();
        for (int i = 0; i < row.size(); i++) {
            new_row.add(i, row.get(i).multiply(scalar));
        }
        return new_row;
    }

    /**
     * Swaps 2 rows in a given matrix.
     *
     * @param indexRow1 Index of first row
     * @param indexRow2 Index of second row
     */
    public void rowSwap(int indexRow1, int indexRow2) {
        ArrayList<Fraction> temp1 = matrix.getMatrix().get(indexRow1);
        ArrayList<Fraction> temp2 = matrix.getMatrix().get(indexRow2);
        matrix.getMatrix().set(indexRow1, temp2);
        matrix.getMatrix().set(indexRow2, temp1);
    }

    /**
     * Adds row2 to row1.
     *
     * @param row1 First row
     * @param row2 Second row
     * @return ArrayList<Fraction>
     */
    public ArrayList<Fraction> rowAdd(ArrayList<Fraction> row1, ArrayList<Fraction> row2) {
        ArrayList<Fraction> new_row = new ArrayList<>();
        for (int i = 0; i < row1.size(); i++) {
            new_row.add(row1.get(i).add(row2.get(i)));
        }
        return new_row;
    }
}
