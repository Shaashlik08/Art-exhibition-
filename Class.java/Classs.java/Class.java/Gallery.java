import java.util.ArrayList;
import java.util.List;

class Gallery extends Entity {
    private List<Artwork> artworks;

    public Gallery(String name) {
        super(name);
        this.artworks = new ArrayList<>();
    }

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public void removeArtwork(Artwork artwork) {
        artworks.remove(artwork);
    }

    public List<Artwork> getArtworks() {
        return artworks;
    }

    public void displayArtworks() {
        System.out.println("Gallery: " + name);
        for (Artwork a : artworks) {
            System.out.println(a);
        }
    }

    
    public void displayArtworksAbovePrice(double minPrice) {
        System.out.println("Artworks above price " + minPrice + ":");
        for (Artwork a : artworks) {
            if (a.getPrice() > minPrice) {
                System.out.println(a);
            }
        }
    }
}
