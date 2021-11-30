package Entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class UserList implements Database{

    final String filepath = "users.txt";

    /**
     * Writes to users.txt in the format "USERNAME,PASSWORD"
     * @param newLine
     * @throws IOException
     */

    @Override
    public void writeToFile(String newLine) throws IOException {
        try {
            FileWriter myWriter = new FileWriter(filepath, true);
            PrintWriter printWriter = new PrintWriter(myWriter);
            printWriter.println(newLine);
            printWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     *
     * @param username
     * @return The password associated with that username or an empty list if the account doesn't exist.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Override
    public ArrayList<String> readWithUsername(String username) throws IOException, ClassNotFoundException {
        ArrayList<String> final_result = new ArrayList<>();
        File myObj = new File(filepath);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] split = data.split(",");
            if (split[0].equals(username)) {
                final_result.add(split[1]);
            }
        }
        myReader.close();
        return final_result;
    }
}
