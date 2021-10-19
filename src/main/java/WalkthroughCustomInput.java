import java.util.Scanner;
import java.util.*;

public class WalkthroughCustomInput{


    public static void main(String[] args) throws ExpressionException {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type in a mathematical expression:");
        String string_input = input.nextLine();
        String expression = string_input.replaceAll(" ", "");
        String final_string = "";
        int j = 0;
        for (int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i) == '*' || expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '/') {
                final_string += expression.substring(j, i) + " " + expression.charAt(i) + " ";
                j = i + 1;
            }
        }
        final_string += expression.substring(j, expression.length());
        System.out.println(final_string);
        InputProcessor user = new InputProcessor(final_string);
        Expression userinput = user.processInput(user.listInput());

        System.out.println(userinput.compute());

    }

}
