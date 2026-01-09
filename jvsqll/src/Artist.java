public class Artist {

 private int id;
private String name;
 private String country;

 public Artist(int id, String name, String country) {
 this.id = id;
 this.name = name;
 this.country = country;
 }

public int getId() {
 return id;
 }

 public String getName() {
 return name;
 }

public String getCountry() {
 return country;
 }
}