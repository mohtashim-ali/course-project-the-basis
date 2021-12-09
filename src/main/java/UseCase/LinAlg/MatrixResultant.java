//package UseCase.LinAlg;
//
//import Entity.Matrix;
//import UseCase.BasicOperations.*;
//
//import java.util.HashMap;
//import java.util.Objects;
//
//public class MatrixResultant {
//
//    private final Matrix matrix1;
//    private final Matrix matrix2;
//    private final String operator;
//
//    public MatrixResultant(Matrix matrix1, String operator, Matrix matrix2) {
//        this.matrix1 = matrix1;
//        this.operator = operator;
//        this.matrix2 = matrix2;
//    }
//
//    /**
//     * @return double
//     * @throws ExpressionException
//     * If Expression is invalid throws Expression Exception
//     */
//    public double resultant() throws ExpressionException {
//        /*
//         * Function that computes the SingleExpression by finding which BasicOperation class to use
//         */
//        HashMap<String, Object> hashMap = new HashMap<>() {{
//            put("+", new MatrixAdd());
//            put("-", new MatrixSubtract());
//            put("R", new MatrixRREF());
//        }};
//        Calculator context = new Calculator();
//        for (String key : hashMap.keySet()) {
//            if (Objects.equals(this.operator, key)) {
//                context.setStrategy((Computation) hashMap.get(key));
//            }
//        }
//        return context.getStrategy(this.matrix1, this.matrix2);
//    }
//}
