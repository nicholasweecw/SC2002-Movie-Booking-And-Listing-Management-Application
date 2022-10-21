package Model;

import Constants.Constants;
import Controller.ControllerUtility;
import java.io.Serializable;

public class Cinema implements Serializable {

  // private int maxSeats = 143;
  // private int roomNumber;
  private String cinemaCode;
  private Movie[] airingMovies = new Movie[12];
  private CinemaClass cinemaClass;
  private Seat[][] seats = new Seat[Constants.NUMROWS][Constants.NUMCOLS];

  public Cinema(String cinemaCode, CinemaClass cinemaClass) {
    this.cinemaCode = cinemaCode;
    this.cinemaClass = cinemaClass;
    for (int i = 0; i < Constants.NUMROWS; i++) {
      for (int j = 0; j < Constants.NUMCOLS; j++) {
        seats[i][j] = new Seat(i * 10 + j);
      }
    }
  }

  public String getCinemaCode() {
    return cinemaCode;
  }

  public void setCinemaCode(String cinemaCode) {
    this.cinemaCode = cinemaCode;
  }

  public CinemaClass getCinemaClass() {
    return cinemaClass;
  }

  public void setCinemaClass(CinemaClass cinemaClass) {
    this.cinemaClass = cinemaClass;
  }

  public Movie getMovieAtTimeslot(int timeslot) {
    return this.airingMovies[timeslot];
  }

  public void setMovieAtTimeslot(Movie currMovie, int timeslot) {
    this.airingMovies[timeslot] = currMovie;
  }

  // Works under assumption it's 10x10
  public void assignSeat(int timeslot, int seatnumber, MovieGoer movieGoer) {
    int row = seatnumber / 10;
    int column = seatnumber % 10;
    if (seats[row][column].getAssignedTo(timeslot) == null) {
      seats[row][column].setAssignedTo(movieGoer, timeslot);
    } else {
      System.out.println("This seat is occupied.");
    }
  }

  public void selectSeat(int timeslot, int seatnumber) {
    // String s = String.format(
    //   "%" + (Constants.NUMCOLS + 3) * 2 + "s",
    //   "Movie Screen"
    // );
    int row = seatnumber / 10;
    int col = seatnumber % 10;
    // This value is hardcoded.
    String s = String.format("%" + 34 + "s", "Movie Screen");
    // System.out.printf("%15s\n", s);
    System.out.println(s);
    for (int i = 0; i < Constants.NUMROWS; i++) {
      System.out.printf("%s0", i);
      for (int j = 0; j < Constants.NUMCOLS; j++) {
        if (j % 5 == 0) {
          System.out.printf("|  |");
        }
        if (i == row && j == col) {
          System.out.printf("|!!|");
        } else if (seats[i][j].getAssignedTo(timeslot) == null) {
          System.out.printf("|%02d|", seats[i][j].getSeatId());
        } else {
          System.out.printf("|xx|");
        }
      }
      System.out.printf("|  |");
      System.out.printf("\n");
    }
    System.out.printf("  ");
    for (int j = 0; j < Constants.NUMCOLS; j++) {
      if (j % 5 == 0) {
        System.out.printf("    ");
      }
      System.out.printf(" %2d ", j);
    }
    System.out.println();
    System.out.println("Legend: ");
    System.out.println();
    System.out.println("|number|: Seat is available");
    System.out.println("|xx|: Seat is taken");
    System.out.println("|!!|: Seat is currently being selected");
    System.out.println();
  }

  public void printAvailableSeats(int timeslot) {
    // String s = String.format(
    //   "%" + (Constants.NUMCOLS + 3) * 2 + "s",
    //   "Movie Screen"
    // );
    // This value is hardcoded.
    String s = String.format("%" + 34 + "s", "Movie Screen");
    // System.out.printf("%15s\n", s);
    System.out.println(s);
    for (int i = 0; i < Constants.NUMROWS; i++) {
      System.out.printf("%s0", i);
      for (int j = 0; j < Constants.NUMCOLS; j++) {
        if (j % 5 == 0) {
          System.out.printf("|  |");
        }
        if (seats[i][j].getAssignedTo(timeslot) == null) {
          System.out.printf("|%02d|", seats[i][j].getSeatId());
        } else {
          System.out.printf("|xx|");
        }
      }
      System.out.printf("|  |");
      System.out.printf("\n");
    }
    System.out.printf("  ");
    for (int j = 0; j < Constants.NUMCOLS; j++) {
      if (j % 5 == 0) {
        System.out.printf("    ");
      }
      System.out.printf(" %2d ", j);
    }
    System.out.println();
    System.out.println("Legend: ");
    System.out.println();
    System.out.println("|number|: Seat is available");
    System.out.println("|xx|: Seat is taken");
    System.out.println("|!!|: Seat is currently being selected");
    System.out.println();
  }

  public void listMovies() {
    System.out.println("Movies showing in this cinema:");
    for (int i = 0; i < 12; i++) {
      System.out.printf("Timeslot %d: (%04dhrs)\n", i, i * 200);
      if (this.airingMovies[i] == null) {
        System.out.println("No movie showing.");
      } else {
        ControllerUtility.printMovie(this.airingMovies[i]);
      }
    }
  }
}
