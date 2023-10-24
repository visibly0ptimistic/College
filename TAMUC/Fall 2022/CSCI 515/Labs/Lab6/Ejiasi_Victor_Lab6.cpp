/*   CSCI 515
 
 Victor Ejiasi
 
 Practice Program 6
 
*/

#include <iostream>

using namespace std;

class orderedPair 
{
    public:
        void setX(double a);
        void setY(double b);
        double getX();
        double getY();
        void print();
                // Prints the ordered pair (x, y)
    private:
        double x;
        double y;
};

// line d
void orderedPair::setX(double a) {
x = a;
}

void orderedPair::setY(double b) {
y = b;
}

double orderedPair::getX() {
return x;
}

double orderedPair::getY() {
return y;
}

void orderedPair::print() {
cout << "The ordered pair is (" <<x<<","<<y<<")."<<endl;
}

// Main function for the program
int main() 
{
    orderedPair *pairPtr;
    pairPtr = new orderedPair;
    pairPtr->setX(5); //line a
    pairPtr->setY(7); //line b
    pairPtr->print(); //line c

return 0;
}