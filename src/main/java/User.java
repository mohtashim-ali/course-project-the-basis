import java.util.Map;
import java.util.Objects;


public class User {



   private final Map<String, String> users;


    public User(Map<String, String> users) {
        this.users = users;
    }

    public boolean signUp(String username, String password){
        if (this.users.containsKey(username)){
            return false;
        }
        else {
            this.users.put(username, password);
            return true;
        }
    }

    public boolean login(String username, String password){
        if (this.users.containsKey(username)){
            if (Objects.equals(this.users.get(username), password)){
                System.out.println("Successfully logged in!");
                return true;

            }
            }
        return false;
    }
    }

