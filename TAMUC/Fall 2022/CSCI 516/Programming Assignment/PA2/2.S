	.data
	.type	v, %object
	.size	v, 3

v:
	.xword 1, 2, 3

	.text
	.global main
	.arch armv8-a+fp+simd
	.type main, %function

main:
    //  Range: X2 = X1 - X0
	X0 = base address of array
	X1 = length of array
	X2 = range
	// call function
	X0 = base address of array
	X1 = length of array
	X2 = range
	temp = X1 - X0
	X2 = temp
Exit:
