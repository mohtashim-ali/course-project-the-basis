package UseCase.BasicOperations;

import java.util.*;

public class BuildExpression {

    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String other) {
        input = other;
    }

    /**
     * Asks the user to type in there expression
     * @return the expression
     */
    public StringBuilder createExpression(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please type in a expression: ");
        input = s.nextLine();
        return makeExpression();
    }

    /**
     * Creates the expression by converting the user input
     * @return created expression
     */
    public StringBuilder makeExpression(){
        String expression = input.replaceAll(" ", "");
        StringBuilder final_string = new StringBuilder();
        int j = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '*' || expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '/' || expression.charAt(i) == '^') {
                final_string.append(expression, j, i).append(" ").append(expression.charAt(i)).append(" ");
                j = i + 1;
            }
        }
        final_string.append(expression.substring(j));
        return final_string;
    }
}
