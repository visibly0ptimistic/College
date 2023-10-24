//Strings (class) has a set of redefined methods string str1="Hello";

#include <iostream>
#include <string>

using namespace std;

int main(){
	

//	string str2 = {'H','e','l','l','o','\0'}; //valid in c++11
	
	string str3, str2, str1;
	
	str3="Hello"; // valid
	
	//str3={'H','e','l','l','o','\0'};// valid in c++11
	
	//input
	cin>>str3; // stop reading when meeting spaces (whitespaces, tabs, new-line...) cin.ignore(100,'\n'); // or char ch; cin.get(ch);
	
	//reads until it reaches the end of the current line
	getline(cin,str3);
	
	//the size of the string (i.e.,the number of characters) 
	int n=str1.size();
	int m=str1.length();
	cout<<n <<" "<<m<<endl;
	
	//output
	cout<<str1<<" "<<str2<<" "<<str3<<endl; 
	
	for(int i=0;i<6;i++)
	cout<<str3[i];

}
