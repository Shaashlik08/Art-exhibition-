import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ArtworkRead {

    public static void main(String[] args) {
        String sql = """
            SELECT a.id, a.title, a.year,
                   ar.name AS artist_name,
                   g.name AS gallery_name
            FROM artwork a
            JOIN artist ar ON a.artist_id = ar.id
            JOIN gallery g ON a.gallery_id = g.id
            ORDER BY a.id
        """;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("All artworks in database:");
            while (rs.next()) {
                System.out.printf(
                    "ID: %d, Title: %s, Year: %d, Artist: %s, Gallery: %s%n",
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getInt("year"),
                    rs.getString("artist_name"),
                    rs.getString("gallery_name")
                );
            }

        } catch (Exception e) {
            System.out.println("ERROR during read:");
            e.printStackTrace();
        }
    }
}
