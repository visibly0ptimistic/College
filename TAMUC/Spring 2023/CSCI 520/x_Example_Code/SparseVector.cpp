// Mutlu Mete
// Sparse Vector  
// Demonstrate how to sum two sparse vectors.

#include <iostream>
#include <stdio.h>
#include <string>
#include <stdlib.h>
// #include <unistd.h> // Optional, to stop execution of the program, From http://cs.dvc.edu/HowTo_CSleep.html

using namespace std;

const int SIZE = 1000;
// A struct to keep items
struct item
{
    unsigned int index;
    int data;
    item *next;
};

// Maintains index, data association for the vector. Indexes are kept ordered.
// Do not confuse with STL vector, https://en.cppreference.com/w/cpp/container/vector

class Vector
{
public:
    Vector();                                   // Construction
    bool add(unsigned int index, int data);		// Adds a new item to vector
    void ListAll();                             // List all items of vector, starting with the first ITEM
	unsigned short getSize();						// returns the size of the vector
	void setSize(unsigned int size);
	Vector operator + (Vector&);
	item *getFirst(); 		// returns the pointer, "first"

private:
    item *first;					// A pointer to show the first node
    item *last;                     // A pointer to show the last node
    unsigned short size;			// how many items vector has (kind of length)
    unsigned short compSize;		// non-zero items vector has
};

// Initialize the class
Vector::Vector()
{
    first = last = NULL;
    size = 0 ;
}

unsigned short Vector::getSize()
{
		return size;
}

item * Vector::getFirst()
{
	return first;
}

void Vector::ListAll()                             // List all items of vector, starting with the first ITEM
{
    item *it = first;
    int  cnt = 0;

    while (it != NULL ) {

        while (cnt < it->index)
        {
            cout << cnt << ":0 " ;
            cnt++;
        }
        cout << it->index << ":";
        cout << it->data << " ";
        it = it->next;
        cnt++;
    }
    cout << endl;
}

// Define a new operator + fro Vector class to sum two sparse vectors.
// This function takes a pass-by-reference parameter
// and return a new class instance of sumVector
Vector Vector::operator+ (Vector &param) {
  Vector sumVector;
  if (size != param.size) cout << "Something is wrong ..." << endl;
  cout << "Same size vectors found, summing vectors items now..." << endl;
  item *itA = first;
  item *itB = param.getFirst();

while (itA != NULL || itB != NULL)
{
	 if (itA == NULL )
      {
			  sumVector.add(itB->index, itB->data );  itB = itB->next;
      }
     else if (itB == NULL )
          {
			  sumVector.add(itA->index, itA->data );  itA = itA->next;
          }
     else  if (itA->index < itB->index)
		  {
			  sumVector.add(itA->index, itA->data );  itA = itA->next;
		  }
	 else if (itA->index > itB->index)
		  {
			  sumVector.add(itB->index, itB->data );
			  itB = itB->next;
		  }
	 else // Colliding indexes 
		  {
			  sumVector.add(itA->index, itB->data + itA->data  );
			  itA = itA->next;
			  itB = itB->next;
		  }
  }
  sumVector.setSize(size);

  //temp.x = x + param.x;
  //temp.y = y + param.y;
  return sumVector;
}

// set the size of the vector
void Vector::setSize(unsigned int size)
{
	this->size = size;
}

bool Vector::add(unsigned int index, int data)		// Adds a new item to Vector, to the end
{
    item *NewItemPtr = new item;					// dynamically create a new struct/item
    if ( NewItemPtr == NULL) return false;  		// not enough memory

    NewItemPtr->index = index;  					// we append, add to end of list
    NewItemPtr->data = data;
    NewItemPtr->next = NULL;
    compSize++;

	//size=index+1;
    if ( last == NULL) 								// first item to be added
    {
        first = last = NewItemPtr;
    }
    else
    {
        last->next = NewItemPtr;
        last = NewItemPtr;
    }
    return true;	// Added.
}

int main(int argc, const char * argv[])
{
    Vector A, B, SumVector;
    int locA = 0, locB = 0 ;
    int data = 0;
    for (int i=0; i< 10; i++) // adds 10 random items
        {
            locA = locA + rand() % 3 + 1; // randomly selected step (index). We assume that some indexes will be same in locA and locB
            data = rand() % 50 + 30; // randonly selected data
            A.add(locA, data);

			locB = locB + rand() % 3 + 1;  // randomly selected step (index)
            data = rand() % 50 + 30; // randonly selected data
            B.add(locB, data);
        }

	//A.add(locA+1, 0);
	//B.add(locA+1, 0);
	A.setSize(95);
	B.setSize(95);
    A.ListAll(); cout << A.getSize() << " items found..." << endl;
	B.ListAll(); cout << B.getSize() << " items found..." << endl;
	SumVector = A + B;  // See how a new operator (operator+) defined for Vector class above

	SumVector.ListAll(); cout << SumVector.getSize() << " items found..." << endl;
}
