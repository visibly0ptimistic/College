// This is to show how augmentation works
// augmentation is a shorthand of modifying a variable and then re-assigning back to that variable

import java.io.*;
public class Augmented_Assignments {
	public static void main (String[] args){

	System.out.println("Example of i += 1");
	int i = 1;
	System.out.println("Declared & Assigned: i = " + i);

	i +=1;
	System.out.println("Augmented: i += 1 is " + i);

	System.out.println();
	//***********************

	System.out.println("Example of a -= 1");
	int a = 5;
	System.out.println("Declared & Assigned: a = " + a);

	a -= 1;
	System.out.println("Augmented: a -= 1 is " + a);

	System.out.println();
	//***********************

	System.out.println("Example of z *= 4");
	int z = 8;
	System.out.println("Declared & Assigned: z = " + z);

	z *= 4;
	System.out.println("Augmented: z *= 4 is " + z);

	System.out.println();
	//***********************

	System.out.println("Example of m/= 2");
	int m = 10;
	System.out.println("Declared & Assigned: m = " + m);

	m /= 2;
	System.out.println("Augmented: m /= 2 is " + m);

	}
}