package UseCase;

import Entity.UserEntity;
import Entity.UserList;

import java.io.IOException;
import java.util.Scanner;

public class ValidateUsername {

    private String user;
    private final UserList list;

    public ValidateUsername(String user1, UserList list1) throws IOException, ClassNotFoundException {
        this.user = user1;
        this.list = list1;

    }

    /**
     *
     * Checks if username exists
     * @throws IOException
     * @throws ClassNotFoundException
     */

    public String valid() throws IOException, ClassNotFoundException {
        while ((list.readWithUsername(this.user).isEmpty())) {
            System.out.println("This user does not exist, please try a different account: ");
            Scanner username = new Scanner(System.in);
            this.user = username.nextLine();
        }
        return this.user;
    }

    /**
     * Checks if username is already taken when signing up
     */
    public String isTaken() throws IOException, ClassNotFoundException {
        while (!(list.readWithUsername(this.user).isEmpty())) {
            System.out.println("This username is already taken, please try another one.");
            Scanner potUser = new Scanner(System.in);
            this.user = potUser.nextLine();
        }
        return this.user;
    }
}