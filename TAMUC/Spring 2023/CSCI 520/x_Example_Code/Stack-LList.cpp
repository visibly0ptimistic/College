// Mutlu Mete
// Stack implementation using linked list, A dynamic data container
// CSCI 520


#include <iostream>
#include <stdio.h>
#include <string>
#include <stdlib.h>
#include <unistd.h> // From http://cs.dvc.edu/HowTo_CSleep.html

using namespace std;

// A struct to keep items
struct node
{
    string data;
    node *next;
    node(string x, node* t)
    {
        data = x;
        next = t;
    }
};


typedef node* lnk;

// A class to represent Stack, where we push and pop items.
// The items (strings) are not sorted in the list.
class Stack
{
public:
    Stack();						// Construction
    bool push (string str);			// Adds a new item to stack
    bool pop ();					// remove the head guy (the most recently added item)
    bool isEmpty ();				// check if we have any item added.
    void ListAll();					// List all items of stack.
    string has(string str);			// Check if stack has this item
    string top();                   // Return the item on the top, the most recently added
    unsigned short getSize();		// How many items  the stack has
private:
    lnk head;						// A pointer to show the head node
    unsigned short size;			// how many items stack has
};

// Initialize the class
Stack::Stack()
{
    size = 0;
    head = NULL;
    cout << "A stack was created...!" << endl ;
}
// How many items the Stack has
unsigned short Stack::getSize ()
{
    return size;
}

string Stack::top ()
{
    if (head == NULL) return "N/A";
    return head->data;
}

// add an item as the head one in the stack
bool Stack::push(string str)
{
    lnk NewItemPtr = new node(str,head);	//  dynamically create a new struct/item
    if ( NewItemPtr == NULL) return false;  // not enought memory
    head = NewItemPtr;
    size++;
    return true;	// Yeah, added.
}

// remove the head one from the stack
bool Stack::pop()
{
    if (head == NULL) {   return false;    }

    cout << head->data << endl;

    lnk RemovePtr = head;
    head = head->next;
    delete RemovePtr;
    size--;
    return true;	// Yeah, removed.
}

// List, print out, all items in the arrays
// make 5 coloumns
void Stack::ListAll()
{
    lnk it = head;   // it means iterator, visit all items one by one.

    //    OPTION-2
    int i=0;
    while (it != NULL) {
        //sleep(1);
        //usleep(1000 * 30);
        cout << it->data << " ";
        it = it->next;
        //if ( (i+1)%5 == 0) cout << endl;
        i++;
    }
    cout << endl;
}

// Check if the bag has item "str"

string Stack::has(string str)
{
    lnk it = head;
    for (int i=0; i < size; i++)
    {
        if (it->data == str) return "YES\n";
        it = it->next;
    }
    return "NO\n";
}

int main(int argc, const char * argv[]) {

    Stack S;

    string tempStr;
    char sel = ' ';
    while (sel != 'e')
    {
        cout << "p(u)sh, p(o)p, (s)earch, (t)op, (e)xit:   ";
        cin >> sel;
        switch (sel)
        {
        case 's' :
            cout << "\nString to be searched:";
            cin >> tempStr;
            cout << S.has(tempStr);
            break;

        case 'u' :
            cout << "\nString to be pushed:";
            cin >> tempStr;
            S.push(tempStr);
            S.ListAll();
            break;
        case 'o' :
            S.pop();
            S.ListAll();
            break;

        case 't' :
            cout << S.top() << endl;
            break;
        default:
            break;
        }
    }
}




