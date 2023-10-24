#include <iostream>

using namespace std;
int main()
{
int x, y, z;
x = 1;
y = 4;
while ( x < y ) {
    x = x * 2;
    y = y +2;
}
z = y;
cout << z << endl;
cout << x << endl;
cout << y << endl;
}