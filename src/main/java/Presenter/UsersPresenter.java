package Presenter;

public class UsersPresenter {

    public String welcome() {
        return "Welcome to The Basis Calculator!";
    }

    public String enterExistingUsername() {
        return "Please type in your username: ";
    }

    public String enterNewUsername() {
        return "Please type in a username: ";
    }

    public String enterExistingPassword() {
        return "Please type in your password: ";
    }

    public String enterNewPassword() {
        return "Please type in a password: ";
    }

    public String enterToContinue() {
        return "Press enter to continue.";
    }

    public String closingMessage(){
        return "Thank you for using The Basis Calculator!";
    }

    public String logInMessage(){
        return "You are now logged in!";
    }

    public String signUpMessage(){
        return "You have successfully signed up!";
    }

    public String existingUser(){
        return "Sorry, that username is taken. Please try a different name: ";
    }

    public String wrongPassword(){
        return "Incorrect Password, please try again: ";
    }

}
