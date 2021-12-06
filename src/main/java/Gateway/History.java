package Gateway;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Should we also pass in the username/calculations...?
 */

public class History implements Database {

    final String filepath = "history.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserList newLine = new UserList();
        newLine.writeToFile("Achraf,password");
        System.out.println(newLine.readWithUsername("Moh"));
    }

    /**
     * Writes to history.txt in the format "USERNAME;CALCULATION;DATE".
     * @param newLine
     */
    @Override
    public void writeToFile(String newLine) {
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
     * @throws IOException
     * @throws ClassNotFoundException
     * return every date/time + calculations associated with that username in the format calculation;date
     */
    @Override
    public ArrayList<String> readWithUsername(String username) throws IOException {
        ArrayList<String> final_result = new ArrayList<>();
        File myObj = new File(filepath);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] split = data.split(";");
            if (split[0].equals(username)) {
                final_result.add(split[1] + ";" + split[2]);
            }
        }
        myReader.close();
        return final_result;
    }
}
