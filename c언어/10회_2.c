#include<stdio.h>

void main()
{
    //정수형 자리수 지정
    printf("값:%d\n",13);
    printf("값:%5d\n",13);
    printf("값:%05d\n",13);
    //실수형 자리수 지정
    printf("값:%f\n",3.26);
    printf("값:%6.1f\n",3.26);//반올림
    printf("값:%-6.1f\n",3.26);//반올림
    printf("값:%-6.3f",3.26);
}