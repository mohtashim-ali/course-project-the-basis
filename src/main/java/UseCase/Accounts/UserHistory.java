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
        list.writeToFile(curr.getCurrentUser().getUsername() + "," + operation + "," + time);
    }

    public void readFromHistory() throws IOException {
        toTable(list.readWithUsername(curr.getCurrentUser().getUsername()));
    }

    /**
     * Helper for readFromHistory
     * @return History in a table form
     */
    public void toTable(ArrayList<String> history) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %20s", "CALC", "TIME");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(String info: history){
            String[] splitList = info.split(";");
            System.out.format("%10s %20s",
                    splitList[0], splitList[1]);
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}
