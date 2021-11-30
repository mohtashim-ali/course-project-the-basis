package UI;
import Controller.CalculatorController;

import java.io.IOException;
import java.util.*;

public class CalculatorUI {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner read = new Scanner(System.in);
        System.out.println("1. Log In");
        System.out.println("2. Sign Up");
        int log = read.nextInt();
        CalculatorController control = new CalculatorController();
        control.setChoice(log);
        control.handleUser();
        }
    }

