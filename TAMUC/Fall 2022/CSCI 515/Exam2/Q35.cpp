// C++ program that has 3 functions (including main) to compute and print the value of x * (x + 1) + y * y + z * (z - 1), where x, y, and z are 3 floating point numbers entered by the user. 

// Requirement: Your main function should NOT have any local variable. 

// Victor Ejiasi
// CSCI515
// 12/15/2022


#include <iostream>

// function prototype
float computeSum(float, float, float);

int main() {
    // variables to hold the user-entered values
    float x, y, z;

    // prompt the user to enter the values
    std::cout << "Enter three floating point numbers: ";

    // read the values from the user
    std::cin >> x >> y >> z;

    // compute and print the result
    std::cout << "Result: " << computeSum(x, y, z) << std::endl;

    return 0;
}

// function definition
float computeSum(float x, float y, float z) {
    // compute and return the result
    return x * (x + 1) + y * y + z * (z - 1);
}
