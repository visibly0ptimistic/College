	.text
	.global main
	.arch armv8-a+fp+simd
	.type main, %function

main:

	MOV X9, #1			// initialize X9 (iterator) with 1 (for z)
	MOV X21, #1			// X21 stores the result y.

loop:
	CMP X9, X20			// compare X9 with X20, X20 stores the value of z
	BGT Exit			// if X9 is greater than z, then jump out of loop

	MUL X21, X21, X19		// accumulate the result, X19 stores the value of x
	ADD X9, X9, #1			// increase the iterator

	B loop

Exit:
