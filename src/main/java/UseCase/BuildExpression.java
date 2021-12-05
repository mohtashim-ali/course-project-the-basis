package UseCase;

import Entity.Expression;
import java.util.*;

public class BuildExpression {

    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String other) {
        input = other;
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
