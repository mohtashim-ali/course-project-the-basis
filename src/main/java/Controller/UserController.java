package Controller;

import UseCase.Accounts.CurrentUser;
import UseCase.Accounts.UserHistory;
import UseCase.Accounts.UserLogIn;
import UseCase.Accounts.UserSignUp;

import java.io.IOException;
import java.util.Scanner;

public class UserController {

    private int choice;
    private final CurrentUser curr = new CurrentUser();
    private final UserHistory userHistory = new UserHistory();
    private CalculatorController control = new CalculatorController();


    public void setChoice(int choice) {
        this.choice = choice;
    }


    public boolean handleUser() {
        if (choice == 1) {
            UserLogIn login = new UserLogIn();
            try {
                curr.setCurrentUser(login.logIn());
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            userHistory.setCurr(curr);
            System.out.println("You have successfully logged in!");
            control.setUserHistory(userHistory);
            control.handleOperations();
            return true;
        } else if (choice == 2) {
            UserSignUp signup = new UserSignUp();
            try {
                curr.setCurrentUser(signup.signUp());
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            userHistory.setCurr(curr);
            System.out.println("You have successfully signed up!");
            control.setUserHistory(userHistory);
            control.handleOperations();
            return true;
        }
        else{
            System.out.println("Invalid Option, Please Try Again!");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            return handleUser();
        }
    }
}
