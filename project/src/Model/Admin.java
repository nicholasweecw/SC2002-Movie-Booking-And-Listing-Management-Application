package Model;

import Controller.MovieController;

// public class Admin extends User {
public class Admin {
  private int id;
  private String username;
  private String password;

  public Admin(String username, String password) {
    // super();
    this.username = username;
    this.password = password;
  }

  public Movie createMovieListing() {
    MovieController movieController = new MovieController();
    Movie m = movieController.createMovie();
    return m;
  }
}
