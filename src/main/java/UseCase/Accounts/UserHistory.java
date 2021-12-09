package UseCase.Accounts;

import Gateway.History;
import java.io.IOException;
import java.util.ArrayList;

public class UserHistory {

    private final History list = new History();
    private CurrentUser curr = new CurrentUser();

    public void setCurr(CurrentUser curr){
        this.curr = curr;
    }


    public void addToHistory(String operation, String time){
        list.writeToFile(curr.getCurrentUser().getUsername() + ";" + operation + ";" + time);
    }

    public void readFromHistory() throws IOException {
        toTable(list.readWithUsername(curr.getCurrentUser().getUsername()));
    }

    /**
     * Helper for readFromHistory
     * prints History in a table form
     */
    public void toTable(ArrayList<String> history) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%1s", "CALCULATION + TIME");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(String info: history){
            String[] splitList = info.split(";");
            //int padding = splitList[0].length()
            System.out.format("%1s %7s",
                    splitList[0], splitList[1]);
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}
