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
	.MODEL SMALL
	.DATA
	RES DB ?
	CNT DB 0AH
	.CODE
	START: MOV AX,@DATA
	MOV DS,AX
	LEA SI,RES
	MOV CL,CNT
	MOV AX,00H
	MOV BX,01H

	L1:ADD AX,BX
	DAA
	MOV [SI],AX
	MOV AX,BX
	MOV BX,[SI]
	INC SI
	LOOP L1

	INT 3H
	END START
Exit:
