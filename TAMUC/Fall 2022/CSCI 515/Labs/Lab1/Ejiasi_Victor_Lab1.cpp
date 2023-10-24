
/*

User will enter 5 numbers and the program will display the 1) product, 2) sum and 3) average of the 5 numbers

user can enters 5 numbers in the range of -2147483648 to 2147483647

Values entered are not required to be displayed

Ejiasi, Victor
CSCI515 Practice Program Lab 1
09/09/2022

*/

#include<iostream>  // required header file for input/output

using namespace std;


int main()

{
    // necessary statements to implement the logic go here
    
    signed num1, num2, num3, num4, num5, sum, avg, product;
    
    cout << "enter 5 numbers that will be multiplied, summed, and averaged";
    
    cout << "\n numbers must be in the range from -2147483648 to 2147483647" << endl;
    
    // all five variables could be put on the same input statement
    
    cin >> num1 >> num2;
    
    cin >> num3 >> num4 >> num5;

    product = num1*num2*num3*num4*num5;
    
    sum = num1+num2+num3+num4+num5;
    
    cout << "The product of the 5 numbers is " << product << "; the sum of the 5 numbers is " << sum << "; the integer average is " << sum/5 <<endl;
    
    
    
    
    
    
    
    return 0;
    
}




