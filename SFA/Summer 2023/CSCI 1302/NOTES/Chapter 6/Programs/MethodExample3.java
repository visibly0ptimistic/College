public class MethodExample3 {

  public static void main(String[] args) {
    System.out.println("Start here in main method");
    aMethod();
    System.out.println("Back to main method");
    aMethod();
    bMethod();
    System.out.println("In main method again - program ends here");
  }// end main

  public static void aMethod() {
    System.out.println("\nIn the aMethod method, printing a line of text: aaaaaaaaaaa \n");
    System.out.println("a call - or invoking - the bMethod");
  }// end PrintLine Method

  public static void bMethod(){
  	System.out.println("\nIn the bMethod method, printing a line of text: bbbbbbbbbbbbb \n");
  }

}// end class
