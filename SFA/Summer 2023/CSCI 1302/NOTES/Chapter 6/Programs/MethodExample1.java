import java.util.*;

public class MethodExample1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input your name: ");
    String myName = input.nextLine();
    welcome(myName);
    System.out.println("back in main");
  }// end main


  public static void welcome(String name) {
    System.out.println("Welcome to Java Methods " + name);
  }// end welcome

}// end class
