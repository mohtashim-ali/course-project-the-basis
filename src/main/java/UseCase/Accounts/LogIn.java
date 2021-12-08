package UseCase.Accounts;

import Entity.User;

import java.io.IOException;

public interface LogIn {

    User logIn() throws IOException, ClassNotFoundException;
}
