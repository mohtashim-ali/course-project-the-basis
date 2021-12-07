package UseCase.Accounts;

import Entity.UserEntity;
import Gateway.UserList;

import java.io.IOException;
import java.util.*;

public class UserSignUp {

    private final UserEntity newer = new UserEntity();
    private final UserList list = new UserList();

    public UserEntity signUp() throws IOException, ClassNotFoundException {
        ValidateSignup validateSignup = new ValidateSignup(newer, list);
        Scanner info = new Scanner(System.in);
        System.out.println("Username: ");
        newer.setUsername(info.nextLine());
        newer.setUsername(validateSignup.isTaken());
        System.out.println("Password: ");
        newer.setPassword(info.nextLine());


        list.writeToFile(newer.getUserInfo());
        return this.newer;
    }


}
