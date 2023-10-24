	.data
	.type	n, %object
	.size	n, 16

n:
	.xword 7, 3, 19, 5, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24

	.text
	.global main
	.arch armv8-a+fp+simd
	.type main, %function


main:

	// X19 stores the base address of x
	// X20 stores a
	// X21 stores b
	// for testing, you could manually change the value of the registers

	// a  = a + b
	ADD X20, X20, X21

	// x[1] = a + x[2]
	LDUR X1, [X19, #16]     // load x[2] to X1
	ADD X2, X20, X1         // add a and x[2] and stores the result to X2
	STUR X2, [X19, #8]      // stores the result back to x[1]

	// x[2] = a >> 4;
	LSR X8, X20, #4         // right shift and store to X8
	STUR X8, [X19, #16]

	// x[a] = 2 * b
	LSL X9, X21, #1         // left shift and store to X9
	LSL X10, X20, #3        // a * 8
	ADD X10, X19, X10       // calculate the address of x[a]
	STUR X9, [X10, #0]      // store the sum to x[a]

	// x[3] = x[a/2] - b;
	LSR X11, X20, #1        // X11 stores a/2
	LSL X12, X11, #3        // calculate the offset
	ADD X12, X19, X12
	LDUR X13, [X12, #0]     // load value to X13
	SUB X13, X13, X21       // subtraction
	STUR X13, [X19, #24]    // store the value to x[3]

Exit:

