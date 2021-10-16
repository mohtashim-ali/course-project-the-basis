import java.util.ArrayList;
import java.util.Arrays;


public class InputProcessor {
    /*
    Takes a string input and converts it to either an Expression or an Equation.
     */
    public String input;

    public static void main(String[] args) {
        InputProcessor input = new InputProcessor("12 - 4 + 3 + 6 + 18");
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

    public ArrayList<String> listInput(){
        return new ArrayList<>(Arrays.asList(this.input.split(" ")));
    }

    public Expression processInput(ArrayList<String> expr) {
        /**
         *
         * Later implement working for n operands and m operators
         *
         */
        if (expr.size() == 3){
            double operand1 = Double.parseDouble(expr.get(0));
            double operand2 = Double.parseDouble(expr.get(2));
            return new Expression(operand1, expr.get(1), operand2);
        }
        else{
            Expression expr1 = this.processInput((new InputProcessor(expr.get(0) + " " + expr.get(1) + " " + expr.get(2))).listInput());
            double operand2 = expr1.compute();
            expr.remove(0); expr.remove(0); expr.remove(0);
            expr.add(0, Double.toString(operand2));
            return this.processInput(expr);
        }
        /*
        String[] operators = new String[]{"+", "-", "/", "*"};
        String opr = "";
        int operator_index = 1;
        for (String operator : operators) {
            if (this.input.contains(operator)) {
                opr = operator;
                operator_index = this.input.indexOf(opr);
            }
        }
        double operand1 = Double.parseDouble(this.input.substring(0, operator_index));
        double operand2 = Double.parseDouble(this.input.substring(operator_index+1, this.input.length()));
        return new Expression(operand1, opr, operand2);
         */
    }
}