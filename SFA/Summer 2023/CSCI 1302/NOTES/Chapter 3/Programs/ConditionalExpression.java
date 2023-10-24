import java.util.Scanner;

public class ConditionalExpression {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a three numbers: ");
    double x = input.nextDouble();
    double y = input.nextDouble();
    double z = input.nextDouble();

    System.out.println((x < y && y < z) ? "sorted" : "not sorted");
    			  // (boolean-expression)  ?  if   :   else ;



  } // end main
}// end ConditionalExpression