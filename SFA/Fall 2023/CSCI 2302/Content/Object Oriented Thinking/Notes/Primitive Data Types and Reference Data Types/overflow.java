import java.io.*;
import java.util.*;


public class overflow {
  public static void main (String [] args) {
    // overflow example
    int temp;
    temp = 2147483647;	// pg 45 in 102 book, int largest value (32-bit signed)
    System.out.println(temp);
    System.out.println(temp + 1);


  }
}