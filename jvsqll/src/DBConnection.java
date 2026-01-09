import java.sql.*;

public class DBConnection {
 public static Connection getConnection() throws SQLException {
     String url = "jdbc:postgresql://localhost:5432/assignment3";
String user = "postgres";
 String password = "366336";
 return DriverManager.getConnection(url, user, password);
 }
}