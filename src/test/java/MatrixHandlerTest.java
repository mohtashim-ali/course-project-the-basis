import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Objects;

public class MatrixHandlerTest extends TestCase {

    public void testDeterminant1() {
        ArrayList<Fraction> m1 = new ArrayList<>() {{
            add(new Fraction(1, 1));
            add(new Fraction(2, 1));
            add(new Fraction(3, 1));
        }};
        ArrayList<Fraction> m2 = new ArrayList<>() {{
            add(new Fraction(4, 1));
            add(new Fraction(5, 1));
            add(new Fraction(6, 1));
        }};
        ArrayList<Fraction> m3 = new ArrayList<>() {{
            add(new Fraction(7, 1));
            add(new Fraction(8, 1));
            add(new Fraction(9, 1));
        }};
        ArrayList<ArrayList<Fraction>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
        }};
        Matrix temp = new Matrix(new_matrix);
        assert Objects.equals(temp.determinant().toString(), "0/1");
    }
    public void testDeterminant2() {
        ArrayList<Fraction> m1 = new ArrayList<>() {{
            add(new Fraction(1, 1));
            add(new Fraction(2, 1));
        }};
        ArrayList<Fraction> m2 = new ArrayList<>() {{
            add(new Fraction(4, 1));
            add(new Fraction(5, 1));
        }};
        ArrayList<ArrayList<Fraction>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
        }};
        Matrix temp = new Matrix(new_matrix);
        assert Objects.equals(temp.determinant().toString(), "-3/1");
    }
