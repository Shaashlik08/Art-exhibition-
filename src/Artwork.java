public class Artwork {
    private String title;
    private Artist artist;
    private Gallery gallery;
    private int year;

    public Artwork(String title, Artist artist, Gallery gallery, int year) {
        this.title = title;
        this.artist = artist;
        this.gallery = gallery;
        this.year = year;
    }

    
    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public int getYear() {
        return year;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfofo() {
        System.out.println("Artwork: " + title +", Artist: " + artist.getName() + ", Gallery: " + gallery.getGalleryName() + ", Year: " + year);
    }
}
