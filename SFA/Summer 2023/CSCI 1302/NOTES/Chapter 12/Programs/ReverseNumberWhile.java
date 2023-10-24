/*Name
 * CSC 102.002
 *
 * Purpose:  This program
 *
 * Input:
 *
 * Output:
 *
 * Sample run:
 *
 *
 **/


import java.util.*;

class ReverseNumberWhile{
   public static void main(String args[])   {
      int num=0;
      int reversenum =0;
      System.out.println("This program will reverse your number, please enter your number to be reversed: ");

      Scanner in = new Scanner(System.in);

      //Captured input would be stored in number num
      num = in.nextInt();

      //While Loop: Logic to find out the reverse number
      while( num != 0 ) {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("The number in reverse: "+ reversenum);

   }// end main
}// end ReverseNumberWhile