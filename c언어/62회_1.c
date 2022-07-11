#include<stdio.h>

int main()
{
    int i=5;
    int z=++i + ++i + ++i;//전위 연산자는 연산할때의 i를 가져온다
    printf("%d,%d",i,z);//z=7+7+8
}