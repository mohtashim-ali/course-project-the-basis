package UseCase;

import Entity.Matrix;

import java.util.*;

public class BuildMatrix {

    private int rows;
    private int cols;


    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int[][] buildMatrix(){
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.println("Please enter the number of columns: ");
        int cols = input.nextInt();
        System.out.println("Your matrix size is " + rows + " x " + cols);

        int[][] matrix = new int[rows][cols];

        for (int x = 0; x < rows; x ++){
            for (int y = 0; y < cols; y ++){
                System.out.println("Please enter the value of your matrix at row" + x + "and column" + y);
                matrix[x][y] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        BuildMatrix m = new BuildMatrix();
    }
}
