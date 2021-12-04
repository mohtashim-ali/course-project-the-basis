package UseCase;

import Entity.Expression;
import java.util.*;

public class BuildExpression {

//    private String expression;
//
//    public void setExpression(String expression){
//        this.expression = expression;
//    }

    public StringBuilder makeExpression(){
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please type in a mathematical expression:");
        String string_input = input2.nextLine();
        String expression = string_input.replaceAll(" ", "");
        StringBuilder final_string = new StringBuilder();
        int j = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '*' || expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '/' || expression.charAt(i) == '^') {
                final_string.append(expression.substring(j, i)).append(" ").append(expression.charAt(i)).append(" ");
                j = i + 1;
            }
        }
        final_string.append(expression.substring(j, expression.length()));
        return final_string;
    }
}
