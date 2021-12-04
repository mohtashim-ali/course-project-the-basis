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
        System.out.println("3. Compute");
        System.out.println("5. Linear Algebra");
        int log = read.nextInt();
        CalculatorController control = new CalculatorController();
        control.setChoice(log);
        control.handleUser();
        }
    }

