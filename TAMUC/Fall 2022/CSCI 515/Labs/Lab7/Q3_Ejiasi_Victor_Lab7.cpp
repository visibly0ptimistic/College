/*   CSCI 515
 
 Victor Ejiasi
 
 Practice Program 7 Q3
 
*/

#include<iostream>
using namespace std;

class Adder {
    public:
        int num;
        Adder() {num = 0;}
        Adder(int r) {num = r;}
        void print() { cout << num << endl; }
        friend Adder operator + (Adder const &, Adder const &);
        friend Adder operator += (Adder & , int x);
        friend bool operator == (Adder & , Adder &);
};


Adder operator + (Adder const &c1, Adder const &c2)
{
return Adder(c1.num + c2.num);
}
Adder operator += (Adder &c1 , int x)
{
c1 = Adder(c1.num + x);
return c1;
}

bool operator == (Adder &c1 , Adder &c2)
{
return c1.num==c2.num;
}


int main()
{
    Adder sum1, sum2(2);
    cout<<"sum1 is "<<sum1.num<<endl;
    cout<<"sum2 is "<<sum2.num<<endl;
    sum1 += 5;
    sum2 += -3;
    if(sum1==sum2)
    cout<<"sum1 and sum2 are the same"<<endl;
    else
    cout<<"sum1 and sum2 are not the same"<<endl;
    return 0;
}