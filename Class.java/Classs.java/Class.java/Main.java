public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Leonardo da Vinci", 1452);
        Artist artist2 = new Artist("Vincent van Gogh", 1853);

        Artwork artwork1 = new Artwork("Mona Lisa", artist1, 850_000_000);
        Artwork artwork2 = new Artwork("Starry Night", artist2, 100_000_000);
        Artwork artwork3 = new Artwork("Sunflowers", artist2, 80_000_000);

        Gallery gallery = new Gallery("Famous Art Gallery");
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);
        gallery.addArtwork(artwork3);

        gallery.displayArtworks();
        System.out.println();
        gallery.displayArtworksAbovePrice(90_000_000);
    }
}


