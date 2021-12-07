//package Controller;
//
//import Entity.ExpressionException;
//import UseCase.BasicOperations.ParserException;
//
//import java.io.IOException;
//import java.util.Objects;
//import java.util.Scanner;
//
//public class CalculationController {
//
//    public boolean calc(CalculatorController control) throws IOException, ClassNotFoundException, ParserException, ExpressionException {
//        if (control.handleUser()) {
//            boolean quit = false;
//            do {
//                Scanner math = new Scanner(System.in);
//                System.out.println("1. Compute");
//                System.out.println("2. Matrix");
//                System.out.println("3. My history");
//                int choice = math.nextInt();
//                control.setChoice(choice);
//                if (choice == 1) {
//                    System.out.println("Please enter your mathematical expression");
//                }
//                Scanner expression = new Scanner(System.in);
//                String input = expression.nextLine();
//                control.handleOperations(input);
//                System.out.println("Press enter to return to the main menu, or Q to quit");
//                Scanner temp = new Scanner(System.in);
//                if (Objects.equals(temp.nextLine(), "Q")) {
//                    quit = true;
//                    System.exit(0);
//                }
//            } while (!quit);
//        }
//        else{
//            System.out.println("Invalid Input, please try again!");
//            calc();
//        }
//    }
//}
