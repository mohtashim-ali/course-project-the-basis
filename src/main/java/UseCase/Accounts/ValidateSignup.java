package UseCase.Accounts;

import Entity.UserEntity;
import Gateway.UserList;

import java.io.IOException;
import java.util.Scanner;

public class ValidateSignup {

    private UserEntity user;
    private final UserList list;

    public ValidateSignup(UserEntity user, UserList list1) throws IOException, ClassNotFoundException {
        this.user = user;
        this.list = list1;
    }

    /**
     * Checks if username is already taken when signing up
     */
    public String isTaken() throws IOException, ClassNotFoundException {
        while (!(list.readWithUsername(this.user.getUsername()).isEmpty())) {
            System.out.println("This username is already taken, please try another one.");
            Scanner potUser = new Scanner(System.in);
            String username = potUser.nextLine();
            user.setUsername(username);
        }
        return user.getUsername();
    }

}