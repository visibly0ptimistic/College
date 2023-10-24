// Victor Ejiasi
// 50315438
// 2/13/2023

#include <iostream>
#include <fstream>
#include <sstream>
#include <unordered_map>

using namespace std;

class SparseVector {
private:
    unordered_map<int, double> values;

public:
    SparseVector() {}

    // Constructor to create a sparse vector from a dense vector
    SparseVector(double* v, int n) {
        for (int i = 0; i < n; i++) {
            if (v[i] != 0.0) {
                values[i] = v[i];
            }
        }
    }

    // Operator * to multiply two sparse vectors
    SparseVector operator*(SparseVector& other) {
        SparseVector result;

        for (unordered_map<int, double>::iterator it = values.begin(); it != values.end(); it++) {
            if (other.values.find(it->first) != other.values.end()) {
                int index = it->first;
                double value = it->second * other.values[index];
                result.values[index] = value;
            }
        }

        return result;
    }

    // Function to print the sparse vector in the specified format
    void print() {
        for (unordered_map<int, double>::iterator it = values.begin(); it != values.end(); it++) {
            cout << it->first << ":" << it->second << " ";
        }
        cout << endl;
    }
};

int main(int argc, char* argv[]) {
    if (argc != 2) {
        cout << "Usage: program.exe <filename>" << endl;
        return 1;
    }

    // Read the vectors from the file
    ifstream infile(argv[1]);
    if (!infile.is_open()) {
        cout << "Error: could not open file" << endl;
        return 1;
    }

    double* v1 = new double[25];
    double* v2 = new double[25];
    string line;

    getline(infile, line);
    istringstream iss1(line);
    for (int i = 0; i < 25; i++) {
        iss1 >> v1[i];
    }

    getline(infile, line);
    istringstream iss2(line);
    for (int i = 0; i < 25; i++) {
        iss2 >> v2[i];
    }

    infile.close();

    // Create two sparse vectors and compute their product
    SparseVector sv1(v1, 25);
    SparseVector sv2(v2, 25);
    SparseVector result = sv1 * sv2;

    // Print the resulting vector in sparse format
    result.print();

    delete[] v1;
    delete[] v2;

    return 0;
}