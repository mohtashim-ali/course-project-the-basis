package UseCase.Accounts;

import Entity.UserEntity;

public class CurrentUser {

    private UserEntity user;

    public void setCurrentUser(UserEntity user){
        this.user = user;

    }
    public UserEntity getCurrentUser(){
        return user;
    }

}
