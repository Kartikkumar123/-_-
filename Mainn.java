package mainn;
import java.util.*;
import java.util.Date;

public class Mainn{
    public static void main(String[] args) {
        // Create a user
        User user = new User("John Doe", "john@example.com", "password");

        // Create a flight
        Flight flight = new Flight("ABC123", "Delta", "JFK", "LAX", new Date(), new Date(), 500.0);

        // Create a hotel
        Hotel hotel = new Hotel("Hilton", "Los Angeles", 100, 200.0);

        // Create transportation
        Transportation transportation = new Transportation("Car rental", "LAX", "Hotel", new Date(), new Date(), 50.0);

        // Create booking system
        BookingSystem bookingSystem = new BookingSystem();

        // Book flight, hotel, and transportation
        bookingSystem.bookFlight(user, flight);
        bookingSystem.bookHotel(user, hotel);
        bookingSystem.bookTransportation(user, transportation);
    }
}
