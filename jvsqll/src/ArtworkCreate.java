import java.sql.Connection;
import java.sql.PreparedStatement;

public class ArtworkCreate {

    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {

            
            String sql = "INSERT INTO artwork (title, year, artist_id, gallery_id) VALUES (?, ?, ?, ?)";

            try (PreparedStatement ps = conn.prepareStatement(sql)) {

                
                ps.setString(1, "Starry Night");
                ps.setInt(2, 1889);
                ps.setInt(3, 1); 
                ps.setInt(4, 3); 
                ps.executeUpdate();

                
                ps.setString(1, "Sunflowers");
                ps.setInt(2, 1888);
                ps.setInt(3, 1);
                ps.setInt(4, 3);
                ps.executeUpdate();

                // Guernica
                ps.setString(1, "Guernica");
                ps.setInt(2, 1937);
                ps.setInt(3, 2); 
                ps.setInt(4, 2); 
                ps.executeUpdate();

                // Water Lilies
                ps.setString(1, "Water Lilies");
                ps.setInt(2, 1906);
                ps.setInt(3, 3); 
                ps.setInt(4, 1); 
                ps.executeUpdate();

                System.out.println("All artworks successfully added!");
            }

        } catch (Exception e) {
            System.out.println("ERROR during insert:");
            e.printStackTrace();
        }
    }
}
