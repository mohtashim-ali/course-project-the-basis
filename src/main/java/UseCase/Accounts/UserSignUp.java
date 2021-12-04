package UseCase.Accounts;

import Entity.UserEntity;
import Gateway.UserList;

import java.io.IOException;
import java.util.*;

public class UserSignUp {

    private final UserEntity newuser = new UserEntity();
    private final UserList list = new UserList();

    public void signUp() throws IOException, ClassNotFoundException {
        ValidateSignup validateSignup = new ValidateSignup(newuser, list);
        Scanner info = new Scanner(System.in);
        System.out.println("Username: ");
        newuser.setUsername(info.nextLine());
        newuser.setUsername(validateSignup.isTaken());
        System.out.println("Password: ");
        newuser.setPassword(info.nextLine());


        list.writeToFile(newuser.getUserInfo());
    }


}
