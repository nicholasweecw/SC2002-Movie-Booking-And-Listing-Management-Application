import Controller.*;
import Model.Admin;
import Model.Movie;
import Model.MovieGoer;
import Model.MovieStatus;
import Model.MovieType;
import Model.AgeRestriction;

/*
 * i use this app to test controllers
 */
public class App {

  public static void main(String[] args) {

    // init for all controllers
    initialise();

    timothy();

    // hochi();    
  }

  public static void initialise() {
    MovieController movieController = new MovieController();
    InputController inputController = new InputController();
  }

  public static void timothy() {
    Admin admin = new Admin("timothyjblew", "password", "Timothy");
    // Movie movie = admin.createMovieListing();
    Movie movie = new Movie(
      2, 
      "Topgun", 
      MovieStatus.COMING_SOON, 
      MovieType.TWO_D,
      AgeRestriction.PG13,
      "flying planes",
      "Tom Cruise",
      "cast is a string, is it worth changing it to String[]?",
      0
    );
    movie.getEverything();

    movie = admin.updateMovieListing(movie);
    movie.getEverything();

    admin.deleteMovieListing(movie);
  }

  public static void hochi() {
    // Testing Movie Goer Class
    MovieGoer user = new MovieGoer("Ho Chi", "90000000", 69);
    System.out.println(user.getUserType());
    System.out.println(user.getId());
    System.out.println(user.getName());
    MovieGoerController.searchMovie();
    MovieGoerController.listAllMovies();
    MovieGoerController.showAllSeats();
  }
}
