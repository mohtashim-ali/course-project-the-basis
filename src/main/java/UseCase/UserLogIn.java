package UseCase;

import Entity.UserEntity;
import Entity.UserList;

import java.io.IOException;
import java.util.*;

public class UserLogIn implements LogIn{

    private final UserEntity oldUser = new UserEntity();
    private final UserList list = new UserList();

    private String user;
    private String pass;

    @Override
    public boolean logIn() throws IOException, ClassNotFoundException {

        Scanner info = new Scanner(System.in);
        System.out.println("Username: ");
        this.user = info.nextLine();
        System.out.println("Password: ");
        this.pass = info.nextLine();

        oldUser.setUsername(user);
        oldUser.setPassword(pass);

        ValidatePassword valid = new ValidatePassword(oldUser, list);

        valid.valid();


        return true;
    }
}
