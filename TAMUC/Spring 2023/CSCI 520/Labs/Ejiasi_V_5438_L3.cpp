// Victor Ejiasi
// 50315438
// 2/13/2023

#include <iostream>
#include <string>
using namespace std;

// Define the node for the stack
struct Node {
    char data;
    Node* next;
};

// Define the stack data structure
class Stack {
private:
    Node* top;

public:
    Stack() {
        top = NULL;
    }

    // Push a character to the stack
    void push(char c) {
        Node* newNode = new Node;
        newNode->data = c;
        newNode->next = top;
        top = newNode;
    }

    // Pop a character from the stack
    char pop() {
        if (top == NULL) {
            return '\0';
        }
        char c = top->data;
        Node* temp = top;
        top = top->next;
        delete temp;
        return c;
    }

    // Peek at the top of the stack
    char peek() {
        if (top == NULL) {
            return '\0';
        }
        return top->data;
    }

    // Check if the stack is empty
    bool isEmpty() {
        return top == NULL;
    }
};

// Check if the given string of parentheses is valid or not
bool isValid(string str) {
    Stack stack;
    for (int i = 0; i < str.length(); i++) {
    char c = str[i];
        if (c == '(') {
            stack.push(c);
        } else if (c == ')') {
            if (stack.isEmpty()) {
                return false;
            }
            stack.pop();
        }
    }
    return stack.isEmpty();
}

// Main function
int main() {
    string input;
    do {
        cout << "Enter an expression: ";
        getline(cin, input);
        if (input == "exit") {
            break;
        }
        bool valid = isValid(input);
        if (valid) {
            cout << "True" << endl;
        } else {
            cout << "False" << endl;
        }
    } while (true);
    cout << "Bye" << endl;
    return 0;
}
