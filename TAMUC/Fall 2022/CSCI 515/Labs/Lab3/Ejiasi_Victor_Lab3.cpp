
/*   CSCI 515
 
 Victor Ejiasi
 
 Practice Program 3
 

 This program will prompt the user to enter a value (N) which represents the number of values to process
 
 Then the program will prompt the user to enter N integer numbers and the program will display the sum and average of the N numbers
 
 The program should also find and display the largest and smallest of the N numbers
 
 NOTE 1: you must use a loop to input the data, sum the data, and find largest and smallest values.
 
 NOTE 2: properly and fully document your code for full credit.
 
 */


#include<iostream>  // required header file for input/output

using namespace std;


int main()

{
    // necessary statements to implement the logic go here
    
	int N;  // N is the number of values to process
	
	cout << "Enter a value: ";  // prompt user to enter a value
	
	cin >> N;  // the value entered by the user is stored in N
	
	
	int a[N],sum=0,min=1e9,max=-1e9;  // a[N] is an array of size N, sum is initialized to 0, min is initialized to 1e9 and max is initialized to -1e9
	
	
	cout << "Enter "<< N <<" integers: "<< endl;  // the user is prompted to enter N integers
	
	
	for(int i=0;i<N;i++)  // for loop to input the data, sum the data and find the largest and smallest values
	{
		cin >> a[i];  // the user enters the N integers
		
		sum+=a[i];  // the sum of the N integers is calculated
		
		if(a[i]>max)  // if the current value is greater than the maximum value, then the current value becomes the maximum value
		max=a[i]; // the maximum value is stored in max
		
		if(a[i]<min)  // if the current value is less than the minimum value, then the current value becomes the minimum value
		min=a[i];  // the minimum value is stored in min
	}
	
	float avg = (float)sum/N; 	//avg stores the average by dividing the sum by N
	//(float) converts the result into float number
	
	cout <<"Sum: "<< sum << endl;  // the sum of the N integers is displayed
	cout <<"Average: "<< avg << endl;  	// the average of the N integers is displayed
	cout <<"Largest number: "<< max << endl;  // largest number is displayed
	cout <<"Smallest number: "<< min << endl;  // smallest number is displayed
    
    
    return 0;
    
}




