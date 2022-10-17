package Model;

import Model.UserType;    // Is this needed?? 
import java.io.Serializable;

public class User implements Serializable{

  protected UserType userType;
  protected long id;
  protected String name;

  public User(UserType userType, String name) {
    this.userType = userType;
    this.name = name;
    this.id = System.currentTimeMillis();
  }

  public UserType getUserType() {
    return this.userType;
  }

  public long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }
}
