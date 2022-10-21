package Controller;

import Model.AgeRestriction;
import Model.Movie;
import Model.MovieStatus;
import Model.MovieType;

import java.util.Arrays;
import java.util.Scanner;

public class MovieController {

  public static Movie createMovie() {
    Scanner sc = new Scanner(System.in);

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

    Movie m = new Movie(
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
    return m;
  }

  public static Movie updateMovie(Movie movie) {
    Scanner sc = new Scanner(System.in);

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

    movie.setId(id);
    movie.setName(name);
    movie.setStatus(movieStatus);
    movie.setType(movieType);
    movie.setAgeRestriction(ageRestriction);
    movie.setSynopsis(synopsis);
    movie.setDirector(director);
    movie.setCast(cast);

    return movie;
  }

  public static void deleteMovie(Movie movie) {
    /*
     * TODO
     * ask alistair how to delete
     */
    System.out.println("Deleting movie " + movie.getName());
  }
}
