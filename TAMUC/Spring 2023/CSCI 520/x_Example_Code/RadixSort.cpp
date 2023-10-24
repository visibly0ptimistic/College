// Mutlu Mete
// Radix Sort
// Source modified Data Structures and Algorithm Analysis,
// Edition 3.2 (C++ Version) Clifford A. Shaffer


#include <iostream>
#include <stdlib.h>
#define N 13
#define RB 10  //  number base
using namespace std;


void radix(int A[], int B[], int k, int r, int cnt[]);

// The program lunches here
int main( )
{
    int data[N]= {75,34,67,40,4,  8,99,13,45,0,  57,59,95};
    int B[N]= {0};
    int cnt[RB]= {0};

    for (int i=0; i < N; i++)
        cout << data[i] << ", " ;
    cout << endl;

    radix(data, B, 2, 10, cnt);

    for (int i=0; i < N; i++)
        cout << data[i] << ", " ;

}
/*
A: data array,
B: bucket/bin array
k: max number of digit of the longest key
r: numbers base, decimal=10
cnt: auxiliary array
    cnt[i] stores number of records in bin[i]
*/

void radix(int A[], int B[], int k, int r, int cnt[])
{
    // cnt[i] stores number of records in bin[i]
    int j;
    for (int i=0, dpl=1; i<k; i++, dpl*=r)   // For k digits
    {
        for (j=0; j<r; j++)
            cnt[j] = 0; // Initialize cnt

        // Count the number of key for each bin for this iteration
        for (j=0; j<N; j++)
            cnt[(A[j]/dpl)%r]++;

        // Index for B, cnt[j] will be index for last slot of bin[j].
        // Note we keep last index, so need to decrease it later
        for (j=1; j<r; j++)
            cnt[j] = cnt[j-1] + cnt[j];

        // Put records into bins, work from bottom of each bin.
        // Since bins fill from bottom, j is decreased, also
        // since we kept last index, we need to --
        for (j=N-1; j>=0; j--)
            B[--cnt[(A[j]/dpl)%r]] = A[j];

        for (j=0; j<N; j++) // for this iteration move them back to A
            A[j] = B[j];
    }

}
