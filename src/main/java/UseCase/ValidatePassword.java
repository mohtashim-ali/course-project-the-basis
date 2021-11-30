package UseCase;

import Entity.UserEntity;
import Entity.UserList;

import java.io.IOException;
import java.util.Scanner;

public class ValidatePassword {

    private final UserEntity user;
    private final UserList list;

    public ValidatePassword(UserEntity user1, UserList list1) throws IOException, ClassNotFoundException {
        this.user = user1;
        this.list = list1;

    }

    public boolean valid() throws IOException, ClassNotFoundException {
        while (list.readWithUsername(user.getUsername()).isEmpty()) {

            System.out.println("Incorrect password, please try again: ");
            Scanner pass = new Scanner(System.in);
            String password = pass.nextLine();
            user.setPassword(password);

        }
        return true;

    }
}

