  .data
  .text
  .global main
  .arch armv8-a+fp+simd
  .type main, %function
main:
  MOV X9, #0         // initialize X9 with 0, the first number in Fibonacci numbers
  MOV X10, #1        // initialize X10 with 1, the second number in Fibonacci numbers
  MOV X11, #0        // initialize X11 with 0, use for the iterator
  MOV X20, #1        // initialize X20 with 1, the sum of the Fibonacci numbers

loop:
  CMP X11, X19       // compare the iterator with n (X19)
  BGE exit           // jump out of the loop to exit
  ADD X12, X9, X10   // add the previous two numbers and store it to X12 (current Fibonacci number)
  ADD X20, X20, X12  // accumulate the sum
  MOV X9, X10        // set the first previous number as the second previous number
  MOV X10, X12       // set the current number as the first previous number
  ADD X11, X11, #1   // increase the iterator
  B loop             // loop back to the beginning of the loop.

exit:
