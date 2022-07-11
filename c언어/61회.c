#include<stdio.h>
int main()
{
    int i=5;
    printf("%d,%d,%d,%d",i++,++i,i++,++i);  //pritnf는 뒤에서부터 계산
}                                           //전위 연산자는 최종적인 i값
                                            // 8,9,6,9