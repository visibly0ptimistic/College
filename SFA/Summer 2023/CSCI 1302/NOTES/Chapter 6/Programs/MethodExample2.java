public class MethodExample2 {

  public static void PrintIntro() {
    System.out.println("This is the intro to the program.");
  }// end PrintIntro
  
  public static void PrintGoodbye() {
    System.out.println("Have a nice day :)");
  }// end PrintGoodbye
  
  public static void main(String[] args) {
    PrintIntro();
    
    for (int i = 0; i < 5; i++){
      System.out.print(i + " ");
    }
    
    System.out.println();
    
    PrintGoodbye();
    
  }// end main
}// end class
