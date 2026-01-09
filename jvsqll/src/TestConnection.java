import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
public static void main(String[] args) {

 String url = "jdbc:postgresql://localhost:5432/assignment3";
 String user = "postgres";
 String password = "366336";

try {
 Connection conn = DriverManager.getConnection(url, user, password);
 System.out.println("Connection successful!");
 conn.close();
} catch (Exception e) {
 System.out.println("Connection failed!");
 e.printStackTrace();
 }
 }
}
