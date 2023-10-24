// Mutlu Mete
// Stack example with STL library
// CSCI 520
// hhttps://en.cppreference.com/w/cpp/container/queue


// queue::push/pop
#include <iostream>       // std::cin, std::cout
#include <queue>          // std::queue

using namespace std;

int main ()
{
  queue<int> Q;
  int myint;

  std::cout << "Enter a few integers (0 terminates):\n";

  do {
    cin >> myint;
    Q.push (myint);
  } while (myint);

  cout << "Queue contains: ";
  while (!Q.empty())
  {
    std::cout << ' ' << Q.front();
    Q.pop();
  }
  cout << '\n';

  return 0;
}