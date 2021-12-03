package UseCase;

import Entity.History;
import Entity.UserEntity;

import java.io.IOException;

public class UserHistory {

    private History list;
    private CurrentUser curr;


    public void setList(History list){
        this.list = list;
    }

    public void setCurr(CurrentUser curr){
        this.curr = curr;
    }


    public void addToHistory(String operation, String time){
        list.writeToFile(curr.getCurrentUser().getUsername() + "," + operation + time);
    }

    public void readFromHistory() throws IOException {
        list.readWithUsername(curr.getCurrentUser().getUsername());
    }
}
