package Gateway;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserList implements Database{

    final String filepath = "users.txt";

    /**
     * Writes to users.txt in the format "USERNAME;PASSWORD"
     * @param newLine input string
     */

    @Override
    public void writeToFile(String newLine) {
        try {
            FileWriter myWriter = new FileWriter(filepath, true);
            PrintWriter printWriter = new PrintWriter(myWriter);
            printWriter.print(newLine + "\n");
            printWriter.close();
            System.out.println("You have successfully signed up!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     *
     * @param username username
     * @return The password associated with that username or an empty list if the account doesn't exist.
     */
    @Override
    public ArrayList<String> readWithUsername(String username) {
        ArrayList<String> final_result = new ArrayList<>();
        File myObj = new File(filepath);
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
        }
        while (true) {
            assert myReader != null;
            if (!myReader.hasNextLine()) break;
            String data = myReader.nextLine();
            String[] split = data.split(";");
            if (split[0].equals(username)) {
                final_result.add(split[1]);
            }
        }
        myReader.close();
        return final_result;
    }
}
