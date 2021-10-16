import java.util.Scanner;
import java.util.*;

public class WalkthroughCustomInput{


    public static void main(String[] args) throws ExpressionException {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type in a mathematical expression:");

        String expression = input.nextLine();


        InputProcessor user = new InputProcessor(expression);
        Expression userinput = user.processInput(user.listInput());

        System.out.println(userinput.compute());





    }

}
