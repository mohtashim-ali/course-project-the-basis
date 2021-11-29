package Controller;
import Entity.User;

import java.io.IOException;

public class UserInputController {

    private int choice;
    private String user;
    private String pass;


    public void setStatus(int input) {
        this.choice = input;
    }

    public int getStatus() {
        return choice;
    }

    public void setUser(String input) {
        this.user = input;
    }

    public String getUser() {
        return user;
    }

    public void setPass(String input) {
        this.pass = input;
    }

    public String getPass() {
        return pass;
    }

    public boolean login() throws IOException {
        User existing = new User(this.user, this.pass);
        return existing.login(existing.username, existing.password);
    }

    public void signup() throws IOException {
        User existing = new User(this.user, this.pass);
        existing.signUp();
    }



}
