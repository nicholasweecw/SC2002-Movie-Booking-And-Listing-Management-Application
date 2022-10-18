package Model;

public class Seat {

  private MovieGoer[] assignedTo;
  private int seatId;

  public Seat() {
    // Empty constructor
    assignedTo = null;
    seatId = -1;
  }

  public Seat(MovieGoer assignedTo, int seatId) {
    this.assignedTo = assignedTo;
    this.seatId = seatId;
  }

  public MovieGoer getAssignedTo() {
    return this.assignedTo;
  }

  public int getSeatId() {
    return this.seatId;
  }
}
