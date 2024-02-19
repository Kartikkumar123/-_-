/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainn;

// Booking System class
public class BookingSystem {
    public void bookFlight(User user, Flight flight) {
        // Logic to book flight
        System.out.println("Flight booked successfully for user: " + user.getName());
    }

    public void bookHotel(User user, Hotel hotel) {
        // Logic to book hotel
        System.out.println("Hotel booked successfully for user: " + user.getName());
    }

    public void bookTransportation(User user, Transportation transportation) {
        // Logic to book transportation
        System.out.println("Transportation booked successfully for user: " + user.getName());
    }

    // Other methods for searching flights, hotels, etc.
}