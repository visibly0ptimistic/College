.LC0:
        .string "enter the value of x and a"
.LC1:
        .string "%lf%ld"
.LC4:
        .string "E^x is %lf\n"
.LC5:
        .string "Answer is %lf\n"
main:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 64
        mov     edi, OFFSET FLAT:.LC0
        call    puts
        lea     rdx, [rbp-56]
        lea     rax, [rbp-48]
        mov     rsi, rax
        mov     edi, OFFSET FLAT:.LC1
        mov     eax, 0
        call    __isoc99_scanf
        mov     DWORD PTR [rbp-4], 0
        mov     QWORD PTR [rbp-16], 1
        movsd   xmm0, QWORD PTR .LC2[rip]
        movsd   QWORD PTR [rbp-24], xmm0
        pxor    xmm0, xmm0
        movsd   QWORD PTR [rbp-32], xmm0
        pxor    xmm0, xmm0
        movsd   QWORD PTR [rbp-40], xmm0
        mov     DWORD PTR [rbp-4], 1
        jmp     .L2
.L3:
        movsd   xmm0, QWORD PTR [rbp-48]
        movsd   xmm1, QWORD PTR [rbp-24]
        mulsd   xmm0, xmm1
        movsd   QWORD PTR [rbp-24], xmm0
        mov     eax, DWORD PTR [rbp-4]
        cdqe
        mov     rdx, QWORD PTR [rbp-16]
        imul    rax, rdx
        mov     QWORD PTR [rbp-16], rax
        pxor    xmm1, xmm1
        cvtsi2sd        xmm1, QWORD PTR [rbp-16]
        movsd   xmm0, QWORD PTR [rbp-24]
        divsd   xmm0, xmm1
        movsd   QWORD PTR [rbp-40], xmm0
        pxor    xmm1, xmm1
        cvtsi2sd        xmm1, QWORD PTR [rbp-16]
        movsd   xmm0, QWORD PTR [rbp-24]
        divsd   xmm0, xmm1
        movsd   xmm1, QWORD PTR [rbp-32]
        addsd   xmm0, xmm1
        movsd   QWORD PTR [rbp-32], xmm0
        add     DWORD PTR [rbp-4], 1
.L2:
        mov     eax, DWORD PTR [rbp-4]
        movsx   rdx, eax
        mov     rax, QWORD PTR [rbp-56]
        cmp     rdx, rax
        jle     .L3
        mov     rax, QWORD PTR [rbp-40]
        movq    xmm0, rax
        mov     edi, OFFSET FLAT:.LC4
        mov     eax, 1
        call    printf
        mov     rax, QWORD PTR [rbp-32]
        movq    xmm0, rax
        mov     edi, OFFSET FLAT:.LC5
        mov     eax, 1
        call    printf
        mov     eax, 0
        leave
        ret
.LC2:
        .long   0
        .long   1072693248