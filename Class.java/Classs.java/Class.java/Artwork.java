
import java.util.Objects;
class Artwork extends Entity {
    private Artist artist;
    private double price;

    public Artwork(String name, Artist artist, double price) {
        super(name);
        this.artist = artist;
        this.price = price;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Artwork{name='" + name + "', artist=" + artist.getName() + ", price=" + price + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Artwork artwork = (Artwork) o;
        return Double.compare(artwork.price, price) == 0 && Objects.equals(artist, artwork.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), artist, price);
    }
}
