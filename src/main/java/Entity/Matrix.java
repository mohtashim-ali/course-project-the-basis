package Entity;

import java.util.ArrayList;

public class Matrix {
    /**
     Creates a matrix.
     */

    private ArrayList<ArrayList<Fraction>> matrix;

    public ArrayList<ArrayList<Fraction>> getMatrix() {
        return matrix;
    }

    public void setMatrix(ArrayList<ArrayList<Fraction>> matrix) {
        this.matrix = matrix;
    }
}
