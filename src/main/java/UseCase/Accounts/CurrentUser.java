package UseCase.Accounts;

import Entity.UserEntity;

public class CurrentUser {

    public UserEntity user;

    public void setCurrentUser(UserEntity user2){
        this.user = user2;

    }
    public UserEntity getCurrentUser(){
        return user;
    }

}
