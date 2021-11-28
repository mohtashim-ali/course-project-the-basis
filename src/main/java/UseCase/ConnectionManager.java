package UseCase;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

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
            if(this.filename.equals("users.txt") && words[0].equals(keyword)) {
                output.add(words[1]);
            } else if(this.filename.equals("history.txt") && words[1].equals(keyword)) {
                output.add(words[0] + "," + words[2]);
            }
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        ConnectionManager users = new ConnectionManager("history.txt");
        ArrayList<String> fc = users.searchByKeyword("moh");
        //System.out.println(fc.get(0));
        Date date = GregorianCalendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        System.out.println(sdf.format(date));

    }

}
