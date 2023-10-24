	.data
	.type	n, %object
	.size	n, 4
	.type	n, %object
	.size	a, 4

n:
	.xword 4
a:
	.xword 2, 4, 6, 8


	.text
	.global main
	.arch armv8-a+fp+simd
	.type main, %function


main:
	ADRP X0, n
	ADD X0, X0, :lo12:n			// X0 contains address of n
	LDUR X1, [X0, #0]			// X1 contains value of n (number of inputs)

	ADRP X2, a
	ADD X2, X2, :lo12:a			// X2 contains base address of array a
	LDUR X3, [X2, #0]			// X3 contains the value of the first element of array

	MOV X20, #0					// initialize X20 = 0; sum of the array
	MOV X21, #0					// initialize X21 = 0; mean of the array
	MOV X4, #0					// initialize X4 = 0; iterator of the array

	MOV X4, #0			    	// X4 works as loop control variable, i, initialized to 1

loop:
	CMP X1, X4
	BEQ done
	LSL X5, X4, #3	        	// X4 = i * 8 (the addrss increment)
	ADD X6, X2, X5				// X6 = address of array[i]
	LDUR X7, [X6, #0]			// X7 = get the value of array[i]
	ADD X20, X20, X7			// sum = sum + array[i]
	ADD X4, X4, #1
	B loop
done:
	LSR X21, X20, #2			// X21: get the mean of the array

Exit:

