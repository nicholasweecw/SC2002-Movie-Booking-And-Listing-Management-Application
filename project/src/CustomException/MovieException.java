package CustomException;

public class MovieException {
  public static class InvalidId extends Exception {
    public InvalidId() {
        super("Invalid ID");
    }
}
}
