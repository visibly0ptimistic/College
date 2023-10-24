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
    ADD X2, X0, X1
    MOV W0, #0
    MOV W1, #0
    MOV W2, #0
    MOV W3, #0
    LOOP:
    CMP W0, W1
    BEQ END
    MOV W2, W0
    ADD W0, W0, #1
    CMP W2, X2
    BGT LOOP
    ADD W1, W1, #1
    B LOOP
    END:
    MOV W3, W1
    SUB W3, W3, W2
    MOV X2, W3
    BX LR
Exit:
