import java.sql.Connection;
import java.sql.PreparedStatement;

public class ArtworkUpdate {

    public static void main(String[] args) {
        String sql = "UPDATE artwork SET year = ? WHERE title = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, 1890); 
            ps.setString(2, "Starry Night");

            int rows = ps.executeUpdate();
            System.out.println("Artwork updated. Rows affected: " + rows);

        } catch (Exception e) {
            System.out.println("ERROR during update:");
            e.printStackTrace();
        }
    }
}
