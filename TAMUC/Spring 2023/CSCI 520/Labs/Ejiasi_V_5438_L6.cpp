// Victor Ejiasi
// 50315438
// 3/24/2023

#include <iostream>
#include <chrono>
#include <cstring>
#include <cstdlib>

using namespace std;

const int N = 256000;

void radix_sort(int *a, int r, int d)
{
    const int RB = r + 1;
    int *cnt = new int[RB]();
    int *b = new int[N]();

    for(int k = 0; k < d; k++) {
        memset(cnt, 0, RB*sizeof(int));

        for(int i = 0; i < N; i++)
            cnt[(a[i]/r)%10+1]++;

        for(int i = 1; i < RB; i++)
            cnt[i] += cnt[i-1];

        for(int i = 0; i < N; i++)
            b[cnt[(a[i]/r)%10]++] = a[i];

        memcpy(a, b, N*sizeof(int));
    }

    delete[] cnt;
    delete[] b;
}

int main()
{
    int *a1 = new int[N];
    int *a2 = new int[N];
    int *a3 = new int[N];

    for(int i = 0; i < N; i++) {
        a1[i] = a2[i] = a3[i] = rand() % 900000 + 100000;
    }

    chrono::high_resolution_clock::time_point start = chrono::high_resolution_clock::now();
    radix_sort(a1, 10, 1);
    chrono::high_resolution_clock::time_point end = chrono::high_resolution_clock::now();
    chrono::duration<double, milli> duration_ms = end - start;
    cout << "r=10,    " << duration_ms.count() << " ms" << endl;

    start = chrono::high_resolution_clock::now();
    radix_sort(a2, 100, 2);
    end = chrono::high_resolution_clock::now();
    duration_ms = end - start;
    cout << "r=100,   " << duration_ms.count() << " ms" << endl;

    start = chrono::high_resolution_clock::now();
    radix_sort(a3, 1000, 3);
    end = chrono::high_resolution_clock::now();
    duration_ms = end - start;
    cout << "r=1000,  " << duration_ms.count() << " ms" << endl;

    delete[] a1;
    delete[] a2;
    delete[] a3;

    return 0;
}