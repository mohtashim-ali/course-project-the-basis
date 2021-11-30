package Controller;

import UseCase.UserLogIn;
import UseCase.UserSignUp;

import java.io.IOException;

public class CalculatorController {

    private int choice;

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void handleUser() throws IOException, ClassNotFoundException {
        if (choice == 1){
            UserLogIn login = new UserLogIn();
            login.logIn();
        }
        else{
            UserSignUp signup = new UserSignUp();
            signup.signUp();
        }
    }
}
