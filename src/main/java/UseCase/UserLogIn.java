package UseCase;

import Entity.UserEntity;
import Entity.UserList;

import java.io.IOException;
import java.util.*;

public class UserLogIn implements LogIn{

    private final UserEntity user = new UserEntity();
    private final UserList list = new UserList();
    private final CurrentUser curr = new CurrentUser();
    private UserHistory hist = new UserHistory();

    @Override
    public boolean logIn() throws IOException, ClassNotFoundException {
        ValidateLogin validateLogin = new ValidateLogin(user, list);

        Scanner info = new Scanner(System.in);
        System.out.println("Username: ");
        user.setUsername(info.nextLine());
        user.setUsername(validateLogin.validateUsername());
        System.out.println("Password: ");
        user.setPassword(info.nextLine());
        user.setPassword(validateLogin.validatePassword());
        return true;
    }
}
