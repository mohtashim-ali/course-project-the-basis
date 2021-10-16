import java.util.Scanner;
import java.util.*;

public class WalkthroughCustomInput{


    public void main(String[] args) throws ExpressionException {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type in a mathematical expression:");
        String expression = input.nextLine();

        InputProcessor user = new InputProcessor(expression);
        Expression userinput = user.processInput(user.listInput());

        System.out.println(userinput.compute());

        /**
         * Checks if the given input includes whitespaces and adds whitespaces if none are present.
         */
        public String validateInput(String expression) {
            StringBuffer s = new StringBuffer();
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
            System.out.println(s);
        }



    }

}
