package UseCase;

import Entity.UserEntity;
import Entity.UserList;

import java.io.IOException;
import java.util.*;

public class UserSignUp {

    private final UserEntity newuser = new UserEntity();
    private final UserList list = new UserList();

    private String user;
    private String pass;

    public void signUp() throws IOException, ClassNotFoundException {
        Scanner info = new Scanner(System.in);
        System.out.println("Username: ");
        this.user = info.nextLine();
        ValidateUsername potUser = new ValidateUsername(this.user, list);
        this.user = potUser.isTaken();
        System.out.println("Password: ");
        this.pass = info.nextLine();

        newuser.setUsername(user);
        newuser.setPassword(pass);


//        UserList list = new UserList();
        list.writeToFile(newuser.getUserInfo());
    }


}
