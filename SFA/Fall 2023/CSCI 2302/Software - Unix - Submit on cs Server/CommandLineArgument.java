/* This is an example of the command line arguments

*/

import java.io.*;
import java.util.*;

public class CommandLineArgument {
  public static void main(String[] args) throws Exception {
    
    // Check command line parameter usage
    if (args.length != 3) {
      System.out.println(
        "Usage: java CommandLineArgument arg1 arg2 arg3");
      System.exit(0);
    }

    // Variables for the command line arguments
    String arg1 = args[0];
    System.out.println("first argument is " + arg1);
    
    String arg2 = args[1];
    System.out.println("second argument is " + arg2);

    String arg3 = args[2];
    System.out.println("third argument is " + arg3);
    
    
  }// end main
}// end CommandLineArgument
