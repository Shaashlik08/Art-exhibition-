
import java.util.Objects;

class Artist extends Entity {
    private int birthYear;

    public Artist(String name, int birthYear) {
        super(name);
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Artist{name='" + name + "', birthYear=" + birthYear + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Artist artist = (Artist) o;
        return birthYear == artist.birthYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), birthYear);
    }
}
