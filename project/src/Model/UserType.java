package Model;

public enum UserType {
  NA("NA"),
  ADMIN("Admin"),
  MOVIE_GOER("Movie Goer");

  private final String text;

  private UserType(String text) {
    this.text = text;
  }

  public String toString() {
    return text;
  }
}
