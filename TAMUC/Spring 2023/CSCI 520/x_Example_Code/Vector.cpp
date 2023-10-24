// Mutlu Mete
// STL Vector operations
// https://www.cplusplus.com/reference/vector/vector/
// https://github.com/gibsjose/cpp-cheat-sheet/blob/master/Data%20Structures%20and%20Algorithms.md#14-list-stdlist-and-stdforward_list
// https://www.hackerearth.com/practice/notes/standard-template-library/

#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector<int> v;

	// push_back(), insert 
	for (int i = 3; i <= 33; i++)
		v.push_back(i);

	// Returns the number of elements in the vector.
	cout << "Size of v	\t:" << v.size() << endl;

	// Return size of allocated storage capacity.
	cout << "Capacity of v	\t:" << v.capacity() << endl;

	// Returns the maximum number of elements that the vector can hold.
	cout << "Max_size of v	\t:" << v.max_size() << endl;

	cout << "Begin to end \t: ";
	//  iterators: begin(), end()
	for (auto i = v.begin(); i != v.end(); i++)   // IF you get an error regarding i, use this line :  for (vector<int>::iterator i = v.begin(); i != v.end(); i++)
	   cout << *i << " ";

	cout << endl;
	cout << "Reverse order \t: ";
	// reverse iterators: rbegin(), rend()
	for (auto i = v.rbegin(); i != v.rend(); i++)
		cout << *i << " ";

	cout << endl;
	// Random access
	cout << "v[3]:" <<  v[3];

	cout << endl;
}
