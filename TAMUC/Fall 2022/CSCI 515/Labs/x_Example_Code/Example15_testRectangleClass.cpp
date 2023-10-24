/* testing rectange class */

#include <iostream>

using namespace std;

//class difinition
class Rectangle {
	private: //private members
		int width, height;
	public: //public members
		void set_values (int, int);
		int area();
};
//function implementation
void Rectangle::set_values(int x, int y){
	width = x;
	height = y;
}

//function area
int Rectangle::area()
{
	return width * height;
}

//main client implementation
int main() {
	Rectangle rect; //instantiate an object
	int w, h;
	cout <<"Enter width and height : ";
	cin >> w >> h;
	rect.set_values(w, w);
	cout << "area:  " << rect.area();
	return 0;	
}
