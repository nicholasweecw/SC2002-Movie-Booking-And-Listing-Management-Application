package Controller;

import Model.Movie;

public class ControllerUtility {

  public static void printMovie(Movie movie) {
    System.out.printf(
      "Movie name: %s\nMovie Status: %s\n\n",
      movie.getName(),
      movie.getStatus()
    );
  }
}