//    public void testDeterminant3() {
//        ArrayList<Math.Fraction> m1 = new ArrayList<>() {{
//            add(new Math.Fraction(2, 1));
//            add(new Math.Fraction(2, 1));
//            add(new Math.Fraction(3, 1));
//        }};
//        ArrayList<Math.Fraction> m2 = new ArrayList<>() {{
//            add(new Math.Fraction(4, 1));
//            add(new Math.Fraction(5, 1));
//            add(new Math.Fraction(6, 1));
//        }};
//        ArrayList<Math.Fraction> m3 = new ArrayList<>() {{
//            add(new Math.Fraction(7, 1));
//            add(new Math.Fraction(8, 1));
//            add(new Math.Fraction(9, 1));
//        }};
//        ArrayList<ArrayList<Math.Fraction>> new_matrix = new ArrayList<>() {{
//            add(m1);
//            add(m2);
//            add(m3);
//        }};
//        Math.Matrix temp = new Math.Matrix(new_matrix);
//        System.out.println(temp.determinant().toString());
//        assert Objects.equals(temp.determinant().toString(), "-3/1");
//    }
//    public void testDeterminant4() {
//        ArrayList<Math.Fraction> m1 = new ArrayList<>() {{
//            add(2.0);
//            add(2.0);
//            add(3.0);
//        }};
//        ArrayList<Math.Fraction> m2 = new ArrayList<>() {{
//            add(4.0);
//            add(3.0);
//            add(6.0);
//        }};
//        ArrayList<Math.Fraction> m3 = new ArrayList<>() {{
//            add(7.0);
//            add(8.0);
//            add(9.0);
//        }};
//        ArrayList<ArrayList<Math.Fraction>> new_matrix = new ArrayList<>() {{
//            add(m1);
//            add(m2);
//            add(m3);
//        }};
//        Math.Matrix temp = new Math.Matrix(new_matrix);
//        assert temp.determinant() == 3;
//    }
//    public void testDeterminant5() {
//        ArrayList<Math.Fraction> m1 = new ArrayList<>() {{
//            add(4.0);
//            add(5.0);
//            add(6.0);
//            add(3.0);
//        }};
//        ArrayList<Math.Fraction> m2 = new ArrayList<>() {{
//            add(2.0);
//            add(3.0);
//            add(4.0);
//            add(5.0);
//        }};
//        ArrayList<Math.Fraction> m3 = new ArrayList<>() {{
//            add(1.0);
//            add(0.0);
//            add(9.0);
//            add(1.0);
//        }};
//        ArrayList<Math.Fraction> m4 = new ArrayList<>() {{
//            add(7.0);
//            add(5.0);
//            add(9.0);
//            add(8.0);
//        }};
//        ArrayList<ArrayList<Math.Fraction>> new_matrix = new ArrayList<>() {{
//            add(m1);
//            add(m2);
//            add(m3);
//            add(m4);
//        }};
//        Math.Matrix temp = new Math.Matrix(new_matrix);
//        assert temp.determinant() == 472;
//    }
//
//    public void testDeterminant6() {
//        ArrayList<Math.Fraction> m1 = new ArrayList<>() {{
//            add(0.0);
//            add(1.0);
//            add(-1.0);
//            add(0.0);
//        }};
//        ArrayList<Math.Fraction> m2 = new ArrayList<>() {{
//            add(3.0);
//            add(0.0);
//            add(0.0);
//            add(2.0);
//        }};
//        ArrayList<Math.Fraction> m3 = new ArrayList<>() {{
//            add(0.0);
//            add(1.0);
//            add(2.0);
//            add(1.0);
//        }};
//        ArrayList<Math.Fraction> m4 = new ArrayList<>() {{
//            add(5.0);
//            add(0.0);
//            add(0.0);
//            add(7.0);
//        }};
//        ArrayList<ArrayList<Math.Fraction>> new_matrix = new ArrayList<>() {{
//            add(m1);
//            add(m2);
//            add(m3);
//            add(m4);
//        }};
//        Math.Matrix temp = new Math.Matrix(new_matrix);
//        assert temp.determinant() == -33;
//    }


    public void testzeroMatrix() {
        ArrayList<Fraction> m1 = new ArrayList<>() {{
            add(new Fraction(0, 1));
            add(new Fraction(0, 1));
            add(new Fraction(0, 1));
        }};
        ArrayList<Fraction> m2 = new ArrayList<>() {{
            add(new Fraction(0, 1));
            add(new Fraction(0, 1));
            add(new Fraction(0, 1));
        }};
        ArrayList<Fraction> m3 = new ArrayList<>() {{
            add(new Fraction(0, 1));
            add(new Fraction(0, 1));
            add(new Fraction(0, 1));
        }};
        ArrayList<ArrayList<Fraction>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
        }};
        Matrix temp = new Matrix(new_matrix);
        assert Objects.equals(temp.RREF().toString(), "[[0/1, 0/1, 0/1], [0/1, 0/1, 0/1], [0/1, 0/1, 0/1]]");
    }

    public void testRREF1() {
        ArrayList<Fraction> m1 = new ArrayList<>() {{
            add(new Fraction(1, 1));
            add(new Fraction(3, 1));
            add(new Fraction(1, 1));
        }};
        ArrayList<Fraction> m2 = new ArrayList<>() {{
            add(new Fraction(-1, 1));
            add(new Fraction(-2, 1));
            add(new Fraction(1, 1));
        }};
        ArrayList<Fraction> m3 = new ArrayList<>() {{
            add(new Fraction(3, 1));
            add(new Fraction(7, 1));
            add(new Fraction(-1, 1));
        }};
        ArrayList<ArrayList<Fraction>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
        }};
        Matrix temp = new Matrix(new_matrix);
        assert Objects.equals(temp.RREF().toString(), "[[1/1, 0/1, -5/1], [0/1, 1/1, 2/1], [0/1, 0/1, 0/1]]");
    }

    public void testRREF2() {
        ArrayList<Fraction> m1 = new ArrayList<>() {{
            add(new Fraction(1, 1));
            add(new Fraction(1, 1));
            add(new Fraction(2, 1));
        }};
        ArrayList<Fraction> m2 = new ArrayList<>() {{
            add(new Fraction(3, 1));
            add(new Fraction(-1, 1));
            add(new Fraction(1, 1));
        }};
        ArrayList<Fraction> m3 = new ArrayList<>() {{
            add(new Fraction(-1, 1));
            add(new Fraction(3, 1));
            add(new Fraction(4, 1));
        }};
        ArrayList<ArrayList<Fraction>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
        }};
        Matrix temp = new Matrix(new_matrix);
        System.out.println(temp.RREF().toString());
        assert Objects.equals(temp.RREF().toString(), "[[1/1, 0/1, 0/1], [0/1, 1/1, 0/1], [0/1, 0/1, 1/1]]");
    }

    public void testRREF3() {
        ArrayList<Fraction> m1 = new ArrayList<>() {{
            add(new Fraction(3, 1));
            add(new Fraction(4, 1));
            add(new Fraction(1, 1));
        }};
        ArrayList<Fraction> m2 = new ArrayList<>() {{
            add(new Fraction(2, 1));
            add(new Fraction(3, 1));
            add(new Fraction(0, 1));
        }};
        ArrayList<Fraction> m3 = new ArrayList<>() {{
            add(new Fraction(4, 1));
            add(new Fraction(3, 1));
            add(new Fraction(-1, 1));
        }};
        ArrayList<ArrayList<Fraction>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
        }};
        Matrix temp = new Matrix(new_matrix);
        System.out.println(temp.RREF().toString());
        assert Objects.equals(temp.RREF().toString(), "[[1/1, 0/1, 0/1], [0/1, 1/1, 0/1], [0/1, 0/1, 1/1]]");

    }

    public void testRREF4() {
        ArrayList<Fraction> m1 = new ArrayList<>() {{
            add(new Fraction(3, 1));
            add(new Fraction(4, 1));
            add(new Fraction(1, 1));
        }};
        ArrayList<Fraction> m2 = new ArrayList<>() {{
            add(new Fraction(2, 1));
            add(new Fraction(3, 1));
            add(new Fraction(1, 1));
        }};
        ArrayList<Fraction> m3 = new ArrayList<>() {{
            add(new Fraction(4, 1));
            add(new Fraction(3, 1));
            add(new Fraction(-1, 1));
        }};
        ArrayList<ArrayList<Fraction>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
        }};
        Matrix temp = new Matrix(new_matrix);
        System.out.println(temp.RREF().toString());
        assert Objects.equals(temp.RREF().toString(), "[[1/1, 0/1, -1/1], [0/1, 1/1, 1/1], [0/1, 0/1, 0/1]]");

    }

    public void testRREF5() {
        ArrayList<Fraction> m1 = new ArrayList<>() {{
            add(new Fraction(1, 1));
            add(new Fraction(1, 1));
            add(new Fraction(-1, 1));
        }};
        ArrayList<Fraction> m2 = new ArrayList<>() {{
            add(new Fraction(-1, 1));
            add(new Fraction(4, 1));
            add(new Fraction(5, 1));
        }};
        ArrayList<Fraction> m3 = new ArrayList<>() {{
            add(new Fraction(1, 1));
            add(new Fraction(6, 1));
            add(new Fraction(3, 1));
        }};
        ArrayList<ArrayList<Fraction>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
        }};
        Matrix temp = new Matrix(new_matrix);
        System.out.println(temp.RREF().toString());
        assert Objects.equals(temp.RREF().toString(), "[[1/1, 0/1, -9/5], [0/1, 1/1, 4/5], [0/1, 0/1, 0/1]]");

    }

    public void testRREF6() {
        ArrayList<Fraction> m1 = new ArrayList<>() {{
            add(new Fraction(1, 1));
            add(new Fraction(2, 1));
            add(new Fraction(-1, 1));
        }};
        ArrayList<Fraction> m2 = new ArrayList<>() {{
            add(new Fraction(2, 1));
            add(new Fraction(5, 1));
            add(new Fraction(-3, 1));
        }};
        ArrayList<Fraction> m3 = new ArrayList<>() {{
            add(new Fraction(1, 1));
            add(new Fraction(4, 1));
            add(new Fraction(-3, 1));
        }};
        ArrayList<ArrayList<Fraction>> new_matrix = new ArrayList<>() {{
            add(m1);
            add(m2);
            add(m3);
        }};
        Matrix temp = new Matrix(new_matrix);
        System.out.println(temp.RREF().toString());
        assert Objects.equals(temp.RREF().toString(), "[[1/1, 0/1, 1/1], [0/1, 1/1, -1/1], [0/1, 0/1, 0/1]]");

    }

    public void testMoveZerosToBottom() {
    }

    public void testZeroMatrix() {
    }

    public void testRREF() {
    }
}