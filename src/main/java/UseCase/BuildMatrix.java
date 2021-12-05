package UseCase;

import Entity.Fraction;
import Entity.Matrix;

import java.util.*;

public class BuildMatrix {

    /**
     * This method created a matrix with the help of the helper method
     *
     * @return Matrix
     */

    public Matrix createMatrix() {


        Scanner input = new Scanner(System.in);

        String clean = input.nextLine().replaceAll(" ", "");

        String[] matrix = clean.split("");

        return new Matrix(helper(matrix));


    }

    /**
     * This method takes in the users matrix split, reads the matrix and places
     * it into a nested ArrayList which will be used to create a matrix.
     *
     * @param matrix - Contains the input matrix split into an array
     * @return ArrayList<ArrayList < Fraction>> - returns the input for Matrix entity
     */
    public ArrayList<ArrayList<Fraction>> helper(String[] matrix) {

        int x = 1;
        ArrayList<ArrayList<Fraction>> matri = new ArrayList<>();
        while (x < matrix.length) {
            if (Objects.equals(matrix[x], "[")) {
                x++;
                ArrayList<Fraction> inner = new ArrayList<>();
                while (!matrix[x].equals("]")) {
                    if (!matrix[x].equals(",") && !matrix[x].equals("]")) {
                        if ((matrix[x + 1].equals(","))) {
                            int first = Integer.parseInt(matrix[x]);
                            Fraction test = new Fraction(first, 1);
                            inner.add(test);
                            x += 1;

                        } else {
                            int first = Integer.parseInt(matrix[x]);
                            int second = Integer.parseInt(matrix[x + 2]);
                            Fraction test = new Fraction(first, second);
                            inner.add(test);
                            x += 3;
                        }
                        matri.add(inner);
                    } else {
                        x++;
                    }
                }
                return matri;

            }
        }
        return matri;
    }
}