// Victor Ejiasi
// 50315438
// 4/2/2023

#include <iostream>
#include <stdlib.h>
#include <time.h>

#define N 100

using namespace std;

struct coor {
    unsigned short x;
    unsigned short y;
    unsigned short z;
};

void swap(coor A[], int i, int j);
bool lessThan(coor a, coor b);
void print(coor A[]);
void fillRandom(coor A[], int size);
void quickSort(coor A[], int lo, int hi);
int partition(coor A[], int lo, int hi);

int main(int argc, const char * argv[])
{
    srand(time(NULL));
    coor A[N];
    fillRandom(A, N);
    print(A);
    quickSort(A, 0, N - 1);
    print(A);
    return 0;
}

void quickSort(coor A[], int lo, int hi)
{
    if (hi <= lo) return;
    int j = partition(A, lo, hi);
    quickSort(A, lo, j - 1);
    quickSort(A, j + 1, hi);
}

int partition(coor A[], int lo, int hi)
{
    int i = lo, j = hi + 1;
    while (true)
    {
        while (lessThan(A[++i], A[lo]))
            if (i == hi) break;

        while (lessThan(A[lo], A[--j]))
            if (j == lo) break;

        if (i >= j) break;
        swap(A, i, j);
    }
    swap(A, lo, j);
    return j;
}

void swap(coor A[], int i, int j)
{
    coor tmp = A[i];
    A[i] = A[j];
    A[j] = tmp;
}

bool lessThan(coor a, coor b)
{
    if (a.x < b.x) return true;
    if (a.x == b.x && a.y < b.y) return true;
    if (a.x == b.x && a.y == b.y && a.z < b.z) return true;
    return false;
}

void fillRandom(coor A[], int size)
{
    for (int i = 0; i < size; i++)
    {
        A[i].x = rand() % 51 + 50;
        A[i].y = rand() % 101 + 50;
        A[i].z = rand() % 151 + 50;
    }
}

void print(coor A[])
{
    for (int i = 0; i < N; i++)
        cout << "(" << A[i].x << ", " << A[i].y << ", " << A[i].z << ") ";
    cout << endl;
}