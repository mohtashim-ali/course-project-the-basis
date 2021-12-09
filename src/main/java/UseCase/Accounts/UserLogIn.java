package UseCase.Accounts;

import Entity.User;
import Gateway.UserList;

import java.util.*;

public class UserLogIn implements LogIn{

    private final User user = new User();
    private final UserList list = new UserList();

    /**
     * Logs in a user
     * @return the logged-in user
     */
    @Override
    public User logIn() {
        ValidateLogin validateLogin = new ValidateLogin(user, list);

        Scanner info = new Scanner(System.in);
        System.out.println("Username: ");
        user.setUsername(info.nextLine());
        user.setUsername(validateLogin.validateUsername());
        System.out.println("Password: ");
        user.setPassword(info.nextLine());
        user.setPassword(validateLogin.validatePassword());
        return this.user;
    }
}
