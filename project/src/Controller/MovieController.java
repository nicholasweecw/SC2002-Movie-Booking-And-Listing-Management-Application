package Controller;

import Model.AgeRestriction;
import Model.Movie;
import Model.MovieStatus;
import Model.MovieType;
import Model.Database;

import CustomException.*;
import CustomException.MovieException.InvalidId;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieController {

  public static Movie createMovie() {
    System.out.println("Enter ID:");
    int id = InputController.getInt();

    System.out.println("Enter name:");
    String name = InputController.getString();

    System.out.print(
      "Possible movie statuses: \n" +
      "1. Coming soon\n" +
      "2. Preview\n" +
      "3. Now showing\n\n" +
      "Select movie status (number): "
    );
    int typeNo = InputController.getInt();
    MovieStatus movieStatus = MovieStatus.NA;
    switch (typeNo) {
      case 1:
        movieStatus = MovieStatus.COMING_SOON;
        break;
      case 2:
        movieStatus = MovieStatus.PREVIEW;
        break;
      case 3:
        movieStatus = MovieStatus.NOW_SHOWING;
        break;
      case 4:
        movieStatus = MovieStatus.END_OF_SHOWING;
        break;
      default:
        System.out.println("Wrong input!\n" + "Returning to menu...");
    }

    System.out.print(
      "Possible movie types: \n" +
      "1. 2D\n" +
      "2. 3D\n" +
      "3. Blockbuster\n\n" +
      "Select movie type (number): "
    );
    typeNo = InputController.getInt();

    MovieType movieType = MovieType.NA;
    switch (typeNo) {
      case 1:
        movieType = MovieType.TWO_D;
        break;
      case 2:
        movieType = MovieType.THREE_D;
        break;
      case 3:
        movieType = MovieType.BLOCKBUSTER;
        break;
      default:
        System.out.println("Wrong input!\n" + "Returning to menu...");
    }

    System.out.print(
      "Possible age restrictions: \n" +
      "1. PG13\n" +
      "2. NC16\n" +
      "3. M18\n" +
      "4. R21\n" +
      "Select age restriction (number): "
    );
    typeNo = InputController.getInt();
    AgeRestriction ageRestriction = AgeRestriction.NA;
    switch (typeNo) {
      case 1:
        ageRestriction = AgeRestriction.PG13;
        break;
      case 2:
        ageRestriction = AgeRestriction.NC16;
        break;
      case 3:
        ageRestriction = AgeRestriction.M18;
        break;
      case 4:
        ageRestriction = AgeRestriction.R21;
        break;
      default:
        System.out.println("Wrong input!\n" + "Returning to menu...");
    }

    System.out.println("Enter synopsis:");
    String synopsis = InputController.getString();

    System.out.println("Enter director:");
    String director = InputController.getString();

    System.out.println("Enter cast");
    String cast = InputController.getString();

    Movie movie = new Movie(
      id,
      name,
      movieStatus,
      movieType,
      ageRestriction,
      synopsis,
      director,
      cast,
      0
    );

    // save to db
    ArrayList<Movie> movies = Database.getMovieList();
    movies.add(movie);
    Database.setMovieList(movies);
    Database.saveDatabase();

    return movie;
  }

  public static Movie updateMovie(Movie movie) {
    try {
      System.out.println("Current ID: " + movie.getId());
      System.out.println("Enter ID:");
      int id = InputController.getInt(); 

      System.out.println("Current name: " + movie.getName());
      System.out.println("Enter name:");
      String name = InputController.getString();

      System.out.println("Current status: " + movie.getStatus());
      System.out.print(
        "Possible movie statuses: \n" +
        "1. Coming soon\n" +
        "2. Preview\n" +
        "3. Now showing\n\n" +
        "Select movie status (number): "
      );
      int typeNo = InputController.getInt();
      MovieStatus movieStatus = MovieStatus.NA;
      switch (typeNo) {
        case 1:
          movieStatus = MovieStatus.COMING_SOON;
          break;
        case 2:
          movieStatus = MovieStatus.PREVIEW;
          break;
        case 3:
          movieStatus = MovieStatus.NOW_SHOWING;
          break;
        case 4:
          movieStatus = MovieStatus.END_OF_SHOWING;
          break;
        default:
          System.out.println("Wrong input!\n" + "Returning to menu...");
      }

      System.out.println("Current type: " + movie.getType());
      System.out.print(
        "Possible movie types: \n" +
        "1. 2D\n" +
        "2. 3D\n" +
        "3. Blockbuster\n\n" +
        "Select movie type (number): "
      );
      typeNo = InputController.getInt();
      MovieType movieType = MovieType.NA;
      switch (typeNo) {
        case 1:
          movieType = MovieType.TWO_D;
          break;
        case 2:
          movieType = MovieType.THREE_D;
          break;
        case 3:
          movieType = MovieType.BLOCKBUSTER;
          break;
        default:
          System.out.println("Wrong input!\n" + "Returning to menu...");
      }

      System.out.println("Current age restriction: " + movie.getAgeRestriction());
      System.out.print(
        "Possible age restrictions: \n" +
        "1. PG13\n" +
        "2. NC16\n" +
        "3. M18\n" +
        "4. R21\n" +
        "Select age restriction (number): "
      );
      typeNo = InputController.getInt();
      AgeRestriction ageRestriction = AgeRestriction.NA;
      switch (typeNo) {
        case 1:
          ageRestriction = AgeRestriction.PG13;
          break;
        case 2:
          ageRestriction = AgeRestriction.NC16;
          break;
        case 3:
          ageRestriction = AgeRestriction.M18;
          break;
        case 4:
          ageRestriction = AgeRestriction.R21;
          break;
        default:
          System.out.println("Wrong input!\n" + "Returning to menu...");
      }

      System.out.println("Current synopsis: " + movie.getSynopsis());
      System.out.println("Enter synopsis:");
      String synopsis = InputController.getString();

      System.out.println("Current director: " + movie.getDirector());
      System.out.println("Enter director:");
      String director = InputController.getString();

      System.out.println("Current cast: " + movie.getCast());
      System.out.println("Enter cast");
      String cast = InputController.getString();

      ArrayList<Movie> movies = Database.getMovieList();
      for (Movie m: movies) {
        if (m.getId() == id) {
          m.setId(id);
          m.setName(name);
          m.setStatus(movieStatus);
          m.setType(movieType);
          m.setAgeRestriction(ageRestriction);
          m.setSynopsis(synopsis);
          m.setDirector(director);
          m.setCast(cast);
        }
      }
      Database.setMovieList(movies);
      Database.saveDatabase();

    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    return movie;
  }

  public static void deleteMovie(Movie movie) {
    System.out.println("Deleting movie " + movie.getName());
    ArrayList<Movie> movies = Database.getMovieList();
    for (Movie m: movies) {
      if (m.equals(movie)) {
        movies.remove(m);
        break;
      }
    }
    Database.setMovieList(movies);
    Database.saveDatabase();
  }

  /*
   * assuming user inputs existing ID
   * not sure how to throw custom error in java
   * need help to add exceotion
   */
  public static Movie getMovieById() {
    try {
      System.out.println("Enter ID:");
      int id = InputController.getInt();
  
      ArrayList<Movie> movies = Database.getMovieList();
      for (Movie movie: movies) {
        if (movie.getId() == id) {
          return movie;
        }
      }
  
    } catch (NullPointerException ex) {
      System.out.println("ID does not exist");
      return null;
    }
    return null;
  }
}
