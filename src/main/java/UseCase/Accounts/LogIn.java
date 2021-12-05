package UseCase.Accounts;

import Entity.UserEntity;

import java.io.IOException;

public interface LogIn {

    UserEntity logIn() throws IOException, ClassNotFoundException;
}
