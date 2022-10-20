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

  public Movie createMovieListing() {
    // MovieController movieController = new MovieController();
    Movie m = MovieController.createMovie();
    return m;
  }

  public Movie updateMovieListing(Movie movie) {
    // MovieController movieController = new MovieController();
    Movie m = MovieController.updateMovie(movie);
    return m;
  }
}
