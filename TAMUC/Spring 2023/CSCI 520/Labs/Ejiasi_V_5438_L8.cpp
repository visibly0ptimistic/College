// Victor Ejiasi
// 50315438
// 4/2/2023

#include <iostream>
#include <string>

using namespace std;

void quickSort(string &str, int left, int right) {
    int i = left, j = right;
    char pivot = str[(left + right) / 2];

    while (i <= j) {
        while (str[i] < pivot) {
            i++;
        }
        while (str[j] > pivot) {
            j--;
        }
        if (i <= j) {
            swap(str[i], str[j]);
            i++;
            j--;
        }
    }

    cout << "After partition [" << left << "-" << right << "] (pivot: " << pivot << ", lo: " << left << ", j: " << j << ", hi: " << right << "): " << str << endl;

    if (left < j) {
        quickSort(str, left, j);
    }
    if (i < right) {
        quickSort(str, i, right);
    }
}

int main() {
    string inputString = "OOEARMTCMMUC";
    cout << "Unsorted string: " << inputString << endl;

    // Sort the input string using QuickSort
    quickSort(inputString, 0, inputString.size() - 1);

    cout << "Sorted string: " << inputString << endl;

    return 0;
}
