package Model;

import java.io.Serializable;

public class Movie implements Serializable {
  private int id;
  private String name;
  private MovieStatus status;
  private MovieType type;
  private AgeRestriction ageRestriction;

  private String synopsis;
  private String director;
  private String cast;
  private float overallRating;
  // private Review[] pastReviews;

  public Movie (
    int id, 
    String name, 
    MovieStatus status, 
    MovieType type,
    AgeRestriction ageRestriction, 
    String synopsis,
    String director,
    String cast,
    float overallRating // not used yet
  ) {
    this.id = id;
    this.name = name;
    this.status = status;
    this.type = type;
    this.ageRestriction = ageRestriction;
    this.synopsis = synopsis;
    this.director = director;
    this.cast = cast; 
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public MovieStatus getStatus() {
    return this.status;
  }

  public void setStatus(MovieStatus movieStatus) {
    this.status = movieStatus;
  }

  public MovieType getType() {
    return this.type;
  }

  public void setType(MovieType movieType) {
    this.type = movieType;

  }

  public AgeRestriction getAgeRestriction() {
    return this.ageRestriction;
  }

  public void setAgeRestriction(AgeRestriction ageRestriction) {
    this.ageRestriction = ageRestriction;
  }

  public String getSynopsis() {
    return this.synopsis;
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }

  public String getDirector() {
    return this.director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getCast() {
    return this.cast;
  }

  public void setCast(String cast) {
    this.cast = cast;
  }

}
