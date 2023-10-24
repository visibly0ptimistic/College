//Example: scientific and fixed 
#include <iostream>
#include <iomanip> 

using namespace std;

int main()
{
double hours = 35.45; 
double rate = 15.00; 
double tolerance = 0.01000; 

cout << setprecision(3);
cout << "hours = " << hours << ", rate = " << rate << ", pay = " << hours * rate << ", tolerance = " << tolerance << endl << endl; cout << scientific;
cout << "Scientific notation: " << endl;
cout << "hours = " << hours << ", rate = " << rate << ", pay = " << hours * rate << ", tolerance = " << tolerance << endl << endl;
cout << fixed;
cout << "Fixed decimal notation: " << endl;
cout << "hours = " << hours << ", rate = " << rate << ", pay = " << hours * rate << ", tolerance = " << tolerance << endl << endl;

return 0;
}

