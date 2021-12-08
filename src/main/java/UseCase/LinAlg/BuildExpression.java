package UseCase.LinAlg;

import java.util.*;

public class BuildExpression {

    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String other) {
        input = other;
    }

    public StringBuilder createExpression(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please type in a expression: ");
        input = s.nextLine();
        return makeExpression();
    }

    public StringBuilder makeExpression(){
        String expression = input.replaceAll(" ", "");
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
