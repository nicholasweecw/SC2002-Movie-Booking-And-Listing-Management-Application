import Controller.*;
import Model.Admin;
import Model.AgeRestriction;
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
    // init for all controllers
    initialise();

    timothy();
    // hochi();
  }

  public static void initialise() {
    Database.initDatabase();
    MovieController movieController = new MovieController();
    InputController inputController = new InputController();
  }

  public static void timothy() {
    Admin admin = new Admin("timothyjblew", "password", "Timothy");
    // admin.createMovieListing();
    ArrayList<Movie> movies = Database.getMovieList();
    for (Movie movie: movies) {
      movie.getEverything();
      System.out.println();
    }

    admin.updateMovieListing();
    for (Movie movie: movies) {
      movie.getEverything();
      System.out.println();
    }

    // admin.deleteMovieListing();
  }

  public static void hochi() {
    // Initialize database
    Database db = new Database();

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
    // String[] names = {
    //   "Terminator",
    //   "Slicer",
    //   "Ninja",
    //   "Hello",
    //   "Robot",
    //   "Dog",
    // };
    // for (int i = 0; i < names.length; i++) {
    //   Movie m = new Movie(
    //     i,
    //     names[i],
    //     MovieStatus.PREVIEW,
    //     MovieType.BLOCKBUSTER,
    //     AgeRestriction.PG13,
    //     "S",
    //     "Bob",
    //     "Muthu",
    //     0
    //   );
    //   ArrayList<Movie> movies = db.getMovieList();
    //   movies.add(m);
    //   db.setMovieList(movies);
    // }
    for (int i = 0; i < db.getMovieList().size(); i++) {
      cinema.setMovieAtTimeslot(db.getMovieList().get(i), i);
    }
    db.saveDatabase();
    cinema.printAvailableSeats(1);
    cinema.assignSeat(1, 74, user);
    cinema.printAvailableSeats(1);
    cinema.selectSeat(1, 53);
    cinema.listMovies();
  }
}
