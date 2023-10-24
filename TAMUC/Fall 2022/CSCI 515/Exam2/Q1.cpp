// Consider the function code below, what (not how) does it do:

int mystery(int x, int y, int z)
{
int temp; // ultimately, holds returned value
temp = x; // assume x is the answer
if(y > temp) { temp = y; }
if(z > temp) { temp = z; }
return temp;
} 