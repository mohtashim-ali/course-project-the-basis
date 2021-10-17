import java.util.Scanner;
import java.util.*;

public class WalkthroughCustomInput{


    public static void main(String[] args) throws ExpressionException {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type in a mathematical expression:");
        String expression = input.nextLine();

        StringBuilder s = new StringBuilder();
        String[] arr = new String[expression.length()+expression.length()-1];
        if (!expression.contains(" ")) {
            for (int i=0; i<expression.length(); i++) {
                arr[i] = String.valueOf(expression.charAt(i));
                arr[i+1] = " ";
            }

            for(int i = 0; i < arr.length-expression.length()+1; i++) {
                s.append(arr[i]);
                s.append(" ");
            }
        }
        InputProcessor user = new InputProcessor(s.toString());
        Expression userinput = user.processInput(user.listInput());

        System.out.println(userinput.compute());

    }

}
