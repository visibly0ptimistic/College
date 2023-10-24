#include <iostream>
#include <iomanip>
#include <string>
#include <cmath>
#include <cstdlib>
#include <ctime>
#include <fstream>
#include <vector>
#include <algorithm>
#include <numeric>
#include <functional>
#include <iterator>
#include <sstream>
#include <map>
#include <set>
#include <list>
#include <queue>
#include <stack>
#include <deque>
#include <bitset>
#include <limits>
#include <utility>
#include <cctype>
#include <cassert>
#include <typeinfo>
#include <valarray>
#include <complex>

using namespace std;

int main()
{


int *a;
int *b;
int c, d=5;

a = &d;
c = 7;
b = &c;
cout << *a + *b << endl;
}