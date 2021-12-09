package UseCase.LinAlg;

import Entity.Fraction;
import Entity.Matrix;

import java.util.*;

public class ComputeMatrix {


    public ArrayList<ArrayList<Fraction>> computeMatrix(){

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please type in a square matrix using brackets: ");
        String in = input1.nextLine();
        BuildMatrix m = new BuildMatrix(in.split(""));

        Matrix matrix_1 = m.createMatrix();
        Scanner choice = new Scanner(System.in);

        System.out.println("Please select a matrix operation: ");
        System.out.println("1. RREF");
        System.out.println("2. Add a matrix");
        System.out.println("3. Subtract a matrix");

        int input = choice.nextInt();
        if (input == 1){
            MatrixRREF ref = new MatrixRREF();
            ref.setMatrix(matrix_1);
            System.out.println(ref.compute());
            return ref.compute();
        } else if (input == 2) {
            System.out.println("Please type in a second matrix");
            String in1 = input1.nextLine();
            BuildMatrix m1 = new BuildMatrix(in1.split(""));
            Matrix matrix2 = m1.createMatrix();
            MatrixAdd add = new MatrixAdd();
            System.out.println(add.basicMatrixCompute(matrix_1, matrix2));
            return add.basicMatrixCompute(matrix_1, matrix2);
        } else if (input == 3) {
            System.out.println("Please type in a second matrix");
            String in1 = input1.nextLine();
            BuildMatrix m1 = new BuildMatrix(in1.split(""));
            Matrix matrix2 = m1.createMatrix();
            MatrixSubtract sub = new MatrixSubtract();
            System.out.println(sub.basicMatrixCompute(matrix_1, matrix2));
            return sub.basicMatrixCompute(matrix_1, matrix2);
        }

        return null;
    }


}
