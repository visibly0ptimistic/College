  .data
  .text
  .global main
  .arch armv8-a+fp+simd
  .type main, %function

odd:
  CMP X0, #1            // if n == 1, then return 1
  BEQ one

  LSL X10, X0, #1       // X1 = n * 2
  SUB X10, X10, #1      // X1 = n * 2 - 1

  SUB X27, X27, #16     // decrement the stack pointer
  STUR X30, [X27, #8]   // store the return address onto the stack
  STUR X10, [X27, #0]   // store the sum onto the stack

  SUB X0, X0, #1        // X0 = X0 - 1 (n = n - 1)
  BL odd                // call odd function again.

  LDUR X10, [X27, #0]   // load the value
  ADD X1, X1, X10       // add the previous sum to the final result
  LDUR X30, [X27, #8]   // get the old address
  ADD X27, X27, #16     // increment the stack pointer.

  BR X30                // return to the previous address

one:
  MOV X1, #1            // use X1 for return value, return 1 here
  BR X30                // return to the previous address

main:
  MOV X0, X19           // initialize X0 with X19, for the input of the recursive function
  MOV X27, SP           // make copy of SP

  BL odd                // call odd function
  MOV X20, X1           // store the result  into X20

exit:
