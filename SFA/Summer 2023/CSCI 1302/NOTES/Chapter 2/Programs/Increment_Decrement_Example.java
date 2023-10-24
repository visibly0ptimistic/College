// This is to show how the increment - decrement works
import java.io.*;
public class Increment_Decrement_Example {
	public static void main (String[] args){

	System.out.println("Example of i--");
	int i = 10;
	System.out.println("i = " + i);

	int j = i--;
	System.out.println("i = " + i + ", j = " + j );

	System.out.println();
	//***********************

	System.out.println("Example of --a");
	int a = 5;
	System.out.println("a = " + a);

	int b = --a;
	System.out.println("a = " + a + ", b = " + b );

	System.out.println();
	//***********************

	System.out.println("Example of z++");
	int z = 5;
	System.out.println("z = " + z);

	int y = z++;
	System.out.println("z = " + z + ", y = " + y );

	System.out.println();
	//***********************

	System.out.println("Example of ++m");
	int m = 5;
	System.out.println("m = " + m);

	int n = ++m;
	System.out.println("m = " + m + ", n = " + n );

	}
}