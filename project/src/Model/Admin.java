package Model;

import Controller.MovieController;
import Model.UserType;

public class Admin extends User {

  private String username;
  private String password;

  public Admin(String username, String password, String name) {
    super(UserType.ADMIN, name);
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return this.username;
  }

  public String getPassword() {
    return this.password;
  }

  public Movie createMovieListing() {
    System.out.println("Creating movie listing");
    Movie m = MovieController.createMovie();
    return m;
  }

  public Movie updateMovieListing() {
    System.out.println("Updating movie listing");
    Movie movie = MovieController.getMovieById();
    movie = MovieController.updateMovie(movie);
    return movie;
  }

  public void deleteMovieListing() {
    System.out.println("Deleting movie listing");
    Movie movie = MovieController.getMovieById();
    MovieController.deleteMovie(movie);
  }
}
