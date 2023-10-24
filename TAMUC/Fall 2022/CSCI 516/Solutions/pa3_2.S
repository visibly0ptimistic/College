  .text
  .global main
  .arch armv8-a+fp+simd
  .type main, %function

power:
  MOV X11, #1            // initialize the iterator as 1
  MOV X1, #1             // initialize the result as 1
  MOV X12, #2            // move #2 to X11 for multiplication
p_loop:
  CMP X11, X0            // compare the iterator with x
  BGT done               // jump out of the loop
  MUL X1, X1, X12        // get the 2^x
  ADD X11, X11, #1       // increase the iterator
  B p_loop               // go back to loop
done:
  BR X30                 // return to the calling point

main:
  // X19 is the input for n
  MOV X9, #1             // initialize X9 as 1 for iterator x
  MOV X10, 100           // intialize the X10 with 100
  SCVTF S9, X10          // convert 100 to floating point
  FMOV S1, WZR           // initialize the S1 with 0.0

loop:
  CMP X9, X19            // compare x with n
  BGT exit               // if x > n, jump out of the loop
  MOV X0, X9             // X0 used as paramter pass into the function
  BL power               // call the power function to caculate 2^x
  SCVTF S10, X1          // convert X1 to floating point
  FDIV S11, S9, S10      // 100 / 2^x
  FADD S1, S1, S11       // adding the result
  ADD X9, X9, #1         // increase the iterator
  B loop
exit:
