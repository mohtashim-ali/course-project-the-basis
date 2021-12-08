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

    private int choice;
    private final CurrentUser curr = new CurrentUser();
    private final UserHistory userHistory = new UserHistory();


    public void setChoice(int choice) {
        this.choice = choice;
    }


    public boolean handleUser() throws IOException, ClassNotFoundException {
            if (choice == 1) {
                UserLogIn login = new UserLogIn();
                curr.setCurrentUser(login.logIn());
                userHistory.setCurr(curr);
                System.out.println("You have successfully logged in!");
                return true;
            } else if (choice == 2) {
                UserSignUp signup = new UserSignUp();
                curr.setCurrentUser(signup.signUp());
                userHistory.setCurr(curr);
                System.out.println("You have successfully signed up!");
                return true;
            }
            else{
                System.out.println("Invalid Option, Please Try Again!");
                Scanner input = new Scanner(System.in);
                choice = input.nextInt();
                return handleUser();
            }
    }

    public void handleOperations() throws IOException, ParserException, ExpressionException, ClassNotFoundException {
        if(this.choice == 1) {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
            BuildExpression buildExpression = new BuildExpression();
            StringBuilder fixed_input = buildExpression.createExpression();
            userHistory.addToHistory(fixed_input.toString(), formatter.format(date)); // Temporary time
            Parser p = new Parser(fixed_input.toString());
            System.out.println(p.stringToExpression().compute());
        } else if (this.choice == 2) {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
            ComputeMatrix computeMatrix = new ComputeMatrix();
            userHistory.addToHistory(String.valueOf(computeMatrix.computeMatrix()), formatter.format(date));
        } else if (this.choice == 3) {
            userHistory.readFromHistory();
        }
        else if (this.choice == 4){
            choice = 1;
            System.out.println("You have been successfully logged out!");
            System.out.println("Log-In Menu");
            handleUser();
        }
        else if (this.choice == 5){
            System.out.println("Thank you for using The Basis Calculator!");
            System.exit(0);
        }
        else{
            System.out.println("Invalid Option, Please Try Again!");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            handleOperations();
        }
    }
}
