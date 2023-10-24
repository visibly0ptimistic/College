/* this program is to test larger using different sets of parameters */

#include <iostream>
using namespace std;

double larger(double x, double y)
{
double max;

if (x >= y)
max = x; else
max = y;

return max;
}


int main(){
	
//	double num1 = 13.00; 
//	double num2 = 36.53; 
//	double maxNum;
//
//   maxNum=larger(5, 6); 
//   maxNum=larger(num1, num2); 
//   maxNum=larger(num1, 29); 
//   cout<<larger(38.46,56.78);
   
  // test with integer parameters
   
   int x,y,one=1,two=2;

   x = larger(int one, 29);
   y = larger(int one, int 29);

   cout << larger(int one, int two);
	

   return 0;
}
