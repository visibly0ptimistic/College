/* 

This code illustrates the use of pointers for effective swapping of variable values

*/

#include <iostream>

using namespace std;

void swap(int* w, int* z) //function implementation with paramters defined as pointers
{
	int t; //local variable
	t = *w; //store the value of the variable to be swapped temporarily in the local variable t
	*w = *z; //swap
	*z = t; //restore the value to the other variable
}
int main()
{
	int w = 5, z = 7; //define and assign variables
	cout << "before calling swap w = " << w << " " << "z = " << z << endl;
	swap(w, z); //function call and passing paramters
	cout << "after calling swap w = " << w << " " << "z = " << z << endl; //print out the results
	return 0;
}

