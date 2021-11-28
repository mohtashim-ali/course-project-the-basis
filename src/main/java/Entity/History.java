package Entity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 */

public class History implements Database {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        History h = new History();
        h.writeToFile("history.txt");
        h.readFromFile("history.txt", );
    }

    @Override
    public void writeToFile(String filepath) throws IOException {
        try {
            FileWriter myWriter = new FileWriter(filepath);
            myWriter.write("Hamza");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public void readFromFile(String filepath, String username) throws IOException, ClassNotFoundException {
        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
