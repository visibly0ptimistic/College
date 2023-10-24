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
    MOV X9, #1          
    MOV X21, #1         
    CMP X9, X20         
    BGT Exit            
    MUL X21, X21, X19       
    ADD X9, X9, #1          
    B loop
Exit:
