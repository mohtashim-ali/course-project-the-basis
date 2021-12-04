package UseCase;

import Entity.UserEntity;
import Gateway.UserList;

import java.io.IOException;
import java.util.Scanner;

public class ValidateLogin {

    private final UserEntity user;
    private final UserList list;

    public ValidateLogin(UserEntity user1, UserList list1) throws IOException, ClassNotFoundException {
        this.user = user1;
        this.list = list1;

    }

    /**
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public String validatePassword() throws IOException, ClassNotFoundException {
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
     * @throws IOException
     * @throws ClassNotFoundException
     */

    public String validateUsername() throws IOException, ClassNotFoundException {
        while ((list.readWithUsername(this.user.getUsername()).isEmpty())) {
            System.out.println("This user does not exist, please try a different account: ");
            Scanner username = new Scanner(System.in);
            String potUser = username.nextLine();
            user.setUsername(potUser);
        }
        return user.getUsername();
    }

}