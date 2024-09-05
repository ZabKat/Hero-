

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sys";
        String username = "HeroCO";
        String password = "HeroCO2";

        try {
            // MySQL-Treiber explizit laden (wichtig für einige Umgebungen)
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully");

            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error while connecting to the database");
        }
    }
}
