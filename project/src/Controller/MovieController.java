package Controller;

import Model.AgeRestriction;
import Model.Movie;
import Model.MovieStatus;
import Model.MovieType;
import java.util.Arrays;
import java.util.Scanner;

// enum ageRestriction {PG13, NC16, M18, R21};

public class MovieController {

  Scanner sc = new Scanner(System.in);

  public Movie createMovie() {
    System.out.println("Enter ID:");
    int id = sc.nextInt();

    System.out.println("Enter name:");
    sc.nextLine();
    String name = sc.nextLine();

    System.out.print(
      "Possible movie statuses: \n" +
      "1. Coming soon\n" +
      "2. Preview\n" +
      "3. Now showing\n\n" +
      "Select movie status (number): "
    );
    int typeNo = sc.nextInt();
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
    typeNo = sc.nextInt();
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
      "Possible movie types: \n" +
      "1. PG13\n" +
      "2. NC16\n" +
      "3. M18\n" +
      "4. R21\n" +
      "Select age restriction (number): "
    );
    typeNo = sc.nextInt();
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
    sc.nextLine();

    System.out.println("Enter synopsis:");
    String synopsis = sc.nextLine();

    System.out.println("Enter director:");
    String director = sc.nextLine();

    System.out.println("Enter cast");
    String cast = sc.nextLine();

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
}
