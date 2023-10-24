//  Created by Mutlu Mete
//  2D dynamic array

#include <iostream>
using namespace std;

int main()
{
    int dim1=4; // first dimension
    int dim2=3; // second dimension

    int ** head;  // pointer of pointer
    head = new int *[dim1]; // create that dim1 dimension (1)

    for (int i=0; i < dim1; i++)
        head[i]=new int [dim2];

    // assign a number (random)
    for (int i = 0 ; i < dim1; i ++)
        for ( int k=0; k < dim2; k++)
            head[i][k]=i+k;

    // same loop as above, assign a number (random)
    for (int i = 0 ; i < dim1; i ++)
        for ( int k=0; k < dim2; k++)
            cout << " head " << i << ", " << k << " is " << head[i][k] << endl;

    return 0;

}
