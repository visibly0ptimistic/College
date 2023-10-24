  .data
  .type  a, %object
  .size  a, 6
a:
  .xword 22, 13, 79, 45, 9, 67


  .text
  .global main
  .arch armv8-a+fp+simd
  .type main, %function

range:
  SUB X27, X27, #48		 // decrease the X27
  STUR X9, [X27, #0]     // store X9 onto the stack
  STUR X10, [X27, #8]    // store X10 onto the stack
  STUR X11, [X27, #16]   // store X11 onto the stack
  STUR X12, [X27, #24]   // store X12 onto the stack
  STUR X13, [X27, #32]   // store X13 onto the stack

  LDUR X9, [X0, #0]      // initialize X9 with the first element, X9 store the min value in the array
  LDUR X10, [X0, #0]     // initialize X10 with the first element, X10 store the max value in the array
  MOV X11, #1            // initialize the iterator with 0

loop:
  CMP X11, X1            // compare the iterator with size of the array
  BGE done               // finish the loop

  LSL X12, X11, #3       // X11 * 8
  ADD X12, X12, X0       // get the address of the next element
  LDUR X13, [X12, #0]    // get the value in the next element

  CMP X13, X9            // compare the value with the min value
  BLT min                // call new_min function

  CMP X13, X10           // compare the value with the max value
  BGT max                // call new_max function

  ADD X11, X11, #1       // increase the iterator
  B loop

min:
  MOV X9, X13            // get new min
  ADD X11, X11, #1       // increase the iterator
  B loop

max:
  MOV X10, X13           // get new max
  ADD X11, X11, #1       // increase the iterator
  B loop

done:
  SUB X2, X10, X9        // calculate the range of the array.
  LDUR X9, [X27, #0]     // restore value in X9
  LDUR X10, [X27, #8]    // restore value in X10
  LDUR X11, [X27, #16]   // restore value in X11
  LDUR X12, [X27, #24]   // restore value in X12
  LDUR X13, [X27, #32]   // restore value in X13
  ADD X27, X27, #48      // increase the X27
  BR X30


main:

  ADRP X0, a
  ADD X0, X0, :lo12:a    // X2 contains base address of array a


  MOV X1, X19            // initialize X1 with the size of the array

  MOV X27, SP            // make copy of SP

  BL range               // call function "range"

exit:
