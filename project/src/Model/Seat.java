package Model;

import java.util.Arrays;

public class Seat {

  private MovieGoer[] assignedTo = new MovieGoer[12];
  private int seatId;

  // public Seat() {
  //   // Empty constructor
  //   assignedTo = null;
  //   seatId = -1;
  // }

  public Seat(int seatId) {
    Arrays.fill(this.assignedTo, null);
    this.seatId = seatId;
  }

  // public Seat(MovieGoer assignedTo, int seatId) {
  //   this.assignedTo = assignedTo;
  //   this.seatId = seatId;
  // }

  public void setAssignedTo(MovieGoer movieGoer, int timeslot) {
    this.assignedTo[timeslot] = movieGoer;
  }

  public MovieGoer getAssignedTo(int timeslot) {
    return this.assignedTo[timeslot];
  }

  public int getSeatId() {
    return this.seatId;
  }
}
