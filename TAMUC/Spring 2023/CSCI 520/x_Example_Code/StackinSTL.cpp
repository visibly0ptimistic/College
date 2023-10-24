// Mutlu Mete
// Stack example with STL library
// CSCI 520
// https://en.cppreference.com/w/cpp/container/stack 


#include <iostream>
#include <stack>

using namespace std;
int main() {
	stack<char> stack;

    // push items of TAMU-C
	stack.push('T');
	stack.push('A');
	stack.push('M');
	stack.push('U');
    stack.push('-');
	stack.push('C');

    // pop two chars
	stack.pop();
	stack.pop();

    // push C again.
    stack.push('C');

	while (!stack.empty()) {
		cout << stack.top() <<" ";
		stack.pop();
	}
    cout << endl;
}
