/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainn;

// Hotel class
public class Hotel {
    private String name;
    private String location;
    private int numberOfRoomsAvailable;
    private double pricePerNight;

    public Hotel(String name, String location, int numberOfRoomsAvailable, double pricePerNight) {
        this.name = name;
        this.location = location;
        this.numberOfRoomsAvailable = numberOfRoomsAvailable;
        this.pricePerNight = pricePerNight;
    }

    // Getters and setters

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the numberOfRoomsAvailable
     */
    public int getNumberOfRoomsAvailable() {
        return numberOfRoomsAvailable;
    }

    /**
     * @param numberOfRoomsAvailable the numberOfRoomsAvailable to set
     */
    public void setNumberOfRoomsAvailable(int numberOfRoomsAvailable) {
        this.numberOfRoomsAvailable = numberOfRoomsAvailable;
    }

    /**
     * @return the pricePerNight
     */
    public double getPricePerNight() {
        return pricePerNight;
    }

    /**
     * @param pricePerNight the pricePerNight to set
     */
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}
