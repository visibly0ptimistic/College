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
    ADRP X0, v
	ADD X0, X0, :lo12:v
    ADD X20, X20, X21    // a = a + b
    ADD X1, X1, X20 #1   // #x1 = a + x[2]
    SUBS X1, X20 #2      // #x1 = a >> 4
    LSL X1, X21, #1      // #x1 = 2 * b
    LSR X1, X20, #1      // #x1 = a/2
    LSL x1, x1, #2       // x1 = 4 * (c/2)
    ADD x1, x1, x19      // #x1 = address of x[c/2]
    LDUR x1, [x1, #0]    // #x1 = x[c/2]
    SUB x1, x21, x1      // #x1 = b - x[c/2]
    LSL x2, x20, #2      // #x2 = 4*a
    ADD x2, x2, x19      // #x2 = address of x[3]
    STUR X1, [X2, #0]    // x[3] = x[a/2] - b
Exit:
