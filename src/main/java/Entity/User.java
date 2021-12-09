package Entity;

public class User {

    private String username;
    private String password;

    /**
     * sets the username of a user
     * @param username String username of the user
     */
    public void setUsername(String username){
        this.username = username;
    }

    /**
     * returns the username upon request
     * @return String username
     */
    public String getUsername(){
        return username;
    }

    /**
     * sets the password of the user
     * @param password - String password
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * returns the user's password upon request
     * @return String
     */
    public String getPassword(){
        return password;
    }

    /**
     * returns the user's username and password as one string
     * @return String
     */
    public String getUserInfo(){
        return username + "," + password;
    }
}
