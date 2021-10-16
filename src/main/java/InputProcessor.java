import java.util.ArrayList;
import java.util.Arrays;


public class InputProcessor {
    /*
    Takes a string input and converts it to either an Expression or an Equation.
     */
    public String input;

    public static void main(String[] args) {
        InputProcessor input = new InputProcessor("12+4");
        Expression temp = input.processInput();
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
    public Expression processInput() {
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
    }
}