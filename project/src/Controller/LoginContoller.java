package Controller;

import java.util.*;
import Model.Admin;
import Model.Database;
import Model.MovieGoer;

public class LoginContoller {

    private static ArrayList<Admin> adminList;
    private static ArrayList<MovieGoer> movieGoerList;

    // method call to do admin login
    public static boolean adminLogin(String username, String password) {
        // Returns true if login is valid, else return false;

        // Retrieves adminList from database
        Database.initDatabase();
        adminList = Database.getAdminList();

        // Default admin account hard-coded to always be allowed
        if (username == "admin" && password == "pass") {
            return true;
        }

        for (Admin a : adminList) {
            if (a.getUsername().equals(username)) {
                if (a.getPassword().equals(password)) {
                    return true;
                } else {
                    System.out.println("Wrong password.");
                    return false;
                }
            }
        }

        System.out.println("User not found.");
        return false;
    }

    // method call if admin is a new user
    public static void createAdmin(String username, String password, String name) {
        // Create a new admin and store to database
        Database.initDatabase();
        adminList = Database.getAdminList();
        adminList.add(new Admin(username, password, name));
        Database.setAdminList(adminList);
        Database.saveDatabase();
    }

    // method call to do user login
    public static MovieGoer userLogin(String name) {
        // Returns MovieGoer object with the same name, otherwise returns null

        // Retrieves movie goers from database
        movieGoerList = Database.getMovierGoerList();

        for (MovieGoer mg : movieGoerList) {
            if (mg.getName().equals(name)) {
                return mg;
            }
        }

        return null;
    }

    // method call if user is a new
    public static void createUser(String name, String mobile, int age) {
        // Create a new user and store to database
        Database.initDatabase();
        movieGoerList = Database.getMovierGoerList();
        movieGoerList.add(new MovieGoer(name, mobile, age));
        Database.setMovieGoerList(movieGoerList);
        Database.saveDatabase();
    }

}
