#include<stdio.h>
void main()
{
    int a,p,i,c=1;
    printf("Enter the number and power:");
    scanf("%d%d",&a,&p);
    while(p!=0){
    c*=a;
    p--;
    }
    printf("%d",c);

}
