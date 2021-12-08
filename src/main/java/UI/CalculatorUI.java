package UI;
import Controller.userController;
import Controller.operationController;
import java.util.*;

public class CalculatorUI {

    public static boolean quit = false;
    public userController userControl = new userController();
    public operationController operationControl = new operationController();

    public void main() {

        Scanner read = new Scanner(System.in);
        System.out.println("1. Log In");
        System.out.println("2. Sign Up");
        int log = read.nextInt();
        userControl.setChoice(log);
        if (userControl.handleUser()) {
            do {
                System.out.println("1. Compute");
                System.out.println("2. Matrix");
                System.out.println("3. My History");
                System.out.println("4. Switch Accounts");
                System.out.println("5. Power Off");
                Scanner math = new Scanner(System.in);
                int choice = math.nextInt();
                operationControl.setCurr(userControl.getCurr());
                operationControl.setChoice(choice);
                operationControl.handleOperations();
            } while (!quit); // allows the menu options to keep on running
        }
        else{
            System.out.println("Invalid input, please try again!");
            main();
        }
    }

}