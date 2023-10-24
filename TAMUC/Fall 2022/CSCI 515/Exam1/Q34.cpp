// c++ program that that prompts a user to enter an integer number n in the range 1 to 50 then calculates and prints the factorials of 1 through n. The factorial of a positive integer m is equal to the product of the positive integers from 1 to m.
//
// Victor Ejiasi
// CSCI515
// 10/18/2022
//
#include <iostream>
using namespace std;

int main()
{
    // Declare variables
    int n, factorial, i;
    // Request user input
    cout << "Enter an integer number n in the range 1 to 50: ";
    cin >> n;
    // Loop through numbers 1 to n
    for (i = 1; i <= n; i++)
    {
        // Initialize factorial
        factorial = 1;
        // Calculate factorial
        for (int m = 1; m <= i; m++)
            factorial *= m;
        // Print factorial
        cout << "Factorial of " << i << " is " << factorial << endl;
    }
    return 0;
}