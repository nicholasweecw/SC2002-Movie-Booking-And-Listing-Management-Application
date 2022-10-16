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
    // Admin admin = new Admin("timothyjblew", "password", "Timothy");
    // Movie m = admin.createMovieListing();
    // System.out.println(m.getId());
    // System.out.println(m.getName());
    // System.out.println(m.getStatus());
    // System.out.println(m.getType());
    // System.out.println(m.getAgeRestriction());
    // System.out.println(m.getSynopsis());
    // System.out.println(m.getDirector());
    // Testing Movie Goer Class
    MovieGoer user = new MovieGoer("Ho Chi", "90000000", 69);
    System.out.println(user.getUserType());
    System.out.println(user.getId());
    System.out.println(user.getName());
    user.searchMovie();
  }
}
