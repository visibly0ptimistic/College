// Victor Ejiasi
// 50315438
// 4/20/2023

#include <iostream>
#include <vector>
#include <algorithm>
#include <ctime>
#include <cstdlib>

// this is a max priority queue
class MaxPQ {
public:
    MaxPQ() {
        pq.push_back(-1);  // Dummy value at index 0
    }

    void insert(int value) {
        pq.push_back(value);
        swim_up(pq.size() - 1);
    }

    // this returns the max value and deletes it from the queue
    int del_max() {
        if (is_empty()) return -1;

        int max = pq[1];
        std::swap(pq[1], pq[pq.size() - 1]);
        pq.pop_back();
        sink_down(1);
        return max;
    }

    bool is_empty() {
        return pq.size() == 1;
    }

    // this prints the values in the queue
    void print() {
        for (size_t i = 1; i < pq.size(); i++) {
            std::cout << pq[i] << ", ";
        }
        std::cout << std::endl;
    }

// this private section is not part of the interface but is used by the class to implement the interface
private:
    std::vector<int> pq;

    // this moves the value at index up the tree until it is in the correct position
    void swim_up(int index) {
        while (index > 1 && pq[index / 3] < pq[index]) {
            std::swap(pq[index / 3], pq[index]);
            index = index / 3;
        }
    }

    // this moves the value at index down the tree until it is in the correct position
    void sink_down(int index) {
        while (3 * index - 1 < pq.size()) {
            int largest_child = 3 * index - 1;
            for (int i = 1; i <= 2; i++) {
                if (3 * index - 1 + i < pq.size() && pq[largest_child] < pq[3 * index - 1 + i]) {
                    largest_child = 3 * index - 1 + i;
                }
            }
            if (pq[index] >= pq[largest_child]) break;
            std::swap(pq[index], pq[largest_child]);
            index = largest_child;
        }
    }
};

// this is the main function
int main() {
    srand(time(NULL));
    MaxPQ pq;

    // this is a test of the priority queue
    std::cout << "PQ created" << std::endl;
    for (int i = 0; i < 32; i++) {
        pq.insert(rand() % 101);
    }
    pq.print();

    // this is a test of the delete function
    for (int i = 0; i < 5; i++) {
        int deleted = pq.del_max();
        std::cout << "Delete " << deleted << std::endl;
        pq.print();
    }

// this is the end of the main function
    return 0;
}
