//**********************************************************************************
// Credit Tutorialspoint
// Link to source: https://www.tutorialspoint.com/cplusplus/cpp_exceptions_handling.htm
// This code illustrates how to creat an exception struct, throw it and catch it.
//**********************************************************************************

#include <iostream>
#include <exception>
using namespace std;

struct MyException : public exception {
   const char * what () const throw () {
      return "C++ Exception";
   }
};
 
int main() {
   try {
      throw MyException();
   } catch(MyException& e) {
      std::cout << "MyException caught" << std::endl;
      std::cout << e.what() << std::endl;
   } catch(std::exception& e) {
      //Other errors
   }
}
