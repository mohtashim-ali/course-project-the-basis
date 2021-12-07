package UseCase.Accounts;

import Entity.User;

public class CurrentUser {

    public User user;

    public void setCurrentUser(User user2){
        this.user = user2;

    }
    public User getCurrentUser(){
        return user;
    }

}
