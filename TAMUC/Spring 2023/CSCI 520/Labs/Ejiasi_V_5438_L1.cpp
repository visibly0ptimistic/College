// Victor Ejiasi
// 50315438
// 1/25/2023

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
	int countDuplicates(int n);
};

BagDyn::BagDyn()
{
	data = NULL;
	capacity = 10;
	size = 0;
	data = new int[capacity];
	if (data == NULL)
	{
		cout << "An error occurred, bag cannot be allocated" << endl;
	}
	else
	{
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
	for (int i = 0; i < size; i++)
	{
		if (data[i] == s)
		{
			return true;
		}
	}
	return false;
}

bool BagDyn::isEmtpy()
{
	if (size == 0)
	{
		return true;
	}
	else
	{
		return false;
	}
}

void BagDyn::ListAll()
{
	for (int i = 0; i < size; i++)
	{
		cout << data[i] << " ";
	}
	cout << endl;
}

int BagDyn::countDuplicates(int n)
{
	int count = 0;
	for (int i = 0; i < size; i++)
	{
		if (data[i] == n)
		{
			count++;
		}
	}
	return count;
}

bool BagDyn::Add(int n)
{
	if (size == capacity)
	{
		cout << "Bag is full, cannot add " << n << endl;
		return false;
	}
	else if (countDuplicates(n) == 3)
	{
		cout << "Bag has already three " << n << "s. ";
		return false;
	}
	else
	{
		data[size] = n;
		size++;
		return true;
	}
}

bool BagDyn::Remove(int n)
{
	if (size == 0)
	{
		cout << "Bag is empty, cannot remove " << n << endl;
		return false;
	}
	else
	{
		for (int i = 0; i < size; i++)
		{
			if (data[i] == n)
			{
				data[i] = data[size - 1];
				size--;
				return true;
			}
		}
		cout << "Cannot find " << n << " in the bag" << endl;
		return false;
	}
}

int main()
{
	BagDyn bag;
	int n;
	cout << "Enter a number: ";
	cin >> n;
	while (n >= 0)
	{
		if (bag.Add(n))
		{
			cout << "> ";
			bag.ListAll();
		}
		cout << "Enter a number: ";
		cin >> n;
	}
	cout << "Bye.." << endl;
	return 0;
}
