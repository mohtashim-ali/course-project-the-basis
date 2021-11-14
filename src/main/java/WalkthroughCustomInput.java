import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;


public class WalkthroughCustomInput {


    public static void main(String[] args) throws ExpressionException {
        HashMap<String, String> logins = new HashMap<>();
        User usr = new User(logins);
        Scanner input = new Scanner(System.in);
        String temp;
        do {

            System.out.println("Would you like to sign up for an account? If you already have one please type in N: ");
            String acc = input.nextLine();
            if (acc.equals("Y")) {
                System.out.println("Please type in a username: ");
                String username = input.nextLine();
                System.out.println("Please type in a password: ");
                String password = input.nextLine();
                usr.signUp(username, password);
                usr.login(username, password);

            } else if (acc.equals("N")) {
                System.out.println("Please type in your username: ");
                String username = input.nextLine();
                System.out.println("Please type in your password: ");
                String password = input.nextLine();

                while (!usr.login(username, password)) {
                    System.out.println("Incorrect password, please try again: ");
                    password = input.nextLine();
                }
            }


            System.out.println("Please type in a mathematical expression:");
            String string_input = input.nextLine();
            String expression = string_input.replaceAll(" ", "");
            String final_string = "";
            int j = 0;
            for (int i = 0; i < expression.length(); i++) {
                if (expression.charAt(i) == '*' || expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '/' || expression.charAt(i) == '^') {
                    final_string += expression.substring(j, i) + " " + expression.charAt(i) + " ";
                    j = i + 1;
                }
            }
            final_string += expression.substring(j, expression.length());
            InputProcessor user = new InputProcessor(final_string);
            System.out.println(final_string);
            System.out.println(user.processInput().compute());
            System.out.println("Please type in Q to stop the calculator, or press enter to continue: ");
            temp = input.nextLine();
        } while (!Objects.equals(temp, "Q"));
    }
}






