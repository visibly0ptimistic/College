	.data
	.type	v, %object
	.size	v, 4

v:
	.xword 1, 2, 3, 4

	.text
	.global main
	.arch armv8-a+fp+simd
	.type main, %function

main:
    ADRP X0, v
	ADD X0, X0, :lo12:v
    ADD X23, X19, X20   // X23 = SUM
    ADD X23, X23, X21
    ADD X23, X23, X22   // X23 = SUM = X19+X20+X21+X22
    LSR X24, X23, #2    // X24 = MEAN = X23/4
Exit: