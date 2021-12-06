package UI;
import Controller.CalculatorController;
import Entity.ExpressionException;
import UseCase.ParserException;

import java.io.IOException;
import java.util.*;

public class CalculatorUI {

    public static boolean quit = false;

    public static void main(String[] args) throws IOException, ClassNotFoundException, ExpressionException, ParserException {

        Scanner read = new Scanner(System.in);
        System.out.println("1. Log In");
        System.out.println("2. Sign Up");
        int log = read.nextInt();
        CalculatorController control = new CalculatorController();
        control.setChoice(log);
        if (control.handleUser()) {
            do {
                Scanner math = new Scanner(System.in);
                System.out.println("1. Compute");
                System.out.println("2. Matrix");
                System.out.println("3. My history");
                int choice = math.nextInt();
                control.setChoice(choice);
                if (choice == 1) {
                    System.out.println("Please enter your mathematical expression");
                }
                Scanner expression = new Scanner(System.in);
                String input = expression.nextLine();
                control.handleOperations(input);
                System.out.println("Press enter to return to the main menu, or Q to quit");
                Scanner temp = new Scanner(System.in);
                if (Objects.equals(temp.nextLine(), "Q")) {
                    quit = true;
                    System.exit(0);
                }
            } while (!quit);
        }
    }
}

