package UseCase.LinAlg;

import Entity.Fraction;
import Entity.Matrix;

import java.util.*;

public class BuildMatrix {

    /**
     * This method created a matrix with the help of the helper method
     *
     * @return Matrix
     */
    private final String[] matrix;

    public BuildMatrix(String[] m){
        this.matrix = m;
    }

    public Matrix createMatrix() {

        Matrix m = new Matrix();
        m.setMatrix(helper());

        return m;


    }

    /**
     * This method takes in the users matrix split, reads the matrix and places
     * it into a nested ArrayList which will be used to create a matrix.
     *
     * @return ArrayList<ArrayList < Fraction>> - returns the input for Matrix entity
     */
    public ArrayList<ArrayList<Fraction>> helper() {

        int x = 1;
        ArrayList<ArrayList<Fraction>> matri = new ArrayList<>();
        while (x < matrix.length - 1) {
            if (Objects.equals(matrix[x], "[")) {
                x++;
                ArrayList<Fraction> inner = new ArrayList<>();
                while (!matrix[x].equals("]")) {
                    if (matrix[x].equals(",")) {
                        x++;
                    } else if (matrix[x + 1].equals(",") || matrix[x + 1].equals("]") ) {
                        int first = Integer.parseInt(matrix[x]);
                        Fraction input = new Fraction(first, 1);
                        inner.add(input);
                        x++;
                    } else if (matrix[x + 1].equals("/")){
                        int first = Integer.parseInt(matrix[x]);
                        int second = Integer.parseInt(matrix[x + 2]);
                        Fraction test = new Fraction(first, second);
                        inner.add(test);
                        x++;
                        x++;
                        x++;
                    }
                }
                matri.add(inner);
            }
            else{
                x++;
            }
        }
        return matri;
    }
}