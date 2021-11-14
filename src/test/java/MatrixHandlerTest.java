import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Objects;

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

//    public void zeroMatrix() {
//        ArrayList<Double> m1 = new ArrayList<>() {{
//            add(0.0);
//            add(0.0);
//            add(0.0);
//        }};
//        ArrayList<Double> m2 = new ArrayList<>() {{
//            add(0.0);
//            add(0.0);
//            add(0.0);
//        }};
//        ArrayList<Double> m3 = new ArrayList<>() {{
//            add(0.0);
//            add(0.0);
//            add(0.0);
//        }};
//        ArrayList<ArrayList<Double>> new_matrix = new ArrayList<>() {{
//            add(m1);
//            add(m2);
//            add(m3);
//        }};
//        Matrix temp = new Matrix(new_matrix);
//        assert Objects.equals(temp.RREF().toString(), "[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0], [0.0, 0.0, 0.0]]");
//    }
//
//    public void testRREF1() {
//        ArrayList<Double> m1 = new ArrayList<>() {{
//            add(1.0);
//            add(3.0);
//            add(1.0);
//        }};
//        ArrayList<Double> m2 = new ArrayList<>() {{
//            add(-1.0);
//            add(-2.0);
//            add(1.0);
//        }};
//        ArrayList<Double> m3 = new ArrayList<>() {{
//            add(3.0);
//            add(7.0);
//            add(-1.0);
//        }};
//        ArrayList<ArrayList<Double>> new_matrix = new ArrayList<>() {{
//            add(m1);
//            add(m2);
//            add(m3);
//        }};
//        Matrix temp = new Matrix(new_matrix);
//        assert Objects.equals(temp.RREF().toString(), "[[1.0, 0.0, -5.0], [0.0, 1.0, 2.0], [0.0, 0.0, 0.0]]");
//    }
//
//    public void testRREF2() {
//        ArrayList<Double> m1 = new ArrayList<>() {{
//            add(1.0);
//            add(1.0);
//            add(2.0);
//        }};
//        ArrayList<Double> m2 = new ArrayList<>() {{
//            add(3.0);
//            add(-1.0);
//            add(1.0);
//        }};
//        ArrayList<Double> m3 = new ArrayList<>() {{
//            add(-1.0);
//            add(3.0);
//            add(4.0);
//        }};
//        ArrayList<ArrayList<Double>> new_matrix = new ArrayList<>() {{
//            add(m1);
//            add(m2);
//            add(m3);
//        }};
//        Matrix temp = new Matrix(new_matrix);
//        assert Objects.equals(temp.RREF().toString(), "[[1.0, 0.0, 0.0], [0.0, 1.0, 0.0], [0.0, 0.0, 1.0]]");
//    }

    public void testRREF3() {
        ArrayList<Double> m1 = new ArrayList<>() {{
            add(3.0);
            add(8.0);
            add(-3.0);
            add(-14.0);
        }};
        ArrayList<Double> m2 = new ArrayList<>() {{
            add(2.0);
            add(3.0);
            add(-1.0);
            add(-2.0);
        }};
        ArrayList<Double> m3 = new ArrayList<>() {{
            add(1.0);
            add(-2.0);
            add(1.0);
            add(10.0);
        }};
        ArrayList<Double> m4 = new ArrayList<>() {{
            add(1.0);
            add(5.0);
            add(-2.0);
            add(-12.0);
        }};
        ArrayList<ArrayList<Double>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
            add(m4);
        }};
        Matrix temp = new Matrix(new_matrix);
        System.out.println(temp.RREF().toString());
        assert Objects.equals(temp.RREF().toString(), "[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0.0, 0.0], [0.0, 0.0, 1.0, 0.0], [0.0, 0.0, 0.0, 1.0]]");

    }

    public void testMoveZerosToBottom() {
    }

    public void testZeroMatrix() {
    }

    public void testRREF() {
    }
}