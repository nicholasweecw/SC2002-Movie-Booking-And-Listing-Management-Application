package Model;

import java.util.ArrayList;

public class Cineplex {
    private String location;
    private String name;
    private ArrayList<Movie> movies;
    private ArrayList<Cinema> cinemas;

    public Cineplex(String location, String name) {
        this.location = location;
        this.name = name;
        this.cinemas = new ArrayList<>();
        this.movies = new ArrayList<>();
    }

    public String getLoc() {
        return location;
    }

    public void setLoc(String loc) {
        this.location = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ArrayList<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(ArrayList<Cinema> cinemas) {
        this.cinemas = cinemas;

    }

}
