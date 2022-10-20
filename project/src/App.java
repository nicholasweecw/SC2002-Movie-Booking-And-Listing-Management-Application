import Controller.*;
import Model.Admin;
import Model.Movie;
import Model.MovieGoer;
import Model.MovieStatus;
import Model.MovieType;

/*
 * i use this app to test controllers
 */
public class App {

  public static void main(String[] args) {
    Admin admin = new Admin("timothyjblew", "password", "Timothy");

    // init for all controllers
    initialise();

    Movie movie = admin.createMovieListing();
    System.out.println(movie.getId());
    System.out.println(movie.getName());
    System.out.println(movie.getStatus());
    System.out.println(movie.getType());
    System.out.println(movie.getAgeRestriction());
    System.out.println(movie.getSynopsis());
    System.out.println(movie.getDirector());
    movie = admin.updateMovieListing(movie);
    System.out.println(movie.getId());
    System.out.println(movie.getName());
    System.out.println(movie.getStatus());
    System.out.println(movie.getType());
    System.out.println(movie.getAgeRestriction());
    System.out.println(movie.getSynopsis());
    System.out.println(movie.getDirector());

    // Testing Movie Goer Class
    // MovieGoer user = new MovieGoer("Ho Chi", "90000000", 69);
    // System.out.println(user.getUserType());
    // System.out.println(user.getId());
    // System.out.println(user.getName());
    // MovieGoerController.searchMovie();
    // MovieGoerController.listAllMovies();
    // MovieGoerController.showAllSeats();
  }

  public static void initialise() {
    MovieController movieController = new MovieController();
    InputController inputController = new InputController();
  }
}
