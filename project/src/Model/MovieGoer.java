package Model;

import Controller.MovieGoerController;

public class MovieGoer extends User {

  public String mobile;
  public int age;

  //   public MovieTicket tickets[];

  public MovieGoer(String name, String mobile, int age) {
    super(UserType.MOVIE_GOER, name);
    this.mobile = mobile;
    this.age = age;
  }

  // Getter Functions

  public String getMobile() {
    return this.mobile;
  }

  public int getAge() {
    return this.age;
  }

  // Prints out an array of movies that match the movie name provided - not case-sensitive.
  // public void searchMovie() {
  //   MovieGoerController.searchMovie();
  // }

  // Prints out all the movies available
  // public void listAllMovies() {}

  // Shows all seats, and whether they are available
  public void showAllSeats(String cinemaCode, int movieId, int time) {}

  // Checks whether seat is available
  public int checkSeatAvailability(
    String cinemaCode,
    int movieId,
    int time,
    int row,
    int col
  ) {
    return 1;
  }

  // Allows the user to purchase a ticket. Creates the ticket and adds it to the user's list
  public void purchaseTicket(
    String cinemaCode,
    int movieId,
    int time,
    int row,
    int col
  ) {}

  // Lists the tickets the user has in his inventory, as well as all information about it.
  public void viewBookingHistory() {}

  // Allows user to add a review
  public void addReview() {}
}
