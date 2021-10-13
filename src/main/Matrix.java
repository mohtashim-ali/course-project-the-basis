import java.util.ArrayList;

public class Matrix extends LinearAlgebraMode{
    private final int m;
    private final int n;
    private final ArrayList<ArrayList<Double>> values;
    public Matrix(int n1, int n2, ArrayList<ArrayList<Double>> values){
        this.m = n1;
        this.n = n2;
        this.values = values;
    }
    public Matrix add(Matrix other){
        ArrayList<ArrayList<Double>> values = new ArrayList<>();
        try {
            for (int i = 0; i < this.n; i++) {
                ArrayList<Double> n_values = new ArrayList<>();
                for (int j = 0; j<this.m; j++){
                    n_values.add(this.values.get(i).get(j) + other.values.get(i).get(j));
                }
                values.add(n_values);
            }
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        return new Matrix(this.m, this.n, values);
    }
    public String print(){
        return null;
    }
}
