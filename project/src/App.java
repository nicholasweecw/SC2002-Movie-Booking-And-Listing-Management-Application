import Controller.*;
import Model.Admin;
import Model.AgeRestriction;
import Model.Cinema;
import Model.CinemaClass;
import Model.Database;
import Model.Movie;
import Model.MovieGoer;
import Model.MovieStatus;
import Model.MovieType;
import Model.Seat;
import java.util.ArrayList;

/*
 * i use this app to test controllers
 */
public class App {

  public static void main(String[] args) {
    // Initialize database
    Database db = new Database();
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
    MovieGoerController.searchMovie();
    MovieGoerController.listAllMovies();
    MovieGoerController.showAllSeats();
    Seat seat = new Seat(1);
    System.out.println(seat.getSeatId());
    System.out.println(seat.getAssignedTo(1));
    seat.setAssignedTo(user, 1);
    System.out.println(seat.getAssignedTo(1).getUserType());
    System.out.println(seat.getAssignedTo(1).getId());
    System.out.println(seat.getAssignedTo(1).getName());
    Cinema cinema = new Cinema("ACD", CinemaClass.STANDARD);
    for (int i = 0; i < db.movieList.size(); i++) {
      cinema.setMovieAtTimeslot(db.movieList.get(i), i);
    }
    db.saveDatabase();
    cinema.printAvailableSeats(1);
    cinema.assignSeat(1, 74, user);
    cinema.printAvailableSeats(1);
    cinema.selectSeat(1, 53);
    cinema.listMovies();
  }
}
