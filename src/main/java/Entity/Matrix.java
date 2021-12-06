package Entity;

import UseCase.LinAlg.MatrixHandler;

import java.util.ArrayList;

public class Matrix extends MatrixHandler {
    /**
     Creates a matrix.
     */

    public ArrayList<ArrayList<Fraction>> matrix;

    /**
     *
     * @param matrix int[][]
     */
    public Matrix(ArrayList<ArrayList<Fraction>> matrix) {
        super(matrix);
    }
}
