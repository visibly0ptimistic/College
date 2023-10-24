/*   CSCI 515
 
 Victor Ejiasi
 
 Practice Program 5

 Suppose that you have the following definitions:

struct timeType                                              struct tourType

{                                                                          {

        int hr;                                                                string cityName;

        double min;                                                     int distance;

        int sec;                                                                     timeType travelTime;

};                                                                         };

a.    Declare a variable destination of type tourType.

b.    Write C++ statements to store the following data in destination: cityName – Chicago, distance -- 550 miles, travelTime – 9 hours and 30 minutes.

c.    Write the definition of a function to output the data stored in a variable of type tourType.

d.    Write the definition of a value-returning function that inputs data into a variable of type tourType.

e.    Write the definition of a void function with a reference parameter of type tourType to input data in a variable of type tourType.

f. Write the main function that captures input from the user for three different tours, stores the data in the struct  tourType using defined functions above and defines and stores the structs in an array. 


*/

#include <iostream> 
#include<string>
using namespace std;

// define the struct timeType
struct timeType
{
int hr;
double min;
int sec;
};

// define the struct tourType
struct tourType
{
string cityName;
int distance;
timeType travelTime;
};
tourType destination;


// prompt the user to enter the city name, distance and travel time
// store the data in the struct tourType
tourType input(){
cout<<"Enter the city, distance, and time in hours and minutes"<<endl;
cin>>destination.cityName;
cin>>destination.distance;
cin>>destination.travelTime.hr;
cin>>destination.travelTime.min;

return destination;
}

// output the data stored in a variable of type tourType
void display(){
cout<<"You are currently located in "<<destination.cityName<<endl;
cout<<"The distance of your search is "<<destination.distance<<endl;
cout<<"The hours defined were "<<destination.travelTime.hr<<endl;
cout<<"The minutes defined were "<<destination.travelTime.min<<endl;
}

// define the tourType array as a global variable to be used in the main function and other functions
void inputFunction(tourType *t){
tourType d;
d.cityName = t->cityName;
d.distance = t->distance;
d.travelTime.hr = t->travelTime.hr;
d.travelTime.min = t->travelTime.min;
}

// define the main function that captures input from the user for three different tours, stores the data in the struct tourType using the functions defined above.
int main(){
input();
inputFunction(&destination);
display();
}