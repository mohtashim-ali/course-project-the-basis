package UseCase;

import Entity.Matrix;
import java.util.*;

public class ComputeMatrix {

//    private Matrix matrix;
//    private BuildMatrix m;
//
//    public void setMatrix(Matrix matrix){
//        this.matrix = matrix;
//    }

    public void computeMatrix(){

        BuildMatrix m = new BuildMatrix();


        Matrix matrix = new Matrix(m.buildMatrix());

        Scanner choice = new Scanner(System.in);

        System.out.println("Please select a matrix operation: ");
        System.out.println("1. RREF");
        System.out.println("2. Temp");

        int input = choice.nextInt();
        if (input == 1){
            System.out.println(matrix.RREF());
        }

    }


}
