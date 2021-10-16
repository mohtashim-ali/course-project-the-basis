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
        for (String operator : operators) {
            if (this.input.contains(operator)) {
                opr = operator;
            }
        }
        double operand1 = Double.parseDouble(String.valueOf(this.input.charAt(0)));
        double operand2 = Double.parseDouble(String.valueOf(this.input.charAt(2)));
        return new Expression(operand1, opr, operand2);
    }
}