#include <stdio.h>
int main()
{
    int n,i;
    int fact=1;
    printf("Enter an integer: ");
    scanf("%d",&n);
if (n<0)
        printf("Error! Factorial of a negative number doesn't exist.");
else{
        for(i=1;i<=n; ++i)
        {
            fact*= i;
        }
        printf("%d",fact);
    }
return 0;
}