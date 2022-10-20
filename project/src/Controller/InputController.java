package Controller;

import java.util.Scanner;

public class InputController {
  static Scanner sc = new Scanner(System.in);

  public static int getInt() {
    int res = sc.nextInt();
    sc.nextLine();
    return res;
  }

  public static String getString() {
    String res = sc.nextLine();

    return res;
  }
}
