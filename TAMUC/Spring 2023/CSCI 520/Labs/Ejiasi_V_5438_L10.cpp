// Victor Ejiasi
// 50315438
// 4/20/2023

#include <iostream>
#include <fstream>
#include <vector>
#include <sstream>

using namespace std;

bool is_heap_ordered(const vector<int>& a) {
    int n = a.size();
    for (int k = 1; k < n; k++) {
        if (a[k] > a[k/2]) {
            return false;
        }
    }
    return true;
}

int main(int argc, char* argv[]) {
    if (argc < 2) {
        cout << "Usage: myProg.exe input.txt" << endl;
        return 1;
    }
    ifstream infile(argv[1]);
    if (!infile.is_open()) {
        cout << "Error: could not open file " << argv[1] << endl;
        return 1;
    }
    string line;
    while (getline(infile, line)) {
        vector<int> a;
        istringstream iss(line);
        int x;
        while (iss >> x) {
            a.push_back(x);
        }
        if (is_heap_ordered(a)) {
            cout << "True" << endl;
        } else {
            cout << "False" << endl;
        }
    }
    infile.close();
    return 0;
}