#include<stdio.h>
#include<conio.h>
void main()
{ int n,sum=0,i,val;
printf("Enter the number of values:");
scanf("%d",&n);
printf("Enter the values");
for(i=0;i<n;i++){
scanf("%d",&val);
sum+=val;
}
printf("%d",sum);
getch();
}
