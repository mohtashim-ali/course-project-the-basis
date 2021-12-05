package UI;
import Controller.CalculatorController;
import Entity.ExpressionException;

import java.io.IOException;
import java.util.*;

public class CalculatorUI {

    public static void main(String[] args) throws IOException, ClassNotFoundException, ExpressionException {

        Scanner read = new Scanner(System.in);
        System.out.println("1. Log In");
        System.out.println("2. Sign Up");
        int log = read.nextInt();
        CalculatorController control = new CalculatorController();
        control.setChoice(log);
        if (control.handleUser()) {
            Scanner math = new Scanner(System.in);
            System.out.println("1. Compute");
            System.out.println("2. Matrix");
            System.out.println("3. My history");
            int choice = math.nextInt();
            control.setChoice(choice);
            if (choice == 1) {
                System.out.println("Please enter your mathematical expression");
            } else if (choice == 2) {
                System.out.println("Please enter your matrix");
            }
            Scanner expression = new Scanner(System.in);
            String input = expression.nextLine();
            control.handleOperations(input);
        }
    }
}

