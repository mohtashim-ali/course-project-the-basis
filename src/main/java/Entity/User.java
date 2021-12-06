package Entity;

import UseCase.ConnectionManager;

import java.io.IOException;
import java.util.ArrayList;


public class User {
    /***
     * Class for a user
     */


    public final String username;
    public final String password;
    private final ConnectionManager users = new ConnectionManager("users.txt");
    private final ConnectionManager history = new ConnectionManager("history.txt");

    /***
     * Creates a user with a username and a password.
     * @param username
     * @param password
     */
    public User(String username, String password) throws IOException {
        this.username = username;
        this.password = password;
    }

    /**
     * Adds this user to the database
     */
    public void signUp() {
        try {
            users.addToFile(this.username + "," + this.password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return True if account exists, and you've succesfully signed in.
     */
    public boolean login(String user, String pass) throws IOException {
        ArrayList<String> thisUser = users.searchByKeyword(user);
        if(thisUser.isEmpty()) {
            return false;
        } else {
            return thisUser.get(0).equals(pass);
        }
    }

    public ArrayList<String> getHistory() throws IOException {
        return history.searchByKeyword(this.username);
    }

    public String getUsername() {
        return this.username;
    }
}


