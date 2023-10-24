/*
 
 User will enter 5 numbers and the program will display the 5 numbers, the sum, and average of the five numbers
 
 user enters 5 numbers in the range of -32768 to 32767
 
 Ejiasi, Victor
 CSCI515 Practice Program Lab 0
 09/02/2022
 
*/

#include <iostream>  // required header file for input/output

using namespace std;


int main()

{    // necessary statements to implement the logic go here
    
    short num1, num2, num3, num4, num5, sum, avg;
    
    cout << "enter 5 numbers that will be summed and averaged";
    
    cout << "\n numbers must be in the range from -32768 to 32767" << endl;
    
    // all five variables could be put on the same input statement
    
    cin >> num1 >> num2;
    
    cin >> num3 >> num4 >> num5;
    
    sum = num1+num2+num3+num4+num5;
    
    cout<< "The sum of the 5 numbers is " << sum << "; the integer average is " << sum/5 <<endl;
    
    // optional code to compute and display average
    
    //avg = sum/5;
    
    //cout<<"The sum of the 5 numbers is "<<sum<<"; the integer average is "<<avg<<endl;
    
    
    
    
    return 0;
    
}
