package Controller;

import Entity.ExpressionException;
import UseCase.Accounts.CurrentUser;
import UseCase.Accounts.UserHistory;
import UseCase.BasicOperations.Parser;
import UseCase.BasicOperations.ParserException;
import UseCase.LinAlg.BuildExpression;
import UseCase.LinAlg.ComputeMatrix;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class operationController {
    /**
     * Handles the operations, given the user's input.
     */

    private int choice;
    private CurrentUser curr;
    private final UserHistory userHistory = new UserHistory();
    private final userController handlingUser = new userController();

    /**
     * Sets current user
     * @param curr2
     */
    public void setCurr(CurrentUser curr2) {
        curr = curr2;
        userHistory.setCurr(curr);
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void handleOperations() {
        if(this.choice == 1) {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
            BuildExpression buildExpression = new BuildExpression();
            StringBuilder fixed_input = buildExpression.createExpression();
            userHistory.addToHistory(fixed_input.toString(), formatter.format(date)); // Temporary time
            Parser p = new Parser(fixed_input.toString());
            try {
                System.out.println(p.stringToExpression().compute());
            } catch (ExpressionException | ParserException e) {
                e.printStackTrace();
            }
        } else if (this.choice == 2) {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
            ComputeMatrix computeMatrix = new ComputeMatrix();
            userHistory.addToHistory(String.valueOf(computeMatrix.computeMatrix()), formatter.format(date));
        } else if (this.choice == 3) {
            try {
                userHistory.readFromHistory();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (this.choice == 4){
            choice = 1;
            System.out.println("You have been successfully logged out!");
            System.out.println("Log-In Menu");
            handlingUser.handleUser();
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
