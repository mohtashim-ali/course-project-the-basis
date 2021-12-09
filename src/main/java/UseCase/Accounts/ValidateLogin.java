package UseCase.Accounts;

import Entity.User;
import Gateway.UserList;

import java.util.Scanner;

public class ValidateLogin {

    private final User user;
    private final UserList list;

    public ValidateLogin(User user1, UserList list1){
        this.user = user1;
        this.list = list1;

    }

    /**
     * validates the input password
     * @return password
     */
    public String validatePassword() {
        while (!(list.readWithUsername(user.getUsername()).get(0).equals(this.user.getPassword()))) {
            System.out.println("Incorrect password, please try again: ");
            Scanner pass = new Scanner(System.in);
            String password = pass.nextLine();
            user.setPassword(password);
        }
        System.out.println("Correct Password!");
        return user.getPassword();
    }

    /**
     *
     * Checks if username exists
     */

    public String validateUsername(){
        while ((list.readWithUsername(this.user.getUsername()).isEmpty())) {
            System.out.println("This user does not exist, please try a different account: ");
            Scanner username = new Scanner(System.in);
            String potUser = username.nextLine();
            user.setUsername(potUser);
        }
        return user.getUsername();
    }

}