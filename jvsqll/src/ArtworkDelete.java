import java.sql.Connection;
import java.sql.PreparedStatement;

public class ArtworkDelete {

    public static void main(String[] args) {
        String sql = "DELETE FROM artwork WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, 1); 
            int rows = ps.executeUpdate();
            System.out.println("Artwork deleted. Rows affected: " + rows);

        } catch (Exception e) {
            System.out.println("ERROR during delete:");
            e.printStackTrace();
        }
    }
}
