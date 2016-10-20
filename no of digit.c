#include<stdio.h>
#include<conio.h>
void main()
{
    long long a;
    int c=0;
    scanf("%lld",&a);
    while(a!=0){
    a=a/10;
    ++c;
    }
    printf("%d",c);
    getch();
}
