//

//  CircularQueue
//
//  Mutlu Mete


#include <iostream>
#include <iomanip>
#include <stdio.h>
#include <string>
#include <stdlib.h>
#include <unistd.h> // From http://cs.dvc.edu/HowTo_CSleep.html

using namespace std;
#define MAX 10

class CQue
{
public:
    CQue();  // Init Circular Queue with fix int items
    bool  isFull();
    bool  isEmpty();
    void enqueue(int item);
    void showAll();
    int  dequeue(); //delete item from first and return
private:
    int first;
    int last;
    int count;
    int que[MAX];
  };

CQue::CQue() //Initalize Circular Queue
{
    first =  last = count = 0;
}

bool CQue::isFull() //To check queue is full or not
{
    if( count == MAX )
        return true;
    else
        return false;
}

void CQue::showAll()  // Show the Circular Queue items.
{
    cout << setw(20) << count << ":";
    int ind = first;
    for (int i = 1; i <= count ; i++, ind = (ind+1) % MAX)
        cout << que[ind] << " ";
    cout << endl;
}

bool CQue::isEmpty()  // check if queue is empty or not
{
    if( count == 0 )
        return true;
    else
        return false;
}

void CQue::enqueue(int item) //Insert item into circular queue
{
    if( isFull() )
    {
        cout<<"\nOverflow\n";
        return;
    }

    que[last] = item;
    last= (last+1) % MAX;
    count++;
}

int CQue::dequeue() //delete item from first and return
{
    if( isEmpty() )
    {
        cout<<"\nEmpty Queue...\n";
        return -1;
    }
    int item = que[first];
    first = (first+1) % MAX;
    count--;
    return item;
}

int main()
{
    CQue CQ = CQue();
    int item=0;

    for (int i=0; i< 40; i++) { // enqueue
        if ( (rand() % 10 ) > 2)
        {
            item = rand() % 20 + 10 ;
            cout << setw(10)  << "Insert " << item << " ";
            CQ.enqueue( item);
        }
        else
        {
            item= CQ.dequeue();
            cout << setw(10) <<"Delete " << item << " ";
        }

        CQ.showAll();
//        sleep(0.3);
    }

    return 0;
}
