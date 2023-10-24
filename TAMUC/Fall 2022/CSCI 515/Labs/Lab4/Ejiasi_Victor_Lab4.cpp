/*   CSCI 515
 
 Your Name
 
 Practice Program 4
 

Write a program that  two functions:

- a function that accepts two integers as input arguments and return their sum.
- a function that prints the result (sum).�

Your program should define the main function as well and call both functions from the main().�

NOTE 1: properly and fully document your code for full credit.
 
 */


#include <iostream> 

using namespace std;

// function declaration for the function that adds two integers
int add(int, int); 

// function declaration for the function that prints the sum
void printSum(int); 

// main function
int main()
{
    // necessary statements to implement the logic go here
    // variables to store two numbers and their sum
    int num1, num2, sum;

    // to print prompt message to enter two numbers
    cout << "Enter two numbers:" << endl;

    //read two numbers from keyboard
    cin >> num1 >> num2;

    // call the add function to add the numbers
    sum = add(num1, num2);

    // declare a variable to store the sum
    printSum(sum);

    // return 0 to indicate that the program ended successfully
    return 0;
    }

// function definition for the function that adds two integers
int add(int x, int y)
{
    // z is the sum of x and y
    int z;
    z = x + y;
    // return the sum
    return(z);
    }

// function to print result
void printSum(int ans)
{
    // print the sum
    cout << "The sum of the given numbers = " << ans;
    }