package Model;

import java.io.*;
import java.util.*;

public final class Database implements Serializable {
  /*
   * HOW TO USE
   *
   * Storing new object type
   * 1) Import and implements Serializable in whatever object you wish to store
   * 2) Add this attribute to your object
   * "private static final long SerialVersionUID=10l;"
   * 3) Create a new private static ArrayList<Object> objectList attribute below
   * 4) Update initDatabase and saveDatabase with your new object, follow the
   * format of previous entries
   * 5) Add get/set for your new object, follow the format of the previous
   * examples
   * 
   * Retrieving and storing data
   * 1) Call Database.initDatabase();
   * 2) Retrieve your data using the get function
   * 3) When done editing your data, return the data using the set function
   * 4) Call Database.saveDatabase();
   * 
   * Notes
   * - Please remember to keep the ArrayLists in order
   * - The database currently stores ArrayLists of objects only, if you really
   * need to store other things please let me know
   * 
   * To-Do
   * - Add a reset database function to re-initialize database with default values
   */

  // Example
  // private ArrayList<Person> personList;
  private static String filename = "database.ser";
  private static ArrayList<Admin> adminList;
  private static ArrayList<Cineplex> cineplexList;
  private static ArrayList<Movie> movieList;
  private static ArrayList<MovieGoer> movieGoerList;

  public static void initDatabase() {
    // On creation deserialize data
    // personList = new ArrayList<Person>();
    adminList = new ArrayList<Admin>();
    cineplexList = new ArrayList<Cineplex>();
    movieList = new ArrayList<Movie>();
    movieGoerList = new ArrayList<MovieGoer>();

    try {
      // Reading the object from a file
      FileInputStream file = new FileInputStream(filename);
      ObjectInputStream in = new ObjectInputStream(file);

      // Method for deserialization of object
      // Person[] personArray = (Person[])in.readObject();
      // Must be in order
      Admin[] adminArray = (Admin[]) in.readObject();
      Cineplex[] cineplexArray = (Cineplex[]) in.readObject();
      Movie[] movieArray = (Movie[]) in.readObject();
      MovieGoer[] movieGoerArray = (MovieGoer[]) in.readObject();

      // Convert arrays into arrayList
      // Collections.addAll(personList, personArray);
      Collections.addAll(adminList, adminArray);
      Collections.addAll(cineplexList, cineplexArray);
      Collections.addAll(movieList, movieArray);
      Collections.addAll(movieGoerList, movieGoerArray);

      in.close();
      file.close();

      System.out.println("Database has been deserialized ");
    } catch (IOException ex) {
      System.out.println("IOException is caught");
      System.out.println(ex.getMessage());
    } catch (ClassNotFoundException ex) {
      System.out.println("ClassNotFoundException is caught");
      System.out.println(ex.getMessage());
    } catch (ClassCastException ex) {
      System.out.println("ClassCastException is caught");
      System.out.println(ex.getMessage());
    }
  }

  // Example for get/set
  // public ArrayList<Person> getPersonList() {
  // return personList;
  // }

  // public void setPersonList(ArrayList<Person> personList) {
  // this.personList = personList;

  public static ArrayList<Admin> getAdminList() {
    return adminList;
  }

  public static ArrayList<Cineplex> getCineplexList() {
    return cineplexList;
  }

  public static ArrayList<Movie> getMovieList() {
    return movieList;
  }

  public static ArrayList<MovieGoer> getMovierGoerList() {
    return movieGoerList;
  }

  public static void setAdminList(ArrayList<Admin> adminList) {
    Database.adminList = adminList;
  }

  public static void setCineplexList(ArrayList<Cineplex> cineplexList) {
    Database.cineplexList = cineplexList;
  }

  public static void setMovieList(ArrayList<Movie> movieList) {
    Database.movieList = movieList;
  }

  public static void setMovieGoerList(ArrayList<MovieGoer> movieGoerList) {
    Database.movieGoerList = movieGoerList;
  }

  public static void saveDatabase() {
    try {
      FileOutputStream file = new FileOutputStream(filename);
      ObjectOutputStream out = new ObjectOutputStream(file);

      // Convert arraylist to arrays
      // Person[] personArray = new Person[personList.size()];
      // personList.toArray(personArray);
      Admin[] adminArray = new Admin[adminList.size()];
      adminList.toArray(adminArray);
      Cineplex[] cineplexArray = new Cineplex[cineplexList.size()];
      cineplexList.toArray(cineplexArray);
      Movie[] movieArray = new Movie[movieList.size()];
      movieList.toArray(movieArray);
      MovieGoer[] movieGoerArray = new MovieGoer[movieGoerList.size()];
      movieGoerList.toArray(movieGoerArray);

      // out.writeObject(personArray);
      out.writeObject(adminArray);
      out.writeObject(cineplexArray);
      out.writeObject(movieArray);
      out.writeObject(movieGoerArray);

      out.close();
      file.close();

      System.out.println("Database has been serialized");
    } catch (IOException ex) {
      System.out.println("IOException is caught");
      System.out.println(ex.getMessage());
    } catch (ClassCastException ex) {
      System.out.println("ClassCastException is caught");
      System.out.println(ex.getMessage());
    }
  }
}
