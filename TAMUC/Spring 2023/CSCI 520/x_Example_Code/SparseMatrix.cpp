// Mutlu Mete
// Sparse Matrix with operator overloading

#include <iostream>
#include <stdio.h>
#include <string>
#include <stdlib.h>
//#include <unistd.h> // From http://cs.dvc.edu/HowTo_CSleep.html


using namespace std;

// A struct to keep items of a row
struct item
{
	unsigned int index;
	int data;
	item *next;
	item(unsigned int i, int d, item* t)
	{
		index = i; data = d; next = t;
	}
};

typedef item* lnk;

// A struct to maintain the all items in a matrix row
struct MatRow
{
	unsigned int size;
	lnk first;
	lnk last;
};

// Maintains index,data association for the matrix. Indexes are kept ordered.
class Matrix
{
public:
	Matrix(unsigned short row, unsigned short col);      // Construction
	bool add(unsigned short row, unsigned short col, int data);		// Adds a new item to the matrix
	void show();                             // show all items of matrix
	Matrix operator + (Matrix&);
	lnk getfirst(int r);
private:
	MatRow *Head;					// A pointer to show array of the "item" pointer
	unsigned short rowN;			// how many row matrix has
	unsigned short colN;		// how many col matrix has
};

// Initialize the class
Matrix::Matrix(unsigned short row, unsigned short col)
{
	rowN = row;
	colN = col;
	Head = new MatRow[row];
	for (int i = 0; i < row; i++)
	{
		Head[i].first = Head[i].last = NULL;
		Head[i].size = 0;
	}
}


lnk Matrix::getfirst(int r)
{

	return Head[r].first;
}

// Define a new operator + for Matrix class to sum two sparse Matrix.
// This function takes a pass-by-reference parameter
// and return a new class of Matrix (MC)

Matrix Matrix::operator+ (Matrix &param)  // To make  C = A + B
{
	Matrix MC(rowN, colN);

	for (int i = 0; i < rowN; i++)
	{
		lnk itA = Head[i].first;
		lnk itB = param.getfirst(i);

		while (itA != NULL || itB != NULL)
		{
			cout << i << " " << endl;
			if (itB == NULL)
			{
				MC.add(i, itA->index, itA->data);
				itA = itA->next;
				continue;
			}
			if (itA == NULL)
			{
				MC.add(i, itB->index, itB->data);
				itB = itB->next;
				continue;
			}
			if (itA->index < itB->index)
			{
				MC.add(i, itA->index, itA->data);
				itA = itA->next;
			}
			else if (itA->index > itB->index)
			{
				MC.add(i, itB->index, itB->data);
				itB = itB->next;
			}
			else
			{
				MC.add(i, itA->index, itB->data + itA->data);
				itA = itA->next;
				itB = itB->next;
			}
		}
	}
	return MC;
}

void Matrix::show()
{
	lnk it;
	for (unsigned short rowC = 0; rowC < rowN; rowC++)
	{
		it = Head[rowC].first;
		for (unsigned short colC = 0; colC < colN; colC++)
		{
			if (it != NULL)
			{
				if (colC < it->index)
				{
					cout << "(" << rowC << "," << colC << ")" << ":0 ";
				}
				else
				{
					cout << "(" << rowC << "," << colC << "):";
					cout << it->data << " ";
					it = it->next;
				}
			}
			else
			{
				cout << "(" << rowC << "," << colC << ")" << ":0 ";
			}
		}
		cout << endl;
	}
}

bool Matrix::add(unsigned short row, unsigned short col, int data)		// Adds a new item to the matrix
{
	lnk Ptr = new item(col, data, NULL);			//  dynamically create a new struct/item. We append, add to end of list
	if (Ptr == NULL) return false;  // not enought memory

	if (Head[row].first == NULL) 					// first item to be added
	{
		Head[row].first = Ptr;
		Head[row].last = Ptr;
	}
	else
	{
		Head[row].last->next = Ptr;	// http://en.cppreference.com/w/cpp/language/operator_precedence
		Head[row].last = Ptr;
	}
	Head[row].size++;
	return true;	// added.
}



int main(int argc, const char * argv[])
{
	Matrix A(3, 3);
	A.add(0, 0, 5);
	A.add(2, 2, 10);
	A.show();

	cout << endl;

	Matrix B(3, 3);
	B.add(0, 0, 3);
	B.add(1, 1, 7);
	B.show();

	Matrix C(3, 3);
	C = A + B; // See how a new operator (operator+) defined for Matrix class above

	C.show();
	

}
