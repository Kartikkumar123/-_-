package maiin;
import java.util.*;

// Enum for different transportation types
enum TransportationType {
    FLIGHT,
    CAR_RENTAL,
    TRAIN,
    BUS
}

// This class representing transportation
class TransportationService {
    private String serviceName;
    private TransportationType type;
    private double price;

    // Constructor
    public TransportationService(String serviceName, TransportationType type, double price) {
        this.serviceName = serviceName;
        this.type = type;
        this.price = price;
    }

    
    public String getServiceName() {
        return serviceName;
    }

    public TransportationType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

// this class representing a hotel
class Hotel {
    private String name;
    private String location;
    private double pricePerNight;

    // Constructor
    public Hotel(String name, String location, double pricePerNight) {
        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
}

// this class representing a flight
class Flight {
    private String departure;
    private String destination;
    private double price;

    // Constructor
    public Flight(String departure, String destination, double price) {
        this.departure = departure;
        this.destination = destination;
        this.price = price;
    }

    // Getters
    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }
}

// this class representing a travel booking system
class TravelBookingSystem {
    private List<TransportationService> transportationServices;
    private List<Hotel> hotels;
    private List<Flight> flights;

    // Constructor
    public TravelBookingSystem() {
        transportationServices = new ArrayList<>();
        hotels = new ArrayList<>();
        flights = new ArrayList<>();
    }

    // Method to add transportation service
    public void addTransportationService(String serviceName, TransportationType type, double price) {
        transportationServices.add(new TransportationService(serviceName, type, price));
    }

    // Method to add hotel
    public void addHotel(String name, String location, double pricePerNight) {
        hotels.add(new Hotel(name, location, pricePerNight));
    }

    // Method to add flight
    public void addFlight(String departure, String destination, double price) {
        flights.add(new Flight(departure, destination, price));
    }

    // Method to search for transportation services by type
    public List<TransportationService> searchTransportationServiceByType(TransportationType type) {
        List<TransportationService> result = new ArrayList<>();
        for (TransportationService service : transportationServices) {
            if (service.getType() == type) {
                result.add(service);
            }
        }
        return result;
    }

    // Method to search for hotels by location
    public List<Hotel> searchHotelByLocation(String location) {
        List<Hotel> result = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.getLocation().equalsIgnoreCase(location)) {
                result.add(hotel);
            }
        }
        return result;
    }

    // Method to search for flights by departure and destination
    public List<Flight> searchFlights(String departure, String destination) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equalsIgnoreCase(departure) && flight.getDestination().equalsIgnoreCase(destination)) {
                result.add(flight);
            }
        }
        return result;
    }
}

public class TravelBookingSystem {
    public static void main(String[] args) {
        // Creating instance of TravelBookingSystem
        TravelBookingSystem bookingSystem = new TravelBookingSystem();

        // Adding transportation services
        bookingSystem.addTransportationService("Flight to Goa", TransportationType.FLIGHT, 500.0);
        bookingSystem.addTransportationService("Car Rental", TransportationType.CAR_RENTAL, 50.0);
        bookingSystem.addTransportationService("Train to Delhi", TransportationType.TRAIN, 100.0);

        // Adding hotels
        bookingSystem.addHotel("Luxury Hotel", "Goa", 200.0);
        bookingSystem.addHotel("Budget Inn", "Sikkim", 80.0);

        // Adding flights
        bookingSystem.addFlight("Delhi", "Goa", 800.0);
        bookingSystem.addFlight("New delhi", "Sikkim", 200.0);

        // Searching for transportation services by type
        List<TransportationService> flights = bookingSystem.searchTransportationServiceByType(TransportationType.FLIGHT);
        System.out.println("Flights available:");
        for (TransportationService flight : flights) {
            System.out.println(flight.getServiceName() + " - Price: $" + flight.getPrice());
        }

        // Searching for hotels in a location
        List<Hotel> hotelsInParis = bookingSystem.searchHotelByLocation("Paris");
        System.out.println("\nHotels in Goa:");
        for (Hotel hotel : hotelsInParis) {
            System.out.println(hotel.getName() + " - Price per night: $" + hotel.getPricePerNight());
        }

        // Searching for flights from Delhi to goa
        List<Flight> flightsFromNewYorkToParis = bookingSystem.searchFlights("New York", "Paris");
        System.out.println("\nFlights from Delhi to Goa:");
        for (Flight flight : flightsFromNewYorkToParis) {
            System.out.println("Departure: " + flight.getDeparture() + ", Destination: " + flight.getDestination() + ", Price: $" + flight.getPrice());
        }
    }
}
