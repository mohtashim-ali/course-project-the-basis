package UseCase.LinAlg;

import Entity.Fraction;
import Entity.Matrix;

import java.util.*;

public class ComputeMatrix {


    public ArrayList<ArrayList<Fraction>> computeMatrix(){

        BuildMatrix m = new BuildMatrix();

        System.out.println("Please type in a square matrix using brackets: ");

        Matrix matrix_1 = m.createMatrix();
        MatrixHandler matrix = new MatrixHandler(matrix_1.getMatrix());
        Scanner choice = new Scanner(System.in);

        System.out.println("Please select a matrix operation: ");
        System.out.println("1. RREF");
        System.out.println("2. Add a matrix");
        System.out.println("3. Subtract a matrix");

        int input = choice.nextInt();
        if (input == 1){
            System.out.println(matrix.RREF());
            return matrix.RREF();
        } else if (input == 2) {
            BuildMatrix other = new BuildMatrix();
            System.out.println("Please type in a second matrix");
            Matrix matrix2 = other.createMatrix();
            MatrixAdd add = new MatrixAdd();
            System.out.println(add.basicMatrixCompute(matrix_1, matrix2));
            return add.basicMatrixCompute(matrix_1, matrix2);
        } else if (input == 3) {
            BuildMatrix other = new BuildMatrix();
            System.out.println("Please type in a second matrix");
            Matrix matrix2 = other.createMatrix();
            MatrixAdd sub = new MatrixAdd();
            System.out.println(sub.basicMatrixCompute(matrix_1, matrix2));
            return sub.basicMatrixCompute(matrix_1, matrix2);
        }

        return null;
    }


}
