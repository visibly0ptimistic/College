
/*   CSCI 515
 
 Ejiasi, Victor
 
 Practice Program 2
 
 09/20/2022
 
Write a program that prompts the user to input an integer between 0 and 35. 
If the number is less than or equal to 9, the program should output the number. 
Otherwise, it should output A for 10, B for 11, C for 12, ..., and Z for 35. 
(Hint: use the cast operator, static_cast<char>( ), for numbers >= 10.)
 
 */

#include<iostream>  // required header file for input/output

using namespace std;


int main()

{
    // necessary statements to implement the logic go here

    signed num1;
    
    cout << "enter an integer between 0 and 35" << endl;
    
    cin >> num1;
    cout << endl;
    if (num1<= 9)
    cout << num1 << endl;
    else if (num1 >= 10 && num1<= 35)
    cout << static_cast<char>('A' + (num1 - 10)) << endl;
    else if (num1< 0 || num1> 35)
    cout << "the integer you entered is not between 0 and 35." << endl;
    return 0;
}




