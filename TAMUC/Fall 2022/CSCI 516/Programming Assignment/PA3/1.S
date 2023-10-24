voltage:
        .zero   4
power:
        .zero   4
.LC0:
        .string "Enter the current value:"
.LC1:
        .string "%f"
.LC2:
        .string "Enter the resistance:"
main:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 16
        mov     edi, OFFSET FLAT:.LC0
        mov     eax, 0
        call    printf
        lea     rax, [rbp-4]
        mov     rsi, rax
        mov     edi, OFFSET FLAT:.LC1
        mov     eax, 0
        call    __isoc99_scanf
        mov     edi, OFFSET FLAT:.LC2
        mov     eax, 0
        call    printf
        lea     rax, [rbp-8]
        mov     rsi, rax
        mov     edi, OFFSET FLAT:.LC1
        mov     eax, 0
        call    __isoc99_scanf
        movss   xmm0, DWORD PTR [rbp-8]
        mov     eax, DWORD PTR [rbp-4]
        movaps  xmm1, xmm0
        movd    xmm0, eax
        call    findvoltage(float, float)
        movss   xmm0, DWORD PTR voltage[rip]
        mov     eax, DWORD PTR [rbp-4]
        movaps  xmm1, xmm0
        movd    xmm0, eax
        call    findcurrent(float, float)
        mov     eax, 0
        leave
        ret
.LC3:
        .string "voltage %f:\n"
findvoltage(float, float):
        push    rbp
        mov     rbp, rsp
        sub     rsp, 16
        movss   DWORD PTR [rbp-4], xmm0
        movss   DWORD PTR [rbp-8], xmm1
        movss   xmm0, DWORD PTR [rbp-4]
        mulss   xmm0, DWORD PTR [rbp-8]
        movss   DWORD PTR voltage[rip], xmm0
        movss   xmm0, DWORD PTR voltage[rip]
        pxor    xmm2, xmm2
        cvtss2sd        xmm2, xmm0
        movq    rax, xmm2
        movq    xmm0, rax
        mov     edi, OFFSET FLAT:.LC3
        mov     eax, 1
        call    printf
        nop
        leave
        ret
.LC4:
        .string "power is %f:"
findcurrent(float, float):
        push    rbp
        mov     rbp, rsp
        sub     rsp, 16
        movss   DWORD PTR [rbp-4], xmm0
        movss   DWORD PTR [rbp-8], xmm1
        movss   xmm0, DWORD PTR [rbp-4]
        mulss   xmm0, DWORD PTR [rbp-8]
        movss   DWORD PTR power[rip], xmm0
        movss   xmm0, DWORD PTR power[rip]
        pxor    xmm2, xmm2
        cvtss2sd        xmm2, xmm0
        movq    rax, xmm2
        movq    xmm0, rax
        mov     edi, OFFSET FLAT:.LC4
        mov     eax, 1
        call    printf
        nop
        leave
        ret