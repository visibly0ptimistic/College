  .text
  .global main
  .arch armv8-a+fp+simd
  .type main, %function

voltage:
  FMUL S10, S0, S1   // calculate the voltage drop: V = R * I
  BR X30             // return to the previous calling point

power:
  FMUL S11, S0, S1   // calculate the power: V = R * I * I
  FMUL S11, S11, S1
  BR X30             // return to the previous calling point

main:
  // S0 is the input for resistance (R)
  // S1 is the input for current (I)
  BL voltage         // call voltage function
  BL power           // call power function
  FMOV S2, S10       // move the voltage drop to S2
  FMOV S3, S11       // move the power to S3

exit:
