package UseCase;

import Entity.Fraction;
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

    public ArrayList<ArrayList<Fraction>> buildMatrix(){
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.println("Please enter the number of columns: ");
        int cols = input.nextInt();
        System.out.println("Your matrix size is " + rows + " x " + cols);

        ArrayList<ArrayList<Fraction>> matrix = new ArrayList<>();

        for( int i = 0;i<rows;i++){
            ArrayList<Fraction> t = new ArrayList<>();
            for(int j=0;j<cols;j++){
                System.out.println("The value at row " + i + " and column " + j);
                System.out.println("Please enter the numerator followed by the denominator");
                Fraction frac = new Fraction(input.nextInt(), input.nextInt());
                t.add(frac);
            }
            matrix.add(t);
        }
        return matrix;
    }

    public static void main(String[] args) {
        BuildMatrix m = new BuildMatrix();
        Matrix ma = new Matrix(m.buildMatrix());
        System.out.println(ma.RREF());
    }
}
