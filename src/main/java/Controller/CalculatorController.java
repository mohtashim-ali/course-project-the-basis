package Controller;

import Entity.ExpressionException;
import UseCase.Accounts.*;
import UseCase.BasicOperations.Parser;
import UseCase.BasicOperations.ParserException;
import UseCase.LinAlg.BuildExpression;
import UseCase.LinAlg.ComputeMatrix;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculatorController {

    private UserHistory userHistory;



//    public boolean handleUser() {
//            if (choice == 1) {
//                UserLogIn login = new UserLogIn();
//                try {
//                    curr.setCurrentUser(login.logIn());
//                } catch (IOException | ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//                userHistory.setCurr(curr);
//                System.out.println("You have successfully logged in!");
//                return true;
//            } else if (choice == 2) {
//                UserSignUp signup = new UserSignUp();
//                try {
//                    curr.setCurrentUser(signup.signUp());
//                } catch (IOException | ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//                userHistory.setCurr(curr);
//                System.out.println("You have successfully signed up!");
//                return true;
//            }
//            else{
//                System.out.println("Invalid Option, Please Try Again!");
//                Scanner input = new Scanner(System.in);
//                choice = input.nextInt();
//                return handleUser();
//            }
//    }

    public void handleOperations(){
        System.out.println("1. Compute");
        System.out.println("2. Matrix");
        System.out.println("3. My History");
        System.out.println("4. Switch Accounts");
        System.out.println("5. Power Off");
        Scanner math = new Scanner(System.in);
        int choice = math.nextInt();
        if(choice == 1) {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
            BuildExpression buildExpression = new BuildExpression();
            StringBuilder fixed_input = buildExpression.createExpression();
            userHistory.addToHistory(fixed_input.toString(), formatter.format(date)); // Temporary time
            Parser p = new Parser(fixed_input.toString());
            try {
                System.out.println(p.stringToExpression().compute());
                handleOperations();
            } catch (ParserException e){
                System.out.println("Invalid operator, please try again!");
                handleOperations();
            }catch (ExpressionException ex){
                System.out.println("Invalid Expression, please try again!");
                handleOperations();
            }
        } else if (choice == 2) {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
            ComputeMatrix computeMatrix = new ComputeMatrix();
            userHistory.addToHistory(String.valueOf(computeMatrix.computeMatrix()), formatter.format(date));
            handleOperations();
        } else if (choice == 3) {
            try{
                userHistory.readFromHistory();
                handleOperations();
            } catch (IOException e){
                System.out.println("Could not read from file");
                handleOperations();
            }

        }
        else if (choice == 4){
            System.out.println("You have been successfully logged out!");
            System.out.println("Log-In Menu");
            UserController n = new UserController();
            n.setChoice(1);
            n.handleUser();
            handleOperations();
        }
        else if (choice == 5){
            System.out.println("Thank you for using The Basis Calculator!");
            System.exit(0);
        }
        else{
            System.out.println("Invalid Option, Please Try Again!");
            handleOperations();
        }
    }

    public void setUserHistory(UserHistory userHistory) {
        this.userHistory = userHistory;
    }
}
