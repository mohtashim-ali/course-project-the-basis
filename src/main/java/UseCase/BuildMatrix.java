package UseCase;

import Entity.Fraction;
import Entity.Matrix;

import java.util.*;

public class BuildMatrix {

    public Matrix createMatrix(){


        Scanner input = new Scanner(System.in);

        System.out.println("Please type a square matrix using brackets: ");

        String clean = input.nextLine().replaceAll(" ", "");

        String[] matrix = clean.split("");

        return new Matrix(helper(matrix));


    }

    public ArrayList<ArrayList<Fraction>> helper(String[] matrix){

        int x  = 1;
        ArrayList<ArrayList<Fraction>> matri = new ArrayList<>();
        while (x < matrix.length){
            if (Objects.equals(matrix[x].toString(), "[")){
                x++;
                ArrayList<Fraction> inner = new ArrayList<>();
                while (!matrix[x].toString().equals("]")){
                    if (!matrix[x].toString().equals(",") && !matrix[x].toString().equals("]")){
                        Fraction test = new Fraction(Integer.parseInt(matrix[x]), Integer.parseInt(matrix[x+2]));
                        inner.add(test);
                        x++;
                        x++;
                        x++;
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
