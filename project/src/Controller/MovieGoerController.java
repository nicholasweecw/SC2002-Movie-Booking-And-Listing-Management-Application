package Controller;

import Model.AgeRestriction;
import Model.Movie;
import Model.MovieStatus;
import Model.MovieType;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class MovieGoerController {

  // Temporary Movie Array

  public static void searchMovie() {
    Scanner sc = new Scanner(System.in);
    String[] names = {
      "Terminator",
      "Slicer",
      "Ninja",
      "Hello",
      "Robot",
      "Dog",
    };
    ArrayList<Movie> movies = new ArrayList<Movie>();
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
        System.out.printf(
          "Movie name: %s\nMovie Status: %s\n",
          movie.getName(),
          movie.getStatus()
        );
      }
    }
  }
}
