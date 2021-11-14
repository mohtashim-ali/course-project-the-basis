import junit.framework.TestCase;

import java.util.ArrayList;

public class MatrixHandlerTest extends TestCase {

    public void testDeterminant1() {
        ArrayList<Double> m1 = new ArrayList<>() {{
            add(1.0);
            add(2.0);
            add(3.0);
        }};
        ArrayList<Double> m2 = new ArrayList<>() {{
            add(4.0);
            add(5.0);
            add(6.0);
        }};
        ArrayList<Double> m3 = new ArrayList<>() {{
            add(7.0);
            add(8.0);
            add(9.0);
        }};
        ArrayList<ArrayList<Double>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
        }};
        Matrix temp = new Matrix(new_matrix);
        assert temp.determinant() == 0;
    }
    public void testDeterminant2() {
        ArrayList<Double> m1 = new ArrayList<>() {{
            add(1.0);
            add(2.0);
        }};
        ArrayList<Double> m2 = new ArrayList<>() {{
            add(4.0);
            add(5.0);
        }};
        ArrayList<ArrayList<Double>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
        }};
        Matrix temp = new Matrix(new_matrix);
        assert temp.determinant() == -3;
    }
    public void testDeterminant3() {
        ArrayList<Double> m1 = new ArrayList<>() {{
            add(2.0);
            add(2.0);
            add(3.0);
        }};
        ArrayList<Double> m2 = new ArrayList<>() {{
            add(4.0);
            add(5.0);
            add(6.0);
        }};
        ArrayList<Double> m3 = new ArrayList<>() {{
            add(7.0);
            add(8.0);
            add(9.0);
        }};
        ArrayList<ArrayList<Double>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
        }};
        Matrix temp = new Matrix(new_matrix);
        assert temp.determinant() == -3;
    }
    public void testDeterminant4() {
        ArrayList<Double> m1 = new ArrayList<>() {{
            add(2.0);
            add(2.0);
            add(3.0);
        }};
        ArrayList<Double> m2 = new ArrayList<>() {{
            add(4.0);
            add(3.0);
            add(6.0);
        }};
        ArrayList<Double> m3 = new ArrayList<>() {{
            add(7.0);
            add(8.0);
            add(9.0);
        }};
        ArrayList<ArrayList<Double>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
        }};
        Matrix temp = new Matrix(new_matrix);
        assert temp.determinant() == 3;
    }
    public void testDeterminant5() {
        ArrayList<Double> m1 = new ArrayList<>() {{
            add(4.0);
            add(5.0);
            add(6.0);
            add(3.0);
        }};
        ArrayList<Double> m2 = new ArrayList<>() {{
            add(2.0);
            add(3.0);
            add(4.0);
            add(5.0);
        }};
        ArrayList<Double> m3 = new ArrayList<>() {{
            add(1.0);
            add(0.0);
            add(9.0);
            add(1.0);
        }};
        ArrayList<Double> m4 = new ArrayList<>() {{
            add(7.0);
            add(5.0);
            add(9.0);
            add(8.0);
        }};
        ArrayList<ArrayList<Double>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
            add(m4);
        }};
        Matrix temp = new Matrix(new_matrix);
        assert temp.determinant() == 472;
    }


}