/*******************************************************************
/*    This example illustrates how interacting with files
*/

// Example program for Week 3 in-class problem
// attempt to solve it yourself first, then look at the code below
//

#include <iostream>
#include <string>
#include <fstream>

using namespace std;

int main()
{
//Declare file stream variables such as the following 
ifstream inData;
ofstream outData;


//Open the files
inData.open("grades.txt"); //open the input file 
outData.open("output.txt"); //open the output file
cout << "debugging 1" << endl;
//Code for data manipulation
string firstName, lastName;
float grade1, grade2, grade3, grade4, grade5, average;

	//read name and grades
	inData >> firstName;
	inData >> lastName;
	cout << "debugging 2: done reading from file, first name is: " << firstName;
	inData >> grade1;
	inData >> grade2;
	inData >> grade3;
	inData >> grade4;
	inData >> grade5;
	
	//calculate average
	average = (grade1+grade2+grade3+grade4+grade5)/5.0;
	cout << "debugging 3: done reading from file, average is: " << average << endl ;
	//write output
	outData << "Student Name: " << firstName + " " + lastName << "\n";
	outData << "Test scores: " << grade1 << " " << grade2 << " " << grade3 << " " << grade4 << " " << grade5 <<"\n";
	outData << "Test scores: " << grade1 << " " << grade2 << " " << grade3 << " " << grade4 << " " << grade5 <<"\n";
	outData << "Average test score: " << average <<"\n";
		
//Close files 
inData.close(); 
outData.close();

cout << "done processing the files" << endl;

return 0;
}




