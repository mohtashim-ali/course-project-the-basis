import java.util.ArrayList;
import java.util.Arrays;


public class InputProcessor {
    /*
    Takes a string input and converts it to either an Expression or an Equation.
     */
    public String input;

    public static void main(String[] args) throws ExpressionException {
        InputProcessor input = new InputProcessor("12 / 4 - 3 + 6 * 18");
        Expression temp = input.processInput(input.listInput());
        System.out.println(temp.compute());
    }

    public InputProcessor(String input){
        this.input = input;
    }
    /*
    If returns true it is an expression, returns false otherwise.
     */
    public boolean checkExpression(){
        return this.input.contains("=");
    }
    /*
    Converts a string to an Expression.
     */

    /**
     * @return ArrayList
     */
    public ArrayList<String> listInput(){
        /**
         * Function that splits the input into a list of operands and operators.
         */
        return new ArrayList<>(Arrays.asList(this.input.split(" ")));
    }

    /**
     * @param n1 String
     * @param n2 String
     * @return boolean
     */
    public boolean compareOperators(String n1, String n2){
        /**
         * Function that compares different types of operators.
         */
        ArrayList<String> operations = new ArrayList<>(Arrays.asList("-", "+", "/", "*"));
        int splitter = 2;
        int n1_position = operations.indexOf(n1);
        int n2_position = operations.indexOf(n2);
        if (n1_position < splitter && n2_position >= splitter){
            return true;
        }
        else if (n1_position < splitter){
            return false;
        }
        else if (n2_position >= splitter){
            return false;
        }
        else{
            return false;
        }

    }

    /**
     * @param expr ArrayList
     * @return Expression
     */
    public Expression processInput(ArrayList<String> expr) throws ExpressionException {
        /**
         *
         * Function that processes input by Array of operands and operators.
         *
         */
        if (expr.size() == 3){
            double operand1 = Double.parseDouble(expr.get(0));
            double operand2 = Double.parseDouble(expr.get(2));
            return new Expression(operand1, expr.get(1), operand2);
        }
        else{
            int highest_order_op = 1;
            for (int i = 2; i<=expr.size()-1; i++){
                if (this.compareOperators(expr.get(highest_order_op), expr.get(i))){
                    highest_order_op = i;
                }
            }
            Expression expr1 = this.processInput((new InputProcessor(expr.get(highest_order_op-1) + " "
                    + expr.get(highest_order_op) + " " + expr.get(highest_order_op+1))).listInput());
            double operand2 = expr1.compute();
            expr.remove(highest_order_op-1); expr.remove(highest_order_op-1); expr.remove(highest_order_op-1);
            expr.add(highest_order_op-1, Double.toString(operand2));
            return this.processInput(expr);
        }
    }
}