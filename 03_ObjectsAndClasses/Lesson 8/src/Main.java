import com.skillbox.airport.Airport;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        System.out.println("List of aircrafts: " + airport.getAllAircrafts());
        System.out.println("Number of aiercrafts: " + airport.getAllAircrafts().size());


    }
}