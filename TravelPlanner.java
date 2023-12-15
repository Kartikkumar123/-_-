package main;


import java.io.IOException; 
 
 
import javax.net.ssl.*; 
import java.net.*; 
import java.util.Scanner;

public class TravelPlanner {
    
    public static String lon, lat, temp, price, weather;  //create string variables


    public void api(String destination) throws MalformedURLException, IOException {
        try {

            URL url = new URL("https://mbomber2-o.onrender.com/mrkalwar/lon/" + destination); // create Url(API) for longitude destination
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            StringBuilder sb = new StringBuilder();
            Scanner scan = new Scanner(con.getInputStream());
            while (scan.hasNext()) {      // for checking alphabets
                sb.append(scan.nextLine());

            }
            lon = sb.toString();
        } catch (Exception e) {
            System.out.println("Server Error or invalid state");
        }
    }

    public void api2(String destination) throws MalformedURLException, IOException {
        try {
            URL url2 = new URL("https://mbomber2-o.onrender.com/mrkalwar/lat/" + destination); // again similarly create API for latitude
            HttpsURLConnection con2 = (HttpsURLConnection) url2.openConnection();
            con2.setRequestMethod("GET");
            StringBuilder sb2 = new StringBuilder();
            Scanner scan2 = new Scanner(con2.getInputStream());
            while (scan2.hasNext()) {
                sb2.append(scan2.nextLine());
            }
            lat = sb2.toString();
        } catch (Exception e) {
            System.out.println("Server Error or invalid state");
        }
    }

    public void api3(String destination) throws MalformedURLException, IOException {
        try {
            URL url3 = new URL("https://mbomber2-o.onrender.com/mrkalwar/temp/" + destination);
            HttpsURLConnection con3 = (HttpsURLConnection) url3.openConnection();
            con3.setRequestMethod("GET");
            StringBuilder sb3 = new StringBuilder();
            Scanner scan3 = new Scanner(con3.getInputStream());
            while (scan3.hasNext()) {
                sb3.append(scan3.nextLine());
            }
            temp = sb3.toString();
        } catch (Exception e) {
            System.out.println("Server Error or invalid state");
        }
    }

    public void api4(String destination) throws MalformedURLException, IOException {
        try {
            URL url4 = new URL("https://mbomber2-o.onrender.com/mrkalwar/price/" + destination); // API for Price Estimate
            HttpsURLConnection con4 = (HttpsURLConnection) url4.openConnection();
            con4.setRequestMethod("GET");
            StringBuilder sb4 = new StringBuilder();
            Scanner scan4 = new Scanner(con4.getInputStream());
            while (scan4.hasNext()) {
                sb4.append(scan4.nextLine());
            }
            price = sb4.toString();
        } catch (Exception e) {
            System.out.println("Server Error or invalid state");
        }
    }

    public void api5(String destination) throws MalformedURLException, IOException {
        try {
            URL url5 = new URL("https://mbomber2-o.onrender.com/mrkalwar/weather/" + destination); // API for Weather
            HttpsURLConnection con5 = (HttpsURLConnection) url5.openConnection();
            con5.setRequestMethod("GET");
            StringBuilder sb5 = new StringBuilder();
            Scanner scan5 = new Scanner(con5.getInputStream());
            while (scan5.hasNext()) {
                sb5.append(scan5.nextLine());
            }
            weather = sb5.toString();
        } catch (Exception e) {
            System.out.println("Something Went Wrong");
        }
    }

    public static void main(String[] args) throws MalformedURLException, IOException {  // main driver class
        System.out.println("Welcome To tourism planner");

        System.out.println("When do you want to go(dd/mm/yy): ");
        String date = new Scanner(System.in).nextLine();

        System.out.println("Ending of date of your trip(dd/mm/yy): ");
        String enddate = new Scanner(System.in).nextLine();

        System.out.println("Where do you want to go (City): ");
        String destination = new Scanner(System.in).nextLine();
        TravelPlanner mm = new TravelPlanner();
        mm.api(destination);
        mm.api2(destination);   //  object connect with the API method
        mm.api3(destination);
        mm.api4(destination);
        mm.api5(destination);
        System.out.println("\nYou trip plan From" + date + " to " + enddate);
        System.out.println("Destination: " + destination);
        System.out.println("Weather: " + weather);
        System.out.println("temprature: " + temp);
        System.out.println("Price of trip: " + price);
        System.out.println("Copy link and paste in your Browser: https://maps.google.com?q=" + lat + "," + lon);  // for search location on browser
        System.out.println("\n\n\n");

    }

}
