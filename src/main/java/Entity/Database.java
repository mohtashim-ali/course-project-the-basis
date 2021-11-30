package Entity;

import java.io.IOException;
import java.util.ArrayList;

public interface Database {
    void writeToFile(String newLine) throws IOException;
    ArrayList<String> readWithUsername(String username) throws IOException, ClassNotFoundException;
}
