package Entity;

import java.io.IOException;

public interface Database {
    void writeToFile(String filepath) throws IOException;
    void readFromFile(String filepath, String username) throws IOException, ClassNotFoundException;
}
