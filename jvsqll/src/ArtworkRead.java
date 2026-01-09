import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ArtworkRead {

 public static void main(String[] args) {

 String sql = "SELECT * FROM artwork";

 try (
 Connection conn = DBConnection.getConnection();
 Statement stmt = conn.createStatement();
 ResultSet rs = stmt.executeQuery(sql)
) {

while (rs.next()) {
 System.out.println(
 rs.getInt("id") + " " +
 rs.getString("title") + " " +
 rs.getInt("year") + " " +
 rs.getInt("artist_id") + " " +
 rs.getInt("gallery_id")
);
 }

 } catch (Exception e) {
 e.printStackTrace();
 }
}
}