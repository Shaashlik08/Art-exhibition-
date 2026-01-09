public class Gallery {
    private String galleryName;
    private String location;
    private int yearBuilt;

    public Gallery(String galleryName, String location, int yearBuilt) {
        this.galleryName = galleryName;
        this.location = location;
        this.yearBuilt = yearBuilt;
    }

    
    public String getGalleryName() {
        return galleryName;
    }

    public String getLocation() {
        return location;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    
    public void setGalleryName(String galleryName) {
        this.galleryName = galleryName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void printInfofo() {
        System.out.println("Gallery: " + galleryName + ", Location: " + location + ", Year built: " + yearBuilt );
    }
}
