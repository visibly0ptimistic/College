/**
 *
 */


public class FormatingExamples {

    public static void main (String [] args) {

    	String name = "First Last Name";
    	double num1 = 123.4567;
    	double num2 = 98765.76543;
    	// print the name aligned to the left and the number to the right
    	System.out.printf("%-20s  %10.2f\n", name, num1);
    	System.out.printf("%-20s  %10.2f\n\n", name, num2);


    	//Simple Interest
    	// A = P(1+r)^t
    	double interestRate = .0325;
    	int t = 5;
    	double p = 1000.00;
    	double a = p * Math.pow((1 + interestRate), t);
    	System.out.printf("The deposit of %7.2f for %d periods will yeild you $%8.2f\n\n", p, t, a);
    	System.out.println(a);


    }// end main
}// end FormatingExamples