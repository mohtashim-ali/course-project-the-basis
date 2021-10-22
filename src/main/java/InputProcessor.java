import java.util.ArrayList;
import java.util.Arrays;

public class InputProcessor{
    /**
    Takes a string input and converts it to either an Expression or an Equation.
     */
    public ArrayList<String> input;

    public InputProcessor(String input){
        this.input = new ArrayList<>(Arrays.asList(input.split(" ")));;

    }
    /**
    If returns true it is an expression, returns false otherwise.
     */
    public boolean checkExpression(){
        return this.input.contains("=");
    }
    /*
    Converts a string to an Expression.
     */

    /**
     * @param n1 String
     * @param n2 String
     * @return boolean
     */
    public boolean compareOperators(String n1, String n2){
        /*
          Function that compares different types of operators.
         */
        ArrayList<String> operations = new ArrayList<>(Arrays.asList("-", "+", "*", "/"));
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
     * @return Expression
     */
    public Expression processInput() throws ExpressionException {
        /**
         *
         * Function that processes input by Array of operands and operators.
         *
         */
        if (this.input.size() == 1){
            double operand1 = Double.parseDouble(this.input.get(0));
            return new Expression(operand1, "", 0);
        }
        if (this.input.size() == 3){
            double operand1 = Double.parseDouble(this.input.get(0));
            double operand2 = Double.parseDouble(this.input.get(2));
            return new Expression(operand1, this.input.get(1), operand2);
        }
        else{
            int highest_order_op = 1;
            for (int i = 2; i<=this.input.size()-1; i++){
                if (this.compareOperators(this.input.get(highest_order_op), this.input.get(i))){
                    highest_order_op = i;
                }
            }
            Expression expr1 = (new InputProcessor(this.input.get(highest_order_op-1) + " "
                    + this.input.get(highest_order_op) + " " + this.input.get(highest_order_op+1))).processInput();
            double operand2 = expr1.compute();
            this.input.remove(highest_order_op-1); this.input.remove(highest_order_op-1); this.input.remove(highest_order_op-1);
            this.input.add(highest_order_op-1, Double.toString(operand2));
            return this.processInput();
        }
    }
}