package Controller;

import Model.AgeRestriction;
import Model.Movie;
import Model.MovieStatus;
import Model.MovieType;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class MovieGoerController {

  private static Scanner sc = new Scanner(System.in);

  // Temporary Movie Array
  private static ArrayList<Movie> movies = new ArrayList<Movie>();

  // Initialize database here
  static {
    String[] names = {
      "Terminator",
      "Slicer",
      "Ninja",
      "Hello",
      "Robot",
      "Dog",
    };
    for (int i = 0; i < names.length; i++) {
      Movie m = new Movie(
        i,
        names[i],
        MovieStatus.PREVIEW,
        MovieType.BLOCKBUSTER,
        AgeRestriction.PG13,
        "S",
        "Bob",
        "Muthu",
        0
      );
      movies.add(m);
    }
  }

  public static void movieGoerInterface() {}

  // Prints out an array of movies that match the movie name provided - not case-sensitive.
  public static void searchMovie() {
    System.out.println("Search based on movie title:");
    String response = sc.nextLine();
    Predicate<Movie> search = movie ->
      (movie.getName().toLowerCase().contains(response.toLowerCase()));
    System.out.println(
      "Movies based on the search term " + response.toLowerCase()
    );
    ArrayList<Movie> resultantMovieList = new ArrayList<Movie>();
    for (Movie movie : movies) {
      if (search.test(movie)) {
        ControllerUtility.printMovie(movie);
      }
    }
  }

  // Prints out all the movies available
  public static void listAllMovies() {
    System.out.println("Listing all movies:");
    for (Movie movie : movies) {
      ControllerUtility.printMovie(movie);
    }
  }

  // Shows all seats, and whether they are available
  public static void showAllSeats() {
    while (true) {
      try {
        System.out.println(
          "Please enter the Cinema Code of the Cinema you wish to view seats for:"
        );
        String cinemaCode = sc.nextLine();
        break;
        // Search in database
      } catch (Exception e) {
        System.out.println(
          "Invalid input/Cinema code does not exist, try again."
        );
      }
    }
    while (true) {
      try {
        System.out.println(
          "Please enter the Movie ID. You can find this by listing all movies or searching for a movie:"
        );
        int movieId = Integer.parseInt(sc.nextLine());
        break;
        // Search in database
      } catch (Exception e) {
        System.out.println("Invalid input/Movie ID does not exist, try again.");
      }
    }
    while (true) {
      try {
        System.out.println("Please enter the Time Slot.");
        System.out.println("Available Time Slots:");
        String cinemaCode = sc.nextLine();
        break;
        // Search in database
      } catch (Exception e) {
        System.out.println(
          "Invalid input/Time Slot does not exist, try again."
        );
      }
    }
  }

  public static boolean checkSeatAvailability() {
    return false;
  }

  public static void listRankings() {}
}
