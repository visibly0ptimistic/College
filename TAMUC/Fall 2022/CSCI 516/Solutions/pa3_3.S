  .text
  .global main
  .arch armv8-a+fp+simd
  .type main, %function

power:
  MOV X11, #1            // initialize the iterator as 1
  FMOV D9, 1.0           // initialize the result as 1.0
p_loop:
  CMP X11, X0            // compare the iterator with x
  BGT done_ploop         // jump out of the loop
  FMUL D9, D9, D0        // get the x^n
  ADD X11, X11, #1       // increase the iterator
  B p_loop               // go back to loop
done_ploop:
  BR X30                 // return to the calling point

fact:
  MOV X13, #1            // initialize the iterator as 1
  MOV X2, #1             // initialize the result as 1
f_loop:
  CMP X13, X0            // compare the iterator with n
  BGT done_floop         // jump out of the loop
  MUL X2, X2, X13        // calculate the factorial
  ADD X13, X13, #1       // increase the iterator
  B f_loop               // go back to the loop
done_floop:
  BR X30                 // return to the calling point

main:
  // X19 is the input for a
  // D1 is the input for x
  MOV X9, #1             // initialize X9 as 1 for iterator x
  FMOV D1, 1.0           // initialize the S1 with 0.0

loop:
  CMP X9, X19            // compare x with n
  BGT exit               // if x > n, jump out of the loop
  MOV X0, X9             // X0 used as paramter pass into the function
  BL power               // call the power function to calculate x^n
  BL fact                // call the fact function to calculate n!
  SCVTF D10, X2          // convert X3 to floating point
  FDIV D11, D9, D10      // x^n / n!
  FADD D1, D1, D11       // adding the result
  ADD X9, X9, #1         // increase the iterator
  B loop
exit:
