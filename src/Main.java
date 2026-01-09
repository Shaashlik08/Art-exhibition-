public class Main {
    public static void main(String[] args) {

        Artist artist1 = new Artist("Leonardo da Vinci", 67, "Italy");
        Artist artist2 = new Artist("Pablo Picasso", 91, "Spain");

        Gallery gallery1 = new Gallery("Louvre", "Paris", 1793);
        Gallery gallery2 = new Gallery("MoMA", "New York", 1929);

        Artwork artwork1 = new Artwork("Mona Lisa", artist1, gallery1, 1503);
        Artwork artwork2 = new Artwork("Guernica", artist2, gallery2, 1937);

        artist1.printInfofo();
        artist2.printInfofo();

        gallery1.printInfofo();
        gallery2.printInfofo();

        artwork1.printInfofo();
        artwork2.printInfofo();

        
        if (artwork1.getYear() < artwork2.getYear()) {
            System.out.println("Mona Lisa is older than Guernica");
        } else {
            System.out.println("Guernica is older than Mona Lisa");
        }
    }
}
