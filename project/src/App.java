
import Controller.*;

import Model.MovieStatus;
import Model.MovieType;
import Model.Admin;
import Model.Movie;

/*
 * i use this app to test controllers
 */
public class App {
	public static void main(String[] args) {

		Admin admin = new Admin("timothyjblew", "password");
		Movie m = admin.createMovieListing();
		// System.out.println(m.getId());
    // System.out.println(m.getName());
    // System.out.println(m.getStatus());
    // System.out.println(m.getType());
    // System.out.println(m.getAgeRestriction());
    // System.out.println(m.getSynopsis());
    // System.out.println(m.getDirector());
	}
}
