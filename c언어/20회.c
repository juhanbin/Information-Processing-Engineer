#include<stdio.h>
void main()
{
    int i,j,sum=0;
    for(i=1;i<10;i++)
    {
        for(j=1;j<10;j++)
        {
            if(j%3==3)
            continue;
            if(j%4==0)
            break;
            sum++;
        }
    }
    printf("%d",sum);
}