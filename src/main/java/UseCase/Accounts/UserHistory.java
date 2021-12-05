package UseCase.Accounts;

import Gateway.History;
import java.io.IOException;
import java.util.ArrayList;

public class UserHistory {

    private History list = new History();
    private CurrentUser curr = new CurrentUser();

    public void setCurr(CurrentUser curr){
        this.curr = curr;
    }


    public void addToHistory(String operation, String time){
        list.writeToFile(curr.getCurrentUser().getUsername() + "," + operation + time);
    }

    public ArrayList<String> readFromHistory() throws IOException {
        return list.readWithUsername(curr.getCurrentUser().getUsername());
    }
}
