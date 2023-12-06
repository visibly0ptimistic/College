/**
 *
 */

public class StringEquals0 {

  public static void main (String args[]) {

     String pupNameA = "Scrappy";				//how we learned in chapter 4 - literal
     String pupNameB = "Scrappy";				// pupNameB is a reference to Scrappy
     												//- the same Scrappy of pupNameA

     String houndNameA = new String("Bozo");	// how we are learning in chapter 10
     String houndNameB = new String("Bozo");	// object String is created - instance creation

	 System.out.println();

 	 boolean sameDog = false;

	 if (pupNameA == pupNameB){  // comparing the reference not the values
 		sameDog=true;
		System.out.println(pupNameA + " and " + pupNameB + " are the same object using ==.");
 	 }else
		System.out.println(pupNameA + " and " + pupNameB + " are different objects using ==.");
	 System.out.println();
	 System.out.println();

	 if (pupNameA.equals(pupNameB)){  // comparing the instance creation - the content of the string
 		sameDog=true;
		System.out.println(pupNameA + " and " + pupNameB + " are the same object using .equals().");
 	 }else
		System.out.println(pupNameA + " and " + pupNameB + " are different objects using .equals().");

 	 System.out.println();
 	 System.out.println();

  	 if (houndNameA == houndNameB){  // comparing the reference not the values
 		sameDog=true;
		System.out.println(houndNameA + " and " + houndNameB + " are the same object using ==.");
 	 }else
		System.out.println(houndNameA + " and " + houndNameB + " are different objects using ==..");

	 System.out.println();
	 System.out.println();

	 if (houndNameA.equals(houndNameB)){  // comparing the instance creation - the content of the string
 		sameDog=true;
		System.out.println(houndNameA + " and " + houndNameB + " are the same object using .equals().");
 	 }else
		System.out.println(houndNameA + " and " + houndNameB + " are different objects using .equals().");

	System.out.println();
	System.out.println();

	System.out.println("Why is == true for some cases?");
	System.out.println("pupNameA memory location: " + System.identityHashCode(pupNameA));
	System.out.println("pupNameB memory location: " + System.identityHashCode(pupNameB));
	System.out.println("houndNameA memory location: " + System.identityHashCode(houndNameA));
	System.out.println("houndNameB memory location: " + System.identityHashCode(houndNameB));


	System.out.println("houndNameB: " + houndNameB.toString());

	}// end main

}// end class StringEquals0