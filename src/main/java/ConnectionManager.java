import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ConnectionManager {

    public String filename;

    public ConnectionManager(String filename) {
        this.filename = filename;
    }

    public void addToFile(String input) throws IOException {
        FileWriter fw = new FileWriter(this.filename, true);
        PrintWriter printWriter = new PrintWriter(fw);
        printWriter.println(input);
        printWriter.close();
    }


    public ArrayList<String> searchByKeyword(String keyword) throws IOException {
        ArrayList<String> output = new ArrayList<>();
        String[] words;
        FileReader fr = new FileReader(this.filename);
        BufferedReader br = new BufferedReader(fr);
        String str;
        while((str = br.readLine()) != null) {
            words = str.split(",");
            if(words[0].equals(keyword)) {
                output.add(words[1]);
            }
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        ConnectionManager users = new ConnectionManager("users.txt");
        ArrayList<String> fc = users.searchByKeyword("Achraf");
        System.out.println(fc.isEmpty());

    }

}
