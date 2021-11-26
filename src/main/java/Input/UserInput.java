package Input;
import History.ConnectionManager;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UserInput {

    public static void main(String[] args) throws IOException {

        UserInputController user1 = new UserInputController();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Welcome to the Basis Calculator! Please select an option from below:");
        System.out.println("1. Log In");
        System.out.println("2. Sign Up");

        int choice = input1.nextInt();

        user1.setStatus(choice);
        if (user1.getStatus() == 1) {
            Scanner log = new Scanner(System.in);
            System.out.println("Please enter your username: ");
            String olduser = log.nextLine();
            System.out.println("Please enter your password: ");
            String oldpass = log.nextLine();
            user1.setUser(olduser);
            user1.setPass(oldpass);
            if (!user1.login()) {
                while (!user1.login()) {
                    Scanner log2 = new Scanner(System.in);
                    System.out.println("Incorrect Password, please try again: ");
                    String pass2 = log2.nextLine();
                    user1.setUser(olduser);
                    user1.setPass(pass2);
                }
                System.out.println("Correct Password, you are now logged in!");
            } else {
                System.out.println("You are now logged in!");
            }
        } else if (user1.getStatus() == 2) {
            Scanner log1 = new Scanner(System.in);
            System.out.println("Please enter your username: ");
            String newuser = log1.nextLine();
            System.out.println("Please enter your password: ");
            String newpass = log1.nextLine();
            user1.setUser(newuser);
            user1.setPass(newpass);
            user1.signup();
            user1.login();
        }
        String temp = "G";
        do {
            System.out.println("Please select an option from below:");
            System.out.println("1. Compute");
            System.out.println("2. View History");
            System.out.println("3. Power Off");
            int input2 = input1.nextInt();
            if (input2 == 1) {
                System.out.println("Add Compute");
            }
            else if (input2 == 2){
                System.out.println("Add History");
            }
            else if (input2 == 3) {
                System.out.println("Thank you for using The Basis Calculator!");
                temp = "Q";
            }
        } while (!Objects.equals(temp, "Q"));

    }
}