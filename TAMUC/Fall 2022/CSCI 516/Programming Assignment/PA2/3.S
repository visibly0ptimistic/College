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
    // Move cursor to mid screen
    MOV DH, 13    // y-coordinate range 0-24
    MOV DL, 40    // x-coordinate range 0-79
    CALL GoToXY   // locate cursor

    MOV EDX, OFFSET prompt    // Display prompt
    CALL WriteString
    CALL ReadInt    // Read integer
    MOV int1,EAX

    CALL WriteString
    CALL ReadInt    // Read integer
    MOV int2,EAX

    MOV EAX, int1   // calculate sum
    ADD EAX, int2
    MOV sum, EAX

    MOV EDX, OFFSET resultMsg   // display sum
    call WriteString
    MOV EAX, sum
    call WriteInt

    call Crlf
    call WaitMsg
Exit:
