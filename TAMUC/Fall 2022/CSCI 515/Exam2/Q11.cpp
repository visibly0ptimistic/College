// What is the output of the following code?

#include <iostream>
using namespace std;

int main()
{
int *p;
int x;
x = 12;
p = &x;
cout << x << ", ";
*p = 81;
cout << *p << endl;
return 0;
}