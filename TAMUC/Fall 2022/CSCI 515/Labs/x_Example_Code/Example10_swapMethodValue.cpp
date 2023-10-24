/* swap function/method, passing by value */

#include <iostream>
using namespace std;

void swap(int x, int y); //paramters, value
void swap2(int& x, int& y); //paramters, reference

int main(){
	
	//local variables
	int a = 100;
	int b = 200;
    cout << endl << "*** Testing passing by value ***" <<endl;

	cout << "before swap, value of a :" <<a <<endl;
	cout << "before swap, value of b :" <<b <<endl;
	
	swap(a, b);
	
	cout << "after swap, value of a :" <<a <<endl;
	cout << "after swap, value of b :" <<b <<endl;
	
	cout << endl << "*** Testing passing by reference ***" <<endl;
	
	cout << "before swap2, value of a :" <<a <<endl;
	cout << "before swap2, value of b :" <<b <<endl;
	
	swap2(a, b);
	
	cout << "after swap2, value of a :" <<a <<endl;
	cout << "after swap2, value of b :" <<b <<endl;
	return 0;
}

void swap(int x, int y){
	int temp;
	temp = x, 
	x = y;
	y = temp;
	return;
}

void swap2(int& x, int& y){
	int temp;
	temp = x, 
	x = y;
	y = temp;
	return;
}

