import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;


public class WalkthroughCustomInput {

    public static void main(String[] args) throws ExpressionException, IOException {
        //HashMap<String, String> logins = new HashMap<>();
        //User usr = new User(logins);

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to The Basis Calculator! You will now be prompted to sign up!");
//        System.out.println("1. Log In");
//        System.out.println("2. Sign Up");
//        int selection = input.nextInt();
//        if (selection == 1) {
        System.out.println("Please type in a username: ");
        String username = input.nextLine();
        System.out.println("Please type in a password: ");
        String password = input.nextLine();
        User new_user = new User(username, password);
        new_user.signUp();
        new_user.login(username, password);

//           if (selection == 2) {
//            Scanner input1 = new Scanner(System.in);
//            System.out.println("Please type in your username: ");
//            String username = input1.nextLine();
//            System.out.println("Please type in your password: ");
//            String password = input1.nextLine();
//            User logged_in_user = new User(username, password);
//            System.out.println(logged_in_user.login(username, password));
//
//            while (!logged_in_user.login(username, password)) {
//                System.out.println("Incorrect password, please try again: ");
//                password = input.nextLine();
//            }
//        }
        System.out.println("You are now logged in!");
        String temp;
        do {
            ConnectionManager history = new ConnectionManager("history.txt");
            System.out.println("1. Compute");
            System.out.println("2. History");
            int input1 = input.nextInt();
            if (input1 == 1) {
                Scanner input2 = new Scanner(System.in);
                System.out.println("Please type in a mathematical expression:");
                String string_input = input2.nextLine();
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
                history.addToFile(new_user.getUsername() + "," + final_string);
                System.out.println(final_string);
                System.out.println(user.processInput().compute());

            }
            else if(input1 == 2) {
                System.out.println(new_user.getHistory());
            }

            System.out.println("Please type in Q to stop the calculator, or press enter to continue: ");
            temp = input.nextLine();
        } while (!Objects.equals(temp, "Q"));


//            System.out.println("Please type in a mathematical expression:");
//            String string_input = input.nextLine();
//            String expression = string_input.replaceAll(" ", "");
//            String final_string = "";
//            int j = 0;
//            for (int i = 0; i < expression.length(); i++) {
//                if (expression.charAt(i) == '*' || expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '/' || expression.charAt(i) == '^') {
//                    final_string += expression.substring(j, i) + " " + expression.charAt(i) + " ";
//                    j = i + 1;
//                }
//            }
//            final_string += expression.substring(j, expression.length());
//            InputProcessor user = new InputProcessor(final_string);
//            System.out.println(final_string);
//            System.out.println(user.processInput().compute());
//            System.out.println("Please type in Q to stop the calculator, or press enter to continue: ");
    }
}







