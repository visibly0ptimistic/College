//Programmer: fill in your name here
//Course number: fill in our course number here
//Lab number: fill in your lab number here
//Date: fill in the date you create this program here

#include <iostream>
#include <iomanip>
#include <ctime>  // time
#include <cstdlib> //srand and rand
using namespace std;

int main(){
	
	//a) declare and initialize an int array of size 10. Th array should contain random numbers in the range 0-99
	//statements
	const int MAX_SIZE =10;
	int arr[MAX_SIZE];
	int num;
	//generate random number
	srand((unsigned)time(0)); // use  the current time as the seed
	bool flag =true;
	for(int i =0;i<MAX_SIZE;i++)
	{
	    //check if it is unique or not
	    //rand : get a floating-point numberin the range between 0 and RAND_MAX.
	    //RAND_MAX is a constant defined in <cstdlib>.
	    //http://www.cplusplus.com/reference/cstdlib/rand/
		num= rand()%(100+1);//[0,99] or [0,100)
		while(flag){
		 int i;
		 for(i =0;i<MAX_SIZE;i++)
		   if(num == arr[i])
		  	 break;
		 
		 if(i == MAX_SIZE)
		{
			  flag =false;
			  continue;
		}
		 num= rand()%(100+1);	 
		}
		arr[i]=num;
	}
	
	//print the array
	for(int i =0;i<MAX_SIZE;i++)
	{
		cout<<arr[i]<<" ";
	}
	//b) ask the user to enter a guess of a random number and try to find it in the stored array, indicate to the user if the input ws found or not. 
	int number;
	cout << "Enter a number between 0 and 100: ";
	cin >> number;
    flag =false;
	for ( int j = 0; j < MAX_SIZE; j++ ) {
			if( arr[j] == number ){
				flag =true;
				break;
			}
	}

	if ( flag == true ){
		cout << number << " exists in the array" << endl;
	}
	else{
		cout << number << " doesn't exist in the array" << endl;
	}

    //c) add 13.5 to all elements of the int array
	for ( int j = 0; j < MAX_SIZE; j++ ) {
		arr[j]+=13.6;
	}
	//d) print the array after addition
	cout << "Random array after addition: " << endl;

	for ( int i = 0; i < 10; i++ ) {
		cout << arr[i] << endl;
	}

	return 0;
}

