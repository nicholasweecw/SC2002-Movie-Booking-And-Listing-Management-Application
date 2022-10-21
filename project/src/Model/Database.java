package Model;

import java.io.*;
import java.util.*;

public final class Database implements Serializable {

  private static final long serialVersionUID = 123654789;
  // Example
  // private ArrayList<Person> personList;
  private String filename = "database.ser";
  private ArrayList<Admin> adminList;
  private ArrayList<Cineplex> cineplexList;
  private ArrayList<MovieGoer> movieGoerList;
  private ArrayList<Movie> movieList;

  public Database() {
    // On creation deserialize data
    // personList = new ArrayList<Person>();
    adminList = new ArrayList<Admin>();
    cineplexList = new ArrayList<Cineplex>();
    movieGoerList = new ArrayList<MovieGoer>();
    movieList = new ArrayList<Movie>();

    try {
      // Reading the object from a file
      FileInputStream file = new FileInputStream(filename);
      ObjectInputStream in = new ObjectInputStream(file);

      // Method for deserialization of object
      // Person[] personArray = (Person[])in.readObject();
      // Must be in order
      Admin[] adminArray = (Admin[]) in.readObject();
      Cineplex[] cineplexArray = (Cineplex[]) in.readObject();
      MovieGoer[] movieGoerArray = (MovieGoer[]) in.readObject();
      Movie[] movieArray = (Movie[]) in.readObject();

      // Convert arrays into arrayList
      // Collections.addAll(personList, personArray);
      Collections.addAll(adminList, adminArray);
      Collections.addAll(cineplexList, cineplexArray);
      Collections.addAll(movieGoerList, movieGoerArray);
      Collections.addAll(movieList, movieArray);

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

  public ArrayList<Movie> getMovieList() {
    return movieList;
  }

  public void setMovieList(ArrayList<Movie> movieList) {
    this.movieList = movieList;
  }

  public void saveDatabase() {
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
      MovieGoer[] movieGoerArray = new MovieGoer[movieGoerList.size()];
      movieGoerList.toArray(movieGoerArray);
      Movie[] movieArray = new Movie[movieList.size()];
      movieList.toArray(movieArray);

      // out.writeObject(personArray);
      out.writeObject(adminArray);
      out.writeObject(cineplexArray);
      out.writeObject(movieGoerArray);
      out.writeObject(movieArray);

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
