package moviedatabaseprogram;

import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private int year;

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        System.out.println("Title: " + title );
        System.out.println(" Director: " + director);
        System.out.println( "Year: " + year);
        return null;
    }
}

class MovieDatabase {
    private ArrayList<Movie> movies;

    public MovieDatabase() {
        movies = new ArrayList<>();
    }

    public void addMovie(String title, String director, int year) {
        Movie newMovie = new Movie(title, director, year);
        movies.add(newMovie);
        System.out.println("Movie added: " + newMovie.getTitle());
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Movie found:");
                System.out.println(movie);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Movie not found.");
        }
    }

    public void displayAllMovies() {
        System.out.println("All movies in the database:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}

public class MovieDatabaseProgram {
    public static void main(String[] args) {
        MovieDatabase database = new MovieDatabase();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMovie Database Menu:");
            System.out.println("1. Add a movie");
            System.out.println("2. Search for a movie by title");
            System.out.println("3. Display all movies");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter movie title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter movie director: ");
                    String director = scanner.nextLine();
                    System.out.print("Enter movie year: ");
                    int year = scanner.nextInt();
                    database.addMovie(title, director, year);
                    break;
                case 2:
                    System.out.print("Enter movie title to search: ");
                    String searchTitle = scanner.nextLine();
                    database.searchByTitle(searchTitle);
                    break;
                case 3:
                    database.displayAllMovies();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
