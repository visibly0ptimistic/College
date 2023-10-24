// Mutlu Mete
// Bag implementation using linked list, A dynamic data container



#include <iostream>
#include <stdio.h>
#include <string>
#include <stdlib.h>

using namespace std;

// A struct to keep items
struct item
{
    string data;
    item *next;
	item(string x, item* t) { // constructor for each new struct
		data = x; next = t;
	}
};

typedef item *lnk;  // easy way to create a new "link"

// A class to represent Bag, which can hold strings in a linked list
// The items (strings) are not sorted in the list.
class Bag
{
public:
    Bag();							// Construction
    bool add (string str);			// Adds a new item to bag
    bool has (string str);			// Check if Bag has this item
	bool remove (string str);		// Delete the str from the bag
    unsigned short getCapacity ();	// Returns the capacity of the Bag. Is there any capacity
    void ListBag();					// List all items of Bag.
    unsigned short getSize();		// How many items  the Bag has
private:
    lnk first;						// A pointer to show the first node
    lnk last;						// A pointer to show the last node
    unsigned short size;			// how many items this Bag has

};
Bag::Bag() // Initialize an instance of the class
{
    size = 0;
    first = last = NULL; // At the beginning both, first and last are null
    cout << "A new bag with  " <<  getCapacity()  << " was created...!" << endl ;
}
bool Bag::add(string str)
{
    lnk AddItem = new item(str,NULL);			//  dynamically create a new struct/item
    if ( AddItem == NULL) return false; 		//   not enought memory

    if ( first == NULL ) first = AddItem;		// first item to be added
    else last->next = AddItem;					// add to the end of array

    last = AddItem;
	size++;
    return true;	// Yeah, added.
}

bool Bag::remove(string str)		// Delete the str from the bag
{
	lnk back;
	lnk front;
	if (first == NULL) return false;
	back=front=first;

	if(front->data == str) 			// delete this
	{
		if (first == last) 			// there is only one item, which will be deleted
			first = last = NULL;
		else
			first =  first ->next;	// first of many items is being deleted
		delete front;
		size--;
		return true;
	}

	front = front->next;			// if reach this line, the first item of bag is not being deleted.

	while (front != NULL)
	{
		if (front->data == str)
		{
			back->next = front->next;				// a mid-item is being deleted. By-pass the (front)
			if (front == last) last = back; 		// the last item is being deleted
			delete front;
			size--;
			return true;
		}
		back = front ;
		front = front -> next;
    }
	return	false; 									//  reaches this line if item is not found in the list.
}

void Bag::ListBag()						// List, print out, all items in the arrays, // make 5 coloumns
{
	cout << size << ": " ;
    lnk it = first;   					// it means iterator, visit all items one by one.
	int i=0;  							// i is used to format the output
    while (it != NULL) {
        cout << it->data << "   ";
        it = it->next;
		if ( (i+1)%5 == 0) cout << endl;
		i++;
    }
	cout << endl;
}

// How many items the Bag has
unsigned short Bag::getSize ()
{
    return size;
}

bool Bag::has(string str)   // Check if the bag has item "str"
{
    lnk it = first;
    for (int i=0; i < size; i++)
    {
        if (it->data == str) return true;
        it = it->next;
    }
    return false;
}

unsigned short Bag::getCapacity ()
{
    return 1000; 		// A made-up number.
}

int main(int argc, const char * argv[]) {    //  not using command line arg for now
    Bag bigBag;
	string tempStr;
	char sel = ' ';
	while (sel != 'e')
	{
		cout << "(i)nsert, (d)elete, (s)earch, (e)xit:   ";
		cin >> sel;
		switch(sel)
		{
			case 'i':
					cout << "\nString to be inserted:";
					cin >> tempStr;
					bigBag.add (tempStr);
					bigBag.ListBag();
					break;
			case 'd':
					cout << "\nString to be deleted: ";
				    cin >> tempStr;
					bigBag.remove(tempStr);
					bigBag.ListBag();
					break;
			case 's':
					cout << "\nString to be searched: ";
				    cin >> tempStr;
					cout << bigBag.has(tempStr) << endl;
					break;
			default:
					break;
		}
	}

}


