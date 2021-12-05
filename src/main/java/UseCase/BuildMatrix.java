package UseCase;

import Entity.Fraction;
import Entity.Matrix;

import java.util.*;

public class BuildMatrix {

    public Matrix createMatrix(){


        Scanner input = new Scanner(System.in);

        System.out.println("Please type in a square matrix using brackets: ");

        String clean = input.nextLine().replaceAll(" ", "");

        String[] matrix = clean.split("");

        return new Matrix(helper(matrix));


    }

    public ArrayList<ArrayList<Fraction>> helper(String[] matrix){

        int x  = 1;
        ArrayList<ArrayList<Fraction>> matri = new ArrayList<>();
        while (x < matrix.length){
            if (Objects.equals(matrix[x], "[")){
                x++;
                ArrayList<Fraction> inner = new ArrayList<>();
                while (!matrix[x].equals("]")){
                    if (!matrix[x].equals(",") && !matrix[x].equals("]")){
                        int first = Integer.parseInt(matrix[x]);
                        int second = Integer.parseInt(matrix[x+2]);
                        Fraction test = new Fraction(first, second);
                        inner.add(test);
                        x+= 3;
                    }
                    else{
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
