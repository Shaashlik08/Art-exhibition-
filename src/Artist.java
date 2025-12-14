public class Artist {
    private String name;
    private int age;
    private String country;

    public Artist(String name,int age,String country) {
        this.name=name;
        this.age=age;
        this.country=country;
    }

public String getName() {
    return name;
}
public int getAge() {
    return age;
}
public String getcountry() {
    return country;
}

public void setName(String name) {
    this.name = name;

}
public void setAge(int age) {
    this.age = age;
}
public void setCountry (String country) {
    this.country = country;

}

 public void printInfofo() {
        System.out.println(
            "Artist: " + name + ", Age: " + age + ", Country: " + country);
    }
}