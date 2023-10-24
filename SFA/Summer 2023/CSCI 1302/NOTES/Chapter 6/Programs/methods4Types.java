
public class methods4Types {

   public static void main (String [] args) {
    int a;
    int b;

    printHelloTenTimes();
    printHelloXTimes(2);
    System.out.println( "The cube of 25 is " + cubeMe(25) );
    a = 6;
    b = 9;
    System.out.println("The greater of " + a + " and " + b + " is " + returnGreatest(a,b));

   }// end main

   // ******************************************************************************************

   //simple method that takes in one parameter, returns a float value
   public static float cubeMe (int x) {
    //give back to the calling program, the cube of x
    return x*x*x;
   }// end cubeMe

   // ******************************************************************************************

   //simple method that takes in two parameters, returns an int value
   public static int returnGreatest (int x, int y) {
    //give back to the calling program, the cube of x
    if (x>y) {
      return x;
    }
    else {
      return y;}
   }// end returnGreatest

   // ******************************************************************************************

   //method that takes in one parameter, returns nothing
   public static void printHelloXTimes (int count){
    int i;
    for (i = 1; i <= count; i++) {
      	System.out.println("Hello world, count = " + i);
    }
   }// end printHelloXTimes

   // ******************************************************************************************

   //extremely simple method that takes in no parameters, returns nothing
   public static void printHelloTenTimes (){
    int i;
    for (i = 1; i <= 10; i++) {
      System.out.println("Hello world, count = " + i);
    }
   }// end printHelloTenTimes

   // ******************************************************************************************

}// end class
