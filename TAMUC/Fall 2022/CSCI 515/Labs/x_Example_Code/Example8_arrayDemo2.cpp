//Programmer: fill in your name here
//Course number: fill in our course number here
//Lab number: fill in your lab number here
//Date: fill in the date you create this program her

#include <iostream>
#include <iomanip>
using namespace std;

int main(){
	//statements
	int myList[5] = {0, 4, 8, 12, 16}; //Line 1
	int yourList[5]={100};             //Line 2 we have no ideas about the complier----and os

	//yourList=myList; illegal
	for(int i=0;i<sizeof(myList)/sizeof(int);i++)
 	 	yourList[i]=myList[i];
 	 	
	//cin>>yourList; //illegal >> (insertion operator is not defined for arrays)
	for(int i=0;i<sizeof(myList)/sizeof(int);i++)
		cin>>yourList[i];
		
	cout<<endl;
	//cout<<yourList;	//legal, print out the address of your array instead of pring elements
	for(int i=0;i<sizeof(myList)/sizeof(int);i++)
		cout<<yourList[i];
 
	return 0;
}
