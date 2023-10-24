/* Write a C++ program (with proper documentation/comments) that reads a sequence of integer inputs and prints the following. 

(10 points) The smallest and largest of the inputs.
(10 points) The number of even and odd inputs.
(10 points) Cumulative totals. For example, if the input is 1 7 2 9, the program should print 1 8 10 19.
(10 points) All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 2, the program should print 3 5 6. */

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
    int num, smallest, largest, even, odd, sum, prev;
    // Request user input
    cout << "Enter a sequence of integers: ";
    // Read first number
    cin >> num;
    // Initialize variables
    smallest = num;
    largest = num;
    even = 0;
    odd = 0;
    sum = 0;
    prev = num;
    // Loop until user enters 0
    while (num != 0)
    {
        // check if smallest
        if (num < smallest)
            smallest = num;
        // check if largest
        if (num > largest)
            largest = num;
        // check if even
        if (num % 2 == 0)
            even++;
        // check if odd
        else
            odd++;
        // add to sum
        sum += num;
        // find duplicates
        if (num == prev)
            cout << "Duplicate number: " << num << endl;
        // update previous number
        cin >> num;
    }
// Print results
    cout << "Smallest: " << smallest << endl;
    cout << "Largest: " << largest << endl;
    cout << "Even: " << even << endl;
    cout << "Odd: " << odd << endl;
    cout << "Sum: " << sum << endl;
    return 0;
}