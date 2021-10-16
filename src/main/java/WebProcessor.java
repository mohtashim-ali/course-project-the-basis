import java.util.ArrayList;


public class WebProcessor {
    /*
    Takes a string input and converts it to either an Expression or an Equation.
     */
    public String input;

    public static void main(String[] args) {
        WebProcessor input = new WebProcessor("1+1");
        Expression temp = input.processInput();
        System.out.println(temp.operator);

    }

    public WebProcessor(String input){
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
        if(this.input.contains("+")) {
            String[] new_array = this.input.split("\\+");
            double operand1 = Double.parseDouble(new_array[0]);
            double operand2 = Double.parseDouble(new_array[1]);
            return new Expression(operand1, "+", operand2);
        } else if(this.input.contains("-")) {
            String[] new_array = this.input.split("-");
            double operand1 = Double.parseDouble(new_array[0]);
            double operand2 = Double.parseDouble(new_array[1]);
            return new Expression(operand1, "-", operand2);
        } else if(this.input.contains("*")) {
            String[] new_array = this.input.split("\\*");
            double operand1 = Double.parseDouble(new_array[0]);
            double operand2 = Double.parseDouble(new_array[1]);
            return new Expression(operand1, "*", operand2);
        } else {
            String[] new_array = this.input.split("/");
            double operand1 = Double.parseDouble(new_array[0]);
            double operand2 = Double.parseDouble(new_array[1]);
            return new Expression(operand1, "/", operand2);
        }
    }
}


//        ArrayList<Expression> temp = new ArrayList<Expression>();
//        for (int i=0; i < this.input.length(); i++) {
//            if(this.input.charAt(i) == '+' || this.input.charAt(i) == '-' ||
//                    this.input.charAt(i) == '*' || this.input.charAt(i) == '/') {
//                Expression new_expression = new Expression();
//            }
//        }