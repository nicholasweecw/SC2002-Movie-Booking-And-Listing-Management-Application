package Model;

import java.io.Serializable;

public class Cinema implements Serializable {

  // private int maxSeats = 143;
  private int roomNumber;
  // private Seat[] seats;
  private Movie currentlyAiring;
  private CinemaClass cinemaClass;
  private Seat[][] seats;

  public Cinema(int roomNumber, Movie currMovie, CinemaClass cinemaClass) {
    this.roomNumber = roomNumber;
    this.currentlyAiring = currMovie;
    this.cinemaClass = cinemaClass;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public CinemaClass getCinemaClass() {
    return cinemaClass;
  }

  public void setCinemaClass(CinemaClass cinemaClass) {
    this.cinemaClass = cinemaClass;
  }

  public Movie getCurrentlyAiring() {
    return currentlyAiring;
  }

  public void setCurrenltyAiring(Movie currMovie) {
    this.currentlyAiring = currMovie;
  }
  // public void initialiseSeats(){
  // for(int i = 0; i<maxSeats; i++){
  // seats[i] = new Seat(i, roomNumber);
  // }
  // }

}
