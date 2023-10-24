// Mutlu Mete
// Bag implementation using a dynamically allocated memory space (NOT LINKED LIST)
// CSCI 520

#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string>

using namespace std;

class BagDyn
{
public:
	BagDyn(); // construction
	bool Add(int n); // Add, true if successfully added
	bool Remove(int n);
	unsigned int getCapacity();
	unsigned int getSize();
	bool Search(int s);
	bool isEmtpy();
	void ListAll();

private:
	int *data;
	unsigned int size;
	unsigned int capacity;

};


BagDyn::BagDyn()
{
	data = NULL;
	cout << "Enter the capacity of the bag:" ;
	cin >> capacity;
	size = 0;
	data = new int[capacity];
	if (data == NULL)
	{
		cout << "An error occured, bag cannot be allocated" << endl;
	}
	else
	{
		cout << data;
		cout << "A bag to keep " << capacity << " items is created and ready to use" << endl;
	}

}

unsigned int BagDyn::getCapacity()
{
	return capacity;
}


unsigned int BagDyn::getSize()
{
	return size;
}

bool BagDyn::Search(int s)
{
	for (int i = 0; i < size; i++)    // i < size   or i <= (size-1)
	{
		if (data[i] == s) return true;
	}

	return false;
}

bool BagDyn::isEmtpy()
{
	if (size == 0) return true;
	return false;
}

bool BagDyn::Add(int n)
{
	if (size == capacity) return false;

	for (int i = 0; i < size; i++)    // i < size   or i <= (size-1)
	{
		if (data[i] == n) return false;
	}
	// data[size] = n; size++;
	data[size++] = n;

	return true;
}

void BagDyn::ListAll()
{
	if (size == 0) { cout << "Bag is empty" << endl; return; }

	for (int i = 0; i < size; i++)    // i < size   or i <= (size-1)
	{
		cout << data[i] << ", ";
	}

	cout << endl;

}

bool BagDyn::Remove(int n)
{
	if (isEmtpy() == true) return false;

	for (int i = 0; i < size; i++)    //  search for the item n
	{
		if (data[i] == n)
		{
			data[i] = data[--size];
			return true;
		}
	}
	return false;
}

int main()
{
	BagDyn aBag;
	aBag.ListAll();  aBag.Add(5); aBag.Add(7); aBag.Add(1);
	aBag.ListAll();  aBag.Add(8); aBag.Add(17); aBag.Add(5);
	aBag.ListAll();

	if (aBag.Search(8) == true) cout << "8 is in the bag" << endl;
	if (aBag.Search(17) == true) cout << "17 is in the bag" << endl;
	if (aBag.Search(3) == true) cout << "3 is in the bag" << endl;
	else cout << " 3 is not in the bag" << endl;

	aBag.Remove(17);  aBag.ListAll();
	aBag.Remove(5);  aBag.ListAll();
	cout << "Size of the bag is " << aBag.getSize() << endl;

	system("pause");


}







