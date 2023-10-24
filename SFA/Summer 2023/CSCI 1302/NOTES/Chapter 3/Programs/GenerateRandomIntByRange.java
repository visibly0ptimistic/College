/*
        Generate a random int number within a given range example

        This Java example shows how to generate an int randomly within given range
        using Math class.


*/

public class GenerateRandomIntByRange {

        public static void main(String args[]){

                //Text book pages:  87 &  122)
                /*
             	 *	a + (int)(Math.random() * b)
             	 *	Returns a random whole number between a & a+b, excluding a+b's value
             	 *
             	 *	b = the range of numbers, or how many numbers you want
						i. e:  you need _(so many)__  numbers to choose from
					a = the starting point, the first number on the number line to choose from, where the range of numbers start
						i. e:  your choice of numbers starts at 5

					If you want a number between 5 and 15 the range is 10 [15-5]
                	replace the b with 10.

                	If you want the lowest number in the range to start with 5 then replace the a with 5.

					int randomNumber = 5 + (int)(Math.random() * 10 );
					what this means taken together:  you have 10 numbers to choose from and the the first number is 5; thus your range is from 5 upto 15, not including 15
             	 */

                // the example below creates a whole number between the values of 1 and 10
             	int randomNumber = 1 + (int)(Math.random() * 10 );
             	System.out.println("a random number between 1 & 10, including 10 (but not including 11):  " + randomNumber);

             	System.out.println();
             	System.out.println();

             	// this loops creates a hundred random numbers and prints them to the screen
             	// the example creates a whole number between the values of 1 and 100
             	System.out.println("100 random numbers:  ");
             	int randomLoopNumber;
             	for(int i = 0; i < 100; i++){
             		randomLoopNumber = 1 + (int)(Math.random() * 101 );
                	System.out.println(randomLoopNumber);
             	}


        }// end of main
}// end of class