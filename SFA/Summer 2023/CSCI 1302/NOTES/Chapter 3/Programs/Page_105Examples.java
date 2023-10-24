public class Page_105Examples {

   public static void main(String args[]){
      int x = 2;
      int y = 3;
      int z = 6;
      
      System.out.println("(x < y && y < z) is " + (x < y && y < z));
      
      System.out.println("(x < y || y < z) is " + (x < y || y < z));
      
      System.out.println("!(x < y) is " + !(x < y));
      
      System.out.println("(x + y < z) is " + (x + y < z));
      
      System.out.println("(x - y < z) is " + (x - y < z));
      
      
      System.out.println("*****************************");
      // write a Boolean expression that evaluates true if age is greater than 13 and less than 18
      int age = 10;
      System.out.println(age > 13 && age < 18);
      
      System.out.println();
      System.out.println("*****************************");
      
      System.out.println("*****************************");
      // write a Boolean expression that evaluates true if weight is greater than 50 lbs and height is greater than 60 inches
      int height = 57;
      int weight = 81;
      System.out.println("height = 57 and weight = 81");
      
      System.out.println("weight > 50 & height > 60: " + (weight > 50 && height > 60));
      
      System.out.println();
      System.out.println("*****************************");
      
      System.out.println("*****************************");
      // write a Boolean expression that evaluates true if weight is greater than 50 lbs or height is greater than 60 inches
       System.out.println("weight > 50 || height > 60: " + (weight > 50 || height > 60));
      
      System.out.println();
      System.out.println("*****************************");
      
      System.out.println("*****************************");
      // write a Boolean expression that evaluates true if either weight is greater than 50 lbs and height is greater than 60 inches, but not both
      System.out.println("weight > 50 ^ height > 60: " + (weight > 50 ^ height > 60));
      
   }
}