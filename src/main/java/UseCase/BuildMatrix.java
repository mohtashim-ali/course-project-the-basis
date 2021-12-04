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

    public ArrayList<ArrayList<Fraction>> convert(List<String> splitmatrix){
        int x = 0;
        ArrayList<ArrayList<Fraction>> matrix = new ArrayList<>();
        while (x < splitmatrix.size()){
            ArrayList<Fraction> n = new ArrayList<>();
            if (splitmatrix.get(x).equals("[")){
                x ++;
                matrix = convert(splitmatrix.subList(x, splitmatrix.size() - 1));
            }
            else if (splitmatrix.get(x).equals("]")){
                matrix.add(n);
                return matrix;
            }
            else{
                x++;
                Fraction frac = new Fraction(5, 5);
                n.add(frac);
            }
        }
        return matrix;

    }
    public ArrayList<ArrayList<Fraction>> buildMatrix(){
        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please type in your matrix in format [row], ..., [row]: ");
//        String S_matrix = input.nextLine();
//
//        List<String> splitmatrix = List.of(S_matrix.split(","));
//
//        ArrayList<ArrayList<Fraction>> matrix = new ArrayList<>();
//        for (String s: splitmatrix){
//            String n = s.substring(1, s.length() - 1);
//            System.out.println(n);
//            }
//        }




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
//        Matrix ma = new Matrix(m.buildMatrix());
//        System.out.println(ma.RREF());

        Scanner input = new Scanner(System.in);

        System.out.println("Please type in your matrix in format [[row], ..., [row]]: ");
        String S_matrix = input.nextLine();

        List<String> splitmatrix = List.of(S_matrix.split(","));

        System.out.println(m.convert(splitmatrix));
    }
}
