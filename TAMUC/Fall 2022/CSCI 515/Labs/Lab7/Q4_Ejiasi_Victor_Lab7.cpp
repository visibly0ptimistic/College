/*   CSCI 515
 
 Victor Ejiasi
 
 Practice Program 7 Q4
 
*/

#include <iostream>
#include <string>
using namespace std;

// class x is defined here
class X
{
        float d;
    public:
        virtual void function1(){
            cout<<"This is class X"<<endl;
        }
};

// class z inherits class x and overrides function1 
class Z: public X
{
        int x = 15;
    public:
        void function1(){
            
            cout<<"This is class Z"<<endl;
        }
};

int main()
{
    X *x = new X();
    Z z;
    x = &z;
    x->function1();
    return 0;
}

