.LC0:
        .string "Enter n: "
.LC1:
        .string "%d"
.LC5:
        .string "y=%f\n"
main:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 32
        mov     edi, OFFSET FLAT:.LC0
        mov     eax, 0
        call    printf
        lea     rax, [rbp-24]
        mov     rsi, rax
        mov     edi, OFFSET FLAT:.LC1
        mov     eax, 0
        call    __isoc99_scanf
        movsd   xmm0, QWORD PTR .LC2[rip]
        movsd   QWORD PTR [rbp-8], xmm0
        pxor    xmm0, xmm0
        movsd   QWORD PTR [rbp-16], xmm0
        mov     DWORD PTR [rbp-20], 1
        jmp     .L2
.L3:
        movsd   xmm0, QWORD PTR [rbp-8]
        movsd   xmm1, QWORD PTR .LC4[rip]
        divsd   xmm0, xmm1
        movsd   xmm1, QWORD PTR [rbp-16]
        addsd   xmm0, xmm1
        movsd   QWORD PTR [rbp-16], xmm0
        movsd   xmm0, QWORD PTR [rbp-8]
        movsd   xmm1, QWORD PTR .LC4[rip]
        divsd   xmm0, xmm1
        movsd   QWORD PTR [rbp-8], xmm0
        add     DWORD PTR [rbp-20], 1
.L2:
        mov     eax, DWORD PTR [rbp-24]
        cmp     DWORD PTR [rbp-20], eax
        jle     .L3
        mov     rax, QWORD PTR [rbp-16]
        movq    xmm0, rax
        mov     edi, OFFSET FLAT:.LC5
        mov     eax, 1
        call    printf
        mov     eax, 0
        leave
        ret
.LC2:
        .long   0
        .long   1079574528
.LC4:
        .long   0
        .long   1073741824