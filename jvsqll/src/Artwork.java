public class Artwork {

private int id;
private String title;
private int year;
private int artist_id;
private int gallery_id;

public Artwork(int id, String title, int year, int artist_id, int gallery_id) {
this.id = id;
this.title = title;
this.year = year;
this.artist_id = artist_id;
this.gallery_id = gallery_id;
}

public int getId() {
return id;
}

public String getTitle() {
return title;
}

public int getYear() {
 return year;
 }

public int getArtistId() {
 return artist_id;
}
 public int getGalleryId() {
return gallery_id;
}
}
