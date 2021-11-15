import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


public class WalkthroughCustomInput {

    public static void main(String[] args) throws ExpressionException, IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to The Basis Calculator! You will now be prompted to sign up!");
        System.out.println("Please type in a username: ");
        String username = input.nextLine();
        System.out.println("Please type in a password: ");
        String password = input.nextLine();
        User new_user = new User(username, password);
        new_user.signUp();
        new_user.login(username, password);

        System.out.println("You are now logged in!");
        String temp;
        do {
            ConnectionManager history = new ConnectionManager("history.txt");
            System.out.println("1. Compute");
            System.out.println("2. History");
            int input1 = input.nextInt();
            if (input1 == 1) {
                Date date = GregorianCalendar.getInstance().getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
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
                history.addToFile(sdf.format(date) + "," + new_user.getUsername() + "," + final_string);
                System.out.println(final_string);
                System.out.println(user.processInput().compute());

            }
            else if(input1 == 2) {
                ArrayList<String> calculations = new_user.getHistory();
                System.out.printf("%5s %16s", "TIME", "OPERATION \n");
                for(String calc: calculations) {
                    String[] split = calc.split(",");
                    System.out.format("%6s%14s", split[0], split[1] + "\n");
                }
            }

            System.out.println("Please type in Q to stop the calculator, or press enter to continue: ");
            temp = input.nextLine();
        } while (!Objects.equals(temp, "Q"));

    }
}







