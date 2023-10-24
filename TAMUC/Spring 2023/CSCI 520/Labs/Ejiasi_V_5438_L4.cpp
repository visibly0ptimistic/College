// Victor Ejiasi
// 50315438
// 2/13/2023

#include <iostream>
#include <cstdlib>
#include <chrono>
using namespace std::chrono;

// Function to print array
void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        std::cout << arr[i] << " ";
    std::cout << std::endl;
}

// Selection sort algorithm
void selectionSort(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        int min = i;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[j] < arr[min])
            {
                min = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}

// Insertion sort algorithm
void insertionSort(int arr[], int n)
{
    for (int i = 1; i < n; i++)
    {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

// Function to generate an array of random numbers
void generateRandomArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        arr[i] = rand() % 40001 - 20000;
    }
}

// Function to generate an array of ascending ordered numbers
void generateAscendingArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        arr[i] = i - 20000;
    }
}

// Function to generate an array of descending ordered numbers
void generateDescendingArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        arr[i] = 20000 - i;
    }
}

// Function to measure the running time of a sorting algorithm
double measureTime(int arr[], int n, void (*sortFunction)(int[], int))
{
    high_resolution_clock::time_point start = high_resolution_clock::now();
    sortFunction(arr, n);
    high_resolution_clock::time_point stop = high_resolution_clock::now();
    std::chrono::microseconds duration = std::chrono::duration_cast<std::chrono::microseconds>(stop - start);
    return duration.count() / 1000000.0;
}

int main()
{
    const int n = 16000;
    int arr[n];
    double timeSS, timeIS;

    // Ascending order
    generateAscendingArray(arr, n);
    timeSS = measureTime(arr, n, selectionSort);
    timeIS = measureTime(arr, n, insertionSort);
    std::cout << "Asc ordered, SS: " << timeSS << " sec, IS: " << timeIS << " sec" << std::endl;

    // Random order
    generateRandomArray(arr, n);
    timeSS = measureTime(arr, n, selectionSort);
    timeIS = measureTime(arr, n, insertionSort);
    std::cout << "Ran ordered, SS: " << timeSS << " sec, IS: " << timeIS << " sec" << std::endl;

    // Descending order
    generateDescendingArray(arr, n);
    timeSS = measureTime(arr, n, selectionSort);
    timeIS = measureTime(arr, n, insertionSort);
    std::cout << "Des ordered, SS: " << timeSS << " sec, IS: " << timeIS << " sec" << std::endl;

return 0;
}