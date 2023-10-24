#include <iostream> //preprocessor directives
 
using namespace std;

// basic operations on a one-dimentional array
int main(){
	//define the array

	int SIZE = 10;
	int list[SIZE];// size is 100. the array has 100 elements of data type int.
	// initialize the array
	// 0<= i<=99
	for(int i=0;i<SIZE;i++)
		list[i]=0; // 0 is the default value of data type 'int.'
	
	for(int i=0;i<SIZE;i++)
		cin>>list[i];
			 
	int sum=0;
	//find the sum and array of an array
	for(int i=0;i<SIZE;i++)
		sum=sum+list[i];
	double average = sum/SIZE;
	cout<< "The sum is "<<sum<<endl;
	cout<< "The average element is "<<average<<endl;
	
	// find the largest element or smallest element
	int max =list[0];
	int min = list[0];
	for(int i=0;i<SIZE;i++) // -1,-3,-5,-100,-20
	{
		if(max <list[i])
			max= list[i];
			
		if (min>list[i])
			min=list[i];			
	}	
	cout<< "The largest element is "<<max<<endl;
	cout<< "The smallest element is "<<min<<endl;
	
	// print all elements
	for(int i=0;i<SIZE;i++) // i<=99
		cout<< list[i] << " ";
	cout<<endl;
	return 0; 
}


