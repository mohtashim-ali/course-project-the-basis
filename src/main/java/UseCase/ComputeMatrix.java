package UseCase;

import Entity.Matrix;
import java.util.*;

public class ComputeMatrix {

    public void computeMatrix(){

        BuildMatrix m = new BuildMatrix();

        System.out.println("Please type in a square matrix using brackets: ");

        Matrix matrix = m.createMatrix();
        Scanner choice = new Scanner(System.in);

        System.out.println("Please select a matrix operation: ");
        System.out.println("1. RREF");
        System.out.println("2. Add a matrix");
        System.out.println("3. Substract a matrix");

        int input = choice.nextInt();
        if (input == 1){
            System.out.println(matrix.RREF());
        } else if (input == 2) {
            BuildMatrix other = new BuildMatrix();
            System.out.println("Please type in a second matrix");
            Matrix matrix2 = other.createMatrix();
            System.out.println(matrix.addMatrix(matrix2));
        } else if (input == 3) {
            BuildMatrix other = new BuildMatrix();
            System.out.println("Please type in a second matrix");
            Matrix matrix2 = other.createMatrix();
            System.out.println(matrix.substractMatrix(matrix2));
        }

    }


}
