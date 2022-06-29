#include<stdio.h>
int fo(void)
{
    int var1=1;
    static int var2=1;
    return (var1++)+(var2++);
}
void main()
{
    int i=0,sum=0;
    while(i<3)
    {
        sum=sum+fo();
        i++;
    }
    printf("sum=%d\n",sum);
}