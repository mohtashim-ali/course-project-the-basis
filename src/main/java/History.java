import java.util.ArrayList;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Scanner;

public class History {
    /**
     * Stores all previous inputs/calculations.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please type in a mathematical expression:");
        String string_input = input.nextLine();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HistoryCalculator", "root", "Class123");

            Statement statement = connection.createStatement();
            String sql = "INSERT INTO history" + " (first_name, calculation)" + " values ('Kyle','" + string_input + "')";
            // ResultSet resultSet = statement.executeQuery("select * from history");
            statement.executeUpdate(sql);
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("calculation"));
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
