/*   testing pointers, references and values  
*              June 29, 2022                  */

#include <iostream>

using namespace std;

void change1(int &a); 
void change2(int a); 
void change3(int* a);

int main(){
    int x = 2, y = 2, z = 2;
	change1(x); 
	change2(y); 
	change3(&z);

    cout << "testing : " << x << ' ' << y << ' ' << z << endl;
    return 0;
}


void change1(int &a){ 
    a = a + 10;
    cout << "inside change 1, value of a is :" << a << endl;
}

void change2(int a){ 
	a = a + 10;
	cout << "inside change 2, value of a is :" << a << endl;
}

void change3(int* a){
	*a=*a + 10;
	cout << "inside change 3, value of a is :" << *a << endl;
}

