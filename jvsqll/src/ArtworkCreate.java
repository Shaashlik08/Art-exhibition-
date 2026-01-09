import java.sql.Connection;
import java.sql.PreparedStatement;

public class ArtworkCreate {

public static void main(String[] args) {

String sql =
 "INSERT INTO artwork(title, year, artist_id, gallery_id) VALUES (?, ?, ?, ?)";

 try (
 Connection conn = DBConnection.getConnection();
 PreparedStatement ps = conn.prepareStatement(sql)
) {

 ps.setString(1, "Starry Night");
 ps.setInt(2, 1889);
 ps.setInt(3, 1); 
 ps.setInt(4, 1); 

 ps.executeUpdate();
 System.out.println("Artwork added");

} catch (Exception e) {
 e.printStackTrace();
 }
 }
}