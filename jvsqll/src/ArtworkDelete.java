import java.sql.Connection;
import java.sql.PreparedStatement;

public class ArtworkDelete {

public static void main(String[] args) {

 String sql = "DELETE FROM artwork WHERE id = ?";

try (
 Connection conn = DBConnection.getConnection();
PreparedStatement ps = conn.prepareStatement(sql)
) {

 ps.setInt(1, 1);
 ps.executeUpdate();
 System.out.println("Artwork deleted");

 } catch (Exception e) {
 e.printStackTrace();
 }
}
}