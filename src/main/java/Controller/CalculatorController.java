package Controller;

import Entity.ExpressionException;
import UseCase.*;
import UseCase.InputProcessor;
import UseCase.Accounts.CurrentUser;
import UseCase.Accounts.UserHistory;
import UseCase.Accounts.UserLogIn;
import UseCase.Accounts.UserSignUp;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CalculatorController {

    private int choice;
    private CurrentUser curr = new CurrentUser();
    private UserHistory userHistory = new UserHistory();


    public void setChoice(int choice) {
        this.choice = choice;
    }

    public boolean handleUser() throws IOException, ClassNotFoundException {
        if (choice == 1){
            UserLogIn login = new UserLogIn();
            curr.setCurrentUser(login.logIn());
            userHistory.setCurr(curr);
            return true;
        }
        else if (choice == 2){
            UserSignUp signup = new UserSignUp();
            curr.setCurrentUser(signup.signUp());
            userHistory.setCurr(curr);
            return true;
        }
        return false;
    }

    public void handleOperations(String input) throws IOException, ExpressionException, ParserException {
        if(this.choice == 1) {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
            BuildExpression buildExpression = new BuildExpression();
            buildExpression.setInput(input);
            StringBuilder fixed_input = buildExpression.makeExpression();
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
    }
}
